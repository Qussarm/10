public abstract class Car {
    private Wheel wheel;
    private Rudder Rudder;
    private String carName;

    public Car(Wheel wheel, Rudder rudder, String carName) {
        this.setWheel(wheel);
        setRudder(rudder);
        this.setCarName(carName);
    }

    public Wheel getWheel() {
        return wheel;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }

    public Rudder getRudder() {
        return Rudder;
    }

    public void setRudder(Rudder rudder) {
        Rudder = rudder;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }
}


