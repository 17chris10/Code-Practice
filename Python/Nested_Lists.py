def get_score(dictionary):
    return dictionary["score"]

def get_name(dictionary):
    return dictionary["name"]

if __name__ == '__main__':
    n = int(input())
    students = []
    
    for _ in range(n):
        name = input()
        sc = float(input())
        entry = {"name": name, "score": sc}
        students.append(entry)
    
    # Sort alphabetically first, then numerically by score
    students.sort(key=get_name)
    students.sort(key=get_score)
    
    # 1. Get the absolute minimum score (the very first element)
    min_score = students[0]["score"]

    # 2. Remove all copies of the lowest score from the front (index 0)
    while students and students[0]["score"] == min_score:
        students.pop(0)
        
    # 3. The new first element now holds the second-lowest score
    target_score = students[0]["score"]
    
    # 4. Print all names matching this second-lowest score
    for item in students:
        if item["score"] == target_score:
            print(item["name"])
