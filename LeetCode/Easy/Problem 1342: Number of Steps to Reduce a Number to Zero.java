# LeetCode Easy Problems – Java

## 🧩 Problem 1342: Number of Steps to Reduce a Number to Zero

**Platform:** LeetCode
**Difficulty:** Easy
**Language:** Java ☕

---

## 📌 Problem Description

Given an integer `num`, return the number of steps required to reduce it to zero.

In one step:

* If the current number is **even**, divide it by `2`.
* If the current number is **odd**, subtract `1` from it.

Continue the process until the number becomes `0`.

---

## 🧠 Approach

We simulate the process described in the problem.

* If the number is even → divide by `2`.
* If the number is odd → subtract `1`.

We keep counting the number of operations until the value becomes `0`.

---

## 🪜 Step-by-Step Explanation

1. Initialize `count = 0`.
2. While `n > 0`:

   * If `n` is even → `n = n / 2`.
   * Else → `n = n - 1`.
3. Increment `count` after each operation.
4. When `n` becomes `0`, return `count`.

---

## ⏱️ Complexity Analysis

* **Time Complexity:** `O(log n)`
  (Number is reduced roughly by half when even)

* **Space Complexity:** `O(1)`
  (Only constant extra variables used)

---

## 📂 Code

class Solution {
    public int numberOfSteps(int num) {
        int count=0;
        int n = num;
        while(n>0){
            if(n%2==0){
                n = n/2;
            }
            else {
                n = n-1;
            }
            count++;
        }
        return count;
    }
}

---

## 💡 Interview Insight

* Simple simulation problem.
* Tests understanding of conditional operations.
* Can also be optimized using bit manipulation concepts.

---

## ✅ Status

✔ Solved successfully
✔ Efficient simulation approach
✔ Interview-ready implementation

---

*This solution is part of my Data Structures & Algorithms (DSA) practice in Java.*
