# Assignment 5: Hotel Room Booking System

## 📌 Overview
The Hotel Room Booking System demonstrates Object-Oriented Programming (OOP) principles in Java, focusing on encapsulation, data hiding, parameterized constructors, object reference manipulation, and static tracking.

---

## 🎯 Concepts Covered
- **Encapsulation & Access Modifiers**: Data members are declared `private` and accessed via `public` getters and setters.
- **Constructors & `this` Keyword**: Parameterized constructor disambiguating instance variables from method arguments.
- **Static Members**: `totalBookings` static variable tracking cumulative room reservations across the hotel.
- **Business Logic**: Booking verification (preventing double-booking), total billing calculations, and formatted receipt generation.

---

## 💻 Code Structure
- **Package**: `NewAssignmnets.HotelBooking`
- **Classes**:
  - `Room`: Encapsulated room model (`roomNumber`, `roomType`, `customerName`, `numberOfDays`, `pricePerDay`, `isBooked`, `totalBookings`).
    - `bookRoom(customerName, numberOfDays)`: Books an available room and increments static booking counter.
    - `calculateBill()`: Computes total room charges.
    - `displayDetails()`: Displays room info and status.
  - `HotelRoomBookingSystem`: Main driver class providing an interactive menu interface.

---

## 🖥️ Sample Menu
```text
===== Hotel Room Booking System =====
1. View All Rooms
2. Book a Room
3. View Booking Details & Generate Bill
4. Check Total Bookings Count
5. Exit
```

---

## 🚀 How to Compile & Run
From the root workspace directory:

```bash
# Compile
javac NewAssignmnets/HotelBooking/HotelRoomBookingSystem.java

# Run
java NewAssignmnets.HotelBooking.HotelRoomBookingSystem
```
