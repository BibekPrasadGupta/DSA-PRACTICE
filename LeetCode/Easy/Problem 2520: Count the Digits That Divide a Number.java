## LeetCode Easy Problems – Java
  
🧩 Problem 2520: Count the Digits That Divide a Number

**Platform:** LeetCode
**Difficulty:** Easy
**Language:** Java ☕

#📌 Problem Description
,,,
Given an integer num, return the number of digits in num that divide num.

A digit divides num if:

The digit is not zero, and

num % digit == 0
,,,
  
## 🧠 Approach (Digit Extraction using Modulo)

*This solution processes the number digit by digit using modulo and division operations.*

## 🔹 Idea:
---
Extract each digit from the number

Check whether the digit divides the original number

Maintain a counter for valid digits
---
## 🪜 Step-by-Step Explanation
---

Store the original number in temp

While temp is not zero:

Extract the last digit using temp % 10

Check if num % digit == 0

If true, increment count

Remove the last digit using temp / 10

Return count
  
---

## ⏱️ Complexity Analysis

** Time Complexity:** O(d)
(Where d is the number of digits in num)

** Space Complexity:** O(1)
(Only constant extra space used)

📂 Code
class Solution {
    public int countDigits(int num) {
        int count = 0;
        int temp = num;

        while (temp != 0) {
            int rem = temp % 10;
            if (num % rem == 0) {
                count++;
            }
            temp = temp / 10;
        }
        return count;
    }
}
✅ Status

✔ Solved using digit extraction
✔ Simple modulo-based logic
✔ Beginner-friendly solution

** This solution is part of my Data Structures & Algorithms (DSA) practice in Java. **
