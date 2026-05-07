# 🧩 LeetCode 3894: Traffic Signal

**Platform:** LeetCode
**Difficulty:** Easy
**Language:** Java ☕

---

## 📌 Problem Description

Given an integer `timer`, return the state of the traffic signal based on the following rules:

* `0` → "Green"
* `30` → "Orange"
* `31 to 90` → "Red"
* Otherwise → "Invalid"

---

## 🧠 Approach

* Use conditional statements to check timer value
* Return corresponding signal color based on rules

---

## 🔑 Key Points

* Exact match for 0 and 30
* Range check for values between 31 and 90
* Handle invalid values explicitly

---

## ⏱️ Complexity

* Time: O(1)
* Space: O(1)

---

## 💻 Code

class Solution {
    public String trafficSignal(int timer) {
        if(timer == 0){
            return "Green";
        }else if(timer == 30){
            return "Orange";
        }else if(timer>30 && timer<=90){
            return "Red";
        }
        return "Invalid";
    }
}

---

## 💡 Interview Insight

* Simple conditional logic problem
* Tests understanding of ranges and edge cases
* Good for beginners to practice if-else conditions

---

## ✅ Status

✔ Solved successfully
✔ Constant time solution
✔ Interview-ready implementation

---

*This solution is part of my Data Structures & Algorithms (DSA) practice in Java.*
