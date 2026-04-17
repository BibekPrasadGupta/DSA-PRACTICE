# 🧩 LeetCode 3300: Minimum Element After Digit Sum

**Platform:** LeetCode
**Difficulty:** Easy
**Language:** Java ☕

---

## 📌 Problem Description

Given an integer array `nums`, replace each element with the sum of its digits and return the **minimum value** among them.

---

## 🧠 Approach

* Traverse each number in the array
* Compute sum of digits using modulo and division
* Track the minimum digit sum

---

## 🔑 Key Points

* Use `% 10` to extract digits
* Use `/ 10` to reduce number
* Maintain a running minimum

---

## ⏱️ Complexity

* Time: O(n * d) (where d = number of digits)
* Space: O(1)

---

## 💻 Code

class Solution {
    public int minElement(int[] nums) {
       int min = Integer.MAX_VALUE;
       int rem;
       for(int num : nums){
            int sum=0;
            while(num!=0){
                rem=num%10;
                sum=sum+rem;
                num=num/10;
            }
            min=Math.min(min,sum);
       }
       return min;
    }
}

---

## 💡 Interview Insight

* Basic math + iteration problem
* Tests understanding of digit extraction
* Good beginner-friendly logic building problem

---

## ✅ Status

✔ Solved successfully
✔ Efficient implementation
✔ Interview-ready approach

---

*This solution is part of my Data Structures & Algorithms (DSA) practice in Java.*
