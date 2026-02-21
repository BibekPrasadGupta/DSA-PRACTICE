# LeetCode Easy Problems – Java

## 🧩 Problem 66: Plus One

**Platform:** LeetCode
**Difficulty:** Easy
**Language:** Java ☕

---

## 📌 Problem Description

You are given a large integer represented as an integer array `digits`, where each `digits[i]` is the i-th digit of the integer.

The digits are ordered from most significant to least significant from left to right.

Increment the large integer by one and return the resulting array of digits.

---

## 🧠 Approach

We simulate the addition of one starting from the last digit.

* If the digit is less than 9 → simply increment and return.
* If the digit is 9 → set it to 0 and continue to the next digit (carry).
* If all digits are 9 → create a new array with leading 1.

---

## 🪜 Step-by-Step Explanation

1. Traverse the array from the last index.
2. If `digits[i] < 9`:

   * Increment the digit and return the array.
3. Otherwise set `digits[i] = 0` and continue.
4. If loop finishes, create a new array of size `n + 1`.
5. Set first element to `1` and return it.

---

## ⏱️ Complexity Analysis

**Time Complexity:** `O(n)`
  (In worst case, we traverse all digits)

**Space Complexity:** `O(1)`
  (Ignoring output array if new one is created)

---

## 📂 Code


class Solution {
    public int[] plusOne(int[] digits) {
       for(int i=digits.length-1; i>=0; i--){
        if(digits[i]<9){
            digits[i]=digits[i]+1;
            return digits;
        }
        digits[i]=0;
       }
       int [] ans = new int [digits.length+1];
       ans[0]=1;
       return ans;
    }
}


---

## 💡 Interview Insight

* Classic carry propagation problem.
* Tests understanding of array manipulation.
* Commonly asked beginner array question.

---

## ✅ Status

✔ Solved successfully
✔ Optimized carry handling
✔ Interview-ready implementation

---

*This solution is part of my Data Structures & Algorithms (DSA) practice in Java.*
