package co.practice.spring;

public class Car {
    private IEngine engine;

    public Car(IEngine engine)
    {
        this.engine=engine;
    }

    public IEngine getEngine()
    {
        return engine;
    }
}
