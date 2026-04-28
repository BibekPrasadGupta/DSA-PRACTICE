# 🧩 LeetCode 3884: First Matching Index

**Platform:** LeetCode
**Difficulty:** Easy
**Language:** Java ☕

---

## 📌 Problem Description

Given a string `s`, return the first index `i` such that the character at index `i` is equal to the character at index `n - i - 1` (mirror position).

If no such index exists, return `-1`.

---

## 🧠 Approach

* Traverse the string from left to right
* Compare each character with its mirror counterpart
* Return the first matching index

---

## 🔑 Key Points

* Mirror index = `n - i - 1`
* Early return on first match
* If no match found → return -1

---

## ⏱️ Complexity

* Time: O(n)
* Space: O(1)

---

## 💻 Code

class Solution {
    public int firstMatchingIndex(String s) {
        int n=s.length();
      
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)==s.charAt(n-i-1)){
                return i;
            }
        }
        return -1;
    }
}

---

## 💡 Interview Insight

* Simple string traversal problem
* Tests understanding of indexing and symmetry
* Common pattern in palindrome-related questions

---

## ✅ Status

✔ Solved successfully
✔ Efficient single-pass solution
✔ Interview-ready implementation

---

*This solution is part of my Data Structures & Algorithms (DSA) practice in Java.*
