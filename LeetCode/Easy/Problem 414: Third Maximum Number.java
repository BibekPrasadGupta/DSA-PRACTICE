# LeetCode Easy Problems – Java

## 🧩 Problem 414: Third Maximum Number

**Platform:** LeetCode
**Difficulty:** Easy
**Language:** Java ☕

---

## 📌 Problem Description

Given an integer array `nums`, return the **third distinct maximum number** in the array.

If the third distinct maximum does not exist, return the **maximum number**.

---

## 🧠 Approach

1. Track the top three distinct maximum values.
2. Use `long` to handle edge cases like `Integer.MIN_VALUE`.
3. Skip duplicates.
4. Return the third max if it exists, otherwise return the first max.

---

## 🪜 Step-by-Step Explanation

1. Initialize `firstmax`, `secondmax`, `thirdmax` to `Long.MIN_VALUE`.
2. Traverse the array:

   * Skip duplicates.
   * Update first, second, third max accordingly.
3. If `thirdmax` is not updated, return `firstmax`.
4. Otherwise, return `thirdmax`.

---

## ⏱️ Complexity Analysis

**Time Complexity:** `O(n)`
  (Single pass through array)

**Space Complexity:** `O(1)`
  (Constant extra space)

---

## 📂 Code

class Solution {
    public int thirdMax(int[] nums) {
        long firstmax=Long.MIN_VALUE;   
        long secondmax= Long.MIN_VALUE;   
        long thirdmax=Long.MIN_VALUE;   
      for(int i=0; i<nums.length; i++){
        int val = nums[i];
        if(firstmax == val || secondmax == val || thirdmax == val){
            continue;
        }
        if(nums[i]>firstmax){
            thirdmax=secondmax;
            secondmax=firstmax;
            firstmax=nums[i];
        }
        else if(nums[i]>secondmax && nums[i]<firstmax){
            thirdmax=secondmax;
            secondmax=nums[i];
        }
        else if(nums[i]>thirdmax && nums[i]<secondmax){
            thirdmax=nums[i];
        }
      }
      
      return thirdmax == Long.MIN_VALUE?(int)firstmax:(int)thirdmax;
    }
}

---

## 💡 Interview Insight

* Tests handling of distinct elements.
* Demonstrates in-place tracking without sorting.
* Common question for understanding edge cases.

---

## ✅ Status

✔ Solved successfully
✔ Optimal one-pass solution
✔ Interview-ready implementation

---

*This solution is part of my Data Structures & Algorithms (DSA) practice in Java.*
