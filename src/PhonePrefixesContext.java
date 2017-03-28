import java.util.HashMap;

/**
 * Created by pc on 3/26/2017.
 */
public class PhonePrefixesContext {
    HashMap<Country, IPhonePrefixesStrategy> phonePrefixesMap = new HashMap<Country, IPhonePrefixesStrategy>();



    public PhonePrefixesContext(){
        phonePrefixesMap.put(Country.BELGIUM, new BelgiumPrefixStrategy());
        phonePrefixesMap.put(Country.NETHERLANDS, new NetherlandsPrefixStrategy());
        phonePrefixesMap.put(Country.FRANCE, new FrancePrefixStrategy());
        phonePrefixesMap.put(Country.ENGLAND, new EnglandPrefixStrategy());
    }

    public String doExecute(Country title){
        return phonePrefixesMap.get(title).showPrefix();
    }
}

