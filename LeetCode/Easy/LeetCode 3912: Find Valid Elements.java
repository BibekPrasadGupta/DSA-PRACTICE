# 🧩 LeetCode 3912: Find Valid Elements

**Platform:** LeetCode
**Difficulty:** Medium
**Language:** Java ☕

---

## 📌 Problem Description

Given an integer array `nums`, return all elements that satisfy:

* Element is at boundary (first or last)
* OR element is greater than at least one side (left max or right max)

---

## 🧠 Approach

* Create prefix max array `leftmax`
* Create suffix max array `rightmax`
* Traverse array and check conditions

---

## 🔑 Key Points

* Precompute max values for efficiency
* Handle boundary elements separately
* Compare with both left and right sides

---

## ⏱️ Complexity

* Time: O(n)
* Space: O(n)

---

## 💻 Code

class Solution {
    public List<Integer> findValidElements(int[] nums) {
        int n=nums.length;
        List<Integer> list = new ArrayList<>();
        if(n==1){
            list.add(nums[0]);
            return list;
        }
        int [] leftmax = new int[n];
        leftmax[0]=nums[0];
        for(int i=1; i<n; i++){
            leftmax[i]=Math.max(leftmax[i-1],nums[i]);
        }
        int [] rightmax = new int[n];
        rightmax[n-1]=nums[n-1];
        for(int i=n-2; i>=0; i--){
            rightmax[i]=Math.max(rightmax[i+1],nums[i]);
        }

        for(int i=0; i<n; i++){
            if(i==0 || i==n-1){
                list.add(nums[i]);
            }
            else if(nums[i]>leftmax[i-1] || nums[i]>rightmax[i+1]){
                list.add(nums[i]);
            }
        }
        return list;
    }
}

---

## 💡 Interview Insight

* Uses prefix and suffix arrays
* Efficient alternative to nested loops
* Common pattern in array problems

---

## ✅ Status

✔ Solved successfully
✔ Optimized using prefix/suffix arrays
✔ Interview-ready implementation

---

*This solution is part of my Data Structures & Algorithms (DSA) practice in Java.*
