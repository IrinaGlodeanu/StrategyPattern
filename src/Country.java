/**
 * Created by pc on 3/26/2017.
 */

    public enum Country{

    BELGIUM("BELGIUM","+32"),
    NETHERLANDS("NETHERLANDS","+33"),
    FRANCE("FRANCE","+31"),
    ENGLAND("ENGLAND","+41");

    String name;
    String prefix;



    Country(String countryName, String countryPrefix) {
        name = countryName;
        prefix = countryPrefix;
    }

    public String getPrefix(){
        return this.prefix;
    }

    }

