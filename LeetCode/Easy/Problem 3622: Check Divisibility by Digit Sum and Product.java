# LeetCode Easy Problems – Java

## 🧩 Problem 3622: Check Divisibility by Digit Sum and Product

**Platform:** LeetCode
**Difficulty:** Easy
**Language:** Java ☕

---

## 📌 Problem Description

You are given a positive integer `n`.

* Compute the **sum of digits** of `n`.
* Compute the **product of digits** of `n`.
* Return `true` if `n` is divisible by `(sum of digits + product of digits)`.
* Otherwise, return `false`.

---

## 🧠 Approach (Digit Extraction Using Modulo)

To solve this problem:

1. Extract digits one by one using `% 10`.
2. Add each digit to `sum`.
3. Multiply each digit into `pro`.
4. After processing all digits, check:

```
n % (sum + product) == 0
```

---

## 🪜 Step-by-Step Explanation

1. Initialize:

   * `sum = 0`
   * `pro = 1`
   * `temp = n`

2. While `temp > 0`:

   * Extract digit → `num = temp % 10`
   * Add to sum → `sum += num`
   * Multiply to product → `pro *= num`
   * Remove last digit → `temp /= 10`

3. Check divisibility:

   * If `n % (sum + pro) == 0` → return `true`
   * Else → return `false`

---

## ⏱️ Complexity Analysis

**Time Complexity:** `O(d)`
  (Where `d` is the number of digits in `n`)
**Space Complexity:** `O(1)`
  (Only constant extra variables used)

---

## 📂 Code

class Solution {
    public boolean checkDivisibility(int n) {
        int sum = 0;
        int pro = 1;
        int num;
        int temp = n;

        while (temp > 0) {
            num = temp % 10;
            sum = sum + num;
            pro = pro * num;
            temp = temp / 10;
        }

        if (n % (sum + pro) == 0) {
            return true;
        } else {
            return false;
        }
    }
}

---

## 💡 Interview Insight

* This is a classic **digit extraction pattern** problem.
* Important concepts tested:

  * Modulo and division operations
  * Handling digit sum and digit product together
  * Basic number theory (divisibility check)

---

## ✅ Status

✔ Solved using digit extraction technique
✔ Clean and efficient solution
✔ Good practice for number manipulation problems

---

* This solution is part of my Data Structures & Algorithms (DSA) practice in Java. *
