# LeetCode Easy Problems – Java

## 🧩 Problem 3079: Find the Sum of Encrypted Integers

**Platform:** LeetCode
**Difficulty:** Easy
**Language:** Java ☕

---

## 📌 Problem Description

You are given an array of integers `nums`.

For each number:

* Replace every digit with the **maximum digit** present in that number.
* The new number is formed by repeating the maximum digit for the same number of digits.

Return the **sum of all encrypted integers**.

---

## 🧠 Approach

For each number:

1. Find the **maximum digit**.
2. Count the number of digits.
3. Create a new number by repeating the maximum digit.
4. Add all such numbers to get the final sum.

---

## 🪜 Step-by-Step Explanation

1. For each number, extract digits using `% 10`.
2. Track the maximum digit.
3. Count total digits.
4. Build a new number using the maximum digit repeated `c` times.
5. Add the result to the sum.
6. Return the final sum.

---

## ⏱️ Complexity Analysis

**Time Complexity:** `O(n × d)`
  (Where `d` is number of digits in each number)

**Space Complexity:** `O(1)`
  (Only constant extra variables used)

---

## 📂 Code

class Solution {
    public int encrypt(int n){
       int max=0,c=0;
       while(n!=0)
       {
        int rem=n%10;
        n=n/10;
        if(max<rem){
            max=rem;
        }
        c++;
       }
       int ans=0;
       while(c!=0)
       {
        ans=ans*10+max;
        c--;
       }
       return ans;

    }
    public int sumOfEncryptedInt(int[] nums) {
        int sum=0;
        for(int i=0; i<nums.length; i++){
           sum+=encrypt(nums[i]);
        }
        return sum;
    }
}

---

## 💡 Interview Insight

* Tests digit manipulation and number reconstruction.
* Combines loops with arithmetic operations.
* Good practice for handling per-element transformations.

---

## ✅ Status

✔ Solved successfully
✔ Efficient digit-based approach
✔ Interview-ready implementation

---

*This solution is part of my Data Structures & Algorithms (DSA) practice in Java.*
