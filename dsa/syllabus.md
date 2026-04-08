# SDE-3 Preparation Syllabus (Execution-Driven)

---

## 0. Operating System (How to Study)

**Daily Loop (2–3 hrs)**

* DSA: 1 pattern + 1 random (one timed)
* System Design: 1 concept OR mini design (15–30 mins)
* Backend Depth: improve 1 real API/component
* Reflection: log mistakes (10 mins)

**Weekly**

* 1 DSA mock (45 mins)
* 1 System Design mock (45–60 mins)
* 1 Code review session (refactor old solutions)
* 1 Revision day

**Rules**

* Java only
* No solution-copying; derive → implement → review
* Speak out loud during timed practice

---

## 1. DSA (Problem Solving)

### 1.1 Foundations

**Topics**: Complexity, Arrays, Strings, Hashing

**Goal**

* Distinguish brute vs optimized; pick approach in <2 mins

**Approach**

* brute → identify bottleneck → optimize → map to pattern

**Exit Criteria**

* 5 medium problems without hints

**Pitfalls**

* Ignoring edge cases; premature optimization

---

### 1.2 Core Patterns (Train + Detect)

For each pattern: learn → 5 problems (E→M→H) → 2 random applications

#### Sliding Window

* **Signals**: contiguous subarray/substring, "at most/at least k"
* **Exit**: 4 mediums in <25 mins

#### Two Pointers

* **Signals**: sorted array, pair sums, in-place ops

#### Binary Search

* **Signals**: monotonic condition, answer space search

#### Prefix Sum

* **Signals**: range queries, subarray sum/count

#### Stack / Monotonic Stack

* **Signals**: next greater/smaller, spans, histogram

#### Heap / Priority Queue

* **Signals**: top-k, streaming, scheduling

---

### 1.3 Data Structures (Implement + Use)

**Topics**

* Linked List, Trees (DFS/BFS), BST
* Graphs (BFS/DFS, shortest path basics)
* Trie, Union-Find (DSU)

**Goal**

* Write DFS/BFS templates from memory

**Exit Criteria**

* Implement + solve 3 problems per DS without reference

---

### 1.4 Advanced

**Topics**

* Dynamic Programming (state/transition)
* Greedy
* Backtracking
* Bit Manipulation

**Goal**

* Derive DP state yourself (not memorize)

**Exit Criteria**

* 3 DP mediums + 1 hard with clear state definition

---

### 1.5 Hard Problem Strategy (MANDATORY)

1. Brute force
2. Identify bottleneck
3. Optimize step-by-step
4. Map to pattern
5. Re-solve without looking

---

### 1.6 Time Pressure Training

* 3x/week: 1 problem, 30 mins strict, think aloud

---

### 1.7 Mistake Log (Maintain Daily)

* pattern_missed
* wrong_assumption
* edge_case_missed
* time_exceeded
* improvement_note

---

## 2. System Design

### 2.1 Fundamentals (Applied)

* Latency vs Throughput
* CAP, consistency models
* Caching basics

**Goal**

* Explain where each concept applies in real systems

---

### 2.2 Core Components (Deep)

* Load balancer
* Databases (SQL vs NoSQL)
* Indexing
* Cache (Redis)
* Queue (Kafka)
* Rate limiting

**Goal**

* Choose component with clear reasoning (WHY/WHEN)

---

### 2.3 Design Framework (Use Every Time)

1. Requirements (functional + non-functional)
2. Scale estimation (users, QPS, storage)
3. High-level design
4. DB choice (with reasoning)
5. Bottlenecks
6. Failure handling
7. Tradeoffs

**Exit Criteria**

* Complete design in 45 mins with tradeoffs

---

### 2.4 Standard Problems

* URL shortener
* Chat system
* Notification system
* Ride-sharing system
* Feed system

---

### 2.5 SDE-3 Depth

* Multi-region systems
* Failover strategies
* Observability (logs, metrics, tracing)
* Backpressure handling

---

## 3. Backend Engineering (Primary Strength)

### 3.1 API Design

* REST, versioning, idempotency

### 3.2 Database

* Schema design
* Indexing strategies
* Query optimization
* Transactions

### 3.3 Real-World Depth (CRITICAL)

* Idempotency keys
* Partial failures
* Race conditions
* Data consistency issues

---

### 3.4 Transformation Practice (Use on Real APIs)

Day 1: Optimize query
Day 2: Add caching
Day 3: Add retry logic
Day 4: Handle failure
Day 5: Add logging + metrics

**Goal**

* Think like production engineer, not problem solver

---

## 4. Low Level Design (LLD)

### 4.1 Principles

* SOLID (practical usage)
* Clean code

### 4.2 Patterns (Use-case driven)

* Factory
* Strategy
* Observer
* Singleton (when NOT to use)

### 4.3 Practice

* Rate limiter
* Parking system
* Library system

**Exit Criteria**

* Design + explain tradeoffs + extensibility

---

## 5. Code Quality & Review

**Checklist (use weekly)**

* Readability (naming, clarity)
* Modularity (functions, separation)
* Reusability
* Edge cases
* Time/space complexity

**Task**

* Refactor 2 old solutions/week

---

## 6. Interview Simulation

### 6.1 DSA Mock

* 45 mins
* 1 medium/hard
* Explain thinking

### 6.2 System Design Mock

* 45–60 mins
* Follow full framework

### 6.3 Behavioral

Prepare stories for:

* Scaling a system
* Fixing production bug
* Performance improvement

---

## 7. Projects (Interview Weapon)

### Primary: Code Tutor

**Upgrades**

* Add caching
* Add async queue
* Add logging & monitoring
* Add rate limiting

**Goal**

* Demonstrate real system thinking in interviews

---

## 8. Execution Plan

**Daily**

* 2 DSA
* 1 system design concept
* 1 backend improvement

**Weekly**

* 1 mock interview
* 1 system design session
* 1 code review

---

## 9. Success Criteria (SDE-3 Ready)

* Medium in ~20 mins
* Hard with structured approach
* Clear system design with tradeoffs
* Clean, production-level code
* Strong debugging and edge case handling

---
