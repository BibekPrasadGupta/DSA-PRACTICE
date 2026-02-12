# LeetCode Easy Problems – Java

## 🧩 Problem 1464: Maximum Product of Two Elements in an Array

**Platform:** LeetCode
**Difficulty:** Easy
**Language:** Java ☕

---

## 📌 Problem Description

Given an integer array `nums`, choose two **different indices** `i` and `j` such that the value of:

```
(nums[i] - 1) * (nums[j] - 1)
```

is maximized.

Return the maximum value.

---

## 🧠 Approach (Finding Two Largest Elements)

To maximize:

```
(max - 1) * (secondMax - 1)
```

We only need to find:

* The largest element in the array
* The second largest element in the array

Instead of sorting (which takes `O(n log n)`), we can find both in a **single pass**.

---

## 🪜 Step-by-Step Explanation

1. Initialize:

   * `max = 0`
   * `smax = 0` (second maximum)

2. Traverse the array:

   * If current element is greater than `max`:

     * Update `smax = max`
     * Update `max = nums[i]`
   * Else if current element is greater than `smax`:

     * Update `smax = nums[i]`

3. Return:

```
(max - 1) * (smax - 1)
```

---

## ⏱️ Complexity Analysis

**Time Complexity:** `O(n)`
  (Single traversal of the array)
**Space Complexity:** `O(1)`
  (Only two extra variables used)

---

## 📂 Code

class Solution {
    public int maxProduct(int[] nums) {
        int smax = 0;
        int max = 0;

        for (int i = 0; i < nums.length; i++) {
            if (max < nums[i]) {
                smax = max;
                max = nums[i];
            } else if (smax < nums[i]) {
                smax = nums[i];
            }
        }

        int ans = (max - 1) * (smax - 1);
        return ans;
    }
}

---

## 💡 Interview Insight

* Sorting is not required.
* Tracking the two largest values in one pass is more efficient.
* This is a common pattern question in interviews.

---

## ✅ Status

✔ Solved using single-pass maximum tracking
✔ Optimized to `O(n)` time
✔ Interview-friendly approach

---

* This solution is part of my Data Structures & Algorithms (DSA) practice in Java. *
