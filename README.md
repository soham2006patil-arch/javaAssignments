# Java Assignments

A curated repository of Java Object-Oriented Programming (OOP) assignments and projects.

---

## 📁 Repository Structure

```
.
├── StudentProfile/
│   └── StudentProfileCalculator.java          # Student profile & basic arithmetic operations
├── FoodDeliveryRating/
│   └── foodDelivery_RatingAnalyzer.java       # Rating analyzer with method overloading & 2D arrays
├── StudentActivity/
│   └── StudentActivityManagementSystem.java   # Attendance & performance tracking system
├── StudentMarks/
│   └── StudentMarksManagementSystem.java      # 2D array marks analysis, searching & sorting
├── HotelBooking/
│   └── HotelRoomBookingSystem.java            # Room booking system with encapsulation & static tracking
├── VehicleRental/
│   └── VehicleRentalSystem.java               # Vehicle rental system with inheritance & polymorphism
├── EcommerceCouponValidator/
│   └── Ecommerce_coupon_validator.java        # E-commerce coupon validation with custom exception handling
├── SmartCabBooking/
│   ├── cab/booking/
│   │   ├── CabBooking.java                    # Packages, wrapper classes, inner class & StringBuilder
│   │   ├── CabType.java                       # Enum definition for cab types
│   │   └── BookingConfirmation.java           # Interface for anonymous class confirmation
│   └── Main.java                              # Driver class with user input & imports
└── StudentRecordFileManager/
    └── StudentRecordFileManager.java          # File class, FileInputStream, FileOutputStream & exception handling
```

---

## 🚀 Assignments Overview

### 1. Student Profile & Calculator (`StudentProfile`)
- Formatted student information output.
- Arithmetic operations (Addition, Subtraction, Multiplication, Division) with type casting.

### 2. Food Delivery Rating Analyzer (`FoodDeliveryRating`)
- Method overloading for 1D and 2D arrays.
- Calculation of total and average ratings for restaurants/delivery executives.

### 3. Student Activity Management System (`StudentActivity`)
- Menu-driven terminal application.
- Attendance eligibility check and performance category categorization.

### 4. Student Marks Management System (`StudentMarks`)
- 2D array representation for student marks across multiple subjects.
- Total, average, subject-wise highest scores, linear search, and bubble sort descending.

### 5. Hotel Room Booking System (`HotelBooking`)
- Object-oriented encapsulation with private members, getters/setters, and constructors (`this` keyword).
- Dynamic booking, billing with tax calculation, and static booking counter.

### 6. Vehicle Rental Management System (`VehicleRental`)
- Inheritance hierarchy: Parent class `Vehicle` extended by `Car`, `Bike`, `Scooter`, and `ElectricCar`.
- Subclass-specific properties (Seats, Engine Capacity, Storage, Battery Capacity).
- Dynamic rental calculations, input validation, and formatted receipt generation.

### 7. E-Commerce Coupon Validator (`EcommerceCouponValidator`)
- User-defined custom exception handling (`InvalidCouponException`).
- Validation of coupon codes (`SAVE10`, `SAVE20`, `SAVE30`) against minimum order amount thresholds.
- Exception propagation, error handling with `try-catch-finally`, and interactive console loop.

### 8. Smart Cab Booking System (`SmartCabBooking`)
- **Package & Imports**: Custom `cab.booking` package imported into the driver `Main` class.
- **Enums**: `CabType` (MINI, SEDAN, SUV).
- **Wrapper Classes**: `Integer` and `Double` with demonstrated Autoboxing and Unboxing.
- **Constants**: `final` variable for fixed booking fee.
- **String Manipulation**: `StringBuilder` for constructing booking summaries.
- **Nested Classes**: Inner class `PickupLocation` for passenger pickup address.
- **Anonymous Classes**: Dynamic `BookingConfirmation` implementation for confirmation messages.

### 9. Student Record File Manager (`StudentRecordFileManager`)
- **File Management**: `File` class methods (`mkdir()`, `exists()`, `createNewFile()`, `delete()`, `length()`, etc.).
- **Byte Stream Writing**: `FileOutputStream` writing byte arrays converted via `getBytes()`.
- **Byte Stream Reading**: `FileInputStream` reading byte-by-byte with `read()` until EOF (`-1`).
- **Append Mode**: Using `FileOutputStream(file, true)` for non-destructive record additions.
- **Exception Handling**: Comprehensive `try-catch-finally` handling for `IOException` and `SecurityException`.

---

## 🛠️ How to Compile & Run

Compile and run from the repository root:

```bash
# Compile and run Student Record File Manager
javac StudentRecordFileManager/StudentRecordFileManager.java
java StudentRecordFileManager.StudentRecordFileManager
```
