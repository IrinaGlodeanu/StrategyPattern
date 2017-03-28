/**
 * Created by pc on 3/26/2017.
 */
public class BelgiumPrefixStrategy implements IPhonePrefixesStrategy {
    @Override
    public String showPrefix() {
        return "Belgium's prefix is: " + Country.BELGIUM.getPrefix();
    }
}
