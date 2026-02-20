# LeetCode Easy Problems – Java

## 🧩 Problem 35: Search Insert Position

**Platform:** LeetCode
**Difficulty:** Easy
**Language:** Java ☕

---

## 📌 Problem Description

Given a sorted array of distinct integers `nums` and a target value `target`, return the index if the target is found.

If not, return the index where it would be if it were inserted in order.

You must write an algorithm with `O(log n)` runtime complexity.

---

## 🧠 Approach

Since the array is sorted, we apply Binary Search.

If the target exists, return its index.

If it does not exist, the correct insert position will be stored in `start` after the loop ends.

---

## 🪜 Step-by-Step Explanation

1. Initialize `start = 0` and `end = nums.length - 1`.
2. While `start <= end`, calculate:
   `mid = start + (end - start) / 2`
3. If `nums[mid] == target`, return `mid`.
4. If `nums[mid] < target`, move right → `start = mid + 1`.
5. Else, move left → `end = mid - 1`.
6. When the loop ends, return `start`.

---

## ⏱️ Complexity Analysis

**Time Complexity:** `O(log n)`
  (Binary Search reduces the search space by half each iteration)

**Space Complexity:** `O(1)`
  (Only constant extra variables used)

---

## 📂 Code


class Solution {
    public int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        while(start<=end){
            int mid = start + (end-start) / 2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]<target){
                start=mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return start;
    }
}


---

## 💡 Interview Insight

* Classic Binary Search variation.
* Tests boundary conditions and insert position logic.
* Frequently asked in coding interviews.

---

## ✅ Status

✔ Solved successfully
✔ Optimized approach
✔ Interview-ready implementation

---

*This solution is part of my Data Structures & Algorithms (DSA) practice in Java.*
