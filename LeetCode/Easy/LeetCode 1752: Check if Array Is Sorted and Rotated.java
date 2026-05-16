# 🧩 LeetCode 1752: Check if Array Is Sorted and Rotated

**Platform:** LeetCode
**Difficulty:** Easy
**Language:** Java ☕

---

## 📌 Problem Description

Given an array `nums`, return `true` if the array was originally sorted in non-decreasing order, then rotated some number of times.

Otherwise, return `false`.

---

## 🧠 Approach

* Count number of "drops" where `nums[i] > nums[i+1]`
* Use modulo to handle circular comparison
* If drops are more than 1 → return false

---

## 🔑 Key Points

* Circular check using `(i + 1) % n`
* At most one drop allowed
* Works for both rotated and non-rotated arrays

---

## ⏱️ Complexity

* Time: O(n)
* Space: O(1)

---

## 💻 Code

class Solution {
    public boolean check(int[] nums) {
        int count = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            if (nums[i] > nums[(i + 1) % n]) {
                count++;
            }
        }
        return count <= 1;
    }
}

---

## 💡 Interview Insight

* Clever use of circular traversal
* Avoids explicit rotation
* Tests observation and edge case handling

---

## ✅ Status

✔ Solved successfully
✔ Optimal linear solution
✔ Interview-ready implementation

---

*This solution is part of my Data Structures & Algorithms (DSA) practice in Java.*
