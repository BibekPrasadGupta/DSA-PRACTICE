# LeetCode Easy Problems – Java

## 🧩 Problem 412: Fizz Buzz

**Platform:** LeetCode
**Difficulty:** Easy
**Language:** Java ☕

---

## 📌 Problem Description

Given an integer `n`, return a string array `answer` (1-indexed) where:

* `answer[i] == "FizzBuzz"` if `i` is divisible by 3 and 5.
* `answer[i] == "Fizz"` if `i` is divisible by 3.
* `answer[i] == "Buzz"` if `i` is divisible by 5.
* `answer[i] == i` (as a string) if none of the above conditions are true.

---

## 🧠 Approach

We iterate from `1` to `n` and check divisibility conditions.

* If divisible by both 3 and 5 → add "FizzBuzz"
* If divisible by 3 → add "Fizz"
* If divisible by 5 → add "Buzz"
* Otherwise → add the number as a string

---

## 🪜 Step-by-Step Explanation

1. Create an ArrayList to store results.
2. Loop from `1` to `n`.
3. Check divisibility:

   * If `i % 3 == 0 && i % 5 == 0` → add "FizzBuzz"
   * Else if `i % 3 == 0` → add "Fizz"
   * Else if `i % 5 == 0` → add "Buzz"
   * Else → add `String.valueOf(i)`
4. Return the list.

---

## ⏱️ Complexity Analysis

**Time Complexity:** `O(n)`
  (We iterate through numbers from 1 to n)

**Space Complexity:** `O(n)`
  (Result list stores n strings)

---

## 📂 Code

class Solution {
    public List<String> fizzBuzz(int n) {
        ArrayList <String> sc = new ArrayList<String>();
        for(int i=1; i<=n; i++){
            if(i%3==0 && i%5==0){
                sc.add("FizzBuzz");
            }
            else if(i%3==0){
                sc.add("Fizz");
            }
            else if(i%5==0){
                sc.add("Buzz");
            }
            else{
                sc.add(String.valueOf(i));
            }
        }
        return sc;
    }
}

---

## 💡 Interview Insight

* Classic beginner problem to test conditional logic.
* Tests ability to handle multiple conditions correctly.
* Frequently used as a warm-up problem in interviews.

---

## ✅ Status

✔ Solved successfully
✔ Clean and simple implementation
✔ Interview-ready solution

---

*This solution is part of my Data Structures & Algorithms (DSA) practice in Java.*
