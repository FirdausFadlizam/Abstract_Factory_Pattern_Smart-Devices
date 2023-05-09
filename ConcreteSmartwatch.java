public class ConcreteSmartwatch extends AbstractFactoryDevice {

    private static ConcreteSmartwatch smartwatchInstant1;
    private static ConcreteSmartwatch smartwatchInstant2;
    private SmartwatchBattery batteryInstant;
    private SmartwatchDisplay displayInstant;
    private SmartwatchProcessor processorInstant;

    //apply singleton pattern to limit instances
    //return null if two instances existed.
    public static ConcreteSmartwatch getInstance(){

        if(smartwatchInstant1 == null){
            smartwatchInstant1 = new ConcreteSmartwatch();
            return smartwatchInstant1;
        }
        else if(smartwatchInstant2 == null){
            smartwatchInstant2 = new ConcreteSmartwatch();
            return smartwatchInstant2;
        }
        System.out.println("You cannot test smartwatch more than twice\n");
        return null;
    }
    @Override
    public AbstractBattery createBattery(){

        batteryInstant = new SmartwatchBattery();
        return batteryInstant;

    }

    public AbstractDisplay createDisplay() {

        displayInstant = new SmartwatchDisplay();
        return displayInstant;

    }
    public AbstractProcessor createProcessor(){

        processorInstant = new SmartwatchProcessor();
        return processorInstant;


    }
}


