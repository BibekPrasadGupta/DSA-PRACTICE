# LeetCode Easy Problems – Java

## 🧩 Problem 1: Two Sum

**Platform:** LeetCode
**Difficulty:** Easy
**Language:** Java ☕

---

## 📌 Problem Description

Given an array of integers `nums` and an integer `target`, return the indices of the two numbers such that they add up to `target`.

Each input has **exactly one solution**, and the same element cannot be used twice.

---

## 🧠 Approach (Brute Force)

* Iterate through the array using two nested loops.
* For each element at index `i`, check all subsequent elements at index `j`.
* If the sum of `nums[i] + nums[j]` equals the target, store their indices and return the result.

This approach checks **all possible pairs** to ensure correctness.

---

## ⏱️ Complexity Analysis

* **Time Complexity:** `O(n²)`
  (Due to nested loops checking every pair)
* **Space Complexity:** `O(1)`
  (Only a fixed-size array is used for the result)

---

## 📂 Code
  
  class Solution {
    public int[] twoSum(int[] nums, int target) {
        int []ans = new int[2];
        
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if((nums[i]+nums[j])==target){
                    ans[0]=i;
                    ans[1]=j;
                    break;
                }
            }
        }
        return ans;
    }
}


---

## ✅ Status

✔ Solved using brute-force approach
✔ Clear and beginner-friendly solution

---

*This solution is part of my Data Structures & Algorithms (DSA) practice in Java.*
