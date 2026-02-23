# LeetCode Easy Problems – Java

## 🧩 Problem 3783: Mirror Distance of an Integer

**Platform:** LeetCode
**Difficulty:** Easy
**Language:** Java ☕

---

## 📌 Problem Description

You are given an integer `n`.

Find the absolute difference between the number and its reversed form.

Return the distance between the original number and its mirror (reversed) number.

---

## 🧠 Approach

To solve this problem:

1. Reverse the digits of the given number.
2. Compute the absolute difference between the original number and the reversed number.
3. Return the result.

---

## 🪜 Step-by-Step Explanation

1. Store the original number in a variable.
2. Reverse the digits using modulo (`%`) and division (`/`).
3. Compare original and reversed numbers.
4. Return the absolute difference.

---

## ⏱️ Complexity Analysis

**Time Complexity:** `O(d)`
  (Where `d` is the number of digits)

**Space Complexity:** `O(1)`
  (Only constant extra variables used)

---

## 📂 Code

class Solution {
    public int mirrorDistance(int n) {
        int m=n;
        int rev=0;
        while(n!=0){
            int rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        if(m>rev){
           return m-rev;
        }
        else{
            return rev-m;
        }
    }
}

---

## 💡 Interview Insight

* Tests digit manipulation logic.
* Similar to number reversal problems.
* Helps build understanding of arithmetic operations on digits.

---

## ✅ Status

✔ Solved successfully
✔ Simple and efficient logic
✔ Interview-ready implementation

---

*This solution is part of my Data Structures & Algorithms (DSA) practice in Java.*
