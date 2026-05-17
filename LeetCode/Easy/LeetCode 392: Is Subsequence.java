# 🧩 LeetCode 392: Is Subsequence

**Platform:** LeetCode
**Difficulty:** Easy
**Language:** Java ☕

---

## 📌 Problem Description

Given two strings `s` and `t`, return `true` if `s` is a subsequence of `t`, or `false` otherwise.

A subsequence is a sequence that can be derived from another string by deleting some (or no) characters without changing the order of the remaining characters.

---

## 🧠 Approach

* Use two pointers
* Traverse both strings
* If characters match, move pointer of `s`
* Always move pointer of `t`
* Check if all characters of `s` are matched

---

## 🔑 Key Points

* Maintain order of characters
* No need for extra space
* Efficient linear scan

---

## ⏱️ Complexity

* Time: O(n)
* Space: O(1)

---

## 💻 Code

class Solution {
    public boolean isSubsequence(String s, String t) {
        int i=0,j=0;
        while(i<s.length() && j<t.length()){
            if(s.charAt(i)==t.charAt(j)){
                i++;
            }
            j++;
        }
        return i==s.length();
    }
}

---

## 💡 Interview Insight

* Classic two-pointer problem
* Tests understanding of subsequences
* Efficient alternative to recursion/DP

---

## ✅ Status

✔ Solved successfully
✔ Optimal two-pointer approach
✔ Interview-ready implementation

---

*This solution is part of my Data Structures & Algorithms (DSA) practice in Java.*
