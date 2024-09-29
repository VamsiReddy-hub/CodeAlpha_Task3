import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // User details
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your email: ");
        String email = scanner.nextLine();
        User user = new User(name, email);
        
        // User preferences
        System.out.println("\nEnter your preferences:");
        System.out.print("Preferred mode of transportation (Car, Train, Plane): ");
        String transportationMode = scanner.nextLine();
        System.out.print("Preferred accommodation type (Hotel, Airbnb, Hostel): ");
        String accommodationType = scanner.nextLine();
        Preference preference = new Preference(transportationMode, accommodationType);
        
        // Budget settings (simplified costs)
        Budget budget = new Budget(100.0, 50.0);  // Accommodation: $100/night, Transportation: $50/destination
        
        // Create itinerary
        Itinerary itinerary = new Itinerary(user, preference, budget);
        
        // Add destinations
        System.out.println("\nEnter the number of destinations: ");
        int numDestinations = scanner.nextInt();
        scanner.nextLine(); // Consume newline left-over
        
        for (int i = 1; i <= numDestinations; i++) {
            System.out.println("\nEnter details for destination " + i + ":");
            System.out.print("Destination name: ");
            String destinationName = scanner.nextLine();
            System.out.print("Country: ");
            String country = scanner.nextLine();
            System.out.print("Start date (e.g., 2024-09-01): ");
            String startDate = scanner.nextLine();
            System.out.print("End date (e.g., 2024-09-05): ");
            String endDate = scanner.nextLine();
            
            // Simulate fetching weather data
            String weather = "Sunny";  // For simplicity, assume the weather is sunny everywhere
            
            // Add destination to itinerary
            Destination destination = new Destination(destinationName, country, startDate, endDate, weather);
            itinerary.addDestination(destination);
        }
        
        // Display the full itinerary
        itinerary.displayItinerary();
        
        scanner.close();
    }
}
