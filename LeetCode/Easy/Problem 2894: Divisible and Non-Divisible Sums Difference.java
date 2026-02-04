# LeetCode Easy Problems – Java

## 🧩 Problem 2894: Divisible and Non-Divisible Sums Difference

**Platform:** LeetCode
**Difficulty:** Easy
**Language:** Java ☕

---

## 📌 Problem Description

You are given two positive integers `n` and `m`.

* `num1` is the **sum of all integers from 1 to n that are NOT divisible by m**
* `num2` is the **sum of all integers from 1 to n that ARE divisible by m**

Return the **difference**:

```text
num1 - num2
```

---

## 🧠 Approach (Single Loop / Brute Force)

This solution uses a **simple iteration approach**:

* Traverse all numbers from `1` to `n`
* For each number:

  * If it is divisible by `m`, add it to `num2`
  * Otherwise, add it to `num1`
  * Finally, return `num1 - num2`

This approach is straightforward, readable, and well-suited for an **easy-level problem**.

---

## 🪜 Step-by-Step Explanation

1. Initialize two variables:

   * `num1` → sum of numbers **not divisible** by `m`
   * `num2` → sum of numbers **divisible** by `m`

2. Loop from `1` to `n`:

   * Use modulo operator (`%`) to check divisibility

3. Update sums accordingly

4. Return the difference `num1 - num2`

---

## ⏱️ Complexity Analysis

**Time Complexity:** `O(n)`
  (Single loop from `1` to `n`)

**Space Complexity:** `O(1)`
  (Only constant extra variables used)

---

## 📂 Code

class Solution {
    public int differenceOfSums(int n, int m) {
        int num1 = 0;
        int num2 = 0;

        for (int i = 1; i <= n; i++) {
            if (i % m == 0) {
                num2 += i;
            } else {
                num1 += i;
            }
        }
        return num1 - num2;
    }
}

---

## ✅ Status

✔ Solved using simple iteration
✔ Constant space usage
✔ Beginner-friendly solution

---

**This solution is part of my Data Structures & Algorithms (DSA) practice in Java.**
