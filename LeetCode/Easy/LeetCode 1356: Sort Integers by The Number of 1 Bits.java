# 🧩 LeetCode 1356: Sort Integers by The Number of 1 Bits

**Platform:** LeetCode
**Difficulty:** Easy
**Language:** Java ☕

---

## 📌 Problem Description

Given an integer array `arr`, sort the integers in ascending order by the number of 1's in their binary representation.

If two numbers have the same number of 1's, sort them in ascending order.

Return the sorted array.

---

## 🧠 Approach

* Convert array to Integer[] for custom sorting
* Use comparator to sort based on bit count
* If bit count is same, sort by value

---

## 🔑 Key Points

* Use `Integer.bitCount()`
* Custom comparator
* Stable sorting based on conditions

---

## ⏱️ Complexity

* Time: O(n log n)
* Space: O(n)

---

## 💻 Code

class Solution {
    public int[] sortByBits(int[] arr) {
        Integer[] temp = new Integer[arr.length];

        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }

        Arrays.sort(temp, (a, b) -> {
            int countA = Integer.bitCount(a);
            int countB = Integer.bitCount(b);

            if (countA == countB) {
                return a - b;
            }
            return countA - countB;
        });

        for (int i = 0; i < arr.length; i++) {
            arr[i] = temp[i];
        }

        return arr;
    }
}

---

## 💡 Interview Insight

* Combines bit manipulation with sorting
* Tests custom comparator logic

---

## ✅ Status

✔ Solved successfully
✔ Efficient sorting approach
✔ Interview-ready implementation

---

*This solution is part of my Data Structures & Algorithms (DSA) practice in Java.*
