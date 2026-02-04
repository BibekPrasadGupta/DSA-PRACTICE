## LeetCode Easy Problems – Java

## 🧩 Problem 167: Two Sum II – Input Array Is Sorted

**Platform:** LeetCode
**Difficulty:** Easy
**Language:** Java ☕

---

## 📌 Problem Description

Given a **1-indexed sorted array** of integers `numbers` and an integer `target`, find **two numbers** such that they add up to `target`.

Return the **indices (1-based)** of the two numbers as an integer array `[index1, index2]`, where:

* `index1 < index2`
* Exactly **one solution exists**
* You may **not use the same element twice**

---

## 🧠 Approach (Two-Pointer Technique)

Since the array is already **sorted**, this solution uses the **two-pointer approach**, which is much more efficient than brute force.

## 🔹 Why Two Pointers?

* Takes advantage of the sorted property
* Eliminates unnecessary comparisons
* Reduces time complexity from `O(n²)` to `O(n)`

---

## 🪜 Step-by-Step Explanation

1. Initialize two pointers:

   * `start` at the beginning of the array
   * `end` at the end of the array

2. Calculate the sum of elements at both pointers

3. Compare the sum with `target`:

   * If `sum == target` → return indices (`start + 1`, `end + 1`)
   * If `sum > target` → move `end` left
   * If `sum < target` → move `start` right

4. Continue until `start < end`

---

## ⏱️ Complexity Analysis

**Time Complexity:** `O(n)`
  (Single pass using two pointers)

**Space Complexity:** `O(1)`
  (Only constant extra space used)

---

## 📂 Code

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] ans = new int[2];
        int start = 0;
        int end = numbers.length - 1;

        while (start < end) {
            int sum = numbers[start] + numbers[end];

            if (sum == target) {
                ans[0] = start + 1; // 1-based index
                ans[1] = end + 1;   // 1-based index
                return ans;
            } else if (sum > target) {
                end--;
            } else {
                start++;
            }
        }
        return ans;
    }
}

---

## ✅ Status

✔ Solved using two-pointer technique
✔ Optimized solution for sorted arrays
✔ Interview-friendly and efficient

---

**This solution is part of my Data Structures & Algorithms (DSA) practice in Java.**
