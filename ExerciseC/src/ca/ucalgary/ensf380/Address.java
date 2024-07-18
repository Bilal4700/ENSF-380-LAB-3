package ca.ucalgary.ensf380;

public class Address {
    private String street;
    private String city;
    private String state;
    private String postalCode;
    private String country;

    public boolean validate() {
        return street != null && !street.isEmpty() &&
               city != null && !city.isEmpty() &&
               state != null && !state.isEmpty() &&
               postalCode != null && !postalCode.isEmpty() &&
               country != null && !country.isEmpty();
    }

    public String fullAddress() {
        return street + ", " + city + ", " + state + ", " + postalCode + ", " + country;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}