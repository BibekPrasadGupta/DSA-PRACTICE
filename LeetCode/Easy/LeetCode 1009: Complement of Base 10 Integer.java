# 🧩 LeetCode 1009: Complement of Base 10 Integer

**Platform:** LeetCode
**Difficulty:** Easy
**Language:** Java ☕

---

## 📌 Problem Description

Given a non-negative integer `n`, return its bitwise complement.

The complement of a number is obtained by flipping all the bits in its binary representation.

---

## 🧠 Approach

* Find number of bits required to represent `n`
* Create a mask with all bits set to 1 of same length
* XOR the number with mask to get complement

---

## 🔑 Key Points

* Special case: when `n = 0`, return 1
* Use logarithm to calculate number of bits
* XOR operation flips bits

---

## ⏱️ Complexity

* Time: O(1)
* Space: O(1)

---

## 💻 Code

class Solution {
    public int bitwiseComplement(int n) {
        if(n==0) return 1;
        int bits = (int)Math.floor(Math.log(n)/Math.log(2))+1;
        int mask = (int)Math.pow(2,bits)-1; 
        return mask^n;
    }
}

---

## 💡 Interview Insight

* Bit manipulation problem
* Tests understanding of binary representation
* XOR trick is commonly used

---

## ✅ Status

✔ Solved successfully
✔ Efficient bit manipulation approach
✔ Interview-ready implementation

---

*This solution is part of my Data Structures & Algorithms (DSA) practice in Java.*
