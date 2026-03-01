# LeetCode Easy Problems – Java

## 🧩 Problem 1572: Matrix Diagonal Sum

**Platform:** LeetCode
**Difficulty:** Easy
**Language:** Java ☕

---

## 📌 Problem Description

Given a square matrix `mat`, return the sum of the matrix diagonals.

Only include the sum of all the elements on the **primary diagonal** and **secondary diagonal**.

If an element belongs to both diagonals (the center element in odd-sized matrix), count it only once.

---

## 🧠 Approach

Traverse the matrix and add elements that satisfy:

* `i == j` → Primary diagonal
* `i + j == n - 1` → Secondary diagonal

This ensures we cover both diagonals while naturally avoiding double counting except the center, which is added once due to the condition.

---

## 🪜 Step-by-Step Explanation

1. Initialize `sum = 0`.
2. Loop through matrix indices.
3. If `i == j` OR `i + j == n - 1`:

   * Add `mat[i][j]` to sum.
4. Return the final sum.

---

## ⏱️ Complexity Analysis

**Time Complexity:** `O(n²)`
  (We traverse the entire matrix)

**Space Complexity:** `O(1)`
  (Only constant extra space used)

---

## 📂 Code

class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat.length; j++){
                if(i==j || i+j == mat.length-1){
                    sum=sum+mat[i][j];
                }
            }
        }
        return sum;
    }
}

---

## 💡 Interview Insight

* Tests matrix traversal and index relationships.
* Important pattern for diagonal-based problems.
* Can be optimized to `O(n)` by directly accessing indices.

---

## ✅ Status

✔ Solved successfully
✔ Correct diagonal condition logic
✔ Interview-ready implementation

---

*This solution is part of my Data Structures & Algorithms (DSA) practice in Java.*
