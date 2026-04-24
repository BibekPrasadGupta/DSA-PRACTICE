# 🧩 LeetCode 195: Tenth Line

**Platform:** LeetCode
**Difficulty:** Easy
**Language:** Bash 🐚

---

## 📌 Problem Description

Given a text file `file.txt`, print just the 10th line of the file.

---

## 🧠 Approach

* Use `sed` command
* Directly print the 10th line

---

## 🔑 Key Points

* `-n` suppresses default output
* `'10p'` prints only the 10th line
* Efficient for large files

---

## ⏱️ Complexity

* Time: O(n)
* Space: O(1)

---

## 💻 Code

sed -n '10p' file.txt


---

## 💡 Interview Insight

* Tests knowledge of Linux commands
* Important for system-level roles
* sed is powerful for text processing

---

## ✅ Status

✔ Solved successfully
✔ Clean one-line solution
✔ Interview-ready command

---

*This solution is part of my Data Structures & Algorithms (DSA) practice.*
