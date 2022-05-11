package module4.hw4;
abstract class Passenger {
    public abstract String getType() ;
    public abstract int getTicketPrice() ;

}
class RegularPassenger extends Passenger {
    public String getType(){
        return "Regular";
    }
    public int getTicketPrice(){
        return 199;
    }
}
class VIPPassenger extends Passenger {
    public String getType(){
        return "VIP";
    }
    public int getTicketPrice(){
        return 399;
    }
}

class Main {
    public static void main(String[] args) {
        Passenger regular  = new RegularPassenger();
        System.out.println("passenger.getTicketPrice() = " + regular .getTicketPrice());
        System.out.println("passenger.getType() = " + regular .getType());
        Passenger vip = new VIPPassenger();
        System.out.println("passenger.getTicketPrice() = " + vip.getTicketPrice());
        System.out.println("passenger.getType() = " + vip.getType());
    }
}