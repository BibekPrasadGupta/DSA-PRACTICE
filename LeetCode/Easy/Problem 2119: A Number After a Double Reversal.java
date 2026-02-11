# LeetCode Easy Problems – Java

## 🧩 Problem 2119: A Number After a Double Reversal

**Platform:** LeetCode
**Difficulty:** Easy
**Language:** Java ☕

---

## 📌 Problem Description

Given a non-negative integer `num`, perform the following steps:

1. Reverse the digits of `num`.
2. Reverse the digits of the resulting number again.

Return `true` if the final result equals the original number. Otherwise, return `false`.

---

## 🧠 Approach (Mathematical Digit Reversal)

* Reverse the given number using modulo (`%`) and division (`/`).
* Reverse the obtained reversed number again.
* Compare the final result with the original number.

This approach simulates the exact process described in the problem.

---

## 🪜 Step-by-Step Explanation

1. Store the original number in a temporary variable.
2. Reverse the number using:

   * `rem = num % 10`
   * `rev = rev * 10 + rem`
   * `num = num / 10`
3. Reverse the result again using the same logic.
4. Compare the final reversed number with the original.
5. Return `true` if they are equal, otherwise `false`.

---

## 💡 Important Insight

A number remains the same after double reversal **only if it does not contain trailing zeros** (except for the number 0 itself).

Example:

* `1800 → 81 → 18` ❌ (Not equal)
* `123 → 321 → 123` ✅ (Equal)

---

## ⏱️ Complexity Analysis

**Time Complexity:** `O(d)`
  (Where `d` is the number of digits in the number)
**Space Complexity:** `O(1)`
  (Only constant extra variables used)

---

## 📂 Code

class Solution {
    public boolean isSameAfterReversals(int num) {
        int rev = 0, rem, ans = num;
        while (ans > 0) {
            rem = ans % 10;
            rev = rev * 10 + rem;
            ans = ans / 10;
        }
        int drev = 0, drem = 0;
        while (rev > 0) {
            drem = rev % 10;
            drev = drev * 10 + drem;
            rev = rev / 10;
        }
        if (num == drev) {
            return true;
        } else {
            return false;
        }
    }
}


---

## ✅ Status

✔ Solved using digit reversal simulation
✔ Beginner-friendly and clean implementation
✔ Interview insight included

---

* This solution is part of my Data Structures & Algorithms (DSA) practice in Java. *
