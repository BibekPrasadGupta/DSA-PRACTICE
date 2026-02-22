# LeetCode Easy Problems – Java

## 🧩 Problem 2529: Maximum Count of Positive Integer and Negative Integer

**Platform:** LeetCode
**Difficulty:** Easy
**Language:** Java ☕

---

## 📌 Problem Description

Given an array `nums` sorted in non-decreasing order, return the maximum between the number of positive integers and the number of negative integers.

Note that `0` is neither positive nor negative.

---

## 🧠 Approach

We simply count:

* Number of negative elements
* Number of positive elements

Then return the maximum of the two counts.

---

## 🪜 Step-by-Step Explanation

1. Initialize two counters:

   * `count` → negative numbers
   * `count1` → positive numbers

2. Traverse the array:

   * If `nums[i] < 0` → increment `count`
   * If `nums[i] > 0` → increment `count1`

3. Return the maximum of the two values.

---

## ⏱️ Complexity Analysis

* **Time Complexity:** `O(n)`
  (Single traversal of the array)

* **Space Complexity:** `O(1)`
  (Only constant extra variables used)

---

## 📂 Code

class Solution {
    public int maximumCount(int[] nums) {
        int count=0;
        int count1=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]<0){
                count++;
            }
            else if(nums[i]>0){
                count1++;
            }
        }
        if(count<count1){
            return count1;
        }
        return count;
    }
}

---

## 💡 Interview Insight

* Simple counting problem.
* Tests basic array traversal and conditional logic.
* Can also be optimized using Binary Search due to sorted array.

---

## ✅ Status

✔ Solved successfully
✔ Simple and efficient approach
✔ Interview-ready implementation

---

* This solution is part of my Data Structures & Algorithms (DSA) practice in java. *
