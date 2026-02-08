# LeetCode Easy Problems – Java

## 🧩 Problem 1518: Water Bottles

**Platform:** LeetCode
**Difficulty:** Easy
**Language:** Java ☕

---

## 📌 Problem Description

You are given two integers:

* `numBottles`: the number of full water bottles you initially have.
* `numExchange`: the number of empty bottles required to exchange for one full bottle.

Each time you drink a full bottle, you gain one empty bottle. You can exchange empty bottles for full ones as long as you have at least `numExchange` empty bottles.

Return the **maximum number of water bottles you can drink**.

---

## 🧠 Approach (Simulation / Greedy)

* Start by drinking all initially available full bottles.
* Keep track of the total bottles drunk.
* While the number of empty bottles is greater than or equal to `numExchange`:

  * Exchange empty bottles for new full bottles.
  * Add newly obtained bottles to the total count.
  * Update the number of empty bottles accordingly.

This greedy simulation ensures that every possible exchange is utilized.

---

## 🪜 Step-by-Step Explanation

1. Initialize `ans` with `numBottles` (initial bottles drunk).
2. While `numBottles >= numExchange`:

   * Compute `newBottles = numBottles / numExchange`.
   * Compute remaining empty bottles using modulo.
   * Add `newBottles` to `ans`.
   * Update `numBottles = newBottles + remainingBottles`.
3. Return `ans` as the final result.

---

## ⏱️ Complexity Analysis

**Time Complexity:** `O(n)`
  (Each loop iteration reduces the number of bottles)
**Space Complexity:** `O(1)`
  (Only constant extra space is used)

---

## 📂 Code

class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int ans = numBottles;
        while (numBottles >= numExchange) {
            int newBottles = numBottles / numExchange;
            int remBottles = numBottles % numExchange;
            ans += newBottles;
            numBottles = remBottles + newBottles;
        }
        return ans;
    }
}


---

## ✅ Status

✔ Solved using greedy simulation approach
✔ Efficient and beginner-friendly solution

---

* This solution is part of my Data Structures & Algorithms (DSA) practice in Java. *
