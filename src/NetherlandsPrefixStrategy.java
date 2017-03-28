/**
 * Created by pc on 3/26/2017.
 */
public class NetherlandsPrefixStrategy implements IPhonePrefixesStrategy {
    @Override
    public String showPrefix() {
        return "Netherlands's prefix is: " + Country.NETHERLANDS.getPrefix();
    }
}
