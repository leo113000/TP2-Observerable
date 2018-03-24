import Model.*;

public class Main {

    public static void main(String[] args) {
	    // The observable
    	Car myCar = new Car("Gol Trend",2018);
	    // The observer
    	Mechanic diego = new Mechanic("Diego");
		// Add the observer to the observable
    	myCar.addObserver(diego);
	    // The sets to test
    	myCar.setOilLevel(100);
	    myCar.setWaterLevel(100);
	    myCar.setTiresPressure(180);
	    myCar.setTiresPressure(20);
    }
}
