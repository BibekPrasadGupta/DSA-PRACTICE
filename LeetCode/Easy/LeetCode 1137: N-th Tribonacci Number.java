##  LeetCode Easy Problems – Java

## 🧩 LeetCode 1137: N-th Tribonacci Number

## 📌 Problem Description

The Tribonacci sequence is defined as follows:

* T₀ = 0
* T₁ = 1
* T₂ = 1
* For n ≥ 3:
  **Tₙ = Tₙ₋₁ + Tₙ₋₂ + Tₙ₋₃**

Given an integer `n`, return the value of **Tₙ**.

---

## 💡 Approach Used

**Iterative Dynamic Programming (Space Optimized)**

Instead of using recursion (which causes repeated calculations), this solution uses an **iterative approach** with constant space.

We only keep track of the last three Tribonacci numbers at any time:

* `first`  → Tₙ₋₃
* `second` → Tₙ₋₂
* `third`  → Tₙ₋₁

Each new Tribonacci number is computed and the window is shifted forward.

---

## 🪜 Step-by-Step Explanation

1. Handle base cases:

   * If `n == 0` → return 0
   * If `n == 1` or `n == 2` → return 1

2. Initialize:

   * `first = 0`
   * `second = 1`
   * `third = 1`

3. Loop until reaching the n-th term:

   * Compute `four = first + second + third`
   * Shift values forward

4. Return the final result.

---

## 🧪 Example

**Input:** `n = 4`
**Output:** `4`

**Explanation:**
T₃ = 0 + 1 + 1 = 2
T₄ = 1 + 1 + 2 = 4

---

## ⏱️ Time and Space Complexity

**Time Complexity:** `O(n)`
**Space Complexity:** `O(1)` (constant extra space)

---

## 🧠 Key Takeaways

* Iterative DP avoids recursion overhead
* Space optimization is achieved by storing only the last three values
* Very common interview-friendly problem

---

## 🧑‍💻 Java Solution

class Solution {
    public int tribonacci(int n) {
        if (n == 0) return 0;
        if (n == 1 || n == 2) return 1;

        int first = 0;
        int second = 1;
        int third = 1;

        for (int i = 3; i <= n; i++) {
            int four = first + second + third;
            first = second;
            second = third;
            third = four;
        }
        return third;
    }
}


---

⭐ * If this solution helped you, consider giving the repository a star! *
