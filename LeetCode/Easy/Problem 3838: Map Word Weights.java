# LeetCode Easy Problems – Java

## 🧩 Problem 3838: Map Word Weights

**Platform:** LeetCode
**Difficulty:** Easy
**Language:** Java ☕

---

## 📌 Problem Description

You are given an array of strings `words` and an integer array `weights` of size 26 representing weights for each lowercase letter.

For each word:

* Compute the sum of weights of its characters.
* Take the result modulo 26.
* Map the value to a character using reverse alphabet indexing.

Return the final string formed by mapped characters.

---

## 🧠 Approach

For each word:

1. Calculate the total weight using character-to-index mapping.
2. Take modulo 26 of the sum.
3. Convert it to a character using reverse mapping from `'z'`.
4. Append to the result string.

---

## 🪜 Step-by-Step Explanation

1. Initialize a `StringBuilder`.
2. Traverse each word in the array.
3. For each character:

   * Find its index using `c - 'a'`.
   * Add corresponding weight.
4. Compute `sum % 26`.
5. Map to character using `'z' - mod`.
6. Append to result.
7. Return final string.

---

## ⏱️ Complexity Analysis

**Time Complexity:** `O(n × m)`
  (Where `m` is average word length)

**Space Complexity:** `O(1)` (excluding output string)

---

## 📂 Code

class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder result= new StringBuilder();
        for(String word : words){
            int sum = 0;
            for(char c: word.toCharArray()){
                sum+=weights[c-'a'];
            }
            int mod = sum % 26;
            char mappedChar = (char)('z'-mod);
            result.append(mappedChar);
        }
        return result.toString();
    }
}

---

## 💡 Interview Insight

* Tests character mapping and modular arithmetic.
* Combines string traversal with array indexing.
* Good practice for encoding/decoding patterns.

---

## ✅ Status

✔ Solved successfully
✔ Efficient mapping approach
✔ Interview-ready implementation

---

*This solution is part of my Data Structures & Algorithms (DSA) practice in Java.*
