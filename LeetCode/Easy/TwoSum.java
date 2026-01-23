# LeetCode Easy Problems – Java

## 🧩 Problem 1: Two Sum

**Platform:** LeetCode  
**Difficulty:** Easy  
**Language:** Java  

---

## 📌 Problem Description
Given an array of integers `nums` and an integer `target`, return the indices of the two numbers such that they add up to `target`.

Each input has **exactly one solution**, and the same element cannot be used twice.

---

## 🧠 Approach
- Use a **HashMap** to store previously visited numbers and their indices.
- For each element, check whether `target - currentElement` exists in the map.
- If found, return the indices immediately.

This approach optimizes the solution by reducing time complexity.

---

## ⏱️ Complexity Analysis
- **Time Complexity:** `O(n)`
- **Space Complexity:** `O(n)`

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
✔ Solved  
✔ Optimized solution using HashMap  

---

*This solution is part of my DSA practice using Java.*
