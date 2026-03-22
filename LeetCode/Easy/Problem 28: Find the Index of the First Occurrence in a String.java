# LeetCode Easy Problems – Java

## 🧩 Problem 28: Find the Index of the First Occurrence in a String

**Platform:** LeetCode
**Difficulty:** Easy
**Language:** Java ☕

---

## 📌 Problem Description

Given two strings `haystack` and `needle`, return the index of the first occurrence of `needle` in `haystack`.

If `needle` is not part of `haystack`, return `-1`.

---

## 🧠 Approach

We use a **brute-force string matching approach**:

* Try to match `needle` starting from every possible index in `haystack`.
* Compare characters one by one.
* If all characters match → return the starting index.

---

## 🪜 Step-by-Step Explanation

1. If `needle` is empty → return `0`.
2. Loop from index `0` to `haystack.length() - needle.length()`.
3. For each index:

   * Compare characters of `haystack` and `needle`.
4. If all characters match → return current index.
5. If no match is found → return `-1`.

---

## ⏱️ Complexity Analysis

**Time Complexity:** `O(n × m)`
  (Where `n` = length of haystack, `m` = length of needle)

**Space Complexity:** `O(1)`
  (No extra space used)

---

## 📂 Code

class Solution {
    public int strStr(String haystack, String needle) {
        
        if (needle.length() == 0) {
            return 0;
        }

        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            
            int j = 0;
            
            while (j < needle.length() && 
                   haystack.charAt(i + j) == needle.charAt(j)) {
                j++;
            }

            if (j == needle.length()) {
                return i;
            }
        }

        return -1;
    }
}

**( or simple code ):**

class Solution {
    public int strStr(String haystack, String needle) {

        return haystack.indexOf(needle);
        
    }
}


---

## 💡 Interview Insight

* Demonstrates manual string matching logic.
* Helps understand how substring search works internally.
* Can be optimized using advanced algorithms like **KMP**.

---

## ✅ Status

✔ Solved successfully
✔ Brute-force string matching approach
✔ Interview-ready implementation

---

*This solution is part of my Data Structures & Algorithms (DSA) practice in Java.*
