class Destination {
    private String name;
    private String country;
    private String startDate;
    private String endDate;
    private String weather;

    public Destination(String name, String country, String startDate, String endDate, String weather) {
        this.name = name;
        this.country = country;
        this.startDate = startDate;
        this.endDate = endDate;
        this.weather = weather;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public String getWeather() {
        return weather;
    }
}
