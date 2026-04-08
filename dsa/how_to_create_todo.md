# How to Create TODO.md

## Purpose
Create structured TODO files for systematic learning. Follows the pattern established for SDE-3 preparation.

**Default Language: Java**

---

## Core Structure

```markdown
# TODO.md - [Subject Name]

**Language: [Java/Python/etc.]**

## Current Focus: [Topic/Section]

---

## Session Log
| Date | Topic | Sub-topic | Questions | Timed | Score | Time Spent | Notes |
|------|-------|-----------|-----------|-------|-------|------------|-------|
| | | | | | | |

---

## Topic: [X.X - Name]

### Prerequisite Knowledge
- [ ] Item 1
- [ ] Item 2

### Questions

#### Easy
- [ ] **Q1** | [Problem Name](url) | Tags: `tag1`, `tag2` | Timed: Xmin
  > One-line problem summary
  - Brute force: O(n²) approach
  - Optimized: O(n) approach
  - Edge: empty, single, duplicates
  - [ ] Solved | [ ] Without hints | [ ] Timed

#### Medium
- [ ] **Q2** | ... (same structure)

#### Hard
- [ ] **Q3** | ... (same structure)

### Exit Parameters
- [ ] Parameter 1
- [ ] Parameter 2
- [ ] **Time target**: Easy <Xmin, Medium <Xmin, Hard <Xmin

---

## Pattern Tracking

| Pattern | Questions Solved | Mastery |
|---------|-----------------|---------|
| pattern-name | | ⬜ |

---

## Topic Completion Checklist

- [ ] All prerequisite knowledge items checked
- [ ] N medium problems solved without hints
- [ ] Can explain brute vs optimized in <2 mins
- [ ] No edge case misses on last 3 problems
- [ ] Time/space complexity always stated

---

## Progress Summary

| Topic | Done | Timed | Without Hints | Exit Criteria | Status |
|-------|------|-------|---------------|---------------|--------|
| Topic 1 | 0/N | 0 | 0 | [ ] | 🔴 |

---
*Updated: YYYY-MM-DD*
```

---

## Element Definitions

### 1. Session Log
Track every study session. Fields:
- **Date**: When you studied
- **Topic**: What section
- **Problems**: Count attempted/solved
- **Timed**: Was it timed practice?
- **Score**: How many without hints
- **Notes**: Quick reflection

### 2. Prerequisite Knowledge
What user must know BEFORE attempting questions.
- Keep to 3-5 items max
- Each should be verifiable (checkbox)
- Don't list things that are prerequisites for prerequisites

### 3. Questions Format
Each question needs:

| Field | Purpose |
|-------|---------|
| Name | Problem identifier |
| URL | Link to problem |
| Tags | Pattern classification |
| Timed | Time limit for practice |
| Summary | One-line what to solve |
| Brute force | Starting approach |
| Optimized | Target approach |
| Edge | Edge cases to handle |
| Checkboxes | Solved/Without hints/Timed |

### 4. Exit Parameters
What "done" looks like. Include:
- Speed targets (e.g., <2 min approach selection)
- Quality targets (no edge case bugs)
- Mastery indicators (N problems without hints)

### 5. Pattern Tracking
Visual table of pattern coverage:
- One row per pattern
- Solved count
- Mastery level (⬜/🟨/🟩)

### 6. Completion Checklist
Before moving topic to completed.md, verify all items.

---

## Question Difficulty Distribution

| Difficulty | Count | Time Target |
|------------|-------|------------|
| Easy | 5 | <10 min |
| Medium | 6 | <25 min |
| Hard | 2 | <40 min |

**Total: 13 questions per topic minimum**

---

## Topic Types

### Conceptual Topics
Topics that are theory-based, no coding required.

**Examples:** Complexity Analysis, CAP Theorem, SOLID Principles

