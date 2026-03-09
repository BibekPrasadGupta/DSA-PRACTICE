# LeetCode Easy Problems – Java

## 🧩 Problem 14: Longest Common Prefix

**Platform:** LeetCode
**Difficulty:** Easy
**Language:** Java ☕

---

## 📌 Problem Description

Write a function to find the **longest common prefix string** among an array of strings.

If there is no common prefix, return an empty string `""`.

---

## 🧠 Approach

We take the first string as a reference and compare its characters with the same position in all other strings.

If a mismatch occurs or a string ends, the prefix found so far is returned.

---

## 🪜 Step-by-Step Explanation

1. Take the first string from the array.
2. Traverse each character of the first string.
3. Compare the character with the same position in all other strings.
4. If a mismatch occurs or index exceeds any string length → return prefix.
5. If all characters match, continue checking.
6. If the loop completes, return the first string.

---

## ⏱️ Complexity Analysis

**Time Complexity:** `O(n × m)`
  (Where `n` is number of strings and `m` is length of the prefix)

**Space Complexity:** `O(1)`
  (No extra space used)

---

## 📂 Code

class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs == null && strs.length == 0){
            return "";
        }
        String first = strs[0];
        for(int i=0; i<first.length(); i++){
            char ch = first.charAt(i);
            for(int j=1; j<strs.length; j++){
                if(i>=strs[j].length() || strs[j].charAt(i) != ch){
                    return first.substring(0,i);
                }
            }
        }
        return first;
    }
}

---

## 💡 Interview Insight

* Classic string comparison problem.
* Tests understanding of string traversal and boundary conditions.
* Can also be solved using sorting or divide-and-conquer.

---

## ✅ Status

✔ Solved successfully
✔ Efficient prefix comparison approach
✔ Interview-ready implementation

---

*This solution is part of my Data Structures & Algorithms (DSA) practice in Java.*
