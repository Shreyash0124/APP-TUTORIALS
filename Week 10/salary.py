def festival_bonus(salary):
    return salary + 5000

def performance_bonus(salary):
    return salary + salary * 0.1

def apply_bonus(func, salary):
    return func(salary)

# Example usage
updated_salary = apply_bonus(performance_bonus, 50000)
print("Updated Salary:", updated_salary)
