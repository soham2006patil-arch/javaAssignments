# Assignment 4: Student Marks Management System

## 📌 Overview
This system manages multi-subject academic records for students using 2D arrays. It implements comprehensive analytical capabilities, including total and average calculations, highest score detection, linear searching, and sorting via the Bubble Sort algorithm.

---

## 🎯 Concepts Covered
- **2-D Arrays (Matrices)**: Modeling 5 students across 3 subjects (`Java`, `Python`, `DBMS`).
- **1-D Arrays**: Accumulating and processing student totals.
- **Linear Search Algorithm**: Searching across the 2D mark matrix for a specific score and identifying which student and subject it belongs to.
- **Bubble Sort Algorithm**: Sorting total marks in descending order (highest to lowest) while preserving synchronized student name mappings.
- **Formatted Tabular Output**: Using `printf` with width specifiers (`%-12s`, `%-10d`) for clear table presentation.

---

## 💻 Code Structure
- **Class**: `StudentMarksManagementSystem`
- **Package**: `NewAssignmnets.StudentMarks`
- **Key Methods**:
  - `displayAllMarks(int[][] marks, String[] students, String[] subjects)`: Prints tabular mark matrix.
  - `calculateTotals(int[][] marks)`: Returns 1D array of totals for each student.
  - `displayStudentTotals(...)`: Displays total marks per student.
  - `displayStudentAverages(...)`: Calculates and displays average marks per student.
  - `displayHighestScores(...)`: Computes top scorers for each individual subject and overall.
  - `searchMark(int[][] marks, int target, ...)`: Linear search implementation.
  - `bubbleSortTotals(int[] totals, String[] students)`: Bubble sort descending ranking.

---

## 🖥️ Sample Menu
```text
===== Student Marks Management System =====
1. Display All Marks
2. Calculate Student Total
3. Calculate Student Average
4. Find Highest Scorer & Subject-Wise Highest
5. Search Marks (Linear Search)
6. Sort Student Totals (Bubble Sort)
7. Exit
Enter your choice (1-7): 
```

---

## 🚀 How to Compile & Run
From the root workspace directory:

```bash
# Compile
javac NewAssignmnets/StudentMarks/StudentMarksManagementSystem.java

# Run
java NewAssignmnets.StudentMarks.StudentMarksManagementSystem
```
