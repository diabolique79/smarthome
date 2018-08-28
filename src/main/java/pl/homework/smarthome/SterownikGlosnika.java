package pl.homework.smarthome;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SterownikGlosnika {

    private StacjaPogody stacjaPogody;
@Autowired
    public SterownikGlosnika(StacjaPogody stacjaPogody) {
        this.stacjaPogody = stacjaPogody;
    }

    public void printMessage(StacjaPogody stacjaPogody){

        System.out.println("Dzień dobry. Dzisiejsza temperatura to " + stacjaPogody.getTemperature() + "\u00B0" + "C i jest " + stacjaPogody.weather());
    }
}
