# LeetCode Easy Problems – Java

## 🧩 Problem 2535: Difference Between Element Sum and Digit Sum of an Array

**Platform:** LeetCode
**Difficulty:** Easy
**Language:** Java ☕

---

## 📌 Problem Description

You are given a positive integer array `nums`.

* The **element sum** is the sum of all elements in the array.
* The **digit sum** is the sum of all digits present in each element.

Return the absolute difference between the element sum and the digit sum.

---

## 🧠 Approach

We calculate two values:

1. The sum of all elements in the array.
2. The sum of digits of each element by extracting digits using modulo and division.

Finally, we return the difference between these two sums.

---

## 🪜 Step-by-Step Explanation

1. Initialize `sum = 0` and `sums = 0`.
2. Traverse the array:

   * Add element value to `sum`.
   * Extract digits using `% 10` and add to `sums`.
3. After traversal, return `sum - sums`.

---

## ⏱️ Complexity Analysis

**Time Complexity:** `O(n × d)`
  (Where `d` is number of digits per element)

**Space Complexity:** `O(1)`
  (Only constant extra variables used)

---

## 📂 Code

class Solution {
    public int differenceOfSum(int[] nums) {
        int sum=0;
        int sums=0;
        for(int i=0; i<nums.length; i++){
            sum=sum+nums[i];
            while(nums[i]!=0){
                int rem=nums[i]%10;
                sums=rem+sums;
                nums[i]=nums[i]/10;
            }
        }
        return sum-sums;
    }
}

---

## 💡 Interview Insight

* Tests digit extraction logic.
* Combines array traversal with number manipulation.
* Good practice for handling nested loops efficiently.

---

## ✅ Status

✔ Solved successfully
✔ Efficient digit processing
✔ Interview-ready implementation

---

*This solution is part of my Data Structures & Algorithms (DSA) practice in Java.*
