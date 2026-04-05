# 🧩 LeetCode 2703: Return Length of Arguments Passed

**Platform:** LeetCode
**Difficulty:** Easy
**Language:** JavaScript ☕

---

## 📌 Problem Description

Write a function `argumentsLength` that returns the number of arguments passed to it.

---

## 🧠 Approach

* Use rest parameters (`...args`) to collect all arguments
* Return the length of the array

---

## 🔑 Key Points

* Rest parameter converts arguments into array
* Length property gives total count

---

## ⏱️ Complexity

* Time: O(1)
* Space: O(1)

---

## 💻 Code


var argumentsLength = function(...args) {
    return args.length;
};


---

## 💡 Interview Insight

* Basic JavaScript concept
* Tests understanding of rest parameters

---

## ✅ Status

✔ Solved successfully
✔ Simple and optimal solution
✔ Interview-ready implementation

---

*This solution is part of my Data Structures & Algorithms (DSA) practice.*
