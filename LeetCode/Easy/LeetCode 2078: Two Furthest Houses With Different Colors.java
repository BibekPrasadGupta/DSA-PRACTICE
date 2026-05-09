# 🧩 LeetCode 2078: Two Furthest Houses With Different Colors

**Platform:** LeetCode
**Difficulty:** Easy
**Language:** Java ☕

---

## 📌 Problem Description

Given an array `colors`, return the maximum distance between two houses with different colors.

The distance between two houses `i` and `j` is `|i - j|`.

---

## 🧠 Approach

* Compare first element with elements from the end
* Compare last element with elements from the beginning
* Take maximum valid distance

---

## 🔑 Key Points

* Only need to check edges for maximum distance
* Break early once a valid pair is found
* Avoid unnecessary full comparisons

---

## ⏱️ Complexity

* Time: O(n)
* Space: O(1)

---

## 💻 Code

class Solution {
    public int maxDistance(int[] colors) {
        int n = colors.length;
        int max = 0;

        for(int i = n - 1; i >= 0; i--){
            if(colors[i] != colors[0]){
                max = Math.max(max, i);
                break;
            }
        }

        for(int i = 0; i < n; i++){
            if(colors[i] != colors[n - 1]){
                max = Math.max(max, n - 1 - i);
                break;
            }
        }

        return max;
    }
}

---

## 💡 Interview Insight

* Smart observation-based problem
* Avoid brute-force by checking boundary elements
* Tests optimization and thinking ability

---

## ✅ Status

✔ Solved successfully
✔ Optimized O(n) approach
✔ Interview-ready implementation

---

*This solution is part of my Data Structures & Algorithms (DSA) practice in Java.*
