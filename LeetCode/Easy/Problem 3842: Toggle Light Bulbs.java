# LeetCode Easy Problems – Java

## 🧩 Problem 3842: Toggle Light Bulbs

**Platform:** LeetCode
**Difficulty:** Easy
**Language:** Java ☕

---

## 📌 Problem Description

You are given a list of integers `bulbs` representing bulb numbers.

Each time a bulb number appears, its state is toggled (ON ↔ OFF).

Initially, all bulbs are OFF.

Return a list of bulb numbers that are **ON after all toggles**.

---

## 🧠 Approach

1. Use a boolean array to track bulb states.
2. Traverse the input list and toggle the state of each bulb.
3. After processing all toggles, collect bulbs that are ON.

---

## 🪜 Step-by-Step Explanation

1. Create a boolean array `on` of size 101.
2. Traverse the input list:

   * For each bulb `b`, toggle `on[b]`.
3. Create a result list.
4. Traverse from `1` to `100`:

   * If `on[i]` is true → add `i` to result.
5. Return the result list.

---

## ⏱️ Complexity Analysis

**Time Complexity:** `O(n + k)`
  (`n` = number of toggles, `k` = fixed range 100)

**Space Complexity:** `O(1)`
  (Fixed-size array used)

---

## 📂 Code

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

* Demonstrates toggling logic using boolean arrays.
* Useful for tracking state changes efficiently.
* Common pattern in simulation problems.

---

## ✅ Status

✔ Solved successfully
✔ Efficient toggle-based approach
✔ Interview-ready implementation

---

*This solution is part of my Data Structures & Algorithms (DSA) practice in Java.*
