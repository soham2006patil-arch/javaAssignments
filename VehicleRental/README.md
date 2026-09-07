# Assignment 6: Vehicle Rental Management System

## 📌 Overview
The Vehicle Rental Management System implements an inheritance hierarchy in Java. A generalized `Vehicle` parent class is extended by specialized subclasses (`Car`, `Bike`, `Scooter`, and `ElectricCar`), each incorporating unique attributes, customized rates, and overridden display logic.

---

## 🎯 Concepts Covered
- **Inheritance (`extends`)**: Factoring common attributes and behaviors into a parent class (`Vehicle`) and deriving specialized child classes.
- **Constructor Chaining (`super`)**: Passing common state up to the parent constructor while initializing subclass-specific fields with `this`.
- **Method Overriding (`@Override`)**: Overriding `displayDetails()` in subclasses to append unique properties while reusing parent presentation via `super.displayDetails()`.
- **Polymorphic Reference Handling**: Storing active rentals as a `Vehicle` superclass reference while dynamically executing subclass behaviors at runtime.

---

## 🚘 Vehicle Hierarchy & Rates

| Vehicle Type | Rate Per Day | Unique Property |
| :--- | :---: | :--- |
| **Car** | ₹1500 | `numberOfSeats` (e.g. 5 seats) |
| **Bike** | ₹700 | `engineCapacity` (e.g. 150 cc) |
| **Scooter** | ₹500 | `storageCapacity` (e.g. 22 Liters) |
| **ElectricCar** *(Additional Task)* | ₹2000 | `batteryCapacity` (e.g. 40.5 kWh) |

---

## 💻 Code Structure
- **Package**: `NewAssignmnets.VehicleRental`
- **Classes**:
  - `Vehicle` *(Parent)*: Common fields (`vehicleNumber`, `vehicleModel`, `customerName`, `rentalDays`, `ratePerDay`, `vehicleType`), calculation formula (`rentalDays * ratePerDay`), and receipt formatting.
  - `Car extends Vehicle`: Adds `numberOfSeats`.
  - `Bike extends Vehicle`: Adds `engineCapacity`.
  - `Scooter extends Vehicle`: Adds `storageCapacity`.
  - `ElectricCar extends Vehicle`: Adds `batteryCapacity`.
  - `VehicleRentalSystem`: Main class with interactive menu loop and input validation.

---

## 🖥️ Sample Receipt Output
```text
===== Vehicle Rental Receipt =====
Vehicle Type   : Car
Vehicle Number : MH12AB1234
Model          : Honda City
Customer Name  : Priya
Rental Days    : 4
Rate Per Day   : ₹1500
Number of Seats: 5
Total Amount   : ₹6000
Vehicle rented successfully.
```

---

## 🚀 How to Compile & Run
From the root workspace directory:

```bash
# Compile
javac NewAssignmnets/VehicleRental/VehicleRentalSystem.java

# Run
java NewAssignmnets.VehicleRental.VehicleRentalSystem
```
