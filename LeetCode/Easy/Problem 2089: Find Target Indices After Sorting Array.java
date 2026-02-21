# LeetCode Easy Problems – Java

## 🧩 Problem 2089: Find Target Indices After Sorting Array

**Platform:** LeetCode
**Difficulty:** Easy
**Language:** Java ☕

---

## 📌 Problem Description

You are given a 0-indexed integer array `nums` and a target element `target`.

Return a list of the indices where the target would appear in the array if it were sorted in non-decreasing order.

The returned list must be sorted in increasing order.

---

## 🧠 Approach

Instead of actually sorting the array, we count:

* How many elements are smaller than `target`
* How many times `target` appears

The first occurrence of `target` in sorted order will be at index equal to the count of smaller elements.

Then we keep adding consecutive indices based on the number of occurrences.

---

## 🪜 Step-by-Step Explanation

1. Initialize counters:

   * `num` → count of elements smaller than target
   * `tcount` → count of target occurrences

2. Traverse the array:

   * If element equals target → increment `tcount`
   * If element is less than target → increment `num`

3. Create result list.

4. Add indices starting from `num` while `tcount > 0`.

5. Return the list.

---

## ⏱️ Complexity Analysis

**Time Complexity:** `O(n)`
  (Single traversal of the array)

**Space Complexity:** `O(k)`
  (Where `k` is the number of target occurrences)

---

## 📂 Code

class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int num = 0;
        int tcount = 0;
        
        for(int ele : nums){
            if(ele == target){
                tcount++;
            }
            else if(ele < target){
                num++;
            }
        }
        List <Integer> ans = new ArrayList<>();
        while(tcount > 0){
            ans.add(num);
            num++;
            tcount--;
        }
        return ans;
    }
}


---

## 💡 Interview Insight

* Sorting is not required to solve this problem.
* Counting technique reduces unnecessary operations.
* Good example of optimizing by avoiding sorting.

---

## ✅ Status

✔ Solved successfully
✔ Optimized approach without sorting
✔ Interview-ready implementation

---

*This solution is part of my Data Structures & Algorithms (DSA) practice in Java.*
