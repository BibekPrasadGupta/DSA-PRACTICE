# 🧩 LeetCode 796: Rotate String

**Platform:** LeetCode
**Difficulty:** Easy
**Language:** Java ☕

---

## 📌 Problem Description

Given two strings `s` and `goal`, return `true` if and only if `s` can become `goal` after some number of shifts.

A shift on `s` consists of moving the leftmost character to the rightmost position.

---

## 🧠 Approach

* Check if lengths are equal
* Concatenate string `s` with itself
* Check if `goal` is a substring of `s + s`

---

## 🔑 Key Points

* Rotation property: `goal` must be substring of `s+s`
* Length mismatch → directly false
* Efficient string check using `contains()`

---

## ⏱️ Complexity

* Time: O(n)
* Space: O(n)

---

## 💻 Code

class Solution {
    public boolean rotateString(String s, String goal) {
       if(s.length()!=goal.length()) return false;
       if((s+s).contains(goal)){
        return true;
       }
       return false;
    }
}

---

## 💡 Interview Insight

* Classic string trick problem
* Tests understanding of rotation logic
* Avoid brute-force rotations using concatenation

---

## ✅ Status

✔ Solved successfully
✔ Optimal string approach
✔ Interview-ready implementation

---

*This solution is part of my Data Structures & Algorithms (DSA) practice in Java.*
