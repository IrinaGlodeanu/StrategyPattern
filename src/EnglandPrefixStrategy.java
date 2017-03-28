/**
 * Created by pc on 3/26/2017.
 */
public class EnglandPrefixStrategy implements IPhonePrefixesStrategy {
    @Override
    public String showPrefix() {
            return "England's prefix is: " + Country.ENGLAND.getPrefix();
    }
}