**Structure:**
```markdown
## Topic: X.X - Name

**Type: Conceptual** - No coding, just analysis

### Prerequisite Knowledge
- [ ] Item 1
- [ ] Item 2

### Questions
- [ ] **Q1** | Tags: `tag` | Timed: Xmin
  > Question about concept
  - Hint: ...
  - Answer: ...
  - [ ] Answer: __________ | [ ] Without hints

### Exit Parameters (Conceptual Topic)
- [ ] Can explain concept
- [ ] Can apply concept to examples
- [ ] Q1-Q4 in <X mins total (timed)
```

**Exit Criteria for Conceptual:**
- All questions answered
- Can derive/explain from first principles
- Timed practice completed

---

### Problem Topics
Topics that require solving coding problems.

**Examples:** Arrays, Strings, Hashing, Trees, DP

**Structure:**
```markdown
## Topic: X.X - Name

**Type: Problems**

### Prerequisite Knowledge
- [ ] Item 1
- [ ] Item 2

### Questions

#### Easy (Target: <10min)
- [ ] **Q1** | [Problem Name](url) | Tags: `tag` | Timed: 10min
  > One-line summary
  - Brute force: O(n²) approach
  - Optimized: O(n) approach
  - Edge: empty, single, duplicates
  - [ ] Solved | [ ] Without hints | [ ] Timed

#### Medium (Target: <25min)
- [ ] **Q2** | ...

#### Hard (Target: <40min)
- [ ] **Q3** | ...

### Exit Parameters (Problem Topic)
- [ ] N medium problems solved without hints
- [ ] Can explain brute vs optimized in <2 mins
- [ ] No edge case misses on last 3 problems
- [ ] Time targets met
```

**Exit Criteria for Problems:**
- N medium problems solved without hints
- Pattern recognition in <2 min
- Edge case handling natural
- Time targets met

---

### Design Topics
Topics requiring system/LLD design.

**Structure:**
```markdown
## Topic: X.X - Design

### Questions

#### Mini Design (Target: <30min)
- [ ] **Q1**: Design X | Tags: `tag` | Status: ⬜

#### Full Design (Target: <60min)
- [ ] **Q2**: Design X | Tags: `tag` | Status: ⬜

### Exit Parameters
- [ ] Follow design framework
- [ ] State assumptions
- [ ] Discuss tradeoffs
```

---

## Template per Difficulty

### Easy Questions
- Direct application of concept
- 1-2 core techniques
- Common edge cases

### Medium Questions
- Requires optimization from brute force
- 2-3 techniques combined
- Non-obvious edge cases

### Hard Questions
- Multi-step reasoning
- Often 2+ patterns combined
- Requires derivation, not memorization

---

## Tags System

Use consistent tags across all topics:

### DSA Pattern Tags
| Tag | When to Use |
|-----|-------------|
| `prefix-sum` | Range queries, cumulative sums |
| `two-pointers` | Sorted arrays, palindrome, pair finding |
| `sliding-window` | Contiguous subarrays, "at most/k" |
| `binary-search` | Monotonic, answer space search |
| `hashing` | O(n) lookup, frequency counting |
| `dynamic-programming` | Overlapping subproblems, optimization |
| `recursion-tree` | Recurrence relations, divide & conquer |
| `greedy` | Local optimum = global optimum |
| `in-place` | Modify without extra space |
| `cycle-detection` | Linked list cycles, happy numbers |
| `trie` | Prefix problems, string matching |
| `heap` | Top-k, scheduling, median |
| `graph-traversal` | BFS, DFS on graphs |
| `backtracking` | Generate combinations, permutations |
| `bit-manipulation` | XOR, bitwise operations |

### System Design Tags
| Tag | When to Use |
|-----|-------------|
| `url-shortener` | Short URL design |
| `chat-system` | Real-time messaging |
| `feed-system` | Social media feeds |
| `rate-limiting` | Rate limiter design |
| `cache` | Caching strategies |
| `database` | DB selection/schema |

### Backend Tags
| Tag | When to Use |
|-----|-------------|
| `query-optimization` | SQL/query performance |
| `caching` | Redis/memcached |
| `idempotency` | Safe retries |
| `transactions` | ACID, distributed transactions |
| `api-design` | REST, versioning |

