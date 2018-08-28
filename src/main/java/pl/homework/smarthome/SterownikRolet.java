package pl.homework.smarthome;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
public class SterownikRolet {

    private StacjaPogody stacjaPogody;
@Autowired
    public SterownikRolet(StacjaPogody stacjaPogody) {
        this.stacjaPogody = stacjaPogody;
    }

    public void printInfoBlinds(StacjaPogody stacjaPogody){

        if(stacjaPogody.weather().equalsIgnoreCase("pochmurnie")){

            System.out.println("Jest pochmurno. Nie zasłaniam rolet.");
        }else System.out.println("Jest słonecznie zasłaniam rolety.");
    }
}
