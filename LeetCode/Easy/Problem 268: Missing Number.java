# LeetCode Easy Problems – Java

## 🧩 Problem 268: Missing Number

**Platform:** LeetCode
**Difficulty:** Easy
**Language:** Java ☕

---

## 📌 Problem Description

Given an array `nums` containing `n` distinct numbers in the range `[0, n]`, return the **only number in the range that is missing from the array**.

---

## 🧠 Approach (Mathematical Formula – Sum Method)

The idea is based on the formula for the sum of first `n` natural numbers:

```
Sum = n × (n + 1) / 2
```

Steps:

* Calculate the expected sum of numbers from `0` to `n`.
* Calculate the actual sum of elements in the array.
* The difference between expected sum and actual sum gives the missing number.

This avoids sorting or extra data structures.

---

## 🪜 Step-by-Step Explanation

1. Let `range = nums.length`.
2. Compute expected sum:

   ```
   actualSum = range × (range + 1) / 2
   ```
3. Compute the sum of array elements.
4. Return:

   ```
   missing = actualSum - currentSum
   ```

---

## ⏱️ Complexity Analysis

**Time Complexity:** `O(n)`
  (Single traversal of the array)
**Space Complexity:** `O(1)`
  (No extra space used)

---

## 📂 Code

class Solution {
    public int missingNumber(int[] nums) {
        int range = nums.length;
        int actualsum = (range * (range + 1)) / 2;
        int currentsum = 0;

        for (int i = 0; i < nums.length; i++) {
            currentsum += nums[i];
        }

        int ans = actualsum - currentsum;
        return ans;
    }
}


---

## 💡 Interview Insight

Alternative approaches:

* XOR method (also O(n), O(1))
* Sorting (O(n log n)) – not optimal

The mathematical formula method is the most elegant and commonly preferred in interviews.

---

## ✅ Status

✔ Solved using mathematical formula
✔ Optimal time and space complexity
✔ Interview-friendly solution

---

* This solution is part of my Data Structures & Algorithms (DSA) practice in java. *
