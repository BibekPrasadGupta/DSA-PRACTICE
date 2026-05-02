# 🧩 LeetCode 3845: Maximum XOR with Constraint

**Platform:** LeetCode
**Difficulty:** Hard
**Language:** Java ☕

---

## 📌 Problem Description

Given an array `nums[]` and an integer `k`, find the maximum XOR of any subarray such that:

* The difference between the **maximum and minimum element** in that subarray is **≤ k**.

---

## 🧠 Approach

* Sliding Window (Two Pointers)
* Monotonic Deque (for min & max)
* Trie (for XOR optimization)

---

## 🔑 Key Points

* Maintain valid window `[L, R]`
* Use deque to track min & max
* Shrink window when condition breaks
* Use prefix XOR + Trie for max XOR

---

## ⏱️ Complexity

* Time: O(n log M)
* Space: O(n)

---

## 💻 Code

class Solution {
    class TrieNode {
        TrieNode[] children = new TrieNode[2];
        int count = 0;
    }
    TrieNode root;
    
    private void insert(int val) {
        TrieNode curr = root;
        for (int i = 14; i >= 0; i--) {
            int bit = (val >> i) & 1;
            if (curr.children[bit] == null) {
                curr.children[bit] = new TrieNode();
            }
            curr = curr.children[bit];
            curr.count++;
        }
    }
    private void remove(int val) {
        TrieNode curr = root;
        for (int i = 14; i >= 0; i--) {
            int bit = (val >> i) & 1;
            curr = curr.children[bit];
            curr.count--;
        }
    }
    private int query(int val) {
        TrieNode curr = root;
        int maxXor = 0;
        for (int i = 14; i >= 0; i--) {
            int bit = (val >> i) & 1;
            int target = 1 - bit;

            if (curr.children[target] != null && curr.children[target].count > 0) {
                maxXor |= (1 << i);
                curr = curr.children[target];
            } else if (curr.children[bit] != null && curr.children[bit].count > 0) {
                curr = curr.children[bit];
            } else {
                break;
            }
        }
        return maxXor;
    }

    public int maxXor(int[] nums, int k) {
        int n = nums.length;
        int[] pref = new int[n + 1];
        for (int i = 0; i < n; i++) {
            pref[i + 1] = pref[i] ^ nums[i];
        }
        
        root = new TrieNode();
        Deque<Integer> maxQ = new ArrayDeque<>();
        Deque<Integer> minQ = new ArrayDeque<>();
        
        int ans = 0;
        int L = 0;
        
        for (int R = 0; R < n; R++) {
            while (!maxQ.isEmpty() && nums[maxQ.peekLast()] <= nums[R]) {
                maxQ.pollLast();
            }
            maxQ.offerLast(R);
            while (!minQ.isEmpty() && nums[minQ.peekLast()] >= nums[R]) {
                minQ.pollLast();
            }
            minQ.offerLast(R);
            insert(pref[R]);
            while (!maxQ.isEmpty() && !minQ.isEmpty() && nums[maxQ.peekFirst()] - nums[minQ.peekFirst()] > k) {
                remove(pref[L]);
                if (maxQ.peekFirst() == L) maxQ.pollFirst();
                if (minQ.peekFirst() == L) minQ.pollFirst();
                L++;
            }
            ans = Math.max(ans, query(pref[R + 1]));
        }
        
        return ans;
    }
}

---

## 💡 Interview Insight

* Combines **3 advanced concepts together**:

  * Sliding Window
  * Monotonic Queue
  * Bitwise Trie
* Very strong FAANG-level problem 🔥
* Tests optimization + data structure design

---

## ✅ Status

✔ Solved successfully
✔ Advanced optimized solution
✔ Strong interview problem  🚀

**This solution is part of my Data Structures & Algorithms (DSA) practice in Java.**
