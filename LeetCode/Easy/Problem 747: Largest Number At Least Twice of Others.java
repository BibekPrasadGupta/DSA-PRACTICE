# LeetCode Easy Problems – Java

## 🧩 Problem 747: Largest Number At Least Twice of Others

**Platform:** LeetCode
**Difficulty:** Easy
**Language:** Java ☕

---

## 📌 Problem Description

You are given an integer array `nums`.

Return the index of the largest element if it is at least **twice as large as every other number** in the array.

Otherwise, return `-1`.

---

## 🧠 Approach (Finding Maximum and Second Maximum)

To solve this problem:

1. Traverse the array and find:

   * The maximum element (`max`)
   * The second maximum element (`smax`)
   * The index of the maximum element
2. After traversal, check:

   * If `smax * 2 <= max`

     * Return index of maximum
   * Otherwise

     * Return `-1`

---

## 🪜 Step-by-Step Explanation

1. Initialize:

   * `max = -1`
   * `smax = -1`
   * `maxIndx = 0`

2. Traverse the array:

   * If `nums[i] > max`

     * Update `smax = max`
     * Update `max = nums[i]`
     * Store index `maxIndx = i`
   * Else

     * If `nums[i] > smax`

       * Update `smax = nums[i]`

3. Final check:

   * If `smax * 2 <= max` → return `maxIndx`
   * Else → return `-1`

---

## ⏱️ Complexity Analysis

**Time Complexity:** `O(n)`
  (Single pass through the array)

**Space Complexity:** `O(1)`
  (Only constant extra variables used)

---

## 📂 Code

class Solution {
    public int dominantIndex(int[] nums) {
        int max = -1;
        int smax = -1;
        int maxIndx = 0;
        for(int i=0; i<nums.length; i++){
            if(max<nums[i]){
                smax=max;
                max=nums[i];
                maxIndx = i;
            }
            else{
                if(smax<nums[i]){
                    smax=nums[i];
                }
            }
        }
        if(smax*2 <= max){
            return maxIndx;
        }
        else {
            return -1;
        }
    }
}

---

## 💡 Interview Insight

* This problem tests:

  * Array traversal
  * Tracking maximum and second maximum
  * Conditional logic
* Can also be solved using two-pass approach, but single-pass is more optimal.

---

## ✅ Status

✔ Solved using single-pass approach
✔ Optimized time complexity
✔ Good practice for array manipulation problems

---

* This solution is part of my Data Structures & Algorithms (DSA) practice in Java. *
