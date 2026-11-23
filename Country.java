public class Country {
    private String name;
    private String capital;
    private String code;
    private String region;
    private String subregion;
    private String languages;
    private String currency;
    private boolean landlocked;
    private String[] borders;
    private double longitude;
    private double latitude;

    public Country(String name, String capital, String code, String region, String subregion, String languages, String currency, 
        boolean landlocked, String[] borders, double longitude, double latitude) 
    {
        this.name = name;
        this.capital = capital;
        this.region = region;
        this.subregion = subregion;
        this.languages = languages;
        this.currency = currency;
        this.landlocked = landlocked;
        this.borders = borders;
        this.longitude = longitude;
        this.latitude = latitude;
    }
}