---

## When to Create New TODO.md

### Scenario 1: New Subject/Section
Copy structure, change topic names.

### Scenario 2: Topic Complete
1. Move to completed.md
2. Create new topic section in current TODO.md
3. Update progress summary

### Scenario 3: New Project/Learning Path
Start fresh TODO.md with new structure.

---

## completed.md Structure

```markdown
# completed.md - [Subject Name]

## Completed Topics

### [Topic Name]
| Field | Value |
|-------|-------|
| **Type** | Conceptual / Problems / Design |
| Completion Date | YYYY-MM-DD |
| Questions Solved | X/N |
| Without Hints | X |
| Avg Time | X min |

### Exit Criteria Met
- [ ] For Conceptual: All answered, can derive from first principles
- [ ] For Problems: N medium without hints, pattern recognition fast
- [ ] For Design: Framework followed, tradeoffs discussed

---

## Pattern Mastery Log

| Pattern | First Solved | Total Solved | Comfortable | Mastered |
|---------|--------------|--------------|-------------|----------|
| name | YYYY-MM-DD | X | [ ] | [ ] |

**Mastery Levels:**
| Level | Criteria |
|-------|----------|
| 🟨 Comfortable | Solved 3-4 problems, can explain when asked |
| 🟩 Proficient | Solved 5-6 problems, recognize pattern quickly |
| 🟦 Mastered | Solved 7+ problems, can derive, teach others |

---

## Statistics

| Metric | Count |
|--------|-------|
| Total Problems Solved | X |
| Easy | X |
| Medium | X |
| Hard | X |
| Without Hints | X |
| Timed Sessions | X |
| System Designs | X |
| Backend Improvements | X |

---

## Mistake Log

| Date | Topic | Problem | Mistake Type | Details | Prevention |
|------|-------|---------|--------------|---------|------------|
| YYYY-MM-DD | topic | name | edge_case | forgot empty | check empty first |

**Mistake Types:**
- `pattern_missed`
- `wrong_assumption`
- `edge_case`
- `time_exceeded`
- `implementation`
- `complexity`

---

## Reflection Notes

### What patterns am I weakest at?
-

### What edge cases do I keep missing?
-

### What should I focus on next?
-

---

*File created: YYYY-MM-DD*
*Last updated: YYYY-MM-DD*
```

---

## Principles

1. **Granularity**: 10+ questions per topic, split by difficulty
2. **Topic Types**: Distinguish Conceptual (theory) vs Problems (coding) vs Design
3. **Verification**: Every item has a checkbox
4. **Tracking**: Session log, pattern tracking, mistake log
5. **Context**: Include problem summaries, don't require clicking links
6. **Hints**: Provide hints inline (hidden or explicit)
7. **Time**: Timed practice flagged explicitly per question
8. **Mastery**: "Without hints" flag measures true understanding
9. **Progression**: Clear exit criteria per topic type before moving on
10. **Reflection**: Mistake log + reflection section for meta-learning
11. **Portability**: Self-contained, survives terminal close
12. **Coverage**: Include System Design and Backend sections

---

## Workflow

### Daily
1. Check TODO.md for current topic (note type: conceptual/problem/design)
2. Warmup: Quick problem or review (<10min)
3. Practice: Medium problem from current topic (20-25min, timed)
4. System Design OR Backend (15-30min)
5. Update session log
6. Log mistakes in completed.md
7. Reflection: What patterns am I weak at?

### Weekly
1. Review mistake log
2. Identify weak patterns
3. Schedule mock interview if needed
4. Refactor 2 old solutions

### Topic Completion (Conceptual)
1. All questions answered
2. Can derive from first principles
3. Timed practice completed within target

### Topic Completion (Problems)
1. Verify exit parameters (N medium without hints)
2. Pattern tracked in mastery log
3. Move topic stats to completed.md
4. Add new topic to TODO.md
5. Update progress summary

### Topic Completion (Design)
1. Follow design framework
2. State assumptions + tradeoffs
3. Complete within time target

---

*Document created: 2026-04-08*
