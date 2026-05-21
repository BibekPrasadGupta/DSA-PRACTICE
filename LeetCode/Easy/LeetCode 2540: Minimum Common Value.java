# 🧩 LeetCode 2540: Minimum Common Value

**Platform:** LeetCode
**Difficulty:** Easy
**Language:** Java ☕

---

## 📌 Problem Description

Given two integer arrays `nums1` and `nums2` sorted in non-decreasing order, return the **minimum integer common to both arrays**. If there is no common integer, return `-1`.

---

## 🧠 Approach

* Use two pointers `i` and `j`
* Traverse both arrays simultaneously
* If elements match → return the value
* Move pointer of smaller element forward

---

## 🔑 Key Points

* Arrays are already sorted → no need to sort
* Two-pointer approach gives optimal solution
* Stops early when match is found

---

## ⏱️ Complexity

* Time: O(n + m)
* Space: O(1)

---

## 💻 Code

class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int i=0,j=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]==nums2[j]){
                return nums1[i];
            }
            else if(nums1[i]<nums2[j]){
                i++;
            }
            else{
                j++;
            }
        }
        return -1;
    }
}

---

## 💡 Interview Insight

* Classic two-pointer technique
* Efficient for sorted arrays
* Avoids brute-force O(n*m)

---

## ✅ Status

✔ Solved successfully
✔ Optimal linear solution
✔ Interview-ready implementation

---

*This solution is part of my Data Structures & Algorithms (DSA) practice in Java.*
