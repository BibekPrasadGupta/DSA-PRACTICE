# LeetCode Medium Problems – Java
  
## 🧩 Problem 7: Reverse Integer

**Platform:** LeetCode
**Difficulty:** Medium
**Language:** Java ☕

## 📌 Problem Description

Given a signed 32-bit integer x, reverse its digits.

If reversing x causes the value to go outside the signed 32-bit integer range
[-2³¹, 2³¹ − 1], return 0.

## 🧠 Approach (Mathematical Reversal)

Initialize a variable to store the reversed number.

Extract the last digit using modulo (x % 10).

Append the digit to the reversed number.

Before each update, check for integer overflow or underflow.

Continue the process until all digits are processed.

This approach avoids string conversion and uses only arithmetic operations.

## ⚠️ Overflow Handling

To prevent overflow, the solution verifies the reversed value before multiplying:

rev > Integer.MAX_VALUE / 10
rev < Integer.MIN_VALUE / 10


If an overflow or underflow is detected, the method immediately returns 0.

## ⏱️ Complexity Analysis

* **Time Complexity:** O(n)
(Where n is the number of digits in the integer)

* **Space Complexity:** O(1)
(Uses constant extra space)


## 📂 Code
  
class Solution {
    public int reverse(int x) {
        int rev = 0, rem;

        while (x != 0) {
            if (rev > Integer.MAX_VALUE / 10 || rev < Integer.MIN_VALUE / 10) {
                return 0;
            }
            rem = x % 10;
            rev = rev * 10 + rem;
            x = x / 10;
        }
        return rev;
    }
}

## ✅ Status

✔ Solved using mathematical digit reversal
✔ Overflow-safe implementation
✔ Interview-ready solution

* This solution is part of my Data Structures & Algorithms (DSA) practice in Java. *
