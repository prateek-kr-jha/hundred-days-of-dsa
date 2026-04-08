# TODO.md - SDE-3 Preparation

**Language: Java**

## Current Focus: DSA 1.1.1 - Complexity Analysis

---

## Session Log

| Date | Topic | Sub-topic | Questions | Timed | Score | Time Spent | Notes |
|------|-------|-----------|-----------|-------|-------|------------|-------|
| | | | | | | | |

---

## Quick Stats

| Today | Week | Total |
|-------|------|-------|
| Problems: | Problems: | Problems: |
| Time: | Time: | Time: |

---

## DSA - Foundations (1.1)

### Section Type: `Conceptual` (1.1.1) | `Problems` (1.1.2-1.1.4)

---

## Topic: 1.1.1 - Complexity Analysis

**Type: Conceptual** - No coding, just analysis

### Prerequisite Knowledge
- [ ] Basic math (sum of arithmetic series, logarithms)
- [ ] Understanding of what "input size" means
- [ ] Big-O, Big-Theta, Big-Omega notation
- [ ] Constant, logarithmic, linear, polynomial, exponential growth

### Questions

- [ ] **Q1** | Tags: `nested-loops` | Timed: 2min
  > What is the time complexity?
  ```java
  for (int i = 0; i < n; i++) {
    for (int j = i; j < n; j++) {
      System.out.println(i + " " + j);
    }
  }
  ```
  - Derive: n + (n-1) + (n-2) + ... + 1 = n(n+1)/2
  - Answer: O(n²)
  - [ ] Answer: __________ | [ ] Without hints

- [ ] **Q2** | Tags: `space-complexity`
  > What is space complexity?
  ```java
  int[][] matrix = new int[n][n];
  for (int i = 0; i < n; i++) {
    Arrays.fill(matrix[i], 0);
  }
  ```
  - Answer: O(n²)
  - [ ] Answer: __________ | [ ] Without hints

- [ ] **Q3** | Tags: `recursion` | Timed: 3min
  > Explain space complexity vs auxiliary space with recursive example
  - Hint: Consider call stack vs output storage
  - [ ] Explanation complete | [ ] Without hints

- [ ] **Q4** | Tags: `algorithm-selection`
  > When pick O(n²) over O(n log n)? Name algorithms.
  - [ ] Answer complete | [ ] Without hints

- [ ] **Q5** | Tags: `amortized-analysis`
  > What is amortized O(1)? Explain with hash table insert.
  - Hint: ArrayList doubling vs individual inserts
  - [ ] Explanation complete | [ ] Without hints

- [ ] **Q6** | Tags: `recurrence-relation` | Timed: 5min
  > Derive binary search time complexity from recurrence
  - Hint: T(n) = T(n/2) + O(1), draw recursion tree
  - Answer: O(log n)
  - [ ] Derivation complete | [ ] Without hints

- [ ] **Q7** | Tags: `loop-analysis` | Timed: 2min
  > Analyze complexity:
  ```java
  int i = n;
  while (i > 0) { i = i / 2; }
  ```
  - Answer: O(log n)
  - [ ] Answer: __________ | [ ] Without hints

- [ ] **Q8** | Tags: `sorting`
  > Why quicksort average O(n log n) but worst O(n²)?
  - Hint: Pivot selection matters
  - [ ] Explanation complete | [ ] Without hints

- [ ] **Q9** | Tags: `practical-analysis` | Timed: 3min
  > O(n), O(n²), O(2ⁿ) for n=20 - which wins?
  - Hint: Calculate actual operations, not just growth rate
  - [ ] Answer with calculation | [ ] Without hints

- [ ] **Q10** | Tags: `graph-traversal`
  > Time complexity of BFS and DFS on V vertices, E edges?
  - Answer: O(V + E) for both
  - [ ] Answer: __________ | [ ] Without hints

