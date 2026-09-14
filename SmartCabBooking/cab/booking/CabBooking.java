package cab.booking;

/**
 * Main booking class representing a cab booking in the Smart Cab Booking System.
 * Belongs to the user-defined package 'cab.booking'.
 */
public class CabBooking {
    // Wrapper Classes used instead of primitive types
    private Integer passengerId;     // Wrapper Class: Integer
    private String passengerName;
    private CabType cabType;          // Enum: CabType (MINI, SEDAN, SUV)
    private Double baseFare;          // Wrapper Class: Double
    private Double finalFare;         // Wrapper Class: Double
    
    // Final variable for booking fee (cannot be changed after initialization)
    private final Double bookingFee;  // Wrapper Class: Double + final

    // Inner Class instance to store pickup location
    private PickupLocation pickupLocation;

    /**
     * Inner Class: PickupLocation
     * Nested inside the main booking class to store and display the passenger's pickup location.
     */
    public class PickupLocation {
        private String locationName;

        public PickupLocation(String locationName) {
            this.locationName = locationName;
        }

        public String getLocationName() {
            return this.locationName;
        }

        public void setLocationName(String locationName) {
            this.locationName = locationName;
        }

        public void displayLocation() {
            System.out.println("Pickup Location: " + locationName);
        }
    }

    /**
     * Parameterized Constructor
     * Demonstrates Autoboxing and Unboxing with Wrapper Classes.
     *
     * @param passengerIdPrimitive primitive int demonstrating Autoboxing to Integer
     * @param passengerName        passenger name
     * @param cabType              cab type enum
     * @param baseFarePrimitive    primitive double demonstrating Autoboxing to Double
     * @param bookingFeeValue      booking fee (assigned to final wrapper Double)
     * @param location             pickup location string
     */
    public CabBooking(int passengerIdPrimitive, String passengerName, CabType cabType, double baseFarePrimitive, double bookingFeeValue, String location) {
        // --- 1. Demonstrating AUTOBOXING ---
        // Primitive int and double values are automatically converted to their corresponding Wrapper objects (Integer, Double)
        this.passengerId = passengerIdPrimitive;  // Autoboxing: int -> Integer
        this.passengerName = passengerName;
        this.cabType = cabType;
        this.baseFare = baseFarePrimitive;        // Autoboxing: double -> Double
        
        // Initializing final variable
        this.bookingFee = bookingFeeValue;        // Autoboxing: double -> Double

        // --- 2. Demonstrating UNBOXING ---
        // Wrapper Double objects (baseFare, bookingFee) are unboxed to primitive double in arithmetic context
        double primitiveBase = this.baseFare;      // Explicit Unboxing: Double -> double
        double primitiveFee = this.bookingFee;     // Explicit Unboxing: Double -> double
        double calculatedTotal = primitiveBase + primitiveFee; // Arithmetic with unboxed primitives
        
        // Autoboxing the result back into Wrapper Double
        this.finalFare = calculatedTotal;          // Autoboxing: double -> Double

        // Initializing Inner Class instance
        this.pickupLocation = new PickupLocation(location);
    }

    // Getters and Setters
    public Integer getPassengerId() {
        return passengerId;
    }

    public void setPassengerId(Integer passengerId) {
        this.passengerId = passengerId;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }

    public CabType getCabType() {
        return cabType;
    }

    public void setCabType(CabType cabType) {
        this.cabType = cabType;
    }

    public Double getBaseFare() {
        return baseFare;
    }

    public void setBaseFare(Double baseFare) {
        this.baseFare = baseFare;
    }

    public Double getBookingFee() {
        return bookingFee;
    }

    public Double getFinalFare() {
        return finalFare;
    }

    public PickupLocation getPickupLocation() {
        return pickupLocation;
    }

    public void setPickupLocation(PickupLocation pickupLocation) {
        this.pickupLocation = pickupLocation;
    }

    /**
     * Helper to format currency cleanly (e.g., ₹500 if integer, ₹500.50 if decimal).
     */
    private String formatCurrency(Double amount) {
        if (amount == null) return "₹0";
        // Unboxing Double to double for comparison
        double val = amount;
        if (val == Math.floor(val)) {
            return String.format("₹%.0f", val);
        } else {
            return String.format("₹%.2f", val);
        }
    }

    /**
     * Constructs and returns the complete booking summary using StringBuilder.
     * Avoids String concatenation with '+' as per requirement.
     *
     * @return Formatted booking summary String
     */
    public String generateBookingSummary() {
        StringBuilder summaryBuilder = new StringBuilder();
        
        summaryBuilder.append("===== Smart Cab Booking System =====\n")
                      .append("Passenger Name: ").append(passengerName).append("\n")
                      .append("Cab Type: ").append(cabType).append("\n")
                      .append("Base Fare: ").append(formatCurrency(baseFare)).append("\n")
                      .append("Booking Fee: ").append(formatCurrency(bookingFee)).append("\n")
                      .append("Final Fare: ").append(formatCurrency(finalFare)).append("\n")
                      .append("Pickup Location: ").append(pickupLocation.getLocationName());
        
        return summaryBuilder.toString();
    }

    /**
     * Confirms the booking using the provided BookingConfirmation interface.
     *
     * @param confirmation implementation (typically an Anonymous Inner Class)
     */
    public void processConfirmation(BookingConfirmation confirmation) {
        if (confirmation != null) {
            confirmation.displayConfirmation();
        }
    }
}
