# LeetCode Easy Problems – Java

## 🧩 Problem 1295: Find Numbers with Even Number of Digits

**Platform:** LeetCode
**Difficulty:** Easy
**Language:** Java ☕

---

## 📌 Problem Description

Given an array `nums` of integers, return how many of them contain an **even number of digits**.

---

## 🧠 Approach

For each number in the array, we count the number of digits it contains.

* Extract digits using division by `10`.
* Count how many digits the number has.
* If the digit count is even, increase the result counter.

---

## 🪜 Step-by-Step Explanation

1. Initialize `count1 = 0`.
2. Traverse the array.
3. For each number:

   * Count digits using a loop (`n = n / 10`).
4. Check if digit count is even.
5. If even → increment `count1`.
6. Return the final count.

---

## ⏱️ Complexity Analysis

**Time Complexity:** `O(n × d)`
  (Where `d` is the number of digits in each number)

**Space Complexity:** `O(1)`
  (Only constant extra variables used)

---

## 📂 Code

class Solution {
    public int findNumbers(int[] nums) {
        int count1=0;
        for(int i=0; i<nums.length; i++){
            int count=0;
            int n=nums[i];
            while(n!=0){
            count++;
            n=n/10;
            }
        if(count%2==0){
            count1++;
        }
        }
        return count1;
    }
}

---

## 💡 Interview Insight

* Tests digit counting logic.
* Reinforces number manipulation using division.
* Simple but common array processing question.

---

## ✅ Status

✔ Solved successfully
✔ Efficient digit counting approach
✔ Interview-ready implementation

---

*This solution is part of my Data Structures & Algorithms (DSA) practice in Java.*