- [ ] **Q11** | Tags: `nested-loops` | Timed: 5min
  > Analyze:
  ```java
  for (int i = 0; i < n; i++) {
    for (int j = 0; j < n; j++) {
      for (int k = 0; k < i + j; k++) { }
    }
  }
  ```
  - Hint: Sum of (i + j) for all i,j pairs
  - Answer: O(n³)
  - [ ] Answer: __________ | [ ] Without hints

- [ ] **Q12** | Tags: `recurrence-relation` | Timed: 5min
  > Difference between T(n)=T(n/2)+O(1) and T(n)=2T(n/2)+O(1)?
  - Hint: Draw recursion trees, count nodes
  - [ ] Explanation complete | [ ] Without hints

### Exit Parameters (Conceptual Topic)
- [ ] Compute any nested loop complexity in <1 min
- [ ] Derive recurrence relations via recursion tree
- [ ] Explain amortized vs worst-case vs average
- [ ] Compare all complexity classes with real examples
- [ ] Q1-Q4 in <10 mins total (timed)

---

## Topic: 1.1.2 - Arrays

**Type: Problems**

### Prerequisite Knowledge
- [ ] Array indexing is O(1)
- [ ] Prefix sum: prefix[i] = sum of arr[0..i-1]
- [ ] Two pointers: left + right, move based on condition
- [ ] Sliding window: fixed/variable size window

### Questions

#### Easy (Target: <10min)

