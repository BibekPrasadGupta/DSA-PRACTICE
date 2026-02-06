# LeetCode Easy Problems – Java

## 🧩 Problem 3512: Minimum Operations to Make the Array Sum Divisible by K

**Platform:** LeetCode
**Difficulty:** Easy
**Language:** Java ☕

---

## 📌 Problem Description

You are given an integer array `nums` and an integer `k`.

In one operation, you can **remove one element** from the array.

Return the **minimum number of operations** required to make the **sum of the array divisible by `k`**.

---

## 🧠 Key Observation

Let:

* `sum` = sum of all elements in the array

If:

* `sum % k == 0` → the sum is already divisible by `k`, so **0 operations** are needed
* Otherwise, the **minimum number of removals required is `sum % k`**

This works because removing one element effectively reduces the total sum by some value, and the remainder determines how many removals are required to reach the nearest divisible sum.

---

## 🧠 Approach (Sum & Modulo)

1. Compute the total sum of the array
2. Check the remainder when divided by `k`
3. If remainder is `0`, return `0`
4. Otherwise, return the remainder

This approach avoids unnecessary simulations and directly uses **mathematical reasoning**.

---

## 🪜 Step-by-Step Explanation

1. Initialize `sum = 0`
2. Traverse the array and add each element to `sum`
3. Compute `sum % k`
4. Return:

   * `0` if divisible
   * Otherwise, the remainder

---

## ⏱️ Complexity Analysis

**Time Complexity:** `O(n)`
  (Single traversal of the array)

**Space Complexity:** `O(1)`
  (Only constant extra space used)

---

## 📂 Code

class Solution {
    public int minOperations(int[] nums, int k) {
        int sum = 0;
        
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }

        if (sum % k == 0) {
            return 0;
        } else {
            return sum % k;
        }
    }
}

---

## ✅ Status

✔ Solved using mathematical observation
✔ No simulation required
✔ Simple and efficient solution

---

*This solution is part of my Data Structures & Algorithms (DSA) practice in Java.*
