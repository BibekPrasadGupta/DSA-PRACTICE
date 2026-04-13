# 🧩 LeetCode 292: Nim Game

**Platform:** LeetCode
**Difficulty:** Easy
**Language:** Java ☕

---

## 📌 Problem Description

You are playing the Nim Game with your friend.

Initially, there is a heap of `n` stones. You and your friend take turns removing 1 to 3 stones.

The player who removes the last stone wins.

Return `true` if you can win the game assuming both players play optimally, otherwise return `false`.

---

## 🧠 Approach

* Observe the pattern of winning and losing positions
* If `n % 4 == 0`, you will always lose
* Otherwise, you can force a win

---

## 🔑 Key Points

* Multiples of 4 are losing states
* You can always make opponent reach a multiple of 4
* Greedy + mathematical observation

---

## ⏱️ Complexity

* Time: O(1)
* Space: O(1)

---

## 💻 Code

class Solution {
    public boolean canWinNim(int n) {
        if(n % 4 == 0){
            return false;
        }
        else{
            return true;
        }
    }
}

---

## 💡 Interview Insight

* Classic game theory problem
* Tests pattern recognition
* No need for DP or recursion

---

## ✅ Status

✔ Solved successfully
✔ Optimal constant time solution
✔ Interview-ready concept

---

*This solution is part of my Data Structures & Algorithms (DSA) practice in Java.*
