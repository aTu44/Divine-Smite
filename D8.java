package modelos;
import java.util.Random;

public class D8 {
    
    int random;
   

    public int Doito() {
        random = new Random().nextInt(8);

        if (random == 0) {
            return Doito();
        }
return random;
    }

  
}