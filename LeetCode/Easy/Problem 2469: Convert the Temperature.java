# LeetCode Easy Problems – Java

## 🧩 Problem 2469: Convert the Temperature

**Platform:** LeetCode
**Difficulty:** Easy
**Language:** Java ☕

---

## 📌 Problem Description

You are given a temperature in **Celsius**.

You need to convert it into:

**Kelvin** = Celsius + 273.15
**Fahrenheit** = Celsius × 1.80 + 32.00

Return the converted temperatures in an array where:

* Index `0` contains the temperature in **Kelvin**
* Index `1` contains the temperature in **Fahrenheit**

---

## 🧠 Approach (Direct Formula Calculation)

* Use the given mathematical formulas to convert Celsius into Kelvin and Fahrenheit.
* Store the results in a double array of size 2.
* Return the array as the final output.

* This is a straightforward calculation-based problem with no loops or extra data structures. *

---

## 🪜 Step-by-Step Explanation

1. Create a double array `ans` of size 2.
2. Convert Celsius to Kelvin using `celsius + 273.15`.
3. Convert Celsius to Fahrenheit using `celsius * 1.80 + 32.00`.
4. Store both results in the array.
5. Return the array.

---

## ⏱️ Complexity Analysis

**Time Complexity:** `O(1)`
  (Only constant-time calculations)
**Space Complexity:** `O(1)`
  (Fixed-size output array)

---

## 📂 Code

class Solution {
    public double[] convertTemperature(double celsius) {
        double[] ans = new double[2];
        double kelvin = celsius + 273.15;
        double fahrenheit = celsius * 1.80 + 32.00;
        ans[0] = kelvin;
        ans[1] = fahrenheit;
        return ans;
    }
}


---

## ✅ Status

✔ Solved using direct mathematical formulas
✔ Clean, readable, and beginner-friendly solution

---

* This solution is part of my Data Structures & Algorithms (DSA) practice in Java. *
