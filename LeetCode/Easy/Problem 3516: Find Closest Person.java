# LeetCode Easy Problems – Java

## 🧩 Problem 3516: Find Closest Person

**Platform:** LeetCode
**Difficulty:** Easy
**Language:** Java ☕

---

## 📌 Problem Description

You are given three integers `x`, `y`, and `z` representing positions on a number line.

* Person 1 is at position `x`
* Person 2 is at position `y`
* A reference point is at position `z`

Determine which person is **closer to `z`**:

* Return `1` if person 1 is closer
* Return `2` if person 2 is closer
* Return `0` if both are at the same distance

---

## 🧠 Approach (Absolute Distance Comparison)

* Calculate the absolute distance between `x` and `z`.
* Calculate the absolute distance between `y` and `z`.
* Compare both distances to decide the result.

* Using absolute values ensures correct distance comparison regardless of sign. *

---

## 🪜 Step-by-Step Explanation

1. Compute distance `a = |z - x|`.
2. Compute distance `b = |z - y|`.
3. If `a < b`, return `1`.
4. If `a > b`, return `2`.
5. Otherwise, return `0`.

---

## ⏱️ Complexity Analysis

**Time Complexity:** `O(1)`
  (Only constant-time operations)
**Space Complexity:** `O(1)`
  (No extra space used)

---

## 📂 Code

class Solution {
    public int findClosest(int x, int y, int z) {
        int a = Math.abs(z - x);
        int b = Math.abs(z - y);
        if (a < b) {
            return 1;
        } else if (a > b) {
            return 2;
        } else {
            return 0;
        }
    }
}

---

## ✅ Status

✔ Solved using absolute distance comparison
✔ Clean, readable, and efficient solution

---

* This solution is part of my Data Structures & Algorithms (DSA) practice in Java. *
