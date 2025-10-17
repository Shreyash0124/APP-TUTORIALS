package quizapp;

import java.sql.*;
import java.util.*;

public class QuestionDAO {
    private static final Random random = new Random();

    private Question map(ResultSet rs) throws SQLException {
        return new Question(
            Subject.valueOf(rs.getString("subject")),
            DifficultyLevel.valueOf(rs.getString("difficulty")),
            rs.getString("question_text"),
            List.of(rs.getString("option_a"), rs.getString("option_b"),
                    rs.getString("option_c"), rs.getString("option_d")),
            rs.getInt("correct_option")
        );
    }

    public List<Question> getRandomQuestions(Subject subject, DifficultyLevel difficulty, int count) {
        String sql = "SELECT * FROM questions WHERE subject=? AND difficulty=? ORDER BY RAND() LIMIT ?";
        List<Question> list = new ArrayList<>();

        try (Connection c = DatabaseConnection.getConnection();
             PreparedStatement s = c.prepareStatement(sql)) {
            s.setString(1, subject.name());
            s.setString(2, difficulty.name());
            s.setInt(3, count);
            try (ResultSet r = s.executeQuery()) {
                while (r.next()) list.add(map(r));
            }
        } catch (SQLException e) {
            System.err.println("Error fetching questions: " + e.getMessage());
        }

        Collections.shuffle(list, random);
        return list;
    }

    public int getQuestionCount(Subject subject, DifficultyLevel difficulty) {
        String sql = "SELECT COUNT(*) FROM questions WHERE subject=? AND difficulty=?";
        try (Connection c = DatabaseConnection.getConnection();
             PreparedStatement s = c.prepareStatement(sql)) {
            s.setString(1, subject.name());
            s.setString(2, difficulty.name());
            try (ResultSet r = s.executeQuery()) {
                return r.next() ? r.getInt(1) : 0;
            }
        } catch (SQLException e) {
            System.err.println("Error counting questions: " + e.getMessage());
            return 0;
        }
    }

    public Question getQuestionById(int id) {
        String sql = "SELECT * FROM questions WHERE id=?";
        try (Connection c = DatabaseConnection.getConnection();
             PreparedStatement s = c.prepareStatement(sql)) {
            s.setInt(1, id);
            try (ResultSet r = s.executeQuery()) {
                return r.next() ? map(r) : null;
            }
        } catch (SQLException e) {
            System.err.println("Error fetching question by ID: " + e.getMessage());
            return null;
        }
    }
}