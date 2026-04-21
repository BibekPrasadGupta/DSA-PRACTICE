# 🧩 LeetCode 2651: Calculate Delayed Arrival Time

**Platform:** LeetCode
**Difficulty:** Easy
**Language:** Java ☕

---

## 📌 Problem Description

You are given two integers `arrivalTime` and `delayedTime`. Return the time when the train will arrive at the station.

The time is in a 24-hour format, so the result should wrap around using modulo 24.

---

## 🧠 Approach

* Add arrivalTime and delayedTime
* If result exceeds 24, wrap around using modulo
* Return final time

---

## 🔑 Key Points

* Time follows 24-hour format
* Use modulo operation for wrapping
* Simple arithmetic problem

---

## ⏱️ Complexity

* Time: O(1)
* Space: O(1)

---

## 💻 Code

class Solution {
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
       int totalTime = arrivalTime + delayedTime;
        if(totalTime == 24) return 0;
        else{
            if(totalTime>24){
                totalTime = totalTime - 24;
            }
        }
        return totalTime;
    }
}

---

## 💡 Interview Insight

* Basic arithmetic and modulo concept
* Tests understanding of edge cases
* Very common easy-level question

---

## ✅ Status

✔ Solved successfully
✔ Simple and efficient approach
✔ Interview-ready implementation

---

*This solution is part of my Data Structures & Algorithms (DSA) practice in Java.*