- [ ] **Q1** | [Running Sum of 1d Array](https://leetcode.com/problems/running-sum-of-1d-array/) | Tags: `prefix-sum` | Timed: 10min
  > Return running sum [1,2,3,4] → [1,3,6,10]
  - Brute force: O(n²) nested loop
  - Optimized: O(n), O(1) space
  - Edge: empty array → []
  - [ ] Solved | [ ] Without hints | [ ] Timed

- [ ] **Q2** | [Maximum Subarray](https://leetcode.com/problems/maximum-subarray/) | Tags: `kadane`, `dynamic-programming` | Timed: 15min
  > Find contiguous subarray with largest sum
  - Brute force: O(n²) - all subarrays
  - Optimized: Kadane's algorithm O(n)
  - Edge: all negatives → return max single element
  - [ ] Solved | [ ] Without hints | [ ] Timed

- [ ] **Q3** | [Richest Customer Wealth](https://leetcode.com/problems/richest-customer-wealth/) | Tags: `array-traversal` | Timed: 10min
  > Find richest customer (max sum of accounts[i])
  - Edge: empty accounts
  - [ ] Solved | [ ] Without hints | [ ] Timed

- [ ] **Q4** | [Shuffle the Array](https://leetcode.com/problems/shuffle-the-array/) | Tags: `in-place` | Timed: 10min
  > [1,2,1] with n=1 → [1,1,2] (restore original)
  - Hint: Process from right, avoid overwriting
  - Edge: single element
  - [ ] Solved | [ ] Without hints | [ ] Timed

- [ ] **Q5** | [Plus One](https://leetcode.com/problems/plus-one/) | Tags: `simulation` | Timed: 10min
  > [1,2,3] → [1,2,4], [9,9] → [1,0,0]
  - Edge: carry propagation, all 9s
  - [ ] Solved | [ ] Without hints | [ ] Timed

#### Medium (Target: <25min)

- [ ] **Q6** | [Product of Array Except Self](https://leetcode.com/problems/product-of-array-except-self/) | Tags: `prefix-sum`, `product` | Timed: 20min
  > arr[i] = product of all except arr[i], no division
  - Brute force: O(n²)
  - Optimized: Two passes (left products, right products)
  - Edge: zero handling
  - [ ] Solved | [ ] Without hints | [ ] Timed

- [ ] **Q7** | [Find Minimum in Rotated Sorted Array](https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/) | Tags: `binary-search` | Timed: 20min
  > Find min in [4,5,6,7,0,1,2]
  - Brute force: O(n) - scan
  - Optimized: Binary search, O(log n)
  - Edge: not rotated, single element
  - [ ] Solved | [ ] Without hints | [ ] Timed

- [ ] **Q8** | [Container With Most Water](https://leetcode.com/problems/container-with-most-water/) | Tags: `two-pointers`, `greedy` | Timed: 20min
  > Max area between two lines
  - Brute force: O(n²) - all pairs
  - Optimized: Two pointers from ends
  - Why greedy works: moving longer pointer can't increase area
  - [ ] Solved | [ ] Without hints | [ ] Timed

- [ ] **Q9** | [Find All Duplicates in an Array](https://leetcode.com/problems/find-all-duplicates-in-an-array/) | Tags: `in-place`, `negation` | Timed: 20min
  > Find elements appearing twice, O(n) time, O(1) space
  - Hint: Use index as marker, negate visited
  - Edge: multiple duplicates, no duplicates
  - [ ] Solved | [ ] Without hints | [ ] Timed

- [ ] **Q10** | [Maximum Points You Can Obtain from Cards](https://leetcode.com/problems/maximum-points-you-can-obtain-from-cards/) | Tags: `sliding-window` | Timed: 20min
  > Remove k cards from ends, maximize points
  - Hint: Equivalent to finding minimum subarray of size n-k
  - Edge: k = 0, k = n
  - [ ] Solved | [ ] Without hints | [ ] Timed

- [ ] **Q11** | [Spiral Matrix](https://leetcode.com/problems/spiral-matrix/) | Tags: `simulation` | Timed: 25min
  > Return elements in spiral order
  - Hint: Track boundaries (top, bottom, left, right)
  - Edge: Single row/col, empty matrix
  - [ ] Solved | [ ] Without hints | [ ] Timed

- [ ] **Q12** | [Next Permutation](https://leetcode.com/problems/next-permutation/) | Tags: `in-place` | Timed: 25min
  > Rearrange to next lexicographically greater permutation
  - Steps: find pivot, find successor, swap, reverse suffix
  - Edge: descending array → wrap to ascending
  - [ ] Solved | [ ] Without hints | [ ] Timed

#### Hard (Target: <40min)

- [ ] **Q13** | [Median of Two Sorted Arrays](https://leetcode.com/problems/median-of-two-sorted-arrays/) | Tags: `binary-search` | Timed: 35min
  > Find median of two sorted arrays, O(log (m+n))
  - Hint: Binary search partition position in smaller array
  - Edge: Unequal lengths, one empty
  - [ ] Solved | [ ] Without hints | [ ] Timed

### Exit Parameters (Problem Topic)
- [ ] Detect pattern (prefix sum, two pointers, sliding window) in <2 min
- [ ] Handle edge cases: empty, single, duplicates, all same, overflow
- [ ] **5 medium problems solved without hints**
- [ ] Time targets: Easy <10min, Medium <25min, Hard <40min

---

## Topic: 1.1.3 - Strings

**Type: Problems**

### Prerequisite Knowledge
- [ ] String immutability in Java (creates new string on change)
- [ ] ASCII (128 chars) vs Unicode (variable width, UTF-16)
- [ ] String methods: charAt(), codePointAt(), substring(), split(), indexOf()
- [ ] StringBuilder for mutable strings
- [ ] HashMap for character frequency

### Questions

#### Easy (Target: <10min)

- [ ] **Q1** | [Valid Anagram](https://leetcode.com/problems/valid-anagram/) | Tags: `hashing` | Timed: 10min
  > Check if t is anagram of s
  - Brute force: Sort both, O(n log n)
  - Optimized: Count chars, O(n)
  - Edge: Different lengths, unicode
  - [ ] Solved | [ ] Without hints | [ ] Timed

- [ ] **Q2** | [First Unique Character](https://leetcode.com/problems/first-unique-character-in-a-string/) | Tags: `hashing` | Timed: 10min
  > Return index of first non-repeating char
  - Two passes: count, then find
  - Edge: no unique char, empty string
  - [ ] Solved | [ ] Without hints | [ ] Timed

- [ ] **Q3** | [Reverse String](https://leetcode.com/problems/reverse-string/) | Tags: `two-pointers` | Timed: 5min
  > In-place reverse (swap in place)
  - O(1) space required
  - [ ] Solved | [ ] Without hints | [ ] Timed

- [ ] **Q4** | [Valid Palindrome](https://leetcode.com/problems/valid-palindrome/) | Tags: `two-pointers` | Timed: 10min
  > Alphanumeric palindrome ignoring case
  - Skip non-alphanumeric chars
  - Edge: empty string, single char
  - [ ] Solved | [ ] Without hints | [ ] Timed

- [ ] **Q5** | [Longest Common Prefix](https://leetcode.com/problems/longest-common-prefix/) | Tags: `iteration` | Timed: 10min
  > Find longest common prefix among strings
  - Approaches: vertical scan, horizontal scan, sort then compare first/last
  - Edge: empty array, no common prefix
  - [ ] Solved | [ ] Without hints | [ ] Timed

#### Medium (Target: <25min)

- [ ] **Q6** | [Longest Substring Without Repeating Characters](https://leetcode.com/problems/longest-substring-without-repeating-characters/) | Tags: `sliding-window`, `hashing` | Timed: 20min
  > Length of longest substring with all unique chars
  - Brute force: O(n³) - all substrings
  - Optimized: Sliding window with set/map, O(n)
  - Edge: empty, all same chars, entire string unique
  - [ ] Solved | [ ] Without hints | [ ] Timed

- [ ] **Q7** | [Group Anagrams](https://leetcode.com/problems/group-anagrams/) | Tags: `hashing` | Timed: 20min
  > Group strings that are anagrams
  - Key strategies: sorted string vs character count (26 array)
  - Tradeoff: sorted = O(k log k) vs count = O(k) but more space
  - Edge: empty strings, single string
  - [ ] Solved | [ ] Without hints | [ ] Timed

- [ ] **Q8** | [Minimum Window Substring](https://leetcode.com/problems/minimum-window-substring/) | Tags: `sliding-window` | Timed: 30min
  > Smallest window containing all chars of pattern
  - Hint: Expand right, contract left when valid
  - Edge: pattern longer than string, no valid window
  - [ ] Solved | [ ] Without hints | [ ] Timed

- [ ] **Q9** | [String to Integer (atoi)](https://leetcode.com/problems/string-to-integer-atoi/) | Tags: `simulation` | Timed: 25min
  > Implement atoi with all edge cases
  - Edge cases: leading spaces, signs, overflow, non-numeric chars, empty
  - Clamp to [-2³¹, 2³¹-1]
  - [ ] Solved | [ ] Without hints | [ ] Timed

- [ ] **Q10** | [Count Number of Nice Subarrays](https://leetcode.com/problems/count-number-of-nice-subarrays/) | Tags: `sliding-window` | Timed: 25min
  > Count subarrays with exactly k odd numbers
  - Hint: Subtract atMost(k-1) from atMost(k)
  - Edge: k = 0, no odd numbers
  - [ ] Solved | [ ] Without hints | [ ] Timed

- [ ] **Q11** | [Interleaving String](https://leetcode.com/problems/interleaving-of-two-strings/) | Tags: `dynamic-programming` | Timed: 30min
  > Is s3 interleaving of s1 and s2?
  - 2D DP: dp[i][j] = can interleave s1[0..i] and s2[0..j] to get s3[0..i+j]
  - Edge: lengths don't match, impossible interleave
  - [ ] Solved | [ ] Without hints | [ ] Timed

- [ ] **Q12** | [Zigzag Conversion](https://leetcode.com/problems/zigzag-conversion/) | Tags: `simulation` | Timed: 20min
  > Convert "PAYPALISHIRING" with n=3 → "PAHNAPLSIIGYIR"
  - Direct indexing: O(n), no string building per row
  - Edge: n = 1, n >= len
  - [ ] Solved | [ ] Without hints | [ ] Timed

#### Hard (Target: <40min)

- [ ] **Q13** | [Regular Expression Matching](https://leetcode.com/problems/regular-expression-matching/) | Tags: `dynamic-programming` | Timed: 40min
  > '.' matches any char, '*' matches zero or more
  - 2D DP required
  - States: dp[i][j] = s[0..i-1] matches p[0..j-1]
  - Edge: consecutive *, no match possible
  - [ ] Solved | [ ] Without hints | [ ] Timed

### Exit Parameters (Problem Topic)
- [ ] Map string problems to array/hash techniques
- [ ] Use sorted key vs character count based on context
- [ ] Sliding window on strings fluently
- [ ] Handle unicode, empty, single char
- [ ] **5 medium problems solved without hints**
- [ ] Time targets: Easy <10min, Medium <25min, Hard <40min

---

## Topic: 1.1.4 - Hashing

**Type: Problems**

### Prerequisite Knowledge
- [ ] Hash function: converts key to array index
- [ ] Collision: chaining (linked list) vs open addressing (linear probing)
- [ ] Load factor = n/m (entries/buckets), triggers rehashing at ~0.75
- [ ] HashMap vs HashSet: value vs existence
- [ ] O(1) amortized vs O(n) worst case

### Questions

#### Easy (Target: <10min)

- [ ] **Q1** | [Two Sum](https://leetcode.com/problems/two-sum/) | Tags: `hashing` | Timed: 10min
  > Return indices of two numbers that sum to target
  - Brute force: O(n²) - all pairs
  - Optimized: One pass hash map, O(n)
  - Why not sort + two pointers? (need original indices)
  - Edge: no solution, multiple solutions
  - [ ] Solved | [ ] Without hints | [ ] Timed

- [ ] **Q2** | [Contains Duplicate](https://leetcode.com/problems/contains-duplicate/) | Tags: `hashing` | Timed: 10min
  > Check if array has duplicate
  - Three approaches: sort O(n log n), set O(n), map count O(n)
  - Tradeoffs: space vs time
  - [ ] Solved | [ ] Without hints | [ ] Timed

- [ ] **Q3** | [Valid Sudoku](https://leetcode.com/problems/valid-sudoku/) | Tags: `hashing` | Timed: 15min
  > Check if 9x9 board is valid
  - Use sets for row, col, box
  - Box index: (row/3)*3 + col/3
  - Edge: empty board, multiple violations
  - [ ] Solved | [ ] Without hints | [ ] Timed

- [ ] **Q4** | [Intersection of Two Arrays](https://leetcode.com/problems/intersection-of-two-arrays/) | Tags: `hashing` | Timed: 10min
  > Return intersection (unique elements)
  - Set intersection approach
  - Edge: no intersection, duplicates
  - [ ] Solved | [ ] Without hints | [ ] Timed

- [ ] **Q5** | [Happy Number](https://leetcode.com/problems/happy-number/) | Tags: `cycle-detection` | Timed: 15min
  > Is n a happy number? (sum of squares eventually = 1)
  - Detect cycles with set or Floyd's algorithm
  - Edge: 1 is happy, 2 is not
  - [ ] Solved | [ ] Without hints | [ ] Timed

#### Medium (Target: <25min)

- [ ] **Q6** | [Longest Consecutive Sequence](https://leetcode.com/problems/longest-consecutive-sequence/) | Tags: `hashing` | Timed: 25min
  > Longest consecutive sequence length (O(n))
  - Brute force: O(n log n) - sort
  - Optimized: O(n) using set + local sequence building
  - Why O(n)? Each element visited at most twice
  - Edge: empty array, all same elements
  - [ ] Solved | [ ] Without hints | [ ] Timed

- [ ] **Q7** | [Design HashMap](https://leetcode.com/problems/design-hashmap/) | Tags: `hash-table`, `design` | Timed: 30min
  > Implement HashMap from scratch
  - Separate chaining with linked list
  - Handle: put, get, remove
  - Explain: load factor, rehashing
  - Edge: key doesn't exist, update existing
  - [ ] Solved | [ ] Without hints | [ ] Timed

- [ ] **Q8** | [Subarray Sum Equals K](https://leetcode.com/problems/subarray-sum-equals-k/) | Tags: `prefix-sum`, `hashing` | Timed: 25min
  > Count subarrays with sum = k
  - Hint: prefixSum[j] - prefixSum[i] = k
  - Use map to store prefix sum counts
  - Edge: negative numbers (can't use sliding window), zero subarrays
  - [ ] Solved | [ ] Without hints | [ ] Timed

- [ ] **Q9** | [Minimum Operations to Reduce X to Zero](https://leetcode.com/problems/minimum-operations-to-reduce-x-to-zero/) | Tags: `sliding-window`, `hashing` | Timed: 25min
  > Min operations using left/right ends to get sum = x
  - Hint: Equivalent to max subarray with sum = total - x
  - Edge: impossible, x > total
  - [ ] Solved | [ ] Without hints | [ ] Timed

- [ ] **Q10** | [Sum of Prefix Scores of Strings](https://leetcode.com/problems/sum-of-prefix-scores-of-strings/) | Tags: `trie` | Timed: 30min
  > For each string, sum of prefix frequencies across all strings
  - Build Trie with prefix count
  - O(total chars) solution
  - Edge: empty strings, single string
  - [ ] Solved | [ ] Without hints | [ ] Timed

- [ ] **Q11** | [Find All Anagrams in a String](https://leetcode.com/problems/find-all-anagrams-in-a-string/) | Tags: `sliding-window` | Timed: 20min
  > Find all start indices of p's anagrams in s
  - Fixed-size sliding window with 26-char count
  - Compare to Q8 in Strings (Minimum Window Substring)
  - Edge: p longer than s, no anagrams
  - [ ] Solved | [ ] Without hints | [ ] Timed

- [ ] **Q12** | [Top K Frequent Elements](https://leetcode.com/problems/top-k-frequent-elements/) | Tags: `heap`, `bucket-sort` | Timed: 20min
  > Return k most frequent elements
  - Approaches: heap O(n log k), bucket sort O(n)
  - Edge: k = n, all frequencies same
  - [ ] Solved | [ ] Without hints | [ ] Timed

#### Hard (Target: <40min)

- [ ] **Q13** | [Substring with Concatenation of All Words](https://leetcode.com/problems/substring-with-concatenation-of-all-words/) | Tags: `sliding-window` | Timed: 40min
  > Find all starting indices of substrings containing all words
  - Word-level sliding window
  - O(n * m) where m = word length
  - Edge: overlapping words, duplicate words in list
  - [ ] Solved | [ ] Without hints | [ ] Timed

### Exit Parameters (Problem Topic)
- [ ] Choose array vs set vs map instinctively
- [ ] Explain collision handling
- [ ] Distinguish amortized vs worst case
- [ ] Know when hashing gives O(n) vs O(n log n)
- [ ] **5 medium problems solved without hints**
- [ ] Time targets: Easy <15min, Medium <25min, Hard <40min

---

## System Design (2.x)

**Placeholder - Not Started**

### Topics to Cover
- [ ] 2.1 Fundamentals (Latency, Throughput, CAP, Caching)
- [ ] 2.2 Core Components (Load Balancer, DB, Cache, Queue)
- [ ] 2.3 Design Framework
- [ ] 2.4 Standard Problems (URL Shortener, Chat, etc.)
- [ ] 2.5 SDE-3 Depth (Multi-region, Failover, Observability)

### Current Focus: ___________

### Questions

#### Mini Design (Target: <30min)
- [ ] **Q1**: Design a rate limiter | Tags: `rate-limiting` | Status: ⬜
- [ ] **Q2**: Design a URL shortener | Tags: `url-shortener` | Status: ⬜
- [ ] **Q3**: Design a chat system | Tags: `chat-system` | Status: ⬜

#### Full Design (Target: <60min)
- [ ] **Q4**: Design Twitter Feed | Tags: `feed-system` | Status: ⬜
- [ ] **Q5**: Design Ride Sharing | Tags: `ride-sharing` | Status: ⬜

### Exit Parameters
- [ ] Follow design framework every time
- [ ] State assumptions explicitly
- [ ] Discuss tradeoffs
- [ ] Complete mini design in <30min

---

## Backend Engineering (3.x)

**Placeholder - Not Started**

### Topics to Cover
- [ ] 3.1 API Design (REST, versioning, idempotency)
- [ ] 3.2 Database (Schema, Indexing, Query optimization)
- [ ] 3.3 Real-World Depth (Partial failures, Race conditions)
- [ ] 3.4 Transformation Practice

### Current Focus: ___________

### Questions

- [ ] **Q1**: Optimize a slow query | Tags: `query-optimization` | Status: ⬜
- [ ] **Q2**: Add caching to an endpoint | Tags: `caching` | Status: ⬜
- [ ] **Q3**: Implement idempotency | Tags: `idempotency` | Status: ⬜

### Exit Parameters
- [ ] Think like production engineer
- [ ] Handle partial failures
- [ ] Add proper logging/metrics

---

## LLD (4.x)

**Placeholder - Not Started**

### Topics to Cover
- [ ] 4.1 SOLID Principles
- [ ] 4.2 Design Patterns
- [ ] 4.3 Practice Problems

### Questions

- [ ] **Q1**: Design a Parking Lot | Tags: `ood` | Status: ⬜
- [ ] **Q2**: Design a Library System | Tags: `ood` | Status: ⬜

---

## Pattern Tracking

| Pattern | Solved | Comfortable | Mastered |
|---------|--------|-------------|----------|
| prefix-sum | | | |
| two-pointers | | | |
| sliding-window | | | |
| binary-search | | | |
| hashing | | | |
| recursion-tree | | | |
| dynamic-programming | | | |
| in-place | | | |
| cycle-detection | | | |
| trie | | | |
| greedy | | | |
| simulation | | | |

**Mastery Levels:**
- ⬜ Not started
- 🟨 Attempted (1-3 problems)
- 🟩 Comfortable (4-6 problems, can explain)
- 🟦 Mastered (7+ problems, can derive)

---

## Topic Completion Checklist

Before moving topic to completed.md, verify:

### For Conceptual Topics
- [ ] All questions answered
- [ ] Can derive complexity from recurrence
- [ ] Can explain all complexity classes

### For Problem Topics
- [ ] 5 medium problems solved without hints
- [ ] Can explain brute vs optimized in <2 mins
- [ ] No edge case misses on last 3 problems
- [ ] Time/space complexity always stated

### Universal
- [ ] All parameters checklists completed
- [ ] Pattern added to tracking table
- [ ] Mistakes logged in completed.md

---

## Mistake Log (link to completed.md)

| Date | Topic | Problem | Mistake Type | What I Learned |
|------|-------|---------|--------------|----------------|
| | | | | |

---

## Random Problem Queue

When current topic is comfortable, pick random to mix:
- [ ] LeetCode "Explore" random medium
- [ ] Blind 75 problem
- [ ] NeetCode 150

---

## Weekly Goals

| Day | DSA | System Design | Backend |
|-----|-----|---------------|---------|
| Mon | | | |
| Tue | | | |
| Wed | | | |
| Thu | | | |
| Fri | | | |
| Sat | | | |
| Sun | Revision | | |

---

## Progress Summary

| Topic | Type | Done | Without Hints | Exit Criteria | Status |
|-------|------|------|---------------|---------------|--------|
| 1.1.1 Complexity | Conceptual | 0/12 | N/A | [ ] | 🔴 |
| 1.1.2 Arrays | Problems | 0/13 | 0 | [ ] | 🔴 |
| 1.1.3 Strings | Problems | 0/13 | 0 | [ ] | 🔴 |
| 1.1.4 Hashing | Problems | 0/13 | 0 | [ ] | 🔴 |
| 2.x System Design | - | 0/5 | - | [ ] | ⚪ |
| 3.x Backend | - | 0/3 | - | [ ] | ⚪ |

---
*Updated: 2026-04-08*
