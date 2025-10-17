class Movie {
    String title, genre;
    double rating;

    void display() {
        System.out.println("Title: " + title + ", Genre: " + genre + ", Rating: " + rating);
    }

    public static void main(String[] args) {
        Movie mv = new Movie();
        mv.title = "Inception";
        mv.genre = "Sci-Fi";
        mv.rating = 8.8;
        mv.display();
    }
}
