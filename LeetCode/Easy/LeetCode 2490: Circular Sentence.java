# 🧩 LeetCode 2490: Circular Sentence

**Platform:** LeetCode
**Difficulty:** Easy
**Language:** Java ☕

---

## 📌 Problem Description

A sentence is called **circular** if:

* The last character of each word matches the first character of the next word
* The last word's last character matches the first word's first character

Given a string `sentence`, return `true` if it is circular, otherwise return `false`.

---

## 🧠 Approach

* Split the sentence into words
* Traverse each word
* Compare last character of current word with first character of next word
* Use modulo to handle circular condition

---

## 🔑 Key Points

* Use `(i + 1) % n` for circular traversal
* Compare characters carefully
* Covers both normal and wrap-around cases

---

## ⏱️ Complexity

* Time: O(n)
* Space: O(n)

---

## 💻 Code

class Solution {
    public boolean isCircularSentence(String sentence) {
        String [] arr = sentence.split(" ");
        int n = arr.length;
        for(int i=0; i<n; i++){
            String current = arr[i];
            String next = arr[(i+1)%n];
            if(current.charAt(current.length()-1)!=next.charAt(0)){
                return false;
            }
        }
        return true;
    }
}

---

## 💡 Interview Insight

* Simple string traversal problem
* Tests understanding of circular logic
* Edge cases include single-word sentences

---

## ✅ Status

✔ Solved successfully
✔ Clean circular comparison logic
✔ Interview-ready implementation

---

*This solution is part of my Data Structures & Algorithms (DSA) practice in Java.*
