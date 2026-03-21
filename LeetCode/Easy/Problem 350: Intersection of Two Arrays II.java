# LeetCode Easy Problems – Java

## 🧩 Problem 350: Intersection of Two Arrays II

**Platform:** LeetCode
**Difficulty:** Easy
**Language:** Java ☕

---

## 📌 Problem Description

Given two integer arrays `nums1` and `nums2`, return an array of their **intersection**.

Each element in the result should appear as many times as it shows in both arrays.

The result can be returned in any order.

---

## 🧠 Approach

We use a **HashMap** to store the frequency of elements in `nums1`.

Then we traverse `nums2`:

* If the element exists in the map and its frequency is greater than 0 → add it to the result.
* Decrease its frequency in the map.

---

## 🪜 Step-by-Step Explanation

1. Create a HashMap to store frequency of elements from `nums1`.
2. Traverse `nums1` and update counts.
3. Create a list to store the result.
4. Traverse `nums2`:

   * If element exists in map and count > 0:

     * Add it to result list
     * Decrease count in map
5. Convert list to array.
6. Return the result.

---

## ⏱️ Complexity Analysis

**Time Complexity:** `O(n + m)`
  (Where `n` and `m` are lengths of arrays)

**Space Complexity:** `O(n)`
  (HashMap storage)

---

## 📂 Code

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        List<Integer> resultList = new ArrayList<>();
        
        for (int num : nums2) {
            if (map.containsKey(num) && map.get(num) > 0) {
                resultList.add(num);
                map.put(num, map.get(num) - 1);
            }
        }

        int[] result = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            result[i] = resultList.get(i);
        }

        return result;
    }
}

---

## 💡 Interview Insight

* Extension of basic intersection problem.
* Requires handling duplicate frequencies.
* Common HashMap counting pattern.

---

## ✅ Status

✔ Solved successfully
✔ Efficient frequency-based approach
✔ Interview-ready implementation

---

*This solution is part of my Data Structures & Algorithms (DSA) practice in Java.*
