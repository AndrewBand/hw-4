package module4.hw4;

public class Tanker {
    private String serialNumber;

    public void setSerialNumber(String serialNumber){
        this.serialNumber = serialNumber;
    }
    public String getSerialNumber(){
        return serialNumber;
    }
    protected String getFuelType(){
        return "A500";
    }
    public void refuel(int amount){
        System.out.println("Add " + amount + " of " + getFuelType() + ", tanker serial number is " + getSerialNumber());
    }
public static void main (String[] asgs){
    Tanker tanker = new Tanker();
    tanker.setSerialNumber("SN504030");
    tanker.refuel(300);

    Tanker tanker2 = new XFuelTanker();
    tanker2.setSerialNumber("SN504030");
    tanker2.refuel(300);
}
}
class XFuelTanker extends Tanker{
    public String getFuelType(){
            return "XFuel";
    }

}
class MX200Tanker extends Tanker {
    public String getFuelType(){
        return "MX200";
    }
}