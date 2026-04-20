# 🧩 LeetCode 1431: Kids With the Greatest Number of Candies

**Platform:** LeetCode
**Difficulty:** Easy
**Language:** Java ☕

---

## 📌 Problem Description

Given an array `candies` where each element represents the number of candies a kid has, and an integer `extraCandies`, return a boolean list indicating whether each kid can have the greatest number of candies after receiving extra candies.

---

## 🧠 Approach

* Find the maximum candies among all kids
* For each kid, check if adding extraCandies makes it >= max
* Store result in a list

---

## 🔑 Key Points

* First pass → find max
* Second pass → compare each value
* Use boolean list for result

---

## ⏱️ Complexity

* Time: O(n)
* Space: O(n)

---

## 💻 Code

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result= new ArrayList<>();
        int maxCandy = 0;
        for(int c : candies){
            if(c>maxCandy){
                maxCandy=c;
            }
        }
        for(int c:candies){
                result.add(c+extraCandies >= maxCandy);
        }
        return result;
    }
}
---

## 💡 Interview Insight

* Simple array traversal problem
* Tests basic logic and comparison
* Common beginner-level question

---

## ✅ Status

✔ Solved successfully
✔ Efficient approach
✔ Interview-ready implementation

---

*This solution is part of my Data Structures & Algorithms (DSA) practice in Java.*
