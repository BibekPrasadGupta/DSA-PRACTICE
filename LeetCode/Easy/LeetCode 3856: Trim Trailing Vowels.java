# 🧩 LeetCode 3856: Trim Trailing Vowels

**Platform:** LeetCode
**Difficulty:** Easy
**Language:** Java ☕

---

## 📌 Problem Description

Given a string `s`, remove all **trailing vowels** from the string and return the remaining substring.

Vowels include: `a, e, i, o, u`.

---

## 🧠 Approach

* Traverse the string from the end
* Skip all vowels
* Stop at the first non-vowel character
* Return substring from start to that index

---

## 🔑 Key Points

* Reverse traversal is important
* Only trailing vowels are removed
* Use `substring` for final result

---

## ⏱️ Complexity

* Time: O(n)
* Space: O(1)

---

## 💻 Code

class Solution {
    public String trimTrailingVowels(String s) {
        int strlen = -1;
        for(int i=s.length()-1; i>=0; i--){
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' ||s.charAt(i)=='u'){
                continue;
            }
                strlen=i;
                break;
        }
       return s.substring(0,strlen+1);
    }
}

---

## 💡 Interview Insight

* Simple string manipulation problem
* Tests understanding of traversal direction
* Edge case: string with all vowels

---

## ✅ Status

✔ Solved successfully
✔ Efficient single pass solution
✔ Interview-ready implementation

---

*This solution is part of my Data Structures & Algorithms (DSA) practice in Java.*
