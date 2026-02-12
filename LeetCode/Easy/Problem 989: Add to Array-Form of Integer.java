# LeetCode Easy Problems – Java

## 🧩 Problem 989: Add to Array-Form of Integer

**Platform:** LeetCode
**Difficulty:** Easy
**Language:** Java ☕

---

## 📌 Problem Description

The array `num` represents a non-negative integer where each element is a digit of the number in order.

You are also given an integer `k`.

Return the array-form of the integer `num + k`.

---

## 🧠 Approach (Digit-by-Digit Addition with Carry)

This problem is similar to manual addition.

* Start from the last digit of the array.
* Add digits of `k` one by one.
* Maintain a `carry` value.
* Store digits in reverse order and finally reverse the list.

This avoids converting the entire array into a large integer (which may overflow).

---

## 🪜 Step-by-Step Explanation

1. Initialize:

   * Pointer `p` at the last index of array.
   * `carry = 0`
   * Result list `ans`.

2. While there are digits left in array OR digits left in `k`:

   * Take current digit from array (if available).
   * Take last digit of `k` using `k % 10`.
   * Compute `sum = numVal + digitOfK + carry`.
   * Add `sum % 10` to result.
   * Update `carry = sum / 10`.
   * Move pointer left.
   * Remove last digit of `k` using `k / 10`.

3. If carry remains, add it.

4. Reverse the result list.

5. Return result.

---

## ⏱️ Complexity Analysis

* **Time Complexity:** `O(max(n, log k))`
* **Space Complexity:** `O(max(n, log k))`

---

## 📂 Code

class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> ans = new ArrayList<Integer>();
        int p = num.length - 1;
        int carry = 0;

        while (p >= 0 || k > 0) {
            int numval = 0;
            if (p >= 0) {
                numval = num[p];
            }
            int d = k % 10;
            int sum = numval + d + carry;
            int digit = sum % 10;
            carry = sum / 10;
            ans.add(digit);
            p--;
            k = k / 10;
        }

        if (carry > 0) {
            ans.add(carry);
        }

        Collections.reverse(ans);
        return ans;
    }
}


---

## 💡 Interview Insight

This problem tests:

* Handling large numbers without overflow
* Carry propagation
* Simulation of manual arithmetic

---

## ✅ Status

✔ Solved using digit-by-digit addition
✔ Efficient and interview-friendly approach
✔ Avoids integer overflow issues

---

* This solution is part of my Data Structures & Algorithms (DSA) practice in Java. *
