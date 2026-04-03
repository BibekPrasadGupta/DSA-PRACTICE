# 🧩 LeetCode 697: Degree of an Array

**Platform:** LeetCode
**Difficulty:** Easy
**Language:** Java ☕

---

## 📌 Problem Description

Given a non-empty array of non-negative integers `nums`, the **degree** of this array is defined as the maximum frequency of any one of its elements.

Your task is to find the smallest possible length of a (contiguous) subarray of `nums`, that has the same degree as `nums`.

---

## 🧠 Approach

* Use HashMaps to track:

  * Frequency of each number
  * First occurrence index of each number
* Traverse the array and update degree
* Calculate minimum subarray length dynamically

---

## 🔑 Key Points

* Degree = maximum frequency
* Track first index to compute subarray length
* Update answer when:

  * New higher frequency found
  * Same frequency but smaller subarray

---

## ⏱️ Complexity

* Time: O(n)
* Space: O(n)

---

## 💻 Code

class Solution {
    public int findShortestSubArray(int[] nums) {
        Map<Integer,Integer> count = new HashMap<>();
        Map<Integer,Integer> firstIndex = new HashMap<>();
        int degree = 0;
        int minLength = nums.length;

        for(int i=0; i<nums.length; i++){
            int num = nums[i];
            firstIndex.putIfAbsent(num,i);
            count.put(num,count.getOrDefault(num,0)+1);
            int frequency = count.get(num);

            if(frequency > degree){
                degree = frequency;
                minLength=i-firstIndex.get(num)+1;
            }else if (frequency == degree){
                minLength = Math.min(minLength,i-firstIndex.get(num)+1);
            }
        }
        return minLength;
    }
}

---

## 💡 Interview Insight

* Classic HashMap problem
* Combines frequency counting with index tracking
* Tests optimization and single-pass logic

---

## ✅ Status

✔ Solved successfully
✔ Optimal O(n) solution
✔ Interview-ready implementation

---

*This solution is part of my Data Structures & Algorithms (DSA) practice in Java.*
