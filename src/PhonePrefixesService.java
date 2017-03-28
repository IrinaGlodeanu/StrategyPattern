/**
 * Created by pc on 3/26/2017.
 */
public class PhonePrefixesService {

     private PhonePrefixesContext context;

     public PhonePrefixesService(){
         context = new PhonePrefixesContext();
     }

    public String getPrefixByCountryName(Country countries) {


            return context.doExecute(countries);
        }
    }


