package JavaConstructors; 



class CarRental {
    
    private String customerName;
    private String carModel;
    private int rentalDays;
    private double dailyRate; 
    
    
    
    public CarRental() {
        this.customerName = "Default Customer";
        this.carModel = "Economy Car";
        this.rentalDays = 1;
        this.dailyRate = 50.00; 
        System.out.println("Default CarRental");
    }

    
    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;

        
        
        if (rentalDays > 0) {
            this.rentalDays = rentalDays;
        } else {
            this.rentalDays = 1; 
            System.out.println("Warning: Invalid rental days for " + customerName + ". Defaulting to 1 day.");
        }

       
        
        
        this.dailyRate = determineDailyRate(carModel);
        System.out.println("Parameterized CarRental object created for: " + customerName + " (" + carModel + ")");
    }

    public CarRental(CarRental otherRental) {
        this.customerName = otherRental.customerName;
        this.carModel = otherRental.carModel;
        this.rentalDays = otherRental.rentalDays;
        this.dailyRate = otherRental.dailyRate;
        System.out.println("Copy CarRental object created from: " + otherRental.customerName + "'s rental.");
    }

    
    private double determineDailyRate(String model) {
        if (model.equalsIgnoreCase("Luxury Car")) {
            return 150.00;
        } else if (model.equalsIgnoreCase("SUV")) {
            return 90.00;
        } else if (model.equalsIgnoreCase("Mid-size")) {
            return 70.00;
        } else {
            return 50.00; 
        }
    }

    public double calculateTotalCost() {
        return this.rentalDays * this.dailyRate;
    }

    public void displayDetails() {
    	
    	
        System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Daily Rate: $" + String.format("%.2f", dailyRate));
        System.out.println("Total Cost: $" + String.format("%.2f", calculateTotalCost()));
        
    }

    
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
        this.dailyRate = determineDailyRate(carModel); 
    }

    public void setRentalDays(int rentalDays) {
        if (rentalDays > 0) {
            this.rentalDays = rentalDays;
        } else {
            System.out.println("Error: Rental days must be a positive value. Not updated.");
        }
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCarModel() {
        return carModel;
    }

    public int getRentalDays() {
        return rentalDays;
    }

    public double getDailyRate() {
        return dailyRate;
    }
}

public class CarRentalSystem {
    public static void main(String[] args) {
       
        CarRental rental1 = new CarRental();
        rental1.displayDetails();

        
        
        CarRental rental2 = new CarRental("Sarah Connor", "Luxury Car", 7);
        rental2.displayDetails();

        CarRental rental3 = new CarRental("John Rambo", "SUV", 5);
        rental3.displayDetails();

        
        
        System.out.println("\n--- Creating a rental with invalid days (Parameterized constructor) ---");
        CarRental rental4 = new CarRental("Ellen Ripley", "Mid-size", -3);
        rental4.displayDetails();

        
        System.out.println("\n--- Creating a rental using the COPY constructor (copying Sarah Connor's rental) ---");
        CarRental rental5 = new CarRental(rental2);
        rental5.displayDetails();

        System.out.println("Modifying original rental (rental2 - Sarah Connor)...");
        rental2.setCustomerName("Sarah K. Connor");
        rental2.setRentalDays(10);
        rental2.setCarModel("Economy Car"); 

        System.out.println("\nDetails of Original Rental (rental2 after modification):");
        rental2.displayDetails();

        System.out.println("\nDetails of Copied Rental (rental5 should remain unchanged):");
        rental5.displayDetails(); 
    }
}
