# 🧩 LeetCode 1480: Running Sum of 1D Array

**Platform:** LeetCode
**Difficulty:** Easy
**Language:** Java ☕

---

## 📌 Problem Description

Given an array `nums`, return the running sum of the array.

Running sum is defined as:

`runningSum[i] = nums[0] + nums[1] + ... + nums[i]`

---

## 🧠 Approach

* Traverse the array from index 1
* Add previous element to current element
* Update array in-place

---

## 🔑 Key Points

* In-place modification
* Each element stores cumulative sum
* No extra space required

---

## ⏱️ Complexity

* Time: O(n)
* Space: O(1)

---

## 💻 Code

class Solution {
    public int[] runningSum(int[] nums) {
        int sum = 0;
        for(int i=1; i<nums.length; i++){
            sum=nums[i-1]+nums[i];
            nums[i]=sum;
        }
        return nums;
    }
}

---

## 💡 Interview Insight

* Basic prefix sum problem
* Foundation for many advanced problems
* Tests in-place array manipulation

---

## ✅ Status

✔ Solved successfully
✔ Efficient in-place solution
✔ Interview-ready implementation

---

*This solution is part of my Data Structures & Algorithms (DSA) practice in Java.*
