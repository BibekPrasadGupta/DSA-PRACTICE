## LeetCode Easy Problems – Java
# 🧩 Problem 1800: Maximum Ascending Subarray Sum

** Platform:**  LeetCode
** Difficulty:**  Easy
** Language:**  Java ☕

📌 Problem Description

You are given an array of positive integers nums.

Return the maximum possible sum of an ascending subarray in nums.

A subarray is ascending if for every i:

nums[i] < nums[i + 1]

🧠 Approach (Sliding Window Technique)

To solve this problem:

Initialize two variables:

currmax → to store current ascending subarray sum

max → to store overall maximum sum

Traverse the array from index 1:

If current element is greater than previous → continue ascending

Add to currmax

Else:

Update max

Reset currmax to current element

After loop, update max one final time.

🪜 Step-by-Step Explanation

Initialize:

max = nums[0]

currmax = nums[0]

Traverse from index 1:

If nums[i-1] < nums[i]

currmax += nums[i]

Else

max = Math.max(max, currmax)

currmax = nums[i]

After loop:

max = Math.max(max, currmax)

Return max.

⏱️ Complexity Analysis

** Time Complexity:**  O(n)
(Single pass through the array)

** Space Complexity:**  O(1)
(Only constant extra variables used)

📂 Code

class Solution {
    public int maxAscendingSum(int[] nums) {
        int max=nums[0];
        int currmax=nums[0];
        for(int i=1; i<nums.length; i++){
            if(nums[i-1]<nums[i]){
                currmax=currmax+nums[i];
            }
            else{
                max=Math.max(max,currmax);
                currmax=nums[i];
            }
        }
        max=Math.max(max,currmax);
        return max;
    }
}

💡 Interview Insight

This problem tests:

Array traversal

Sliding window technique

Tracking running sum

Similar logic is used in Kadane’s Algorithm (maximum subarray problems).

✅ Status

✔ Solved using sliding window approach
✔ Optimized time complexity
✔ Good practice for subarray problems

** This solution is part of my Data Structures & Algorithms (DSA) practice in Java. ** 
