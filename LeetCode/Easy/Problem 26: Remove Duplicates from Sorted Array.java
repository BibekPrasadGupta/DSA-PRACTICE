# LeetCode Easy Problems – Java

## 🧩 Problem 26: Remove Duplicates from Sorted Array

**Platform:** LeetCode
**Difficulty:** Easy
**Language:** Java ☕

---

## 📌 Problem Description

Given an integer array `nums` sorted in non-decreasing order, remove the duplicates **in-place** such that each unique element appears only once.

Return the number of unique elements `k`.

The first `k` elements of `nums` should contain the unique elements in the same order as they were present in the original array.

---

## 🧠 Approach

We use the **Two Pointer Technique**.

* One pointer (`i`) scans the array.
* Another pointer (`count`) keeps track of the position where the next unique element should be placed.

Whenever we find a new element different from the previous one, we place it at index `count`.

---

## 🪜 Step-by-Step Explanation

1. Initialize `count = 1` (first element is always unique).
2. Traverse from index `1` to end.
3. If `nums[i] != nums[i-1]`:

   * Place `nums[i]` at `nums[count]`.
   * Increment `count`.
4. After loop ends, return `count`.

---

## ⏱️ Complexity Analysis

**Time Complexity:** `O(n)`
  (Single pass through the array)

**Space Complexity:** `O(1)`
  (In-place modification, no extra space used)

---

## 📂 Code

class Solution {
    public int removeDuplicates(int[] nums) {
      int count = 1;
      for(int i=1; i<nums.length; i++){
        if(nums[i]!=nums[i-1]){
            nums[count]=nums[i];
            count++;
        }
      }
      return count;
    }
}

---

## 💡 Interview Insight

* Classic Two Pointer problem.
* Tests in-place array modification.
* Very common interview question.

---

## ✅ Status

✔ Solved successfully
✔ In-place optimized approach
✔ Interview-ready implementation

---

*This solution is part of my Data Structures & Algorithms (DSA) practice in Java.*
