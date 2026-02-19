## LeetCode Easy Problems – Java
# 🧩 Problem 704: Binary Search

** Platform:** LeetCode
**Difficulty:** Easy
**Language:** Java ☕

📌 Problem Description
--- 
  
You are given a sorted (ascending order) integer array nums and an integer target.

Return the index of target if it exists in the array.

If it does not exist, return -1.

Your solution must run in O(log n) time complexity.

🧠 Approach (Binary Search Algorithm)

To solve this problem:

Initialize two pointers:

low = 0

high = nums.length - 1

Use a loop while low <= high.

Find the middle index using:

mid = low + (high - low) / 2

---
  
Compare nums[mid] with target:

If equal → return mid

If smaller → search right half

If greater → search left half

If the target is not found, return -1.

---

# 🪜 Step-by-Step Explanation

  ---
  
Initialize:

low = 0

high = nums.length - 1

While low <= high:

Compute middle:

mid = low + (high - low) / 2

If nums[mid] == target

return mid

Else if nums[mid] < target

low = mid + 1

Else

high = mid - 1

After loop ends:

Return -1

  ---

# ⏱️ Complexity Analysis

**Time Complexity:** O(log n)
(Search space is reduced by half each iteration)

**Space Complexity:** O(1)
(Only constant extra variables used)

📂 Code
  
class Solution {
    public int search(int[] nums, int target) {
        int low=0;
        int high=nums.length-1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return -1;
    }
}

# 💡 Interview Insight

This is a classic Binary Search problem.

Important concepts tested:

Divide and Conquer technique

Correct loop boundary conditions

Preventing overflow using low + (high - low) / 2

✅ Status

✔ Solved using Binary Search
✔ Achieved required O(log n) complexity
✔ Clean and efficient implementation

* This solution is part of my Data Structures & Algorithms (DSA) practice in Java. *
