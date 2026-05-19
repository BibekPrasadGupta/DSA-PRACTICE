# 🧩 LeetCode 2784: Check if Array is Good

**Platform:** LeetCode
**Difficulty:** Easy
**Language:** Java ☕

---

## 📌 Problem Description

An array is considered **good** if it contains all integers from `1` to `n-1` exactly once and the number `n-1` appears twice.

Given an array `nums`, return `true` if it is good, otherwise return `false`.

---

## 🧠 Approach

* Sort the array
* Check if elements from index `0` to `n-2` match values `1` to `n-1`
* Finally, check if last element equals `n-1`

---

## 🔑 Key Points

* Sorting simplifies validation
* Expected pattern: `1, 2, 3, ..., n-1, n-1`
* Last element must be duplicate of `n-1`

---

## ⏱️ Complexity

* Time: O(n log n)
* Space: O(1)

---

## 💻 Code

class Solution {
    public boolean isGood(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        for(int i=0; i<n-1; i++){
            if(nums[i]!=i+1){
                return false;
            }
        }
        return nums[n-1]==n-1;
    }
}

---

## 💡 Interview Insight

* Pattern recognition problem
* Sorting helps verify sequence easily
* Watch edge cases carefully

---

## ✅ Status

✔ Solved successfully
✔ Clean validation logic
✔ Interview-ready implementation

---

*This solution is part of my Data Structures & Algorithms (DSA) practice in Java.*
