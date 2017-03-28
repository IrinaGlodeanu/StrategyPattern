/**
 * Created by pc on 3/26/2017.
 */
public class FrancePrefixStrategy implements IPhonePrefixesStrategy {
    @Override
    public String showPrefix() {
        return "France's prefix is: " + Country.FRANCE.getPrefix();
    }
}
