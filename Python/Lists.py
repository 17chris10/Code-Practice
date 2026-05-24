if __name__ == '__main__':
    N = int(input())
    arr = []

    for _ in range(N):
        cmd, *args = input().split()

        if cmd == "insert":
            arr.insert(int(args[0]), int(args[1]))
        elif cmd == "print":
            print(arr)
        elif cmd == "remove":
            arr.remove(int(args[0]))
        elif cmd == "append":
            arr.append(int(args[0]))
        elif cmd == "sort":
            arr.sort()
        elif cmd == "pop":
            arr.pop()
        elif cmd == "reverse":
            arr.reverse()
            
