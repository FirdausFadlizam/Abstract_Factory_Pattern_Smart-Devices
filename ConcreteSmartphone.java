public class ConcreteSmartphone extends AbstractFactoryDevice {

    private static ConcreteSmartphone smartphoneInstant1;
    private static ConcreteSmartphone smartphoneInstant2;
    private SmartphoneBattery batteryInstant;
    private SmartphoneDisplay displayInstant;
    private SmartphoneProcessor processorInstant;

    //apply singleton pattern to limit instances
    //return null if two instances existed.
    public static ConcreteSmartphone getInstance(){
        if(smartphoneInstant1 == null){
            smartphoneInstant1 = new ConcreteSmartphone();
            return smartphoneInstant1;
        }
        else if(smartphoneInstant2 == null){
            smartphoneInstant2 = new ConcreteSmartphone();
            return smartphoneInstant2;
        }
        System.out.println("You cannot test smartphone more than twice\n");
        return null;
    }
    @Override
    public AbstractBattery createBattery(){

        batteryInstant = new SmartphoneBattery();
        return batteryInstant;

    }

    public AbstractDisplay createDisplay() {

        displayInstant = new SmartphoneDisplay();
        return displayInstant;

    }
    public AbstractProcessor createProcessor(){

        processorInstant = new SmartphoneProcessor();
        return processorInstant;


    }
}


