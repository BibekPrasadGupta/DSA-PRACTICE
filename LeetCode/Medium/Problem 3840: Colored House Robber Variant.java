# LeetCode Easy Problems – Java

## 🧩 Problem 3840: Colored House Robber Variant

**Platform:** LeetCode
**Difficulty:** Medium
**Language:** Java ☕

---

## 📌 Problem Description

You are given two arrays:

* `nums[]` → amount of money at each position
* `colors[]` → color of each position

You want to maximize the total money collected with the following rule:

* If two adjacent positions have the **same color**, you **cannot take both**.
* If colors are **different**, you **can take both**.

Return the maximum money you can collect.

---

## 🧠 Approach

This is a **Dynamic Programming (DP)** problem similar to House Robber.

1. Define `dp[i]` as the maximum money up to index `i`.
2. At each index, we have two choices:

   * **Skip current** → `dp[i-1]`
   * **Take current**:

     * If same color → `dp[i-2] + nums[i]`
     * If different color → `dp[i-1] + nums[i]`
3. Take maximum of both choices.

---

## 🪜 Step-by-Step Explanation

1. Initialize:

   * `dp[0] = nums[0]`
   * For `dp[1]`:

     * Same color → max of both
     * Different color → sum of both
2. Iterate from `i = 2 → n-1`:

   * Compute `skip`
   * Compute `take` based on color condition
   * Store `dp[i]`
3. Return `dp[n-1]`

---

## ⏱️ Complexity Analysis

**Time Complexity:** `O(n)`
**Space Complexity:** `O(n)` (can be optimized to O(1))

---

## 📂 Code

class Solution {
    public long rob(int[] nums, int[] colors) {
        int n=nums.length;
        if(n==0) return 0;
        if(n==1) return nums[0];
        long[] dp = new long[n];

        dp[0]=nums[0];
        dp[1]=(colors[0]==colors[1])?Math.max(nums[0],nums[1]):nums[0]+nums[1];

        for(int i=2; i<n; i++){
            long skip = dp[i-1];
            long take;

            if(colors[i]==colors[i-1]){
                take = dp[i-2]+nums[i];
            }
            else{
                take = dp[i-1]+nums[i];
            }
            dp[i]=Math.max(skip,take);
        }
        return dp[n-1];
    }
}

---

## 💡 Interview Insight

* Variation of **House Robber** problem.
* Adds constraint using colors → decision depends on adjacency condition.
* Tests DP state transitions and condition-based choices.

---

## ✅ Status

✔ Solved successfully
✔ Optimized DP approach
✔ Interview-ready implementation

---

*This solution is part of my Data Structures & Algorithms (DSA) practice in Java.*
