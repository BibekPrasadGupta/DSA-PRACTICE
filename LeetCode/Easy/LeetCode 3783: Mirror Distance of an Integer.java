# 🧩 LeetCode 3783: Mirror Distance of an Integer

**Platform:** LeetCode
**Difficulty:** Easy
**Language:** Java ☕

---

## 📌 Problem Description

Given an integer `n`, find the absolute difference between the number and its reverse.

Return `|reverse(n) - n|`.

---

## 🧠 Approach

* Reverse the digits of the number
* Compute absolute difference between original and reversed number

---

## 🔑 Key Points

* Use modulus and division to reverse number
* Use `Math.abs()` to get absolute difference
* Handle digit extraction carefully

---

## ⏱️ Complexity

* Time: O(d) (where d = number of digits)
* Space: O(1)

---

## 💻 Code

class Solution {
    public int mirrorDistance(int n) {
        int a = n;
        int rev=0;
        while(a>0){
            int rem = a%10;
            rev = rev*10+rem;
            a=a/10;
        }
        int sub = Math.abs(rev-n);
        return sub;
    }
}

---

## 💡 Interview Insight

* Classic number manipulation problem
* Tests understanding of reversing digits
* Frequently asked beginner-level logic

---

## ✅ Status

✔ Solved successfully
✔ Efficient digit manipulation
✔ Interview-ready implementation

---

**This solution is part of my Data Structures & Algorithms (DSA) practice in Java.**
