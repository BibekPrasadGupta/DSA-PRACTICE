# 🧩 LeetCode 2942: Find Words Containing Character

**Platform:** LeetCode
**Difficulty:** Easy
**Language:** Java ☕

---

## 📌 Problem Description

Given an array of strings `words` and a character `x`, return a list of indices of the words that contain the character `x`.

---

## 🧠 Approach

* Traverse each word in the array
* For every word, check each character
* If the character matches `x`, store the index
* Move to the next word

---

## 🔑 Key Points

* Nested loop traversal
* Break early once character is found
* Store indices, not words

---

## ⏱️ Complexity

* Time: O(n * m)
* Space: O(k)

Where:

* n = number of words
* m = average length of each word
* k = number of matching indices

---

## 💻 Code

class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> ans = new ArrayList<>();
        for(int i=0; i<words.length; i++){
            for(char c: words[i].toCharArray()){
                if(c==x){
                    ans.add(i);
                    break; // when we find letter then we stop we goes for next word iteration
                }
            }
        }
        return ans;
    }
}

---

## 💡 Interview Insight

* Simple string traversal problem
* Tests nested loop logic and early exit optimization
* Beginner-friendly question

---

## ✅ Status

✔ Solved successfully
✔ Efficient approach with early break
✔ Interview-ready implementation

---

*This solution is part of my Data Structures & Algorithms (DSA) practice in Java.*
