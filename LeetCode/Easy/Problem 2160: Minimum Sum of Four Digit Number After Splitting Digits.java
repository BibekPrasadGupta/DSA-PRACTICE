# LeetCode Easy Problems – Java

## 🧩 Problem 2160: Minimum Sum of Four Digit Number After Splitting Digits

**Platform:** LeetCode
**Difficulty:** Easy
**Language:** Java ☕

---

## 📌 Problem Description

You are given a positive integer `num` consisting of exactly **four digits**.

Split the digits of `num` into two new integers such that the **sum of the two numbers is minimized**.

Return the minimum possible sum.

---

## 🧠 Approach

1. Extract the four digits from the number.
2. Store them in an array.
3. Sort the digits.
4. Construct two numbers using the smallest digits in a way that minimizes their sum.

The optimal strategy is:

* Combine the smallest and largest digits.
* Combine the two middle digits.

---

## 🪜 Step-by-Step Explanation

1. Create an array of size `4` to store digits.
2. Extract digits using `% 10` and `/ 10`.
3. Sort the digit array.
4. Create two numbers:

   * `num1 = arr[0] * 10 + arr[3]`
   * `num2 = arr[1] * 10 + arr[2]`
5. Return `num1 + num2`.

---

## ⏱️ Complexity Analysis

**Time Complexity:** `O(1)`
  (Only four digits are processed)

**Space Complexity:** `O(1)`
  (Fixed-size array used)

---

## 📂 Code

class Solution {
    public int minimumSum(int num) {
        int rem;
        int [] arr = new int[4];
        int i=0;
        while(num!=0){
            rem=num%10;
            arr[i]=rem;
            i++;
            num=num/10;
        }
        Arrays.sort(arr);
        int num1 = arr[0]*10+arr[3];
        int num2 = arr[1]*10+arr[2];
        int MinSum = num1 + num2;
        return MinSum;
    }
}

---

## 💡 Interview Insight

* Tests digit extraction and sorting logic.
* Demonstrates greedy thinking to minimize the resulting sum.
* Common beginner-friendly number manipulation problem.

---

## ✅ Status

✔ Solved successfully
✔ Efficient digit sorting approach
✔ Interview-ready implementation

---

*This solution is part of my Data Structures & Algorithms (DSA) practice in Java.*
