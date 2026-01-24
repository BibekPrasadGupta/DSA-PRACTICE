# LeetCode Hard Problems – Java

## 🧩 Problem 4: Median of Two Sorted Arrays

**Platform:** LeetCode
**Difficulty:** Hard
**Language:** Java ☕

---

## 📌 Problem Description

Given two sorted arrays `nums1` and `nums2` of sizes `n` and `m` respectively, return the **median** of the two sorted arrays.

The overall run time complexity is expected to be efficient, but in this solution, the focus is on **clarity and strong fundamentals**.

---

## 🧠 Approach (Merge-Based / Two-Pointer Technique)

This solution uses a **brute-force merge approach**, similar to the merge step of **Merge Sort**.

### 🔹 How it works:

* Merge both sorted arrays into a single sorted array
* Use pointer comparison to maintain sorted order
* Once merged, compute the median based on total length

This approach avoids advanced techniques like binary search and instead emphasizes **readability and correctness**.

---

## 🪜 Step-by-Step Explanation

### 1️⃣ Merging the Arrays

* Use three pointers:

  * `p1` for `nums1`
  * `p2` for `nums2`
  * `p3` for the merged array
* Compare elements from both arrays
* Insert the smaller element into the merged array
* Use `Integer.MAX_VALUE` when one array is exhausted

---

### 2️⃣ Finding the Median

Let `len` be the length of the merged array.

* **If `len` is even:**

  ```text
  median = (element at len/2 + element at (len/2 - 1)) / 2
  ```

* **If `len` is odd:**

  ```text
  median = element at len/2
  ```

The result is returned as a `double`.

---

## ⏱️ Complexity Analysis

* **Time Complexity:** `O(n + m)`
  (Merging both arrays)

* **Space Complexity:** `O(n + m)`
  (Extra array used for merging)

---

## 📂 Code

```java
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] ans = merge(nums1, nums2);
        
        if (ans.length % 2 == 0) {
            return (double)(ans[ans.length / 2] + ans[(ans.length / 2) - 1]) / 2;
        } else {
            return ans[ans.length / 2];
        }
    }

    public int[] merge(int[] arr1, int[] arr2) {
        int[] ans = new int[arr1.length + arr2.length];
        int p1 = 0, p2 = 0, p3 = 0;

        while (p1 < arr1.length || p2 < arr2.length) {
            int val1 = p1 < arr1.length ? arr1[p1] : Integer.MAX_VALUE;
            int val2 = p2 < arr2.length ? arr2[p2] : Integer.MAX_VALUE;

            if (val1 < val2) {
                ans[p3++] = val1;
                p1++;
            } else {
                ans[p3++] = val2;
                p2++;
            }
        }
        return ans;
    }
}
```

---

## ✅ Status

✔ Solved using merge-based approach
✔ Two-pointer technique applied
✔ Beginner-friendly and easy to understand

---

*This solution is part of my Data Structures & Algorithms (DSA) practice in Java.*
