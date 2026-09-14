# Assignment 8: Smart Cab Booking System

## 📌 Overview
The **Smart Cab Booking System** is a Java application designed to demonstrate Unit 4 concepts: **Packages & Advanced OOP Concepts**. It illustrates how to structure user-defined packages, work with wrapper classes, leverage Java enums, utilize inner classes and anonymous classes, apply final variables, and build formatted text with `StringBuilder`.

---

## 🎯 Key Concepts Implemented

### 1. User-Defined Package & Import
- Package name: `cab.booking`
- Houses:
  - `CabBooking.java`: The core booking business logic and inner class.
  - `CabType.java`: Enum definition for cab categories.
  - `BookingConfirmation.java`: Interface for booking confirmation.
- The driver class `Main.java` resides in the root of the project and uses `import cab.booking.*` to access these classes.

### 2. Enum: `CabType`
- Represents predefined cab types: `MINI`, `SEDAN`, `SUV`.
- Provides type safety when selecting cab models.

### 3. Wrapper Classes & Autoboxing / Unboxing
- Replaced primitive types with `Integer` (for passenger ID) and `Double` (for base fare, booking fee, and final fare).
- **Autoboxing**: Assigning primitive `double` and `int` values directly to wrapper references (`Integer passengerId = id;`, `this.baseFare = baseFarePrimitive;`).
- **Unboxing**: Extracting primitive values from wrapper objects to perform arithmetic calculation (`double primitiveBase = this.baseFare; double calculatedTotal = primitiveBase + primitiveFee;`).

### 4. `final` Variable for Booking Fee
- A fixed booking fee is declared as a `final` variable to prevent modification after initialization and is added to the base fare to compute the final fare.

### 5. `StringBuilder` for Summary Construction
- Constructs the formatted booking summary efficiently without string concatenation (`+`).

### 6. Inner Class: `PickupLocation`
- Defined inside `CabBooking` to encapsulate and display the passenger's pickup location (`booking.new PickupLocation(...)` / inner member).

### 7. Anonymous Inner Class: Confirmation Message
- Implements the `BookingConfirmation` interface anonymously at runtime to print `"Booking confirmed successfully."`.

---

## 📁 Project Structure

```
SmartCabBooking/
├── cab/
│   └── booking/
│       ├── BookingConfirmation.java  # Confirmation interface for anonymous class
│       ├── CabBooking.java           # Core booking logic & inner class PickupLocation
│       └── CabType.java              # Enum for cab types (MINI, SEDAN, SUV)
├── Main.java                         # Driver class handling user input & execution
└── README.md                         # Assignment documentation
```

---

## 🚀 How to Compile & Run

### 1. Compile
From the `SmartCabBooking` directory:
```bash
javac cab/booking/*.java Main.java
```

### 2. Run
```bash
java Main
```

---

## 📋 Sample Input & Output

### Input
```
Enter Passenger Name: Apeksha
Enter Cab Type (MINI / SEDAN / SUV): SEDAN
Enter Base Fare (₹): 500
Enter Pickup Location: Mumbai
```

### Expected Output
```
===== Smart Cab Booking System =====
Passenger Name: Apeksha
Cab Type: SEDAN
Base Fare: ₹500
Booking Fee: ₹50
Final Fare: ₹550
Pickup Location: Mumbai
Booking confirmed successfully.
```
