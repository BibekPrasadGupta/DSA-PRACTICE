# 🧩 LeetCode 507: Perfect Number

**Platform:** LeetCode
**Difficulty:** Easy
**Language:** Java ☕

---

## 📌 Problem Description

A perfect number is a positive integer that is equal to the sum of its positive divisors, excluding itself.

Given an integer `num`, return `true` if it is a perfect number, otherwise return `false`.

---

## 🧠 Approach

* Iterate from 2 to √num
* Check divisors in pairs
* Add both divisors when found
* Compare sum with original number

---

## 🔑 Key Points

* Start sum from 1 (since 1 is always a divisor)
* Use square root optimization
* Avoid double counting when i == num/i

---

## ⏱️ Complexity

* Time: O(√n)
* Space: O(1)

---

## 💻 Code

class Solution {
    public boolean checkPerfectNumber(int num) {
        if (num <= 1) return false;

        int sum = 1;

        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                sum += i;
                if (i != num / i) {
                    sum += num / i;
                }
            }
        }

        return sum == num;
    }
}
---

## 💡 Interview Insight

* Classic math + divisor problem
* Optimization using square root reduces complexity
* Tests understanding of factors and edge cases

---

## ✅ Status

✔ Solved successfully
✔ Optimized approach using divisor pairs
✔ Interview-ready implementation

---

*This solution is part of my Data Structures & Algorithms (DSA) practice in Java.*
