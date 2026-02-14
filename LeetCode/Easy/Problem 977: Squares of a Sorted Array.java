# LeetCode Easy Problems – Java

## 🧩 Problem 977: Squares of a Sorted Array

**Platform:** LeetCode
**Difficulty:** Easy
**Language:** Java ☕

---

## 📌 Problem Description

Given an integer array `nums` sorted in non-decreasing order, return an array of the **squares of each number**, also sorted in non-decreasing order.

---

## 🧠 Approach 1 (Brute Force – Square and Sort)

Your solution follows a simple two-step approach:

1. Square every element in the array.
2. Sort the resulting array.

This works because squaring negative numbers can disturb the original sorted order, so sorting again ensures correct order.

---

## 🪜 Step-by-Step Explanation

1. Create a new array `arr` of the same length.
2. Traverse the input array:

   * Store `nums[i] * nums[i]` in `arr[i]`.
3. Sort the `arr` using `Arrays.sort()`.
4. Return the sorted squared array.

---

## ⏱️ Complexity Analysis

**Time Complexity:** `O(n log n)`
  (Due to sorting step)
**Space Complexity:** `O(n)`
  (New array created)


## 📂 Code (Your Approach)

class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = nums[i] * nums[i];
        }
        Arrays.sort(arr);
        return arr;
    }
}


---

## 💡 Interview Insight

* Brute force solution is acceptable.
* Interviewers usually expect the **two-pointer O(n) approach**.
* Important pattern: Handling negative numbers in sorted arrays.

---

## ✅ Status

✔ Correct solution
✔ Can be optimized further using two pointers
✔ Good array manipulation practice

---

*This solution is part of my Data Structures & Algorithms (DSA) practice in Java.*
