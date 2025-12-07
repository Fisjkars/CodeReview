import debugpy

# Enable debugpy to listen on a specific address and port
debugpy.listen(("0.0.0.0", 5678))
print("Waiting for debugger to attach...")

# Optionally pause execution until a debugger is attached
debugpy.wait_for_client()
print("Debugger attached! Resuming execution.")

# Sample function with a bug to demonstrate debugging
def buggy_function(n):
    result = 0
    for i in range(1, n + 1):
        result += i
        if i == 3:  # Intentional bug: division by zero
            result /= (i - 3)
    return result

if __name__ == "__main__":
    print("Starting buggy function...")
    try:
        output = buggy_function(5)
        print(f"Result: {output}")
    except ZeroDivisionError as e:
        print(f"Caught an exception: {e}")