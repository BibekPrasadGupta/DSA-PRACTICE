# LeetCode Easy Problems – Java

## 🧩 Problem 136: Single Number

**Platform:** LeetCode
**Difficulty:** Easy
**Language:** Java ☕

---

## 📌 Problem Description

Given a non-empty array of integers `nums`, every element appears twice except for one.

Find that single one.

You must implement a solution with a linear runtime complexity and use only constant extra space.

---

## 🧠 Approach

We use the **XOR (^) operator**.

Properties of XOR:

* `a ^ a = 0`
* `a ^ 0 = a`
* XOR is commutative and associative

When we XOR all elements together, duplicate numbers cancel out, leaving only the single number.

---

## 🪜 Step-by-Step Explanation

1. Initialize `ans = 0`.
2. Traverse the array.
3. For each element:

   * `ans = ans ^ num`
4. After traversal, `ans` contains the single number.

---

## ⏱️ Complexity Analysis

**Time Complexity:** `O(n)`
  (Single traversal of the array)

**Space Complexity:** `O(1)`
  (No extra space used)

---

## 📂 Code

class Solution {
    public int singleNumber(int[] nums) {
        int ans=0;
        for(int num: nums){
            ans ^=num;
        }
        return ans;
    }
}

---

## 💡 Interview Insight

* Classic bit manipulation problem.
* Demonstrates efficient use of XOR properties.
* Very common interview question.

---

## ✅ Status

✔ Solved successfully
✔ Optimal bit manipulation approach
✔ Interview-ready implementation

---

*This solution is part of my Data Structures & Algorithms (DSA) practice in Java.*
