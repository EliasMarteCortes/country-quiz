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

    public String getName() {
        return name; 
    }

    public String getCapital() {
        return capital; 
    }
    public String getRegion() {
        return region; 
    }
    public String getSubregion() {
        return subregion; 
    }
    public String getLanguages() {
        return languages; 
    }

    public boolean isLandlocked() {
        return landlocked; 
    }

    public double getLatitude() {
        return latitude; 
    }

    public double getLongitude() {
        return longitude; 
    }


    public void setName(String name) {
        this.name = name; 
    }

    public void setCapital(String capital) {
        this.capital = capital; 
    }

    public void setLanguages(String languages) {
        this.languages = languages; 
    }

    public String toString() {
        return name + " - capital: " + capital + ", region: " + subregion
                + ", languages: " + languages + ", landlocked: " + landlocked;
    }
}