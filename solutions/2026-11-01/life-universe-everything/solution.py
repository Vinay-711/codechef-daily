import sys


def solve(data):
    output = []
    for token in data.split():
        value = int(token)
        if value == 42:
            break
        output.append(str(value))
    return "\n".join(output)


if __name__ == "__main__":
    result = solve(sys.stdin.read())
    if result:
        print(result)
