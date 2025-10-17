def add(a, b):
    return a + b

def sub(a, b):
    return a - b

def mul(a, b):
    return a * b

def div(a, b):
    return a / b

def operate(func, a, b):
    return func(a, b)

print("Addition:", operate(add, 10, 5))
print("Multiplication:", operate(mul, 10, 5))
