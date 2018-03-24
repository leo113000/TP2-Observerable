package Model;

import java.util.Map;
import java.util.Observable;
import java.util.Observer;
import java.util.Set;

public class Mechanic implements Observer {
    // Attributes
    private String name;
    // Constructor
    public Mechanic(String name) { this.name = name; }
    // Getters
    public String getName() { return name; }
    // Setters
    public void setName(String name) { this.name = name; }
    // Implemented method
    @Override
    public void update(Observable o, Object arg) {
        //String to be printed
        String toPrint;
        // check nullity and object type
        if(arg instanceof Map){
            // Cast the object to a Map
            Map m = (Map) arg;
            // Initial string to be printed with the car name
            toPrint = "El auto " + ((Car) o ).getName() + ": \n";
            // get all the keys in the Map
            Set<String> keys = m.keySet();
            for(String k : keys){
                // Get the inner map
                Map values = (Map) m.get(k);
                // Add string with the old value
                toPrint += " tenía : " + values.get("old") + " de " + k;
                // Add string with the new value
                toPrint += "\n y ahora tiene : " + values.get("new");
            }
            // Print the data
            System.out.println(toPrint);
        }
    }
}
