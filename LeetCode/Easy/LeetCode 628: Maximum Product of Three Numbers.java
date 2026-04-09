# 🧩 LeetCode 628: Maximum Product of Three Numbers

**Platform:** LeetCode
**Difficulty:** Easy
**Language:** Java ☕

---

## 📌 Problem Description

Given an integer array `nums`, find three numbers whose product is maximum and return that product.

---

## 🧠 Approach

* Track top 3 maximum numbers
* Track 2 minimum numbers (for negative case)
* Compare:

  * Product of 3 largest numbers
  * Product of 2 smallest (negative) and largest number

---

## 🔑 Key Points

* Negative numbers can increase product
* Need both max and min tracking
* Single pass solution

---

## ⏱️ Complexity

* Time: O(n)
* Space: O(1)

---

## 💻 Code

class Solution {
    public int maximumProduct(int[] nums) {
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;

        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        for (int num : nums) {
            if (num > max1) {
                max3 = max2;
                max2 = max1;
                max1 = num;
            } else if (num > max2) {
                max3 = max2;
                max2 = num;
            } else if (num > max3) {
                max3 = num;
            }

            if (num < min1) {
                min2 = min1;
                min1 = num;
            } else if (num < min2) {
                min2 = num;
            }
        }

        return Math.max(max1 * max2 * max3, min1 * min2 * max1);
    }
}

---

## 💡 Interview Insight

* Classic array optimization problem
* Tests edge cases with negative numbers
* Focus on greedy selection and tracking extremes

---

## ✅ Status

✔ Solved successfully
✔ Optimized single pass solution
✔ Interview-ready implementation

---

*This solution is part of my Data Structures & Algorithms (DSA) practice in Java.*
