# 🧩 LeetCode 1758: Minimum Changes To Make Alternating Binary String

**Platform:** LeetCode
**Difficulty:** Easy
**Language:** Java ☕

---

## 📌 Problem Description

Given a binary string `s`, return the minimum number of changes required to make it alternating.

A string is alternating if no two adjacent characters are equal. The string can start with either '0' or '1'.

---

## 🧠 Approach

* Count mismatches assuming pattern starting with '0' (i.e., 0101...)
* Count mismatches assuming pattern starting with '1' (i.e., 1010...)
* Answer is the minimum of both counts

---

## 🔑 Key Points

* Even indices and odd indices must follow alternating pattern
* Only two possible valid patterns exist
* Compute cost for both and take minimum

---

## ⏱️ Complexity

* Time: O(n)
* Space: O(1)

---

## 💻 Code

class Solution {
    public int minOperations(String s) {
        int count=0;
        int n = s.length();
        for(int i=0; i<s.length(); i++){
            if(i%2==0){
                if(s.charAt(i)=='0') count++;
            }
            else{
                if(s.charAt(i)=='1') count++;
            }
        }
        int count1=n-count;
        return Math.min(count,count1);
    }
}

---

## 💡 Interview Insight

* Classic string pattern matching problem
* Tests understanding of alternating sequences
* Efficiently handled with single pass

---

## ✅ Status

✔ Solved successfully
✔ Optimal O(n) solution
✔ Interview-ready implementation

---

*This solution is part of my Data Structures & Algorithms (DSA) practice in Java.*
