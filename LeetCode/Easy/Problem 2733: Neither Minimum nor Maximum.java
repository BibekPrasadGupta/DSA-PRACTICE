# LeetCode Easy Problems – Java

## 🧩 Problem 2733: Neither Minimum nor Maximum

**Platform:** LeetCode
**Difficulty:** Easy
**Language:** Java ☕

---

## 📌 Problem Description

Given an array `nums`, return any number that is **neither the minimum nor the maximum**.

If no such number exists, return `-1`.

---

## 🧠 Approach

1. Sort the array.
2. The first element is the minimum.
3. The last element is the maximum.
4. If the array has more than 2 elements, the second element will be neither minimum nor maximum.

---

## 🪜 Step-by-Step Explanation

1. Sort the array using `Arrays.sort()`.
2. If array size is less than or equal to 2 → return `-1`.
3. Otherwise, return `nums[1]`.

---

## ⏱️ Complexity Analysis

**Time Complexity:** `O(n log n)`
  (Due to sorting)

**Space Complexity:** `O(1)`
  (No extra space used)

---

## 📂 Code

class Solution {
    public int findNonMinOrMax(int[] nums) {
        Arrays.sort(nums);
        int min = nums[0];
        int n=nums.length-1;
        int max=nums[n];
        if(nums.length>2){
        return nums[1];
        }
        else{
            return -1;
        }
    }
}

---

## 💡 Interview Insight

* Tests understanding of array ordering.
* Simple logic after sorting.
* Can also be solved without sorting in `O(n)`.

---

## ✅ Status

✔ Solved successfully
✔ Simple sorting-based solution
✔ Interview-ready implementation

---

*This solution is part of my Data Structures & Algorithms (DSA) practice in Java.*
