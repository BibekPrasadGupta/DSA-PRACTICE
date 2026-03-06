# LeetCode Easy Problems – Java

## 🧩 Problem 121: Best Time to Buy and Sell Stock

**Platform:** LeetCode
**Difficulty:** Easy
**Language:** Java ☕

---

## 📌 Problem Description

You are given an array `prices` where `prices[i]` is the price of a given stock on the `i`th day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction.

If you cannot achieve any profit, return `0`.

---

## 🧠 Approach

We track the **minimum price seen so far** while traversing the array.

For every price:

* If it is smaller than the current minimum price → update the minimum price.
* Otherwise → calculate the profit by subtracting the minimum price from the current price.

We keep updating the maximum profit found.

---

## 🪜 Step-by-Step Explanation

1. Initialize `minPrice = Integer.MAX_VALUE` and `maxProfit = 0`.
2. Traverse the array.
3. If current price is smaller than `minPrice`, update `minPrice`.
4. Otherwise calculate `price - minPrice`.
5. Update `maxProfit` if the profit is larger.
6. Return `maxProfit`.

---

## ⏱️ Complexity Analysis

* **Time Complexity:** `O(n)`
  (Single traversal of the array)

* **Space Complexity:** `O(1)`
  (Only constant extra variables used)

---

## 📂 Code

class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;
        for(int price : prices){
            if(price < minPrice){
                minPrice = price;
            }
            else{
                maxProfit = Math.max(maxProfit,price-minPrice);
            }
        }
        return maxProfit;
    }
}

---

## 💡 Interview Insight

* Classic greedy problem.
* Tests ability to track minimum values while scanning.
* One of the most common stock-profit interview questions.

---

## ✅ Status

✔ Solved successfully
✔ Optimal single-pass solution
✔ Interview-ready implementation

---

*This solution is part of my Data Structures & Algorithms (DSA) practice in Java.*
