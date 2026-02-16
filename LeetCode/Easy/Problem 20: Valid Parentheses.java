# LeetCode Easy Problems – Java

## 🧩 Problem 20: Valid Parentheses

**Platform:** LeetCode
**Difficulty:** Easy
**Language:** Java ☕

# 📌 Problem Description :-

** Given a string s containing just the characters: **

( )

{ }

[ ]

** Determine if the input string is valid. **

## A string is valid if:

Open brackets are closed by the same type of brackets.

Open brackets are closed in the correct order.

Every closing bracket has a corresponding opening bracket.

## 🧠 Approach (Using Stack)

To solve this problem, we use a Stack data structure.

Traverse each character of the string.

-> If the character is an opening bracket ((, {, [), push it into the stack.

-> If it is a closing bracket:

-> If the stack is empty → return false.

Pop the top element and check if it matches the correct opening bracket.

After processing all characters:

-> If the stack is empty → return true.

Otherwise → return false.

## 🪜 Step-by-Step Explanation

Initialize an empty stack st.

Traverse the string:

If ch is '(', '{', or '[' → push into stack.

Else:

If stack is empty → return false.

Pop the top element.

Check if it matches the correct pair:

'(' → ')'

'{' → '}'

'[' → ']'

After the loop:

Return st.isEmpty().

## ⏱️ Complexity Analysis

**Time Complexity:** O(n)
(Each character is processed once)

**Space Complexity:** O(n)
(In worst case, all characters are opening brackets)

## 📂 Code

class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '[' || ch == '{' || ch == '(') {
                st.push(ch);
            } else {
                if (st.isEmpty()) return false;

                char c = st.pop();

                if (c == '(' && ch != ')' ||
                    c == '{' && ch != '}' ||
                    c == '[' && ch != ']') {
                    return false;
                }
            }
        }
        return st.isEmpty();
    }
}

## 💡 Interview Insight

** This is one of the most commonly asked Stack-based problems. **

---

Tests understanding of:

Stack data structure

String traversal

Matching logic

Foundation for more advanced stack problems like:

Next Greater Element

Largest Rectangle in Histogram

Expression evaluation

---

✅ Status

✔ Solved using stack approach
✔ Clean and efficient solution
✔ Strong foundation problem for mastering stacks

** This solution is part of my Data Structures & Algorithms (DSA) practice in Java. **
