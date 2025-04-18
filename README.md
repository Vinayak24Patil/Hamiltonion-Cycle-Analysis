# 🔁 Hamiltonian Cycle Analysis and Algorithm in Java

This project explores the **Hamiltonian Cycle problem**, a classic NP-complete problem in graph theory, using a **Java-based backtracking approach**.

> ✅ A Hamiltonian Cycle is a closed-loop on a graph where every vertex is visited exactly once before returning to the starting point.

---

## 📌 Project Overview

- Implements a **backtracking algorithm** to detect Hamiltonian cycles.
- Suitable for **small graphs (≤20 vertices)** due to factorial time complexity.
- Includes **graph input**, **safe vertex selection**, and **path tracing**.
- Demonstrates the fundamentals of **exhaustive search** and **NP-complete problems**.

---

## 💡 Applications

- Traveling Salesman Problem (TSP)
- Routing & Logistics
- Circuit Board Design
- Genome Sequencing

---

## 🧠 Algorithm Details

### Core Steps:
1. Start from vertex `0`.
2. Recursively add adjacent, unvisited vertices to the path.
3. Check if the last vertex connects back to the first.
4. If successful, a **Hamiltonian cycle** is found.

### Time Complexity:
- **Worst Case:** `O(N!)`
- **Space Complexity:** `O(N)` for storing the path

---

## 🛠 How to Run

### 🔧 Prerequisites
- Java JDK 8 or higher
- Any Java IDE (e.g., IntelliJ, Eclipse) or terminal with `javac`

### 🚀 Compile and Run
```bash
javac HamiltonianCycle.java
java HamiltonianCycle
