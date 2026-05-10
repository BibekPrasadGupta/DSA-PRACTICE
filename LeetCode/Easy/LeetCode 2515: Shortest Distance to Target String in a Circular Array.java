# 🧩 LeetCode 2515: Shortest Distance to Target String in a Circular Array

**Platform:** LeetCode
**Difficulty:** Easy
**Language:** Java ☕

---

## 📌 Problem Description

Given a circular array `words`, a string `target`, and an integer `startIndex`, return the shortest distance from `startIndex` to any index `i` such that `words[i] == target`.

Since the array is circular, you can move left or right.

Return `-1` if the target does not exist.

---

## 🧠 Approach

* Traverse the array
* When target is found:

  * Compute direct distance: `|startIndex - i|`
  * Compute circular distance: `n - direct`
* Take minimum of both distances
* Track global minimum

---

## 🔑 Key Points

* Circular array handling is important
* Compare both clockwise and anticlockwise paths
* Return `-1` if target not found

---

## ⏱️ Complexity

* Time: O(n)
* Space: O(1)

---

## 💻 Code

class Solution {
    public int closestTarget(String[] words, String target, int startIndex) {
        int n=words.length;
        int min = n;
        for(int i=0; i<words.length; i++){
            if(words[i].equals(target)){
                int index = Math.abs(startIndex - i);
                int circular =n-index;
                int distance=Math.min(index,circular);
                min=Math.min(min,distance);
            }
        }
        
        return min==n?-1:min;
    }
}

---

## 💡 Interview Insight

* Tests circular array concepts
* Requires careful distance calculation
* Good example of minimizing multiple conditions

---

## ✅ Status

✔ Solved successfully
✔ Efficient linear scan approach
✔ Interview-ready implementation

---

*This solution is part of my Data Structures & Algorithms (DSA) practice in Java.*
