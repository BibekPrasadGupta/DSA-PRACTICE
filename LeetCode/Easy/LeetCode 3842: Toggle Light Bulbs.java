# 🧩 LeetCode 3842: Toggle Light Bulbs

**Platform:** LeetCode
**Difficulty:** Easy
**Language:** Java ☕

---

## 📌 Problem Description

You are given a list of bulb indices. Each index represents a toggle operation on that bulb.

Initially, all bulbs are OFF. Every time a bulb index appears, its state is toggled (ON → OFF or OFF → ON).

Return a list of bulbs that are ON after all operations.

---

## 🧠 Approach

* Use a boolean array to track ON/OFF state
* Toggle the bulb state for each occurrence
* Collect bulbs that remain ON

---

## 🔑 Key Points

* Toggling: `on[b] = !on[b]`
* Fixed size array (1 to 100)
* Final traversal to collect ON bulbs

---

## ⏱️ Complexity

* Time: O(n + 100)
* Space: O(1)

---

## 💻 Code

class Solution {
    public List<Integer> toggleLightBulbs(List<Integer> bulbs) {
        boolean[] on = new boolean[101];
        for(int b:bulbs){
            on[b]=!on[b];
        }
        List<Integer> result = new ArrayList<>();
        for(int i=1; i<=100; i++){
            if(on[i]){
                result.add(i);
            }
        }
        return result;
    }
}

---

## 💡 Interview Insight

* Based on frequency parity (odd toggles → ON)
* Similar to XOR/parity problems
* Tests understanding of state flipping

---

## ✅ Status

✔ Solved successfully
✔ Efficient toggle-based solution
✔ Interview-ready implementation

---

*This solution is part of my Data Structures & Algorithms (DSA) practice in Java.*
