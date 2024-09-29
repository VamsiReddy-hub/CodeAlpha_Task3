class Preference {
    private String transportationMode;
    private String accommodationType;

    public Preference(String transportationMode, String accommodationType) {
        this.transportationMode = transportationMode;
        this.accommodationType = accommodationType;
    }

    public String getTransportationMode() {
        return transportationMode;
    }

    public String getAccommodationType() {
        return accommodationType;
    }
}
