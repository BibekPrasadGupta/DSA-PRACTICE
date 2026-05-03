# 🧩 LeetCode 345: Reverse Vowels of a String

**Platform:** LeetCode
**Difficulty:** Easy
**Language:** Java ☕

---

## 📌 Problem Description

Given a string `s`, reverse only all the vowels in the string and return it.

Vowels include: `a, e, i, o, u` (both lowercase and uppercase).

---

## 🧠 Approach

* Use two pointers: one from the start and one from the end
* Move pointers until vowels are found
* Swap the vowels and continue

---

## 🔑 Key Points

* Convert string to char array for easy swapping
* Use helper function to check vowels
* Two-pointer technique optimizes traversal

---

## ⏱️ Complexity

* Time: O(n)
* Space: O(n)

---

## 💻 Code

class Solution {
    public String reverseVowels(String s) {
        char [] arr = s.toCharArray(); // string -> char array conversion
        int left = 0;
        int n=arr.length;
        int right = n-1;

        while(left < right){
            if(!isVowel(arr[left])){
                 left++;
            }
            else if(!isVowel(arr[right])){
                right--;
            }
            else{
                char temp = arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
                left++;
                right--;
            }
        }
            String a = new String(arr);
            return a;
    }
        private boolean isVowel(char c){
            return "aeiouAEIOU".indexOf(c)!=-1;
        }
}

---

## 💡 Interview Insight

* Classic two-pointer problem
* Tests string manipulation and condition handling
* Efficient alternative to brute-force swapping

---

## ✅ Status

✔ Solved successfully
✔ Optimized two-pointer approach
✔ Interview-ready implementation

---

*This solution is part of my Data Structures & Algorithms (DSA) practice in Java.*
