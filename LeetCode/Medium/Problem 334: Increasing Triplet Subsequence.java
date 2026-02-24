# LeetCode Easy Problems – Java

## 🧩 Problem 334: Increasing Triplet Subsequence

**Platform:** LeetCode
**Difficulty:** Medium
**Language:** Java ☕

---

## 📌 Problem Description

Given an integer array `nums`, return `true` if there exists a triple of indices `(i, j, k)` such that `i < j < k` and `nums[i] < nums[j] < nums[k]`.

If no such triplet exists, return `false`.

---

## 🧠 Approach

We track two smallest values while traversing the array:

* `first` → smallest element seen so far
* `second` → second smallest element greater than `first`

If we find an element greater than both, an increasing triplet exists.

---

## 🪜 Step-by-Step Explanation

1. Initialize:

   * `first = Integer.MAX_VALUE`
   * `second = Integer.MAX_VALUE`

2. Traverse the array:

   * If element ≤ first → update `first`
   * Else if element ≤ second → update `second`
   * Else → element is greater than both → triplet found → return `true`

3. If traversal finishes → return `false`.

---

## ⏱️ Complexity Analysis

**Time Complexity:** `O(n)`
  (Single traversal of the array)

**Space Complexity:** `O(1)`
  (Only constant extra variables used)

---

## 📂 Code

class Solution {
    public boolean increasingTriplet(int[] nums) {
        int first=Integer.MAX_VALUE;
        int second=Integer.MAX_VALUE;
        int third =Integer.MAX_VALUE;
        for(int i=0; i<nums.length; i++){
           int ele=nums[i];
           if(first>=ele){
                first=ele;
           }
           else if(second>=ele){
                second=ele;
           }
           else{
            third=ele;
            return true;
           }
        }
        return false;
    }
}

---

## 💡 Interview Insight

* Greedy tracking problem.
* Avoids nested loops for optimal linear solution.
* Tests understanding of maintaining running minimums.

---

## ✅ Status

✔ Solved successfully
✔ Optimal linear approach
✔ Interview-ready implementation

---

*This solution is part of my Data Structures & Algorithms (DSA) practice in Java.*
