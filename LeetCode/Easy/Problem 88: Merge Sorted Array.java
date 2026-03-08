# LeetCode Easy Problems – Java

## 🧩 Problem 88: Merge Sorted Array

**Platform:** LeetCode
**Difficulty:** Easy
**Language:** Java ☕

---

## 📌 Problem Description

You are given two integer arrays `nums1` and `nums2`, sorted in non-decreasing order, and two integers `m` and `n`.

* `nums1` has a length of `m + n`, where the first `m` elements represent the valid elements.
* `nums2` has `n` elements.

Merge `nums2` into `nums1` as one sorted array.

The final sorted array should be stored inside `nums1`.

---

## 🧠 Approach

Instead of merging from the beginning, we start filling the array from the **end**.

This avoids overwriting elements in `nums1`.

We compare the largest elements of both arrays and place the larger one at the last available position.

---

## 🪜 Step-by-Step Explanation

1. Initialize three pointers:

   * `i = m - 1` → last valid element in `nums1`
   * `j = n - 1` → last element in `nums2`
   * `k = m + n - 1` → last index of `nums1`

2. Compare elements from the end of both arrays.

3. Place the larger element at position `k`.

4. Decrease the respective pointers.

5. Continue until one array is exhausted.

6. If elements remain in `nums2`, copy them to `nums1`.

---

## ⏱️ Complexity Analysis

**Time Complexity:** `O(m + n)`
  (Each element is processed once)

**Space Complexity:** `O(1)`
  (In-place merge without extra space)

---

## 📂 Code

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int i = m - 1;     
        int j = n - 1; 
        int k = m + n - 1;
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }
        while (j >= 0) {
            nums1[k] = nums2[j];
            j--;
            k--;
        }
    }
}

---

## 💡 Interview Insight

* Classic **two-pointer technique** problem.
* Important trick: merge from the **end** to avoid overwriting elements.
* Frequently asked array manipulation interview question.

---

## ✅ Status

✔ Solved successfully
✔ Optimal in-place merging solution
✔ Interview-ready implementation

---

*This solution is part of my Data Structures & Algorithms (DSA) practice in Java.*
