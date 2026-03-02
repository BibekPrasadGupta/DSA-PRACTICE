# LeetCode Easy Problems – Java

## 🧩 Problem 3028: Ant on the Boundary

**Platform:** LeetCode
**Difficulty:** Easy
**Language:** Java ☕

---

## 📌 Problem Description

An ant starts at position `0` on a number line.

You are given an integer array `nums` where each element represents a movement:

* Positive value → move right
* Negative value → move left

Return the number of times the ant returns to position `0` after performing each move sequentially.

---

## 🧠 Approach

We keep track of the cumulative position of the ant using a running sum.

Every time the cumulative sum becomes `0`, it means the ant has returned to the boundary.

We count how many times this happens.

---

## 🪜 Step-by-Step Explanation

1. Initialize `sum = 0` and `count = 0`.
2. Traverse the array:

   * Add each move to `sum`.
3. If `sum == 0`, increment `count`.
4. After traversal, return `count`.

---

## ⏱️ Complexity Analysis

**Time Complexity:** `O(n)`
  (Single traversal of the array)

**Space Complexity:** `O(1)`
  (Only constant extra variables used)

---

## 📂 Code

class Solution {
    public int returnToBoundaryCount(int[] nums) {
        int sum=0;
        int count=0;
        for(int move : nums){
            sum=sum+move;
            if(sum==0){
                count++;
            }
        }
        return count;
    }
}

---

## 💡 Interview Insight

* Tests prefix sum concept.
* Simple cumulative tracking problem.
* Good example of simulation-based logic.

---

## ✅ Status

✔ Solved successfully
✔ Efficient single-pass solution
✔ Interview-ready implementation

---

*This solution is part of my Data Structures & Algorithms (DSA) practice in Java.*
