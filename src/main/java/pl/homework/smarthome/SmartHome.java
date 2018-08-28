package pl.homework.smarthome;

import org.springframework.stereotype.Component;

@Component
public interface SmartHome {

    public static void getOn(){
        System.out.println("Urządzenia zostały włączone/ SmartHome");
    };
}
