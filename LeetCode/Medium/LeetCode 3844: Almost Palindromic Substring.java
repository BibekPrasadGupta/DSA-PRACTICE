# 🧩 LeetCode 3844: Almost Palindromic Substring

**Platform:** LeetCode
**Difficulty:** Medium
**Language:** Java ☕

---

## 📌 Problem Description

Given a string `s`, find the length of the **longest almost palindromic substring**.

A substring is considered **almost palindromic** if:

* It is already a palindrome OR
* It can become a palindrome by removing at most one character

Return the maximum length of such substring.

---

## 🧠 Approach

* Use **Dynamic Programming (DP)**
* Maintain two 2D arrays:

  * `isPal[i][j]` → checks if substring is palindrome
  * `almost[i][j]` → checks if substring is almost palindrome
* Expand substring range from smaller to larger

---

## 🔑 Key Points

* Base case: single character is palindrome
* If characters match → check inner substring
* If mismatch → allow one removal
* Track maximum valid substring length

---

## ⏱️ Complexity

* Time: O(n²)
* Space: O(n²)

---

## 💻 Code

class Solution {
    public int almostPalindromic(String s) {
        int n = s.length();
        if (n < 2) return 0;

        boolean[][] isPal = new boolean[n][n];
        boolean[][] almost = new boolean[n][n];

        int maxLen = 0;

        for (int i = n - 1; i >= 0; i--) {
            isPal[i][i] = true;

            for (int j = i + 1; j < n; j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    if (j - i == 1)
                        isPal[i][j] = true;
                    else
                        isPal[i][j] = isPal[i + 1][j - 1];
                }
                if (s.charAt(i) == s.charAt(j)) {
                    if (j - i > 1)
                        almost[i][j] = almost[i + 1][j - 1];
                } else {
                    almost[i][j] = isPal[i + 1][j] || isPal[i][j - 1];
                }
                if (isPal[i][j] && j - i >= 1) {
                    almost[i][j] = true;
                }

                if (almost[i][j]) {
                    maxLen = Math.max(maxLen, j - i + 1);
                }
            }
        }

        return maxLen;
    }
}

---

## 💡 Interview Insight

* Variation of **Longest Palindromic Substring** problem.
* Adds flexibility of removing one character.
* Tests DP table design and transition logic.

---

## ✅ Status

✔ Solved successfully
✔ DP optimized approach
✔ Interview-ready implementation

---

*This solution is part of my Data Structures & Algorithms (DSA) practice in Java.*
