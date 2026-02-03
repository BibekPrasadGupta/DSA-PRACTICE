# LeetCode Easy Problems – Java

🧩 Problem 509: Fibonacci Number

Platform: LeetCode
Difficulty: Easy
Language: Java ☕

🧩 Problem Description

**The Fibonacci numbers are defined as follows:**

F(0) = 0

F(1) = 1

F(n) = F(n − 1) + F(n − 2), for n > 1

Given an integer n, return the nᵗʰ Fibonacci number.

🔗 Problem Link: https://leetcode.com/problems/fibonacci-number/

# 💡 Approach Used

This solution uses an iterative approach with space optimization.

Instead of recursion (which causes repeated calculations and higher memory usage),
we compute Fibonacci numbers iteratively by storing only the previous two values.

This makes the solution efficient and interview-friendly.

# 🧠 Algorithm

If n <= 1, return n

**Initialize:**

first = 0

second = 1

Loop from 2 to n

Compute the current Fibonacci number

Update previous values

Return the final result

# 🧪 Example

Input:

n = 5


Output:

5


**Explanation:**

0 → 1 → 1 → 2 → 3 → 5

🧾 Java Code
  
class Solution {
    public int fib(int n) {

        if (n <= 1) {
            return n;
        }

        int first = 0;
        int second = 1;

        for (int i = 2; i <= n; i++) {
            int temp = first + second;
            first = second;
            second = temp;
        }

        return second;
    }
}

# ⏱️ Time & Space Complexity

**Time Complexity:** O(n)

**Space Complexity:** O(1)

# 🚀 Notes

Beginner-friendly and easy to explain in interviews

Avoids recursion and extra memory usage

Optimized Dynamic Programming approach

# 📌 Tags

Dynamic Programming · Java · Iteration · LeetCode Easy · Beginner Friendly

** This solution is part of my Data Structures & Algorithms (DSA) practice in Java. **
