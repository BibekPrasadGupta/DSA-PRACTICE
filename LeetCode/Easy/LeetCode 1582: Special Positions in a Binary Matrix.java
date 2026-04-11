# 🧩 LeetCode 1582: Special Positions in a Binary Matrix

**Platform:** LeetCode
**Difficulty:** Easy
**Language:** Java ☕

---

## 📌 Problem Description

Given a binary matrix `mat`, return the number of special positions in it.

A position `(i, j)` is called special if:

* `mat[i][j] == 1`
* All other elements in row `i` are `0`
* All other elements in column `j` are `0`

---

## 🧠 Approach

* Count number of 1s in each row and column
* Traverse matrix again
* Check if cell is 1 and both row & column count is 1

---

## 🔑 Key Points

* Use two arrays: rowArray and colArray
* First pass → count frequency
* Second pass → validate special position

---

## ⏱️ Complexity

* Time: O(m × n)
* Space: O(m + n)

---

## 💻 Code

class Solution {
    public int numSpecial(int[][] mat) {
        int count=0;
        int m=mat.length;
        int n=mat[0].length;
        int [] rowArray = new int[m];
        int [] colArray = new int[n];
        for (int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(mat[i][j]==1){
                    rowArray[i]++;
                    colArray[j]++;
                }
            }
        }
        for (int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(mat[i][j]==0) continue;
                if(rowArray[i]==1 && colArray[j]==1){
                    count++;
                }
            }
        }
            return count;
    }
}

---

## 💡 Interview Insight

* Classic matrix counting problem
* Uses prefix-style counting for optimization
* Avoids brute force row/column scanning repeatedly

---

## ✅ Status

✔ Solved successfully
✔ Optimized using counting arrays
✔ Interview-ready implementation

---

*This solution is part of my Data Structures & Algorithms (DSA) practice in Java.*
