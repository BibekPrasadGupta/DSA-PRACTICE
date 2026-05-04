# 🧩 LeetCode 3740: Minimum Distance Between Equal Elements

**Platform:** LeetCode
**Difficulty:** Medium
**Language:** Java ☕

---

## 📌 Problem Description

Given an integer array `nums`, find the minimum value of `2 * (k - i)` such that:

* `i < j < k`
* `nums[i] == nums[j] == nums[k]`

Return the minimum possible value. If no such triplet exists, return `-1`.

---

## 🧠 Approach

* Use three nested loops to check all triplets `(i, j, k)`
* Ensure values at all three indices are equal
* Calculate distance `2 * (k - i)`
* Track minimum value

---

## 🔑 Key Points

* Brute-force approach using 3 loops
* Break early when third match is found
* Handle case when no valid triplet exists

---

## ⏱️ Complexity

* Time: O(n³)
* Space: O(1)

---

## 💻 Code

class Solution {
    public int minimumDistance(int[] nums) {
        int sum = 0;
        
        int min=Integer.MAX_VALUE;
        for(int i=0; i<nums.length -2; i++){
            for(int j=i+1; j<nums.length - 1; j++){
                if(nums[i]!=nums[j]){
                    continue;
                }
                for(int k=j+1; k<nums.length; k++){
                    if(nums[j]==nums[k]){
                        sum= 2 * (k - i);
                        min = Math.min(min,sum);
                        break;
                    }
                }
            }
        }
        if(min==Integer.MAX_VALUE){
            return -1;
        }
        return min;
    }
}

---

## 💡 Interview Insight

* Brute-force solution to identify triplets
* Can be optimized using hashing or index tracking
* Tests nested loop optimization and condition checks

---

## ✅ Status

✔ Solved successfully
✔ Brute-force approach implemented
✔ Interview-ready implementation

---

*This solution is part of my Data Structures & Algorithms (DSA) practice in Java.*
