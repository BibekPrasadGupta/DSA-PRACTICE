# LeetCode Easy Problems – Java

## 🧩 Problem 11: Container With Most Water

**Platform:** LeetCode
**Difficulty:** Medium
**Language:** Java ☕

---

## 📌 Problem Description

You are given an integer array `height` of length `n`.

There are `n` vertical lines drawn such that the two endpoints of the `i`th line are `(i, 0)` and `(i, height[i])`.

Find two lines that together with the x-axis form a container such that the container contains the most water.

Return the maximum amount of water a container can store.

---

## 🧠 Approach

We use the **Two Pointer Technique**.

* Start with one pointer at the beginning and one at the end.
* Calculate the area formed between them.
* Move the pointer with the smaller height inward to try to find a taller boundary.

This ensures we explore all optimal possibilities efficiently.

---

## 🪜 Step-by-Step Explanation

1. Initialize `start = 0` and `end = height.length - 1`.
2. While `start < end`:

   * Calculate height = `min(height[start], height[end])`
   * Calculate width = `end - start`
   * Compute area = height × width
   * Update maximum area
3. Move pointer with smaller height inward.
4. Continue until pointers meet.
5. Return the maximum area found.

---

## ⏱️ Complexity Analysis

**Time Complexity:** `O(n)`
  (Each element is visited at most once)

**Space Complexity:** `O(1)`
  (No extra space used)

---

## 📂 Code

class Solution {
    public int maxArea(int[] height) {
        int start = 0;
        int end = height.length - 1;
        int maxCap = 0;
        while(start<end){
            int high = Math.min(height[start],height[end]);
            int width = end - start ;
            int currCap = high * width;
            maxCap = Math.max(currCap,maxCap);
            if(height[start]<height[end]){
                start++;
            }
            else{
                end--;
            }
        }
        return maxCap;
    }
}

---

## 💡 Interview Insight

* Classic Two Pointer optimization problem.
* Brute force is `O(n²)` but optimal solution is `O(n)`.
* Tests understanding of greedy movement strategy.

---

## ✅ Status

✔ Solved successfully
✔ Optimal two-pointer approach
✔ Interview-ready implementation

---

*This solution is part of my Data Structures & Algorithms (DSA) practice in Java.*
