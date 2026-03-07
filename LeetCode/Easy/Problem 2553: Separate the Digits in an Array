# LeetCode Easy Problems – Java

## 🧩 Problem 2553: Separate the Digits in an Array

**Platform:** LeetCode
**Difficulty:** Easy
**Language:** Java ☕

---

## 📌 Problem Description

You are given an array of positive integers `nums`.

Return an array `answer` that consists of the digits of each integer in `nums` after separating them in the same order they appear.

For example, if `nums = [13, 25]`, the result should be `[1, 3, 2, 5]`.

---

## 🧠 Approach

We first count the total number of digits across all numbers to determine the size of the result array.

Then we traverse the array again and extract digits from each number using modulo and division operations.

Digits are placed into the result array in the correct order.

---

## 🪜 Step-by-Step Explanation

1. Initialize a counter `c` to store total digits.
2. Traverse the array and count digits of each number.
3. Create a result array of size `c`.
4. Traverse the input array from right to left.
5. Extract digits using `% 10` and place them in the result array.
6. Continue until all digits are stored.

---

## ⏱️ Complexity Analysis

* **Time Complexity:** `O(n × d)`
  (Where `d` is the number of digits in each number)

* **Space Complexity:** `O(k)`
  (Where `k` is the total number of digits stored in the result array)

---

## 📂 Code

class Solution {
    public int[] separateDigits(int[] nums) {
        int c = 0;
        for(int i : nums){
            while(i>0){
                c++;
                i=i/10;
            }
        }
        int []arr = new int[c];
        for(int i=nums.length-1; i>=0; i--){
            int x = nums[i];
            while (x>0){
                arr[c-1] = x%10;
                c--;
                x/=10;
            }
        }
        return arr;
    }
}

---

## 💡 Interview Insight

* Tests digit extraction from numbers.
* Combines array traversal with number manipulation.
* Good practice for handling digit-level operations.

---

## ✅ Status

✔ Solved successfully
✔ Efficient digit extraction approach
✔ Interview-ready implementation

---

*This solution is part of my Data Structures & Algorithms (DSA) practice in Java.*
