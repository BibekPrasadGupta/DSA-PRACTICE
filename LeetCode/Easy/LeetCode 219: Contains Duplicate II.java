# 🧩 LeetCode 219: Contains Duplicate II

**Platform:** LeetCode
**Difficulty:** Easy
**Language:** Java ☕

---

## 📌 Problem Description

Given an integer array `nums` and an integer `k`, return `true` if there are two distinct indices `i` and `j` such that:

* `nums[i] == nums[j]`
* `|i - j| <= k`

Otherwise, return `false`.

---

## 🧠 Approach

* Use two nested loops
* Compare each element with next `k` elements
* If duplicate found within range `k`, return true

---

## 🔑 Key Points

* Ensure `j` stays within `i + k`
* Check bounds to avoid index out of range
* Early return when duplicate is found

---

## ⏱️ Complexity

* Time: O(n * k)
* Space: O(1)

---

## 💻 Code

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<=i+k && j<nums.length; j++){
                if(nums[i]==nums[j]){
                    return true;
                }
            }
        }
        return false;
    }
}

---

## 💡 Interview Insight

* Brute-force window check problem
* Can be optimized using HashSet (sliding window)
* Tests understanding of index constraints

---

## ✅ Status

✔ Solved successfully
✔ Brute-force approach implemented
✔ Interview-ready implementation

---

*This solution is part of my Data Structures & Algorithms (DSA) practice in Java.*
