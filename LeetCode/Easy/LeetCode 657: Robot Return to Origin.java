# 🧩 LeetCode 657: Robot Return to Origin

**Platform:** LeetCode
**Difficulty:** Easy
**Language:** Java ☕

---

## 📌 Problem Description

There is a robot starting at position (0, 0). Given a string `moves` representing movements, determine if the robot returns to the origin after all moves.

Moves:

* 'U' → Up
* 'D' → Down
* 'L' → Left
* 'R' → Right

Return `true` if the robot returns to (0, 0), otherwise `false`.

---

## 🧠 Approach

* Track horizontal (y) and vertical (x) movements
* Update coordinates based on moves
* Check if final position is (0,0)

---

## 🔑 Key Points

* 'U' → x++
* 'D' → x--
* 'L' → y--
* 'R' → y++
* Return true if both x and y are 0

---

## ⏱️ Complexity

* Time: O(n)
* Space: O(1)

---

## 💻 Code

class Solution {
    public boolean judgeCircle(String moves) {
        int x=0;
        int y=0;
        for(int i=0; i<moves.length(); i++){
            char ch = moves.charAt(i);
            if(ch == 'U') x++;
            else if(ch == 'D') x--;
            else if(ch == 'L') y--;
            else if(ch == 'R') y++;
        }
        return (x==0 && y==0);
    }
}

---

## 💡 Interview Insight

* Simple simulation problem
* Tests coordinate tracking logic
* Common beginner-level problem

---

## ✅ Status

✔ Solved successfully
✔ Efficient O(n) solution
✔ Interview-ready implementation

---

*This solution is part of my Data Structures & Algorithms (DSA) practice in Java.*
