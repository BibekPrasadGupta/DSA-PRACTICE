# 🧩 LeetCode 434: Number of Segments in a String

**Platform:** LeetCode
**Difficulty:** Easy
**Language:** Java ☕

---

## 📌 Problem Description

Given a string `s`, return the number of segments in the string.

A segment is defined as a contiguous sequence of non-space characters.

---

## 🧠 Approach

* Trim the string to remove leading/trailing spaces
* Check if the string is empty
* Split the string using regex for one or more spaces
* Return the length of the resulting array

---

## 🔑 Key Points

* Use `trim()` to handle edge spaces
* Use `split("\\s+")` for multiple spaces
* Handle empty string case

---

## ⏱️ Complexity

* Time: O(n)
* Space: O(n)

---

## 💻 Code

class Solution {
    public int countSegments(String s) {
        s=s.trim();
        if (s.isEmpty()) return 0;
        String []arr= s.split("\\s+");
        return arr.length;
    }
}

---

## 💡 Interview Insight

* String manipulation problem
* Tests understanding of regex and splitting
* Edge cases with spaces are important

---

## ✅ Status

✔ Solved successfully
✔ Clean string processing approach
✔ Interview-ready implementation

---

*This solution is part of my Data Structures & Algorithms (DSA) practice in Java.*
