# 🧩 LeetCode 3843: First Unique Frequency

**Platform:** LeetCode
**Difficulty:** Medium
**Language:** Java ☕

---

## 📌 Problem Description

Given an array `nums[]`, find the first element whose **frequency is unique**.

* Frequency of an element = number of times it appears in the array.
* Return the **first element (in original order)** whose frequency occurs only once among all frequencies.
* If no such element exists, return `-1`.

---

## 🧠 Approach

* Use **HashMap** to count frequency of each element
* Use another **HashMap** to count frequency occurrences
* Traverse original array to find first valid element

---

## 🔑 Key Points

* Maintain two maps:

  * `num → frequency`
  * `frequency → count`
* Check frequency uniqueness using second map
* Preserve original order while checking

---

## ⏱️ Complexity

* Time: O(n)
* Space: O(n)

---

## 💻 Code

class Solution {
    public int firstUniqueFreq(int[] nums) {
        
        Map<Integer, Integer> freq = new HashMap<>();
        
        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        
        Map<Integer, Integer> freqCount = new HashMap<>();
        for (int f : freq.values()) {
            freqCount.put(f, freqCount.getOrDefault(f, 0) + 1);
        }
    
        for (int num : nums) {
            int f = freq.get(num);
            if (freqCount.get(f) == 1) {
                return num;
            }
        }
        return -1;
    }
}

---

## 💡 Interview Insight

* Combines **frequency counting + hashing** concepts.
* Tests ability to manage **multiple maps efficiently**.
* Important concept: frequency of frequency.

---

## ✅ Status

✔ Solved successfully
✔ Optimized using HashMap
✔ Interview-ready implementation

---

*This solution is part of my Data Structures & Algorithms (DSA) practice in Java.*
