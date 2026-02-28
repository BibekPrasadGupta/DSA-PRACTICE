# LeetCode Easy Problems – Java

## 🧩 Problem 1394: Find Lucky Integer in an Array

**Platform:** LeetCode
**Difficulty:** Easy
**Language:** Java ☕

---

## 📌 Problem Description

Given an array of integers `arr`, a **lucky integer** is an integer that has a frequency equal to its value.

Return the largest lucky integer in the array.

If there is no lucky integer, return `-1`.

---

## 🧠 Approach

We use a **HashMap** to count the frequency of each number.

Then we check which numbers satisfy the condition:

```
value == frequency
```

Among all valid numbers, we return the maximum one.

---

## 🪜 Step-by-Step Explanation

1. Create a HashMap to store frequency of each element.
2. Traverse the array and update counts.
3. Initialize `lucky = -1`.
4. Traverse keys in the map:

   * If `key == frequency`, update `lucky` with maximum value.
5. Return `lucky`.

---

## ⏱️ Complexity Analysis

**Time Complexity:** `O(n)`
  (Single traversal for counting and checking)

**Space Complexity:** `O(n)`
  (HashMap storage)

---

## 📂 Code

class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int lucky = -1;
        for (int key : map.keySet()) {
            if (key == map.get(key)) {
                lucky = Math.max(lucky, key);
            }
        }
        return lucky;
    }
}

---

## 💡 Interview Insight

* Tests frequency counting using HashMap.
* Combines counting with conditional checking.
* Good practice for map-based problems.

---

## ✅ Status

✔ Solved successfully
✔ Efficient frequency counting approach
✔ Interview-ready implementation

---

*This solution is part of my Data Structures & Algorithms (DSA) practice
