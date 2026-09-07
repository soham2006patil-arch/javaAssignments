# Assignment 3: Student Activity Management System

## 📌 Overview
The Student Activity Management System is an interactive, menu-driven command-line application that allows students/administrators to check attendance eligibility criteria for examinations and determine academic performance categories.

---

## 🎯 Concepts Covered
- **Control Flow Statements**: Conditional branching with `if-else` and `switch-case`.
- **Looping Constructs**: Continuous menu interaction using `while (isRunning)` loops.
- **Console Input Handling**: Safe user input parsing and validation using `java.util.Scanner`.
- **Threshold & Range Logic**: Evaluating percentage ranges for grading categories (Distinction, First Class, Second Class, Pass, Fail).

---

## 💻 Code Structure
- **Class**: `StudentActivityManagementSystem`
- **Package**: `NewAssignmnets.StudentActivity`
- **Menu Features**:
  1. **Check Attendance Eligibility**: Evaluates whether total attendance percentage satisfies the minimum 75% threshold required to appear for exams.
  2. **View Performance Category**: Categorizes marks percentage into academic tiers (e.g., Distinction >= 75%, First Class >= 60%, etc.).
  3. **Exit**: Gracefully exits the application loop.

---

## 🖥️ Sample Menu
```text
===== Student Activity Management System =====
1. Check Attendance Eligibility
2. View Performance Category
3. Exit
Enter your choice (1-3): 
```

---

## 🚀 How to Compile & Run
From the root workspace directory:

```bash
# Compile
javac NewAssignmnets/StudentActivity/StudentActivityManagementSystem.java

# Run
java NewAssignmnets.StudentActivity.StudentActivityManagementSystem
```
