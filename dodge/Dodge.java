package dodge;
import java.util.*;

public class Dodge{
    public boolean dodgetime(int randomselect){
        Random r = new Random();
        int R = r.nextInt(3);
        if(randomselect == R){
            return true;
        }
        else{
            return false;
        }
    }
}