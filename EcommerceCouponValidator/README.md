# Assignment 7: E-Commerce Coupon Validator

## 📌 Overview
The E-Commerce Coupon Validator models a promotional discount validation system for e-commerce checkouts. It demonstrates custom exception handling in Java by defining and throwing a user-defined checked exception (`InvalidCouponException`) when coupon conditions or minimum purchase requirements are not satisfied.

---

## 🎯 Concepts Covered
- **Custom Exceptions (`extends Exception`)**: Creating user-defined checked exception classes with custom error messages.
- **Exception Handling (`try-catch-finally`)**: Catching runtime coupon validation exceptions and ensuring clean execution flows with `finally` blocks.
- **Conditional Validation Logic**: Applying coupon discounts based on valid promotional codes (`SAVE10`, `SAVE20`, `SAVE30`) and order threshold limits.
- **Interactive Console Input**: Continuous user input processing via `java.util.Scanner` with graceful loop control.

---

## 🏷️ Coupon Rules & Discounts

| Coupon Code | Minimum Order Amount | Discount Percentage |
| :--- | :---: | :--- |
| **SAVE10** | ₹1000 | 10% off |
| **SAVE20** | ₹2000 | 20% off |
| **SAVE30** | ₹3000 | 30% off |

*Orders that do not meet the minimum amount or use an invalid coupon code throw an `InvalidCouponException`.*

## Output
<img width="415" height="214" alt="image" src="https://github.com/user-attachments/assets/693c5df6-06af-4969-b616-128da97bf665" />


---

## 💻 Code Structure
- **Package**: `NewAssignmnets.EcommerceCouponValidator`
- **Classes**:
  - `Ecommerce_coupon_validator`: Main driver class containing validation logic and user interface loop.
  - `InvalidCouponException extends Exception`: Static nested custom exception class.
- **Key Methods**:
  - `validate(double amount, String code)`: Validates order amount against coupon rules and displays discount details, or throws `InvalidCouponException`.

---

## 🚀 How to Compile & Run
From the root workspace directory:

```bash
# Compile
javac NewAssignmnets/EcommerceCouponValidator/Ecommerce_coupon_validator.java

# Run
java NewAssignmnets.EcommerceCouponValidator.Ecommerce_coupon_validator
```
