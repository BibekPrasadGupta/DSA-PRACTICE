# LeetCode Easy Problems – Java

## 🧩 Problem 162: Find Peak Element

**Platform:** LeetCode
**Difficulty:** Medium
**Language:** Java ☕

---

## 📌 Problem Description

A peak element is an element that is strictly greater than its neighbors.

Given an integer array `nums`, find a peak element and return its index.

If the array contains multiple peaks, return the index to any of the peaks.

You must write an algorithm that runs in `O(log n)` time.

---

## 🧠 Approach

We use **Binary Search** to locate a peak efficiently.

* If middle element is greater than both neighbors → peak found.
* If right neighbor is greater → peak lies on the right side.
* Otherwise → peak lies on the left side.

---

## 🪜 Step-by-Step Explanation

1. Handle edge cases:

   * If array length is 1 → return 0
   * If first element > second → return 0
   * If last element > second last → return last index

2. Perform Binary Search between index `1` and `n-2`.

3. If `nums[mid] > nums[mid-1]` and `nums[mid] > nums[mid+1]` → return `mid`.

4. If `nums[mid] < nums[mid+1]` → move right.

5. Else → move left.

---

## ⏱️ Complexity Analysis

**Time Complexity:** `O(log n)`
  (Binary Search reduces search space each iteration)

**Space Complexity:** `O(1)`
  (Constant extra space used)

---

## 📂 Code

class Solution {
    public int findPeakElement(int[] nums) {
          if(nums.length==1){
            return 0;
        }else if ( nums[0]>nums[1]){
            return 0;
        }else if ( nums[nums.length-1]>nums[nums.length-2]){
            return nums.length-1;
        }else {
            int start = 1 ;
            int end = nums.length-2;
            while(start<=end){
                 int mid = ( start + end)/2;
                 if(nums[mid]>nums[mid-1] && nums[mid]>nums[mid+1]){
                     return mid ;
                 }else if ( nums[mid]<nums[mid+1]){
                     start = mid+1 ;
                 }else{
                     end = mid-1 ;
                 }
             }
           return -1 ;
        }
    }
}

---

## 💡 Interview Insight

* Classic Binary Search application beyond sorted arrays.
* Demonstrates decision-based search.
* Frequently asked medium-level interview question.

---

## ✅ Status

✔ Solved successfully
✔ Efficient binary search solution
✔ Interview-ready implementation

---

*This solution is part of my Data Structures & Algorithms (DSA) practice in Java.*
