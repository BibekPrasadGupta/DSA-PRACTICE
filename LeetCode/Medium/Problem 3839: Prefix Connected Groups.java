# LeetCode Easy Problems – Java

## 🧩 Problem 3839: Prefix Connected Groups

**Platform:** LeetCode
**Difficulty:** Easy
**Language:** Java ☕

---

## 📌 Problem Description

You are given an array of strings `words` and an integer `k`.

A group is formed when **two or more words share the same prefix of length `k`**.

Return the number of such groups.

---

## 🧠 Approach

1. Use a HashMap to count occurrences of each prefix of length `k`.
2. Ignore words shorter than `k`.
3. Count how many prefixes appear at least twice.

---

## 🪜 Step-by-Step Explanation

1. Create a map `prefixCount`.
2. Traverse each word:

   * If length < k → skip.
   * Extract prefix of length `k`.
   * Store frequency in map.
3. Traverse map values:

   * If count ≥ 2 → increment groups.
4. Return total groups.

---

## ⏱️ Complexity Analysis

**Time Complexity:** `O(n * k)`
  (Substring operation for each word)

**Space Complexity:** `O(n)`
  (HashMap storage)

---

## 📂 Code

class Solution {
    public int prefixConnected(String[] words, int k) {
        Map<String,Integer> prefixCount = new HashMap<>();
        for(String word : words){
            if(word.length() < k) continue;
            String prefix = word.substring(0,k);
            prefixCount.put(prefix,prefixCount.getOrDefault(prefix,0)+1);
        }
        int groups = 0;
        for(int count: prefixCount.values()){
            if(count>=2){
                groups++;
            }
        }
        return groups;
    }
}

---

## 💡 Interview Insight

* Good example of prefix-based grouping using HashMap.
* Demonstrates frequency counting and filtering.
* Related to string hashing and grouping problems.

---

## ✅ Status

✔ Solved successfully
✔ Clean HashMap approach
✔ Interview-ready implementation

---

*This solution is part of my Data Structures & Algorithms (DSA) practice in Java.*
