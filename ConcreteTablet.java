public class ConcreteTablet extends AbstractFactoryDevice {

    private static ConcreteTablet tabletInstant1;
    private static ConcreteTablet tabletInstant2;
    private TabletBattery batteryInstant;
    private TabletDisplay displayInstant;
    private TabletProcessor processorInstant;

    //apply singleton pattern to limit instances
    //return null if two instances existed.
    public static ConcreteTablet getInstance(){
        if(tabletInstant1 == null){
            tabletInstant1 = new ConcreteTablet();
            return tabletInstant1;
        }
        else if(tabletInstant2 == null){
            tabletInstant2 = new ConcreteTablet();
            return tabletInstant2;
        }
        System.out.println("You cannot test tablet more than twice\n");
        return null;
    }
    @Override
    public AbstractBattery createBattery(){

        batteryInstant = new TabletBattery();
        return batteryInstant;

    }

    public AbstractDisplay createDisplay() {

        displayInstant = new TabletDisplay();
        return displayInstant;

    }
    public AbstractProcessor createProcessor(){

        processorInstant = new TabletProcessor();
        return processorInstant;


    }
}
