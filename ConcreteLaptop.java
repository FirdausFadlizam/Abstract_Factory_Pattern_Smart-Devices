public class ConcreteLaptop extends AbstractFactoryDevice {

    private static ConcreteLaptop laptopInstant1;
    private static ConcreteLaptop laptopInstant2;
    private LaptopBattery batteryInstant;
    private LaptopDisplay displayInstant;
    private LaptopProcessor processorInstant;

    //apply singleton pattern to limit instances
    //return null if two instances existed.
    public static ConcreteLaptop getInstance(){
        if(laptopInstant1 == null){
            laptopInstant1 = new ConcreteLaptop();
            return laptopInstant1;
        }
        else if(laptopInstant2 == null){
            laptopInstant2 = new ConcreteLaptop();
            return laptopInstant2;
        }
        System.out.println("You cannot test laptop more than twice\n");
        return null;
    }
    @Override
    public AbstractBattery createBattery(){

        batteryInstant = new LaptopBattery();
        return batteryInstant;

    }

    public AbstractDisplay createDisplay() {

            displayInstant = new LaptopDisplay();
            return displayInstant;

    }
    public AbstractProcessor createProcessor(){

                processorInstant = new LaptopProcessor();
                return processorInstant;


    }
}
