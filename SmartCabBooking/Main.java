import cab.booking.CabBooking;
import cab.booking.CabType;
import cab.booking.BookingConfirmation;
import java.util.Scanner;

/**
 * Driver class for the Smart Cab Booking System.
 * Demonstrates:
 * 1. Package & Import usage (cab.booking)
 * 2. Enums (CabType)
 * 3. Wrapper Classes & Autoboxing / Unboxing
 * 4. Final variable for booking fee
 * 5. StringBuilder for booking summary
 * 6. Inner Class for pickup location
 * 7. Anonymous Class for confirmation message
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Constant: Final variable for booking fee (cannot be changed)
        final double BOOKING_FEE = 50.0;

        System.out.println("========================================");
        System.out.println("   Welcome to Smart Cab Booking System  ");
        System.out.println("========================================");

        // 1. Accept Passenger Name
        System.out.print("Enter Passenger Name: ");
        String name = scanner.nextLine().trim();

        // 2. Accept Cab Type (MINI, SEDAN, SUV)
        CabType selectedCabType = null;
        while (selectedCabType == null) {
            System.out.print("Enter Cab Type (MINI / SEDAN / SUV): ");
            String cabInput = scanner.nextLine().trim().toUpperCase();
            try {
                selectedCabType = CabType.valueOf(cabInput);
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid cab type! Please choose from MINI, SEDAN, or SUV.");
            }
        }

        // 3. Accept Base Fare
        double baseFareInput = 0.0;
        while (true) {
            System.out.print("Enter Base Fare (₹): ");
            String fareStr = scanner.nextLine().trim();
            try {
                baseFareInput = Double.parseDouble(fareStr);
                if (baseFareInput < 0) {
                    System.out.println("Fare cannot be negative. Please enter a valid amount.");
                    continue;
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid fare input! Please enter a numerical value.");
            }
        }

        // 4. Accept Pickup Location
        System.out.print("Enter Pickup Location: ");
        String location = scanner.nextLine().trim();
        if (location.isEmpty()) {
            location = "Mumbai"; // Default fallback if empty
        }

        // Generate Passenger ID (Demonstrating Autoboxing primitive int -> Integer wrapper)
        int primitiveId = 101;
        Integer passengerId = primitiveId; // Autoboxing

        // Create CabBooking instance from the imported package
        CabBooking booking = new CabBooking(
            passengerId,       // Unboxing Integer -> int passed to constructor
            name,
            selectedCabType,
            baseFareInput,
            BOOKING_FEE,
            location
        );

        System.out.println();
        // 5. Generate and display the booking summary constructed with StringBuilder
        String summary = booking.generateBookingSummary();
        System.out.println(summary);

        // 6. Use an Anonymous Class to display the confirmation message
        BookingConfirmation confirmation = new BookingConfirmation() {
            @Override
            public void displayConfirmation() {
                System.out.println("Booking confirmed successfully.");
            }
        };

        // Trigger confirmation via the anonymous inner class
        booking.processConfirmation(confirmation);

        scanner.close();
    }
}
