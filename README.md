# 🧩 LeetCode 141 - Linked List Cycle

## 📘 Problem Statement

Given the `head` of a linked list, determine if the linked list has a **cycle** in it.

A linked list has a cycle if there is some node in the list that can be reached again by continuously following the `next` pointer. 

Return `true` if there is a cycle in the linked list. Otherwise, return `false`.

---

## 📝 Example

### Example 1:
```

Input: head = \[3,2,0,-4], pos = 1
Output: true
Explanation: There is a cycle in the linked list where the tail connects to the 1st node (0-indexed).

```

### Example 2:
```

Input: head = \[1,2], pos = 0
Output: true
Explanation: Tail connects to head.

```

### Example 3:
```

Input: head = \[1], pos = -1
Output: false
Explanation: The linked list has no cycle.

````

---

## 🔍 Constraints

- The number of nodes in the list is in the range `[0, 10^4]`.
- `-10^5 <= Node.val <= 10^5`
- `pos` is `-1` if there is no cycle. Otherwise, it's the index of the node where the tail connects.

---

## 🚀 Approach

### ✅ Floyd’s Cycle Detection Algorithm (Tortoise and Hare)
- Use two pointers:
  - `slow`: moves one step at a time.
  - `fast`: moves two steps at a time.
- If there's a cycle, `slow` and `fast` will eventually meet.
- If `fast` or `fast.next` becomes `null`, the list has no cycle.

---


## 🧠 Complexity Analysis

* **Time Complexity:** `O(n)` – Each node is visited at most twice.
* **Space Complexity:** `O(1)` – No extra space used (constant memory).

---

## 📚 Related Topics

* Linked List
* Two Pointers
* Hashing (Alternate approach: using `set()` to track visited nodes)

---

## 🔁 Alternate Approach (HashSet)
> ⚠️ This uses `O(n)` space.

---

## 🔗 LeetCode Link

[LeetCode Problem 141 – Linked List Cycle](https://leetcode.com/problems/linked-list-cycle/)

