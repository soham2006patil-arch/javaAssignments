# Assignment 2: Food Delivery Rating Analyzer

## 📌 Overview
The Food Delivery Rating Analyzer models a rating analysis engine for food delivery platforms. It demonstrates method overloading and multi-dimensional array processing to compute total and average customer ratings across multiple restaurants or delivery executives.

---

## 🎯 Concepts Covered
- **Method Overloading**: Defining multiple methods with the same name (`calcTotal`, `calcAvg`) but different parameter signatures (1D array vs. 2D array with index).
- **1-D & 2-D Arrays**: Processing linear collections of ratings and tabular matrix rating datasets.
- **Array Traversal**: Iterating over elements using `for` loops.
- **Statistical Calculations**: Summation, counts, and average computations with floating-point precision.

---

## 💻 Code Structure
- **Class**: `foodDelivery_RatingAnalyzer`
- **Package**: `NewAssignmnets.FoodDeliveryRating`
- **Key Methods**:
  - `calcTotal(int[] arr)`: Calculates total rating for a 1-D array.
  - `calcTotal(int[][] arr, int row)`: Overloaded method to calculate total rating for a specific row in a 2-D array.
  - `calcAvg(int sum, int count)`: Calculates average rating.
  - `calcAvg(int[] arr)`: Overloaded method to calculate average rating from a 1-D array directly.
  - `calcAvg(int[][] arr, int row)`: Overloaded method to calculate average rating for a row in a 2-D array.

---

## 🚀 How to Compile & Run
From the root workspace directory:

```bash
# Compile
javac NewAssignmnets/FoodDeliveryRating/foodDelivery_RatingAnalyzer.java

# Run
java NewAssignmnets.FoodDeliveryRating.foodDelivery_RatingAnalyzer
```
