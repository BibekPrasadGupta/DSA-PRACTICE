# LeetCode Easy Problems – Java

## 🧩 Problem 34: Find First and Last Position of Element in Sorted Array

**Platform:** LeetCode
**Difficulty:** Medium
**Language:** Java ☕

---

## 📌 Problem Description

Given an array of integers `nums` sorted in non-decreasing order, find the starting and ending position of a given `target` value.

If the target is not found in the array, return `[-1, -1]`.

You must write an algorithm with `O(log n)` runtime complexity.

---

## 🧠 Approach

We use Binary Search twice:

* First to find the first occurrence of the target.
* Second to find the last occurrence of the target.

By modifying the search boundaries after finding the target, we can locate both positions efficiently.

---

## 🪜 Step-by-Step Explanation

1. Initialize answer array as `[-1, -1]`.
2. Perform Binary Search to find first occurrence:

   * When target found → store index and move left.
3. Perform Binary Search to find last occurrence:

   * When target found → store index and move right.
4. Return the result array.

---

## ⏱️ Complexity Analysis

** Time Complexity:** `O(log n)`
  (Binary Search performed twice)

**Space Complexity:** `O(1)`
  (Only constant extra space used)

---

## 📂 Code

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int [] ans = {-1,-1};
        if(nums.length==0){
            return ans;
        }
        ans[0]=firstOccurence(nums,target);
        ans[1]=lastOccurence(nums,target);

        return ans;
    }
    public int firstOccurence (int[] nums, int target) {
        int ans=-1;
        int start = 0;
        int end = nums.length-1;
        while(start<=end){
            int mid = start + (end - start)/2;
            if(nums[mid]==target){
                ans=mid;
                end=mid-1;
            }
            else if(nums[mid]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return ans;
    }
    public int lastOccurence (int[] nums, int target) {
        int ans=-1;
        int start = 0;
        int end = nums.length-1;
        while(start<=end){
            int mid = start + (end - start)/2;
            if(nums[mid]==target){
                ans=mid;
                start=mid+1;
            }
            else if(nums[mid]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return ans;
    }
}

---

## 💡 Interview Insight

* Classic Binary Search boundary problem.
* Tests ability to modify search conditions.
* Commonly asked medium-level interview question.

---

## ✅ Status

✔ Solved successfully
✔ Efficient double binary search
✔ Interview-ready implementation

---

*This solution is part of my Data Structures & Algorithms (DSA) practice in Java.*
