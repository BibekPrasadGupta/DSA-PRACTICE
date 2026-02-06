# LeetCode Medium Problems – Java

## 🧩 Problem 319: Bulb Switcher

**Platform:** LeetCode
**Difficulty:** Medium
**Language:** Java ☕

---

## 📌 Problem Description

There are `n` bulbs that are initially **off**.

You turn on all the bulbs in the first round. Then, in every subsequent round `i` (starting from 2), you toggle the state of every `i`‑th bulb.

After completing `n` rounds, return the **number of bulbs that are on**.

---

## 🧠 Key Observation

A bulb ends up **ON** only if it is toggled an **odd number of times**.

* Most numbers have an even number of divisors*
**Perfect squares** have an odd number of divisors

👉 Therefore, **only bulbs at perfect square positions remain ON**.

---

## 🧠 Approach (Mathematical / Perfect Squares)

Instead of simulating all rounds, we count how many **perfect squares** are ≤ `n`.

This is equivalent to finding:

```text
⌊√n⌋
```

---

## 🪜 Step-by-Step Explanation

1. Initialize a counter `count`
2. Start from `i = 1`
3. While `i * i ≤ n`:

   * Increment `count`
   * Increment `i`
4. Return `count`

Each valid `i` represents a bulb at position `i²` that remains ON.

---

## ⏱️ Complexity Analysis

**Time Complexity:** `O(√n)`
  (Loop runs until `i * i ≤ n`)

**Space Complexity:** `O(1)`
  (Only constant extra space used)

---

## 📂 Code

class Solution {
    public int bulbSwitch(int n) {
        int count = 0;
        int i = 1;

        while (i * i <= n) {
            count++;
            i++;
        }
        return count;
    }
}


## ✅ Status

✔ Solved using mathematical observation
✔ No simulation required
✔ Efficient and interview-friendly solution

---

*This solution is part of my Data Structures & Algorithms (DSA) practice in Java.*
