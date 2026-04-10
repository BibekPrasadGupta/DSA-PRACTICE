# 🧩 LeetCode 217: Contains Duplicate

**Platform:** LeetCode
**Difficulty:** Easy
**Language:** Java ☕

---

## 📌 Problem Description

Given an integer array `nums`, return `true` if any value appears at least twice in the array, and return `false` if every element is distinct.

---

## 🧠 Approach

* Use HashSet to track seen elements
* If element already exists → duplicate found
* Otherwise insert into set

---

## 🔑 Key Points

* HashSet provides O(1) lookup
* Early exit when duplicate found
* Efficient for large inputs

---

## ⏱️ Complexity

* Time: O(n)
* Space: O(n)

---

## 💻 Code

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> sc = new HashSet<>();
        for(int num : nums){
            if(sc.contains(num)){
                return true;
            }
            sc.add(num);
        }
        return false;
    }
}

---

## 💡 Interview Insight

* One of the most common beginner problems
* Tests knowledge of HashSet
* Focus on time optimization over brute force

---

## ✅ Status

✔ Solved successfully
✔ Optimized using HashSet
✔ Interview-ready implementation

---

*This solution is part of my Data Structures & Algorithms (DSA) practice in Java.*
