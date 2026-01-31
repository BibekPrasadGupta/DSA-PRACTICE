# LeetCode Easy Problems – Java 

## 🧩 Problem 27: Remove Element
**Platform:** LeetCode
**Difficulty:** Easy 
**Language:** Java ☕

## 🧩 Problem Description

Given an integer array nums and an integer val, remove all occurrences of val in-place and return the number of elements remaining.

The order of the elements can be changed

It does not matter what you leave beyond the returned length

🔗 Problem Link: https://leetcode.com/problems/remove-element/

## 💡 Approach Used

In this solution, I used an ArrayList as an intermediate data structure to simplify element removal.

Steps:

Copy all elements from the array nums into an ArrayList

Traverse the list from back to front and remove elements equal to val

Print remaining elements (for understanding/debugging)

Copy the remaining elements back into the original array nums

Return the size of the updated list

## 🧠 Algorithm

Initialize an empty ArrayList<Integer>

Add all elements of nums into the list

Remove matching elements using reverse traversal

Update the original array with remaining values

Return the count of valid elements

## 🧪 Example
Input:
nums = [3,2,2,3]
val = 3

Output:
2
nums = [2,2,_ ,_]

## 🧾 Java Code
  
class Solution {
    public int removeElement(int[] nums, int val) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < nums.length; i++) {
            list.add(nums[i]);
        }
        for(int i = list.size() - 1; i >= 0; i--) {
            if(list.get(i) == val) {
                list.remove(i);
            }
        }
        for(int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        for(int i = 0; i < list.size(); i++) {
            nums[i] = list.get(i);
        }
        return list.size();
    }
}

## ⏱️ Time & Space Complexity

**Time Complexity:** O(n)

**Space Complexity:** O(n) (extra space used by ArrayList)

## 🚀 Notes

This approach is easy to understand and beginner-friendly

LeetCode also expects an O(1) space solution, which can be done using two pointers

This solution is still valid and accepted for learning purposes

📌 Tags

Array Java LeetCode Easy Beginner Friendly

*This solution is part of my Data Structures & Algorithms (DSA) practice in Java.*
