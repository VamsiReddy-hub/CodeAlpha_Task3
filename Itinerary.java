import java.util.ArrayList;
import java.util.List;

class Itinerary {
    private User user;
    private List<Destination> destinations;
    private Preference preference;
    private Budget budget;

    public Itinerary(User user, Preference preference, Budget budget) {
        this.user = user;
        this.destinations = new ArrayList<>();
        this.preference = preference;
        this.budget = budget;
    }

    public void addDestination(Destination destination) {
        destinations.add(destination);
    }

    public void displayItinerary() {
        System.out.println("Travel Itinerary for " + user.getName() + ":\n");
        for (Destination destination : destinations) {
            System.out.println("Destination: " + destination.getName() + ", " + destination.getCountry());
            System.out.println("Travel Dates: " + destination.getStartDate() + " to " + destination.getEndDate());
            System.out.println("Expected Weather: " + destination.getWeather());
            System.out.println("Mode of Transportation: " + preference.getTransportationMode());
            System.out.println("Accommodation: " + preference.getAccommodationType() + "\n");
        }
        System.out.println("Estimated Total Budget: $" + budget.calculateBudget(destinations.size()));
    }
}
