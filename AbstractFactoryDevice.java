public abstract class AbstractFactoryDevice {

    public abstract AbstractBattery createBattery();

    public abstract AbstractDisplay createDisplay();

    public abstract AbstractProcessor createProcessor();
}
