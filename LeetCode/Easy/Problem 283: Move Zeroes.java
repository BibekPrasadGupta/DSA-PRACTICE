# LeetCode Easy Problems – Java

## 🧩 Problem 283: Move Zeroes

**Platform:** LeetCode
**Difficulty:** Easy
**Language:** Java ☕

---

## 📌 Problem Description

Given an integer array `nums`, move all `0`s to the end of it while maintaining the **relative order of the non-zero elements**.

You must do this **in-place** without making a copy of the array.

---

## 🧠 Approach

We use a **two-pointer technique**:

* One pointer (`index`) tracks the position to place the next non-zero element.
* Traverse the array and copy non-zero elements forward.
* Fill remaining positions with zeroes.

---

## 🪜 Step-by-Step Explanation

1. Initialize `index = 0`.
2. Traverse the array:

   * If element is non-zero → place it at `nums[index]` and increment `index`.
3. After traversal, fill remaining positions with `0`.
4. This keeps non-zero elements in order and moves all zeros to the end.

---

## ⏱️ Complexity Analysis

**Time Complexity:** `O(n)`
  (Single traversal of the array)

**Space Complexity:** `O(1)`
  (In-place modification)

---

## 📂 Code

class Solution {
    public void moveZeroes(int[] nums) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[index] = nums[i];
                index++;
            }
        }
        while (index < nums.length) {
            nums[index] = 0;
            index++;
        }
    }
}

---

## 💡 Interview Insight

* Classic in-place array manipulation problem.
* Tests understanding of two-pointer technique.
* Avoids extra space while maintaining order.

---

## ✅ Status

✔ Solved successfully
✔ Optimal in-place solution
✔ Interview-ready implementation

---

*This solution is part of my Data Structures & Algorithms (DSA) practice in Java.*
