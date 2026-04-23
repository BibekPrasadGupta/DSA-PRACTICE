# 🧩 LeetCode 1450: Number of Students Doing Homework at a Given Time

**Platform:** LeetCode
**Difficulty:** Easy
**Language:** Java ☕

---

## 📌 Problem Description

You are given two integer arrays `startTime` and `endTime` and an integer `queryTime`.

Return the number of students doing homework at time `queryTime`.

A student is doing homework if:

`startTime[i] <= queryTime <= endTime[i]`

---

## 🧠 Approach

* Traverse both arrays
* Check if queryTime lies within the interval
* Count valid students

---

## 🔑 Key Points

* Simple condition checking
* Use single loop
* Inclusive range condition

---

## ⏱️ Complexity

* Time: O(n)
* Space: O(1)

---

## 💻 Code

class Solution {
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int count=0;
        for(int i=0; i<startTime.length; i++){
          if(startTime[i]<=queryTime && endTime[i]>=queryTime){
            count++;
          }
        }
        return count;
    }
}

---

## 💡 Interview Insight

* Basic array traversal problem
* Tests understanding of intervals
* Very common beginner-level question

---

## ✅ Status

✔ Solved successfully
✔ Simple and efficient approach
✔ Interview-ready implementation

---

*This solution is part of my Data Structures & Algorithms (DSA) practice in Java.*
