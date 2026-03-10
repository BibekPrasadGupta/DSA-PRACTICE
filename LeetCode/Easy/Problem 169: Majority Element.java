# LeetCode Easy Problems – Java

## 🧩 Problem 169: Majority Element

**Platform:** LeetCode
**Difficulty:** Easy
**Language:** Java ☕

---

## 📌 Problem Description

Given an array `nums` of size `n`, return the **majority element**.

The majority element is the element that appears **more than ⌊n / 2⌋ times**.

You may assume that the majority element always exists in the array.

---

## 🧠 Approach

We use the **Boyer–Moore Voting Algorithm**.

The idea is to keep a candidate for the majority element and maintain a counter.

* If the counter becomes `0`, we select a new candidate.
* If the current number equals the candidate → increase the count.
* Otherwise → decrease the count.

Since the majority element appears more than `n/2` times, it will remain as the final candidate.

---

## 🪜 Step-by-Step Explanation

1. Initialize `number = 0` and `count = 0`.
2. Traverse the array.
3. If `count == 0`, update candidate `number = num`.
4. If current number equals candidate → increment `count`.
5. Otherwise → decrement `count`.
6. After traversal, the candidate will be the majority element.

---

## ⏱️ Complexity Analysis

**Time Complexity:** `O(n)`
  (Single traversal of the array)

**Space Complexity:** `O(1)`
  (Only constant extra variables used)

---

## 📂 Code

class Solution {
    public int majorityElement(int[] nums) {
        int number=0;
        int count=0;
        for( int num : nums){
            if(count==0){
                number=num;
            }
            if(num == number){
                count++;
            }
            else{
                count--;
            }
        }
        return number;
    }
}

---

## 💡 Interview Insight

* Classic algorithm known as **Boyer–Moore Voting Algorithm**.
* Avoids using extra space like HashMap.
* Very common interview question for arrays.

---

## ✅ Status

✔ Solved successfully
✔ Optimal linear time solution
✔ Interview-ready implementation

---

*This solution is part of my Data Structures & Algorithms (DSA) practice in Java.*
