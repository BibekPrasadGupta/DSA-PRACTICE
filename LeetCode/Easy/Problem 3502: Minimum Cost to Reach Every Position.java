# LeetCode Easy Problems – Java

## 🧩 Problem 3502: Minimum Cost to Reach Every Position

**Platform:** LeetCode
**Difficulty:** Easy
**Language:** Java ☕

---

## 📌 Problem Description

You are given an integer array `cost`.

Transform the array such that each position represents the minimum cost encountered up to that index while traversing from left to right.

Return the modified array.

---

## 🧠 Approach

We iterate through the array and maintain the minimum value seen so far.

For each index:

* If the next value is greater than the current minimum, replace it with the current minimum.
* Otherwise, keep the smaller value as the new minimum.

This effectively builds a prefix minimum array.

---

## 🪜 Step-by-Step Explanation

1. Traverse the array from index `0` to `n - 2`.
2. Compare `cost[i]` and `cost[i + 1]`.
3. If `cost[i + 1]` is greater:

   * Replace it with `cost[i]`.
4. Continue until the end of the array.
5. Return the modified array.

---

## ⏱️ Complexity Analysis

**Time Complexity:** `O(n)`
  (Single traversal of the array)

**Space Complexity:** `O(1)`
  (In-place modification)

---

## 📂 Code

class Solution {
    public int[] minCosts(int[] cost) {
        for(int i=0; i<cost.length-1; i++){
            if(cost[i+1]<cost[i]){
                cost[i]=cost[i];
            }
            else{
                cost[i+1]=cost[i];
            }
        }
        return cost;
    }
}

---

## 💡 Interview Insight

* Demonstrates prefix minimum computation.
* Tests understanding of in-place array updates.
* Useful pattern for dynamic programming preprocessing.

---

## ✅ Status

✔ Solved successfully
✔ Efficient in-place approach
✔ Interview-ready implementation

---

*This solution is part of my Data Structures & Algorithms (DSA) practice in Java.*
