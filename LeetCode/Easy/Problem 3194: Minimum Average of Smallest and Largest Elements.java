# LeetCode Easy Problems – Java

## 🧩 Problem 3194: Minimum Average of Smallest and Largest Elements

**Platform:** LeetCode
**Difficulty:** Easy
**Language:** Java ☕

---

## 📌 Problem Description

You are given an integer array `nums`.

In each operation, pair the smallest and largest remaining elements and compute their average.

Return the minimum average among all such pairs.

---

## 🧠 Approach

1. Sort the array.
2. Pair the smallest element with the largest element.
3. Compute their average.
4. Track the minimum average among all pairs.

Sorting ensures correct pairing from both ends.

---

## 🪜 Step-by-Step Explanation

1. Sort the array in ascending order.
2. Initialize `res = Double.MAX_VALUE`.
3. Loop from `i = 0` to `n - 1`:

   * `minElement = nums[i]`
   * `maxElement = nums[n - i - 1]`
   * Compute average = `(minElement + maxElement) / 2.0`
   * Update `res` with minimum value.
4. Return `res`.

---

## ⏱️ Complexity Analysis

**Time Complexity:** `O(n log n)`
  (Due to sorting)

**Space Complexity:** `O(1)`
  (Ignoring sorting space depending on implementation)

---

## 📂 Code

class Solution {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        double res = Double.MAX_VALUE;
        for(int i=0; i<n; i++){
            int minElement=nums[i];
            int maxElement=nums[n-i-1];
            double avg = (minElement + maxElement) / 2.0;
            res= Math.min(avg,res);
        }
        return res;
    }
}

---

## 💡 Interview Insight

* Demonstrates sorting + two-pointer pairing.
* Tests understanding of array manipulation and averages.
* Important to use `2.0` for correct double division.

---

## ✅ Status

✔ Solved successfully
✔ Sorting-based approach
✔ Interview-ready implementation

---

*This solution is part of my Data Structures & Algorithms (DSA) practice i
