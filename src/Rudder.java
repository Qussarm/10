public class Rudder {
    private int wheelSize;
    private String nameFirm;

    public Rudder(int wheelSize, String nameFirm) {
        this.setWheelSize(wheelSize);
        this.setNameFirm(nameFirm);

    }

    public int getWheelSize() {
        return wheelSize;
    }

    public void setWheelSize(int wheelSize) {
        this.wheelSize = wheelSize;
    }

    public String getNameFirm() {
        return nameFirm;
    }

    public void setNameFirm(String nameFirm) {
        this.nameFirm = nameFirm;
    }
}
