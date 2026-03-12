# LeetCode Easy Problems – Java

## 🧩 Problem 1979: Find Greatest Common Divisor of Array

**Platform:** LeetCode
**Difficulty:** Easy
**Language:** Java ☕

---

## 📌 Problem Description

Given an integer array `nums`, return the **greatest common divisor (GCD)** of the **smallest number** and the **largest number** in the array.

The GCD of two numbers is the largest positive integer that divides both numbers without leaving a remainder.

---

## 🧠 Approach

1. Traverse the array to find the **minimum** and **maximum** elements.
2. Compute the **GCD** of these two numbers.
3. We check divisors from the smaller number downwards and return the first value that divides both numbers.

---

## 🪜 Step-by-Step Explanation

1. Initialize `max` and `min` with the first element of the array.
2. Traverse the array:

   * Update `max` if a larger element is found.
   * Update `min` if a smaller element is found.
3. Loop from `min` down to `2`.
4. If a number divides both `max` and `min`, it is the GCD.
5. Return the GCD.

---

## ⏱️ Complexity Analysis

**Time Complexity:** `O(n + min)`
  (Traversal for min/max and divisor checking)

**Space Complexity:** `O(1)`
  (Only constant extra variables used)

---

## 📂 Code

class Solution {
    public int findGCD(int[] nums) {
        int max=nums[0];
        int min=nums[0];
        for(int i=1; i<nums.length; i++){
            if(nums[i]>max){
               max=nums[i];
            }
            if(nums[i]<min){
                min=nums[i];
            }
        }
        int gcd = 1;
        for(int i=Math.min(max,min); i>1; i--){
            if(max%i==0 && min%i==0){
                gcd=i;
                break;
            }
        }
        return gcd;
    }
}

---

## 💡 Interview Insight

* Tests understanding of **GCD computation**.
* Requires identifying **minimum and maximum values** in an array.
* Can be optimized using **Euclidean Algorithm**.

---

## ✅ Status

✔ Solved successfully
✔ Correct divisor checking logic
✔ Interview-ready implementation

---

*This solution is part of my Data Structures & Algorithms (DSA) practice in Java.*
