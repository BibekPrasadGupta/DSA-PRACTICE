# 🧩 LeetCode 2553: Separate the Digits in an Array

**Platform:** LeetCode
**Difficulty:** Easy
**Language:** Java ☕

---

## 📌 Problem Description

Given an array of positive integers `nums`, return an array consisting of all the digits of each number in the same order as they appear in `nums`.

---

## 🧠 Approach

* Traverse each number in the array
* Extract digits using modulus and division
* Store digits temporarily and reverse to maintain order
* Add all digits to the final list
* Convert list to array

---

## 🔑 Key Points

* Maintain original digit order
* Use a temporary list for reversing digits
* Convert `List<Integer>` to `int[]` at the end

---

## ⏱️ Complexity

* Time: O(n * d)
* Space: O(n * d)

(where `d` is number of digits)

---

## 💻 Code

class Solution {
    public int[] separateDigits(int[] nums) {
       List<Integer> list = new ArrayList<>();
        for(int num : nums){
            List<Integer> temp = new ArrayList<>();
            while(num>0){
                temp.add(num%10);
                num=num/10;
            }
            //reverse
            Collections.reverse(temp);
            list.addAll(temp);
        }
        int [] arr = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            arr[i]=list.get(i);
        }
        return arr;
    }
}

---

## 💡 Interview Insight

* Basic number manipulation problem
* Tests understanding of digit extraction
* Careful handling of order is important

---

## ✅ Status

✔ Solved successfully
✔ Clean digit extraction logic
✔ Interview-ready implementation

---

*This solution is part of my Data Structures & Algorithms (DSA) practice in Java.*
