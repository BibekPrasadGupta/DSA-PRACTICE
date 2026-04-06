# 🧩 LeetCode 455: Assign Cookies

**Platform:** LeetCode
**Difficulty:** Easy
**Language:** Java ☕

---

## 📌 Problem Description

You are given two integer arrays `g` and `s`:

* `g[i]` represents the greed factor of the i-th child.
* `s[j]` represents the size of the j-th cookie.

Each child can be assigned at most one cookie. A child is satisfied if the cookie size is greater than or equal to their greed factor.

Return the maximum number of children you can satisfy.

---

## 🧠 Approach

* Sort both arrays
* Use two pointers to match smallest greed with smallest possible cookie
* Greedily assign cookies

---

## 🔑 Key Points

* Sort `g` and `s`
* Use two pointers
* Assign only when cookie satisfies greed

---

## ⏱️ Complexity

* Time: O(n log n)
* Space: O(1)

---

## 💻 Code

class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int i = 0;
        int j = 0;
        int count = 0;

        while (i < g.length && j < s.length) {
            if (s[j] >= g[i]) {
                count++;   
                i++;
                j++;
            } else {
                j++;      
            }
        }

        return count;
    }
}
---

## 💡 Interview Insight

* Classic Greedy problem
* Tests sorting + two pointer technique

---

## ✅ Status

✔ Solved successfully
✔ Optimal greedy approach
✔ Interview-ready implementation

---

*This solution is part of my Data Structures & Algorithms (DSA) practice in Java.*
