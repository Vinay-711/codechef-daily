# AI-assisted archived practice solution
def solve(data):
    a = data.split()
    return '\n'.join(str(sum(map(int, value))) for value in a[1:1+int(a[0])])

if __name__ == "__main__":
    import sys
    print(solve(sys.stdin.read()))
