# AI-assisted archived practice solution
def solve(data):
    a = list(map(int, data.split()))
    return '\n'.join(str(a[i]+a[i+1]) for i in range(1,1+2*a[0],2))

if __name__ == "__main__":
    import sys
    print(solve(sys.stdin.read()))
