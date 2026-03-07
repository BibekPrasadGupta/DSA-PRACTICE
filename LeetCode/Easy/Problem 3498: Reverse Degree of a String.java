# LeetCode Easy Problems – Java

## 🧩 Problem 3498: Reverse Degree of a String

**Platform:** LeetCode
**Difficulty:** Easy
**Language:** Java ☕

---

## 📌 Problem Description

You are given a lowercase string `s`.

For each character in the string:

* Find its **reverse alphabetical position**.
* Multiply it by its **1-based index** in the string.

Return the sum of these values.

The reverse alphabetical position is calculated as:

```
26 - (character - 'a')
```

---

## 🧠 Approach

We iterate through each character of the string and compute its reverse alphabetical value.

Then we multiply that value by the character's position in the string and accumulate the result.

---

## 🪜 Step-by-Step Explanation

1. Initialize `sum = 0`.
2. Traverse the string from index `0` to `s.length()-1`.
3. For each character:

   * Compute reverse position: `26 - (s.charAt(i) - 'a')`.
   * Multiply by `(i + 1)`.
4. Add the result to `sum`.
5. Return the final sum.

---

## ⏱️ Complexity Analysis

**Time Complexity:** `O(n)`
  (Single traversal of the string)

**Space Complexity:** `O(1)`
  (Only constant extra variables used)

---

## 📂 Code

class Solution {
    public int reverseDegree(String s) {
        int sum = 0;
        for(int i=0; i<s.length(); i++){
            int n = 26-(s.charAt(i)-'a');
            int prod=n*(i+1);
            sum = sum+prod;
        }
        return sum;
    }
}

---

## 💡 Interview Insight

* Tests character arithmetic and ASCII manipulation.
* Combines string traversal with mathematical computation.
* Good practice for understanding character indexing logic.

---

## ✅ Status

✔ Solved successfully
✔ Efficient single-pass solution
✔ Interview-ready implementation

---

*This solution is part of my Data Structures & Algorithms (DSA) practice in Java.*
