# LeetCode Easy Problems – Java
🧩 Problem 326: Power of Three

**Platform:** LeetCode 
**Difficulty:** Easy 
**Language:** Java ☕

🧩 Problem Description

Given an integer n, return true if it is a power of three. Otherwise, return false.

An integer n is a power of three if there exists an integer x such that:

n == 3^x


🔗 Problem Link: https://leetcode.com/problems/power-of-three/

## 💡 Approach Used

This solution uses iterative division.

A number is a power of three if it can be repeatedly divided by 3 and finally becomes 1

Any number <= 0 can never be a power of three

## 🧠 Algorithm

If n <= 0, return false

If n == 1, return true

While n % 3 == 0

Divide n by 3

If n == 1, return true, else return false

##🧪 Example

**Input:**

n = 27


**Output:**

true


**Explanation:**

27 → 9 → 3 → 1

## 🧾 Java Code

class Solution {
    public boolean isPowerOfThree(int n) {
        if (n <= 0) {
            return false;
        } else if (n == 1) {
            return true;
        } else {
            while (n % 3 == 0) {
                n = n / 3;
            }
            return n == 1;
        }
    }
}

## ⏱️ Time & Space Complexity

**Time Complexity:** O(log₃ n)

**Space Complexity:** O(1)

## 🚀 Notes

Beginner-friendly and easy to explain in interviews

No extra space used

Alternative approaches: recursion, math-based solution

## 📌 Tags

Math · Java · Loop · LeetCode Easy · Beginner Friendly

**This solution is part of my Data Structures & Algorithms (DSA) practice in Java.**
