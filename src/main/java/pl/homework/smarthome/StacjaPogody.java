package pl.homework.smarthome;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Random;
@Component
public class StacjaPogody {

private Integer temperature;
private String weather;


//    public StacjaPogody(Integer temperature, String weather) {
//        this.temperature = temperature;
//        this.weather = weather;
//    }

    public int getTemperature() {

        if(temperature == null){
            Random random = new Random();
            temperature = random.nextInt((61)-25);
        }

        return temperature;
    }

    public String weather() {
        Random random = new Random();
        Integer temp = random.nextInt(2);
        if(temp == 1){

            weather = "słonecznie";
        }else weather = "pochmurnie";

        return weather;
    }

    public void printMessage(){

        System.out.println("Stacja pogodowa pobiera informacje o temperaturze.");
    }
}
