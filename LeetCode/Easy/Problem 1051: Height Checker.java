# LeetCode Easy Problems – Java

## 🧩 Problem 1051: Height Checker

**Platform:** LeetCode
**Difficulty:** Easy
**Language:** Java ☕

---

## 📌 Problem Description

A school is trying to take an annual photo of all the students. The students are asked to stand in **non-decreasing order of height**.

You are given an integer array `heights` representing the current order of students.

Return the number of indices where the heights are **not in the expected sorted order**.

---

## 🧠 Approach

1. Create a copy of the original array.
2. Sort the copied array to obtain the expected order.
3. Compare each element of the original array with the sorted array.
4. Count the positions where the values differ.

---

## 🪜 Step-by-Step Explanation

1. Store the length of the array `n`.
2. Create another array `expected`.
3. Copy all elements from `heights` into `expected`.
4. Sort the `expected` array.
5. Compare each element of `heights` with `expected`.
6. If values differ, it means the student is not in the correct position.
7. Return the number of mismatched indices.

---

## ⏱️ Complexity Analysis

**Time Complexity:** `O(n log n)`
  (Due to sorting)

**Space Complexity:** `O(n)`
  (Extra array used to store expected order)

---

## 📂 Code

class Solution {
    public int heightChecker(int[] heights) {
        int n=heights.length;
        int count=0;
        int expected [] = new int [n];
        for(int i=0; i<n; i++){
            expected[i]=heights[i];
        }
        Arrays.sort(expected);
        for(int i=0; i<n; i++){
            if(expected[i]==heights[i]){
                count++;
            }
        }
        return Math.abs(count-n);
    }
}

---

## 💡 Interview Insight

* Tests understanding of sorting and comparison.
* Useful for detecting mismatches between original and expected order.
* Can also be optimized using counting sort since height range is limited.

---

## ✅ Status

✔ Solved successfully
✔ Sorting-based comparison approach
✔ Interview-ready implementation

---

*This solution is part of my Data Structures & Algorithms (DSA) practice in Java.*
