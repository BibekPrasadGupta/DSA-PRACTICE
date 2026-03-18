# LeetCode Easy Problems – Java

## 🧩 Problem 58: Length of Last Word

**Platform:** LeetCode
**Difficulty:** Easy
**Language:** Java ☕

---

## 📌 Problem Description

Given a string `s` consisting of words and spaces, return the **length of the last word** in the string.

A word is defined as a maximal substring consisting of non-space characters only.

---

## 🧠 Approach

We traverse the string from the end:

* Skip all trailing spaces.
* Count characters until we encounter a space.

This gives the length of the last word.

---

## 🪜 Step-by-Step Explanation

1. Start from the end of the string.
2. Skip all trailing spaces.
3. Initialize a counter `length = 0`.
4. Count characters until a space is found.
5. Return the length.

---

## ⏱️ Complexity Analysis

**Time Complexity:** `O(n)`
  (Single traversal of the string)

**Space Complexity:** `O(1)`
  (Only constant extra variables used)

---

## 📂 Code

class Solution {
    public int lengthOfLastWord(String s) {
        
        int length = 0;
        int i = s.length() - 1;
        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }
        while (i >= 0 && s.charAt(i) != ' ') {
            length++;
            i--;
        }

        return length;
    }
}

---

## 💡 Interview Insight

* Tests string traversal from the end.
* Common problem involving trimming and parsing.
* Efficient without using extra string methods.

---

## ✅ Status

✔ Solved successfully
✔ Efficient single-pass solution
✔ Interview-ready implementation

---

*This solution is part of my Data Structures & Algorithms (DSA) practice in Java.*
