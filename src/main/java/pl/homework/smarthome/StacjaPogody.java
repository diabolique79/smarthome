package pl.homework.smarthome;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Random;
@Component
public class StacjaPogody {

//    private int temperature;
//    private String weather;
//
//
//    public StacjaPogody(int temperature, String weather) {
//        this.temperature = temperature;
//        this.weather = weather;
//    }

    public int getTemperature() {
        Random random = new Random();
        Integer temp = random.nextInt((61)-25);
        return temp;
    }

    public String weather() {
        Random random = new Random();
        Integer temp = random.nextInt(2);
        String weather = "";

        if(temp == 1){

            weather = "słonecznie";
        }else weather = "pochmurnie";

        return weather;
    }

    public void printMessage(){

        System.out.println("Stacja pogodowa pobiera informacje o temperaturze.");
    }
}
