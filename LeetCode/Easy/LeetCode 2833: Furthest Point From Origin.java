# 🧩 LeetCode 2833: Furthest Point From Origin

**Platform:** LeetCode
**Difficulty:** Easy
**Language:** Java ☕

---

## 📌 Problem Description

Given a string `moves` consisting of characters `'L'`, `'R'`, and `'_'`, determine the furthest distance from the origin you can achieve.

* `'L'` → move left
* `'R'` → move right
* `'_'` → can be either `'L'` or `'R'`

Return the maximum possible distance from the origin.

---

## 🧠 Approach

* Count number of `'L'`, `'R'`, and `'_'`
* Compute base distance: `|L - R|`
* Add all flexible moves `'_'` to maximize distance

---

## 🔑 Key Points

* Treat `'_'` as flexible moves
* Maximize difference by assigning all `'_'` in one direction
* Use absolute difference for base movement

---

## ⏱️ Complexity

* Time: O(n)
* Space: O(1)

---

## 💻 Code

class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int left=0;
        int right=0;
        int count=0;
        for(int i=0; i<moves.length(); i++){
            if(moves.charAt(i)=='L'){
                left++;
            }else if(moves.charAt(i)=='R'){
                right++;
            }
           else
            {
                count++;
            }
        }
        int max=Math.abs(left-right);
        max=max+count;
        return max;
    }
}

---

## 💡 Interview Insight

* Greedy thinking problem
* Use flexibility of `'_'` to maximize distance
* Tests counting and optimization skills

---

## ✅ Status

✔ Solved successfully
✔ Optimal greedy approach
✔ Interview-ready implementation

---

*This solution is part of my Data Structures & Algorithms (DSA) practice in Java.*
