import sys
for token in sys.stdin.read().split():
    value = int(token)
    if value == 42:
        break
    print(value)
# cook your dish here
