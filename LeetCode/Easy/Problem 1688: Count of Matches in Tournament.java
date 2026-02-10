# LeetCode Easy Problems – Java

## 🧩 Problem 1688: Count of Matches in Tournament

**Platform:** LeetCode
**Difficulty:** Easy
**Language:** Java ☕

---

## 📌 Problem Description

You are given an integer `n`, the number of teams participating in a tournament.

The tournament follows these rules:

* If the number of teams is **even**, teams are paired and each pair plays one match.
* If the number of teams is **odd**, one team advances automatically and the rest are paired.
* Each match eliminates exactly **one team**.

Return the **total number of matches played** until one team becomes the winner.

---

## 🧠 Approach (Simulation / Greedy)

* Simulate each round of the tournament.
* In every round, calculate how many matches are played based on whether `n` is even or odd.
* Reduce the number of teams for the next round accordingly.
* Accumulate the total number of matches.

This greedy simulation mirrors the tournament process step by step.

---

## 🪜 Step-by-Step Explanation

1. Initialize `match = 0` to count total matches.
2. While more than one team remains:

   * If `n` is even:

     * Matches played = `n / 2`
     * Teams advancing = `n / 2`
   * If `n` is odd:

     * Matches played = `(n - 1) / 2`
     * Teams advancing = `(n - 1) / 2 + 1`
3. Add matches of each round to `match`.
4. Repeat until only one team remains.
5. Return `match`.

---

## ⏱️ Complexity Analysis

**Time Complexity:** `O(log n)`
  (Number of teams reduces roughly by half each round)
**Space Complexity:** `O(1)`
  (Only constant extra variables used)

---

## 📂 Code

class Solution {
    public int numberOfMatches(int n) {
        int match = 0;
        while (n > 1) {
            if (n % 2 == 0) {
                match += n / 2;
                n = n / 2;
            } else {
                match += (n - 1) / 2;
                n = (n - 1) / 2 + 1;
            }
        }
        return match;
    }
}


---

## ✅ Status

✔ Solved using greedy simulation approach
✔ Efficient, clean, and interview-friendly solution

---

* This solution is part of my Data Structures & Algorithms (DSA) practice in Java. *
