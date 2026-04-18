# 🧩 LeetCode 1470: Shuffle the Array

**Platform:** LeetCode
**Difficulty:** Easy
**Language:** Java ☕

---

## 📌 Problem Description

Given the array `nums` consisting of `2n` elements in the form `[x1,x2,...,xn,y1,y2,...,yn]`, return the array in the form `[x1,y1,x2,y2,...,xn,yn]`.

---

## 🧠 Approach

* Use two pointers
* First half contains x values
* Second half contains y values
* Place elements alternately

---

## 🔑 Key Points

* Input size is always even (2n)
* Alternate placement is required
* Can be done in-place or using extra array

---

## ⏱️ Complexity

* Time: O(n)
* Space: O(1)

---

## 💻 Code

class Solution {
    public int[] shuffle(int[] nums, int n) {
        for(int i=1; i<nums.length; i++){
            if(i%2==0){
                nums[i]=nums[i];
            }
            else{
                nums[i]=nums[n];
                n++;
            }
        }
        return nums;
    }
}

---

## 💡 Interview Insight

* Simple array manipulation problem
* Tests indexing and pattern understanding
* Common beginner-level question

---

## ✅ Status

✔ Solved successfully
✔ Simple and intuitive approach
✔ Interview-ready implementation

---

*This solution is part of my Data Structures & Algorithms (DSA) practice in Java.*
