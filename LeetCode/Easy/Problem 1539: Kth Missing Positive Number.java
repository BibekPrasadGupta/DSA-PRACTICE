# LeetCode Easy Problems – Java

## 🧩 Problem 1539: Kth Missing Positive Number

**Platform:** LeetCode
**Difficulty:** Easy
**Language:** Java ☕

---

## 📌 Problem Description

Given an array `arr` of positive integers sorted in strictly increasing order, and an integer `k`.

Return the `k`th positive integer that is missing from this array.

---

## 🧠 Approach

We simulate natural numbers starting from `1` and compare them with elements of the array.

* If the current number exists in the array → move to the next array element.
* Otherwise → it is a missing number.

We keep counting missing numbers until we reach the `k`th missing value.

---

## 🪜 Step-by-Step Explanation

1. Initialize pointer `i = 0` for the array.
2. Start checking numbers from `num = 1`.
3. If `arr[i] == num`, move to the next array index.
4. Otherwise, it is a missing number → decrease `k`.
5. When `k == 0`, return the current number.
6. Continue increasing `num` until the answer is found.

---

## ⏱️ Complexity Analysis

**Time Complexity:** `O(n + k)`
  (We may check numbers until the kth missing number appears)

**Space Complexity:** `O(1)`
  (Only constant extra variables used)

---

## 📂 Code

class Solution {
    public int findKthPositive(int[] arr, int k) {
        int i=0; 
        int num=1;
        while(true){
            if(i<arr.length && arr[i]==num){
                i++;
            }
            else{
                k--;
                if(k==0){
                    return num;
                }
            }
            num++;
        }
    }
}

---

## 💡 Interview Insight

* Classic missing number simulation problem.
* Tests understanding of pointer traversal with sequence generation.
* Can also be optimized using binary search.

---

## ✅ Status

✔ Solved successfully
✔ Efficient simulation approach
✔ Interview-ready implementation

---

*This solution is part of my Data Structures & Algorithms (DSA) practice in Ja
