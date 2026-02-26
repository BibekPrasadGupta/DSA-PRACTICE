# LeetCode Easy Problems – Java

## 🧩 Problem 2652: Sum Multiples

**Platform:** LeetCode
**Difficulty:** Easy
**Language:** Java ☕

---

## 📌 Problem Description

Given a positive integer `n`, return the sum of all integers in the range `[1, n]` that are divisible by **3, 5, or 7**.

---

## 🧠 Approach

We iterate from `1` to `n` and check whether the current number is divisible by `3`, `5`, or `7`.

If it is divisible by any of these values, we add it to the running sum.

---

## 🪜 Step-by-Step Explanation

1. Initialize `sum = 0`.
2. Loop from `1` to `n`.
3. If `i % 3 == 0` OR `i % 5 == 0` OR `i % 7 == 0`:

   * Add `i` to `sum`.
4. After loop ends, return `sum`.

---

## ⏱️ Complexity Analysis

**Time Complexity:** `O(n)`
  (We check each number once)

**Space Complexity:** `O(1)`
  (Only constant extra space used)

---

## 📂 Code

class Solution {
    public int sumOfMultiples(int n) {
        int sum=0;
        for(int i=1; i<=n; i++){
            if(i%3==0 || i%5==0 || i%7==0){
                sum=sum+i;
            }
        }
        return sum;
    }
}

---

## 💡 Interview Insight

* Simple iteration and condition checking problem.
* Tests understanding of modulus operations.
* Good beginner practice question.

---

## ✅ Status

✔ Solved successfully
✔ Straightforward implementation
✔ Interview-ready solution

---

*This solution is part of my Data Structures & Algorithms (DSA) practice in Java.*
