# LeetCode Easy Problems – Java

## 🧩 Problem 728: Self Dividing Numbers

**Platform:** LeetCode
**Difficulty:** Easy
**Language:** Java ☕

---

## 📌 Problem Description

A **self-dividing number** is a number that is divisible by every digit it contains.

For example, 128 is a self-dividing number because:

* 128 % 1 == 0
* 128 % 2 == 0
* 128 % 8 == 0

Given two integers `left` and `right`, return a list of all the self-dividing numbers in the range `[left, right]`.

---

## 🧠 Approach

We iterate through each number in the range and check if it is self-dividing.

For each number:

* Extract digits one by one using modulo.
* If a digit is `0` or the number is not divisible by that digit → it is not self-dividing.
* Otherwise, it is valid and added to the result list.

---

## 🪜 Step-by-Step Explanation

1. Initialize an empty result list.
2. Loop from `left` to `right`.
3. For each number:

   * Extract digits using `% 10`.
   * Check if digit is `0` or number not divisible by digit.
   * If invalid → break.
4. If all digits pass → add number to result.
5. Return the list.

---

## ⏱️ Complexity Analysis

**Time Complexity:** `O(n × d)`
  (Where `d` is number of digits)

**Space Complexity:** `O(1)` (excluding output list)

---

## 📂 Code

class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result = new ArrayList<>();

        for (int i = left; i <= right; i++) {
            int num = i;
            boolean isSelfDividing = true;

            while (num > 0) {
                int digit = num % 10;

                if (digit == 0 || i % digit != 0) {
                    isSelfDividing = false;
                    break;
                }

                num = num / 10;
            }

            if (isSelfDividing) {
                result.add(i);
            }
        }
        return result;
    }
}

---

## 💡 Interview Insight

* Tests digit extraction and validation logic.
* Combines loops with number theory concepts.
* Good practice for range-based problems.

---

## ✅ Status

✔ Solved successfully
✔ Efficient digit validation
✔ Interview-ready implementation

---

*This solution is part of my Data Structures & Algorithms (DSA) practice in Java.*
