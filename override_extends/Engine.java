package module4.hw4;
class AdvancedXFuelEngine extends XFuelEngine{
    @Override
    public void setPower(int power) {
        super.setPower(power);
    }

    @Override
    public int getPower() {
        return super.getPower();
    }

    @Override
    public void setSerialNumber(String serialNumber) {
        super.setSerialNumber(serialNumber);
    }

    public void printInfo(){
        System.out.println("Serial number is " + serialNumber + ", power is " + super.getPower());
    }
}
class XFuelEngine extends Engine {
    protected String serialNumber;

    public void setSerialNumber(String serialNumber){
        this.serialNumber = serialNumber;
    }
    public String getFuelType() {
        return "XFuel";
    }

}

public class Engine {
    private int power;
//    private String fuelType = "A500";

    public void setPower(int power) {
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    public String getFuelType() {
        return "A500";
    }

    public static void main(String[] args) {
//        Engine eng = new Engine();
//        System.out.println(eng.getFuelType());
//        eng.setPower(20);
//        System.out.println("engine.getPower() = " + eng.getPower());

        Engine xFuelEngine = new XFuelEngine();
        System.out.println(xFuelEngine.getFuelType());

        AdvancedXFuelEngine engine = new AdvancedXFuelEngine();
        engine.setPower(1000);
        engine.setSerialNumber("SN504030");
        System.out.print("engine.printInfo() = " ); //Serial number is SN504030, power is 1000
        engine.printInfo();

    }
}
