public class Country {
    private String name;
    private String capital;
    private String region;
    private String subregion;
    private String languages;
    private boolean landlocked;
    private double latitude;
    private double longitude;

    public Country(String name, String capital, String region, String subregion,
                   String languages, boolean landlocked, double latitude, double longitude)
    {
        this.name = name;
        this.capital = capital;
        this.region = region;
        this.subregion = subregion;
        this.languages = languages;
        this.landlocked = landlocked;
        this.latitude = latitude;
        this.longitude = longitude;
    }
}