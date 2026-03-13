# LeetCode Easy Problems – Java

## 🧩 Problem 3658: GCD of Odd and Even Sums

**Platform:** LeetCode
**Difficulty:** Easy
**Language:** Java ☕

---

## 📌 Problem Description

You are given an integer `n`.

Consider the first `n` natural numbers.

* Find the **sum of all odd numbers**.
* Find the **sum of all even numbers**.

Return the **greatest common divisor (GCD)** of these two sums.

---

## 🧠 Approach

When we compute the sums mathematically:

* Sum of first `n` odd numbers = `n²`
* Sum of first `n` even numbers = `n(n + 1)`

The GCD of `n²` and `n(n + 1)` simplifies to **`n`**.

Therefore, the result can be returned directly without extra computation.

---

## 🪜 Step-by-Step Explanation

1. Observe mathematical pattern of sums.
2. Odd sum → `n²`.
3. Even sum → `n(n + 1)`.
4. Compute `gcd(n² , n(n + 1))`.
5. Simplified result = `n`.
6. Return `n`.

---

## ⏱️ Complexity Analysis

**Time Complexity:** `O(1)`
  (Direct mathematical result)

**Space Complexity:** `O(1)`
  (No extra space used)

---

## 📂 Code

class Solution {
    public int gcdOfOddEvenSums(int n) {
        return n;
    }
}


---

## 💡 Interview Insight

* Demonstrates recognizing **mathematical patterns**.
* Avoids unnecessary computation.
* Highlights importance of simplifying expressions.

---

## ✅ Status

✔ Solved successfully
✔ Optimized constant-time solution
✔ Interview-ready implementation

---

*This solution is part of my Data Structures & Algorithms (DSA) practice in Java.*
