package Model;

import java.util.HashMap;
import java.util.Map;
import java.util.Observable;

public class Car extends Observable {
    // Attributes
    private String name;
    private int year;
    // Observables attributes
    private int oilLevel;
    private int waterLevel;
    private int tiresPressure;
    // Constructor
    public Car(String name, int year) {
        this.name = name;
        this.year = year;
        this.oilLevel = 0;
        this.waterLevel = 0;
        this.tiresPressure = 0;
    }
    // Getters
    public String getName() { return name; }
    public int getYear() { return year; }
    public int getOilLevel() { return oilLevel; }
    public int getWaterLevel() { return waterLevel; }
    public int getTiresPressure() { return tiresPressure; }
    //Setters
    public void setName(String name) { this.name = name; }
    public void setYear(int year) { this.year = year; }
    // Setters that notifies the observer
    public void setOilLevel(int oilLevel) {
        // create a dictionary with the old values
        Map dict = createObjDictionary("Oil Level",this.oilLevel,oilLevel);
        // Change the value
        this.oilLevel = oilLevel;
        // Set the observable as changed
        this.setChanged();
        // Notify Observers
        this.notifyObservers(dict);
    }
    public void setWaterLevel(int waterLevel) {
        // create a dictionary with the old values
        Map dict = createObjDictionary("Water Level",this.waterLevel,waterLevel);
        // Change the value
        this.waterLevel = waterLevel;
        // Set the observable as changed
        this.setChanged();
        // Notify Observers
        this.notifyObservers(dict);
    }
    public void setTiresPressure(int tiresPressure) {
        // create a dictionary with the old values
        Map dict = createObjDictionary("Tires Pressure",this.tiresPressure,tiresPressure);
        // Change the value
        this.tiresPressure = tiresPressure;
        // Set the observable as changed
        this.setChanged();
        // Notify Observers
        this.notifyObservers(dict);
    }
    /**
     *  This function builds a dictionary which will be sent to the observer as a param
     * @param name the name of the parameter modified
     * @param oldValue
     * @param newValue
     * @return a dictionary with the data
     */
    private Map createObjDictionary(String name, Integer oldValue, Integer newValue) {
        Map <String,Map> m = new HashMap();
        Map <String,Integer> values = new HashMap();
        values.put("old",oldValue);
        values.put("new",newValue);
        m.put(name,values);
        return m;
    }
}
