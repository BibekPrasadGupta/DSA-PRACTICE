# LeetCode Easy Problems – Java

## 🧩 Problem 3774: Absolute Difference Between K Elements

**Platform:** LeetCode
**Difficulty:** Easy
**Language:** Java ☕

---

## 📌 Problem Description

You are given an integer array `nums` and an integer `k`.

Find the sum of the **k smallest elements** and the sum of the **k largest elements** in the array.

Return the **absolute difference** between these two sums.

---

## 🧠 Approach

1. Sort the array in ascending order.
2. The first `k` elements will be the **k smallest elements**.
3. The last `k` elements will be the **k largest elements**.
4. Compute the sum of both groups and return the absolute difference.

---

## 🪜 Step-by-Step Explanation

1. Sort the array using `Arrays.sort()`.
2. Initialize two variables: `maxSum` and `minSum`.
3. Loop from `0` to `k-1`:

   * Add `nums[i]` to `maxSum` (k smallest elements).
   * Add `nums[n-i-1]` to `minSum` (k largest elements).
4. Return `Math.abs(maxSum - minSum)`.

---

## ⏱️ Complexity Analysis

**Time Complexity:** `O(n log n)`
  (Due to sorting)

**Space Complexity:** `O(1)`
  (No extra space used apart from variables)

---

## 📂 Code

class Solution {
    public int absDifference(int[] nums, int k) {
      Arrays.sort(nums);
      int maxSum=0;
      int minSum=0;
      int n=nums.length;
      for(int i=0; i<k; i++){
        maxSum=maxSum+nums[i];
        minSum=minSum+nums[n-i-1];
      }
      return Math.abs(maxSum-minSum);
    }
}
---

## 💡 Interview Insight

* Demonstrates sorting-based selection technique.
* Helps understand how to pick extreme elements efficiently.
* Common pattern when working with smallest and largest values.

---

## ✅ Status

✔ Solved successfully
✔ Sorting-based solution
✔ Interview-ready implementation

---

*This solution is part of my Data Structures & Algorithms (DSA) practice in Java.*
