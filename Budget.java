class Budget {
    private double accommodationCostPerNight;
    private double transportationCostPerDestination;

    public Budget(double accommodationCostPerNight, double transportationCostPerDestination) {
        this.accommodationCostPerNight = accommodationCostPerNight;
        this.transportationCostPerDestination = transportationCostPerDestination;
    }

    public double calculateBudget(int numDestinations) {
        // Simulate a calculation assuming 3 days per destination
        int totalNights = numDestinations * 3;
        double totalAccommodationCost = accommodationCostPerNight * totalNights;
        double totalTransportationCost = transportationCostPerDestination * numDestinations;
        return totalAccommodationCost + totalTransportationCost;
    }
}
