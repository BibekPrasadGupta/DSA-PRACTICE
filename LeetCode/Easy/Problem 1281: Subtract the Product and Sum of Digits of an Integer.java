# LeetCode Easy Problems – Java

## 🧩 Problem 1281: Subtract the Product and Sum of Digits of an Integer

**Platform:** LeetCode
**Difficulty:** Easy
**Language:** Java ☕

---

## 📌 Problem Description

Given an integer `n`, return the difference between the **product of its digits** and the **sum of its digits**.

---

## 🧠 Approach

We extract each digit of the number using modulo (`% 10`) and division (`/ 10`).

* Multiply digits to compute the **product**.
* Add digits to compute the **sum**.

Finally, return `product - sum`.

---

## 🪜 Step-by-Step Explanation

1. Initialize `product = 1` and `sum = 0`.
2. While the number is greater than `0`:

   * Extract last digit using `n % 10`.
   * Add the digit to `sum`.
   * Multiply the digit with `product`.
   * Remove the last digit using `n / 10`.
3. After processing all digits, compute `product - sum`.
4. Return the result.

---

## ⏱️ Complexity Analysis

* **Time Complexity:** `O(d)`
  (Where `d` is the number of digits in `n`)

* **Space Complexity:** `O(1)`
  (Only constant extra variables used)

---

## 📂 Code

class Solution {
    public int subtractProductAndSum(int n) {
        int rem; 
        int product=1;
        int sum = 0;
        int num = n;
        while(num>0){
            rem = num%10;
            sum = sum + rem;
            product = product * rem;
            num = num/10;
        }
        int result = product - sum;
        return result;
    }
}

---

## 💡 Interview Insight

* Classic digit manipulation problem.
* Tests understanding of modulo and division operations.
* Frequently used for practicing number-based logic.

---

## ✅ Status

✔ Solved successfully
✔ Efficient digit extraction approach
✔ Interview-ready implementation

---

*This solution is part of my Data Structures & Algorithms (DSA) practice in Java.*
