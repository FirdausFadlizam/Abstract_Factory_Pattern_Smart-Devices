public class Client {
    private AbstractBattery abstractBattery;
    private AbstractProcessor abstractProcessor;
    private AbstractDisplay abstractDisplay;

    public Client(AbstractFactoryDevice factoryDevice){
        abstractBattery = factoryDevice.createBattery();
        abstractDisplay = factoryDevice.createDisplay();
        abstractProcessor = factoryDevice.createProcessor();
    }

    public void run(){
        abstractBattery.testBattery(abstractBattery);
        abstractDisplay.testDisplay(abstractDisplay);
        abstractProcessor.testProcessor(abstractProcessor);
    }
}
