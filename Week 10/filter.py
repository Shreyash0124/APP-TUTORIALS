def filter_students(criteria, students):
    return [s for s in students if criteria(s)]

students = [
    {"name": "John", "cgpa": 9.1},
    {"name": "Alice", "cgpa": 7.8},
    {"name": "Bob", "cgpa": 8.5}
]

result = filter_students(lambda s: s["cgpa"] > 8, students)
print(result)
