# 🧩 LeetCode 1848: Minimum Distance to the Target Element

**Platform:** LeetCode
**Difficulty:** Easy
**Language:** Java ☕

---

## 📌 Problem Description

Given an integer array `nums`, an integer `target`, and an integer `start`, return the minimum distance between `start` and any index `i` such that `nums[i] == target`.

The distance is defined as `|i - start|`.

---

## 🧠 Approach

* Traverse the array
* Check for elements equal to target
* Compute absolute distance from `start`
* Track the minimum distance

---

## 🔑 Key Points

* Use `Math.abs()` for distance calculation
* Update minimum whenever target is found
* Simple linear scan

---

## ⏱️ Complexity

* Time: O(n)
* Space: O(1)

---

## 💻 Code

class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int min = Integer.MAX_VALUE;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==target){
                int a = Math.abs(i-start);
                min = Math.min(a,min);
            }
        }
        return min;
    }
}

---

## 💡 Interview Insight

* Straightforward array traversal problem
* Tests understanding of absolute difference
* Focus on efficient single-pass solution

---

## ✅ Status

✔ Solved successfully
✔ Optimal linear scan approach
✔ Interview-ready implementation

---

*This solution is part of my Data Structures & Algorithms (DSA) practice in Java.*
