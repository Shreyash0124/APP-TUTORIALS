def student_profile(name):
    marks = {}
    def add_marks(subject, mark):
        marks[subject] = mark
        avg = sum(marks.values()) / len(marks)
        print(f"{name}'s Average Marks: {avg}")
    return add_marks

profile = student_profile("Charan")
profile("Maths", 90)
profile("Science", 80)
