package data.base;

public enum Country {
    NETHERLANDS("Netherlands"),
    TURKEY("Turkey"),
    ECUADORA("Ecuador"),
    ETHIOPIA("Ethiopia"),
    COLOMBIA("Colombia");

    public final String country;

    Country(String country) {
        this.country = country;
    }

    @Override
    public String toString(){
        return "Country{"+
                "name = '" + country +'\''+'}';
    }
}