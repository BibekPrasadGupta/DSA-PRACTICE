# 🧩 LeetCode 1342: Number of Steps to Reduce a Number to Zero

**Platform:** LeetCode
**Difficulty:** Easy
**Language:** Java ☕

---

## 📌 Problem Description

Given an integer `num`, return the number of steps to reduce it to zero.

In one step:

* If the current number is even → divide it by 2
* If the current number is odd → subtract 1 from it

---

## 🧠 Approach

* Use a loop until number becomes zero
* Check if number is even or odd
* Apply corresponding operation and increment count

---

## 🔑 Key Points

* Even → divide by 2
* Odd → subtract 1
* Count total operations

---

## ⏱️ Complexity

* Time: O(log n)
* Space: O(1)

---

## 💻 Code

class Solution {
    public int numberOfSteps(int num) {
        int count = 0;
        while(num>0){
            if(num%2==0){
                num=num/2;
                count++;
            }
            else{
                num = num - 1;
                count++;
            }
        }
        return count;
    }
}

---

## 💡 Interview Insight

* Basic simulation problem
* Tests understanding of loops and conditions
* Common beginner-friendly question

---

## ✅ Status

✔ Solved successfully
✔ Clean and simple logic
✔ Interview-ready implementation

---

*This solution is part of my Data Structures & Algorithms (DSA) practice in Java.*
