# 🧩 LeetCode 2455: Average Value of Even Numbers That Are Divisible by Three

**Platform:** LeetCode
**Difficulty:** Easy
**Language:** Java ☕

---

## 📌 Problem Description

Given an integer array `nums`, return the average value of all even numbers that are divisible by 3.

If there are no such numbers, return 0.

---

## 🧠 Approach

* Traverse the array
* Check if number is divisible by both 2 and 3
* Keep track of sum and count
* Return average

---

## 🔑 Key Points

* Condition: `num % 2 == 0 && num % 3 == 0`
* Avoid division by zero
* Integer division for result

---

## ⏱️ Complexity

* Time: O(n)
* Space: O(1)

---

## 💻 Code

class Solution {
    public int averageValue(int[] nums) {
        int count = 0;
        int sum = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]%2==0 && nums[i]%3==0){
                sum = nums[i]+sum;
                count++;
                }
            }
            if(count == 0){
                return 0;
            }
        int avg=sum/count;
        return avg;
    }
}

---

## 💡 Interview Insight

* Simple filtering and aggregation problem
* Tests basic looping and condition checks
* Common beginner-level question

---

## ✅ Status

✔ Solved successfully
✔ Efficient single-pass solution
✔ Interview-ready implementation

---

*This solution is part of my Data Structures & Algorithms (DSA) practice in Java.*
