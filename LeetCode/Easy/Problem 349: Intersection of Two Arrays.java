# LeetCode Easy Problems – Java

## 🧩 Problem 349: Intersection of Two Arrays

**Platform:** LeetCode
**Difficulty:** Easy
**Language:** Java ☕

---

## 📌 Problem Description

Given two integer arrays `nums1` and `nums2`, return an array of their **intersection**.

Each element in the result must be **unique**, and the result can be returned in any order.

---

## 🧠 Approach

We use **HashSet** to efficiently find common elements:

* Store all elements of the first array in a set.
* Traverse the second array and check if elements exist in the set.
* Use another set to store unique intersection elements.

---

## 🪜 Step-by-Step Explanation

1. Create a HashSet `set` to store elements of `nums1`.
2. Create another HashSet `resultSet` to store intersection elements.
3. Traverse `nums1` and add elements to `set`.
4. Traverse `nums2`:

   * If element exists in `set`, add it to `resultSet`.
5. Convert `resultSet` to an array.
6. Return the result array.

---

## ⏱️ Complexity Analysis

**Time Complexity:** `O(n + m)`
  (Where `n` and `m` are lengths of arrays)

**Space Complexity:** `O(n)`
  (Extra space for HashSet)

---

## 📂 Code

import java.util.*;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> resultSet = new HashSet<>();

        for (int num : nums1) {
            set.add(num);
        }
        for (int num : nums2) {
            if (set.contains(num)) {
                resultSet.add(num);
            }
        }
        int[] result = new int[resultSet.size()];
        int i = 0;
        for (int num : resultSet) {
            result[i++] = num;
        }

        return result;
    }
}

---

## 💡 Interview Insight

* Tests usage of **HashSet** for fast lookup.
* Ensures uniqueness of elements automatically.
* Common pattern for set-based problems.

---

## ✅ Status

✔ Solved successfully
✔ Efficient set-based approach
✔ Interview-ready implementation

---

*This solution is part of my Data Structures & Algorithms (DSA) practice in Java.*
