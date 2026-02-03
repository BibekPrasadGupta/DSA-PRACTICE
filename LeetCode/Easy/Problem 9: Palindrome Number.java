# LeetCode Easy Problems – Java

🧩 Problem 9: Palindrome Number

Platform: LeetCode
Difficulty: Easy
Language: Java ☕

🧩 Problem Description

Given an integer x, return true if x is a palindrome, and false otherwise.

A palindrome number is a number that reads the same forward and backward.

**Examples**

121 → true

-121 → false

10 → false

🔗 Problem Link: https://leetcode.com/problems/palindrome-number/

# 💡 Approach Used

This solution uses the reverse-number approach.

**Key Observations:**

Negative numbers can never be palindromes

Reverse the digits of the number

Compare the reversed number with the original number

If both are equal, the number is a palindrome.

# 🧠 Algorithm

If x < 0, return false

Store the original number in a temporary variable

Reverse the number using a loop

Compare reversed number with original

Return true if equal, otherwise false

# 🧪 Example

Input:

x = 121


Output:

true


**Explanation:**

Reverse of 121 → 121
Since both are equal, it is a palindrome.

# 🧾 Java Code

class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        int rev = 0, temp = x, rem;

        while (x != 0) {
            rem = x % 10;
            rev = rev * 10 + rem;
            x = x / 10;
        }

        return temp == rev;
    }
}

# ⏱️ Time & Space Complexity

**Time Complexity:** O(log₁₀ n)

**Space Complexity:** O(1)

#🚀 Notes

Beginner-friendly logic

No string conversion used

Efficient and easy to explain in interviews

# 📌 Tags

Math · Java · Loop · LeetCode Easy · Palindrome · Beginner Friendly

**This solution is part of my Data Structures & Algorithms (DSA) practice in Java.**
