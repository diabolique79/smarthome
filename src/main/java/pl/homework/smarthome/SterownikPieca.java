package pl.homework.smarthome;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SterownikPieca {

    private StacjaPogody stacjaPogody;
@Autowired
    public SterownikPieca(StacjaPogody stacjaPogody) {
        this.stacjaPogody = stacjaPogody;
    }

    public void printInfo(){

        if(stacjaPogody.getTemperature() < 15){

            System.out.println("Jest zimno. Uruchamiam piec.");
        }else System.out.println("Jest ciepło. Nie uruchamiam pieca.");
    }
}
