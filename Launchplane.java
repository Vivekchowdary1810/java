class Plane{
    void TakeOff(){
        System.out.println("plane is taking Off");
    }
    void fly(){
        System.out.println("plane is Flying");
    }
    void land(){
        System.out.println("plane is Landing");
    }
}
class passengerplane extends Plane{
void fly(){
        System.out.println("passengerplane is Flying at low height");
    }
}
class cargoplane extends Plane{
void fly(){
        System.out.println("cargoplane is Flying at medium height");
    }
}
class fighterplane extends Plane{
void fly(){
        System.out.println("fighterplane is Flying at high height");
    }
}
class Airport{
    void permit(Plane ref){
        ref.TakeOff();
        ref.fly();
        ref.land();
    }
}
public class Launchplane {
    public static void main(String[] args) {
        passengerplane pp=new passengerplane();
        cargoplane cp=new cargoplane();
        fighterplane fp=new fighterplane();
         Airport a=new Airport();
         a.permit(pp);
         a.permit(cp);
         a.permit(fp);
    }
}
