# LeetCode Medium Problems – Java

## 🧩 Problem 238: Product of Array Except Self

**Platform:** LeetCode
**Difficulty:** Medium
**Language:** Java ☕

## 📌 Problem Description

Given an integer array `nums`, return an array `answer` such that:

text
answer[i] = product of all elements of nums except nums[i]


## Important Constraints:

* You ** must not use division **
* The solution should run in ** O(n) ** time


## 🧠 Approach (Prefix & Suffix Product Technique)

This solution uses a ** prefix–suffix (left–right) product approach ** to efficiently compute the result without using division.

## 🔹 Key Idea:

For each index `i`:

* Multiply the product of all elements ** to the left of i **
* With the product of all elements ** to the right of i **

---

## 🪜 Step-by-Step Explanation

## 1️⃣ Build Right Product Array

* Traverse from right to left
* `right[i]` stores the product of elements from index `i` to the end

#Example:

nums   = [1, 2, 3, 4]
right  = [24, 24, 12, 4]


## 2️⃣ Compute Final Answer Using Left Product

* Maintain a variable `left` to store product of elements before index `i`
* For each index:

  answer[i] = left * right[i + 1]
  
* Update `left` after each iteration


## 3️⃣ Handle Last Index

* For the last element, there are no elements to the right
* So the answer is simply the `left` product

---

## ⏱️ Complexity Analysis

** Time Complexity: ** `O(n)`
  (Two linear passes)

** Space Complexity: ** `O(n)`
  (Extra array used for right products)


## 📂 Code

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] right = new int[n];
        int pro = 1;

        for (int i = n - 1; i >= 0; i--) {
            pro = pro * nums[i];
            right[i] = pro;
        }

        int[] ans = new int[n];
        int left = 1;

        for (int i = 0; i < n - 1; i++) {
            ans[i] = left * right[i + 1];
            left = left * nums[i];
        }

        ans[n - 1] = left;
        return ans;
    }
}

## ✅ Status

✔ Solved without using division
✔ Uses prefix & suffix product logic
✔ Optimal and interview-ready solution


* This solution is part of my Data Structures & Algorithms (DSA) practice in Java. *
