# 🧩 LeetCode 448: Find All Numbers Disappeared in an Array

**Platform:** LeetCode
**Difficulty:** Easy
**Language:** Java ☕

---

## 📌 Problem Description

Given an array `nums` of size `n` where each element is in the range `[1, n]`, find all the integers in the range `[1, n]` that do not appear in `nums`.

Return the result as a list.

---

## 🧠 Approach

* Use a boolean array to mark visited numbers
* Iterate through the input array and mark seen elements
* Traverse from `1` to `n` to find missing numbers

---

## 🔑 Key Points

* Extra space used for tracking presence
* Simple and easy to understand approach
* Works in linear time

---

## ⏱️ Complexity

* Time: O(n)
* Space: O(n)

---

## 💻 Code

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        boolean[] seen = new boolean[n + 1];

        for(int num : nums) {
            seen[num] = true;
        }
        List<Integer> result = new ArrayList<>();
        for(int i = 1; i <= n; i++) {
            if(!seen[i]) {
                result.add(i);
            }
        }
        return result;
    }
}

---

## 💡 Interview Insight

* Classic array marking problem
* Can be optimized to O(1) space using in-place marking
* Tests understanding of indexing and constraints

---

## ✅ Status

✔ Solved successfully
✔ Simple and clean approach
✔ Interview-ready implementation

---

**This solution is part of my Data Structures & Algorithms (DSA) practice in Java.**
