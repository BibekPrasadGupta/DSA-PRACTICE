# LeetCode Easy Problems – Java

## 🧩 Problem 2549: Count Distinct Numbers on Board

**Platform:** LeetCode
**Difficulty:** Easy
**Language:** Java ☕

---

## 📌 Problem Description

You are given an integer `n`.

Initially, there is a number `n` written on a board.

You perform the following operation repeatedly:

* Choose a number `x` on the board.
* Find a number `i` such that `1 <= i <= x` and `x % i == 1`.
* Add `i` to the board if it is not already present.

Return the number of **distinct integers** on the board after performing the operations.

---

## 🧠 Approach

By observing the pattern:

* For `n = 1`, only one number exists.
* For any `n > 1`, all numbers from `1` to `n-1` can eventually appear.

Thus, the total distinct numbers will be `n - 1`.

---

## 🪜 Step-by-Step Explanation

1. If `n == 1`, return `1`.
2. Otherwise, return `n - 1`.

---

## ⏱️ Complexity Analysis

**Time Complexity:** `O(1)`
  (Constant time computation)

**Space Complexity:** `O(1)`
  (No extra space used)

---

## 📂 Code

class Solution {
    public int distinctIntegers(int n) {
            if(n==1){
                return n;
            }
       return n-1;
    }
}

---

## 💡 Interview Insight

* Tests observation and pattern recognition.
* Avoids brute-force simulation.
* Good example of mathematical optimization.

---

## ✅ Status

✔ Solved successfully
✔ Optimal constant-time solution
✔ Interview-ready implementation

---

*This solution is part of my Data Structures & Algorithms (DSA) practice in Java.*
