# 🧩 LeetCode 1502: Can Make Arithmetic Progression From Sequence

**Platform:** LeetCode
**Difficulty:** Easy
**Language:** Java ☕

---

## 📌 Problem Description

Given an array `arr`, return `true` if the array can be rearranged to form an arithmetic progression. Otherwise, return `false`.

An arithmetic progression is a sequence where the difference between consecutive elements is constant.

---

## 🧠 Approach

* Sort the array
* Compute the common difference using first two elements
* Check if all consecutive differences are equal

---

## 🔑 Key Points

* Sorting helps align elements in order
* Compare adjacent differences
* Early return if mismatch found

---

## ⏱️ Complexity

* Time: O(n log n)
* Space: O(1)

---

## 💻 Code

class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int a=arr[1]-arr[0];
        for(int i=2; i<arr.length; i++){
            if(arr[i]-arr[i-1] != a){
                return false;
            }
        }
        return true;
    }
}
---

## 💡 Interview Insight

* Classic sorting + pattern checking problem
* Tests understanding of arithmetic sequences
* Simple but important logic

---

## ✅ Status

✔ Solved successfully
✔ Efficient approach using sorting
✔ Interview-ready implementation

---

**This solution is part of my Data Structures & Algorithms (DSA) practice in Java.**
