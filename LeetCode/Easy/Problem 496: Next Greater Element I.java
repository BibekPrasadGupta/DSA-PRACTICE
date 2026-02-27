# LeetCode Easy Problems – Java

## 🧩 Problem 496: Next Greater Element I

**Platform:** LeetCode
**Difficulty:** Easy
**Language:** Java ☕

---

## 📌 Problem Description

You are given two integer arrays `nums1` and `nums2`, where `nums1` is a subset of `nums2`.

For each element in `nums1`, find the next greater element in `nums2`.

The next greater element of a number `x` in `nums2` is the first greater number to the right of `x`.

If it does not exist, return `-1`.

---

## 🧠 Approach

We use a **Monotonic Stack** to efficiently find the next greater element for each number in `nums2`.

* Traverse `nums2` while maintaining a decreasing stack.
* When a greater element is found, map it as the next greater value.
* Store results in a hashmap for quick lookup for elements in `nums1`.

---

## 🪜 Step-by-Step Explanation

1. Initialize a stack and a hashmap.
2. Traverse `nums2`:

   * While current element is greater than stack top:

     * Pop and map it to current element.
   * Push current element to stack.
3. After traversal, map remaining stack elements to `-1`.
4. Create result array for `nums1` using hashmap lookups.

---

## ⏱️ Complexity Analysis

**Time Complexity:** `O(n + m)`
  (Where `n = nums1.length`, `m = nums2.length`)

**Space Complexity:** `O(m)`
  (Stack and hashmap storage)

---

## 📂 Code

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stack = new Stack<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums2){
            while(!stack.isEmpty() && stack.peek()<num){
                map.put(stack.pop(),num);
            }
            stack.push(num);
        }
        while(!stack.isEmpty()){
            map.put(stack.pop(),-1);
        }
        int [] result=new int[nums1.length];
        for(int i=0; i<nums1.length; i++){
            result[i] = map.get(nums1[i]);
        }
        return result;
    }
}

---

## 💡 Interview Insight

* Classic monotonic stack pattern.
* Useful for range query problems.
* Common in stock span and histogram problems.

---

## ✅ Status

✔ Solved successfully
✔ Optimal stack-based solution
✔ Interview-ready implementation

---

*This solution is part of my Data Structures & Algorithms (DSA) practice in Java.*
