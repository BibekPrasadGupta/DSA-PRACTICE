# LeetCode Easy Problems – Java

## 🧩 Problem 1929: Concatenation of Array

**Platform:** LeetCode
**Difficulty:** Easy
**Language:** Java ☕

---

## 📌 Problem Description

Given an integer array `nums` of length `n`, create an array `ans` of length `2n` where:

* `ans[i] = nums[i]`
* `ans[i + n] = nums[i]`

Return the concatenated array `ans`.

---

## 🧠 Approach

We create a new array of size `2 × n` and copy elements from the original array twice:

* First half → original order
* Second half → repeat the same elements

---

## 🪜 Step-by-Step Explanation

1. Create a new array `ans` of size `2 * nums.length`.
2. Traverse the array from `0` to `n - 1`.
3. Assign:

   * `ans[i] = nums[i]`
   * `ans[i + nums.length] = nums[i]`
4. Return the result array.

---

## ⏱️ Complexity Analysis

**Time Complexity:** `O(n)`
  (Single traversal of the array)

**Space Complexity:** `O(n)`
  (New array of size 2n created)

---

## 📂 Code

class Solution {
    public int[] getConcatenation(int[] nums) {
        int [] ans = new int[2 * nums.length];
        for(int i=0; i<nums.length; i++){
            ans[i]=nums[i];
            ans[i+nums.length]=nums[i];
        }     
        return ans;
    }
}

---

## 💡 Interview Insight

* Simple array manipulation problem.
* Tests understanding of indexing and memory allocation.
* Good warm-up question for array operations.

---

## ✅ Status

✔ Solved successfully
✔ Clean and efficient implementation
✔ Interview-ready solution

---

*This solution is part of my Data Structures & Algorithms (DSA) practice in Java.*
