if __name__ == '__main__':
    n = int(input())
    arr = map(int, input().split())
    new_arr=sorted(arr)
    max_val = new_arr[-1] 
    max_count = new_arr.count(max_val)
    new_arr = new_arr[:-max_count]
    print(new_arr[-1])
