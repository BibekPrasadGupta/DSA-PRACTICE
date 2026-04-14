# 🧩 LeetCode 1784: Check if Binary String Has at Most One Segment of Ones

**Platform:** LeetCode
**Difficulty:** Easy
**Language:** Java ☕

---

## 📌 Problem Description

Given a binary string `s`, return `true` if the string contains at most one contiguous segment of '1's.

Otherwise, return `false`.

---

## 🧠 Approach

* Traverse the string once
* Check if a '1' appears after a '0' following a previous segment of '1'
* If such a pattern exists → return false

---

## 🔑 Key Points

* Only one continuous block of '1's is allowed
* Pattern to detect: `...0 -> 1` after a segment
* Simple linear scan

---

## ⏱️ Complexity

* Time: O(n)
* Space: O(1)

---

## 💻 Code

class Solution {
    public boolean checkOnesSegment(String s) {
        for(int i = 1; i < s.length(); i++){
            if(s.charAt(i) == '1' && s.charAt(i-1) == '0'){
                return false;
            }
        }
        return true;
    }
}

---

## 💡 Interview Insight

* Simple string traversal problem
* Tests pattern recognition in binary strings
* Efficient solution with single pass

---

## ✅ Status

✔ Solved successfully
✔ Optimal O(n) solution
✔ Interview-ready implementation

---

*This solution is part of my Data Structures & Algorithms (DSA) practice in Java.*
