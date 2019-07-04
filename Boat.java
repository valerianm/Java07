public class Boat extends Vehicule {
    public Boat(String name, int kilometers){
        super(name, kilometers);
    }
    public String doStuff() {
        return "Je suis " + getBrand() + " et je fais glou glou !";
    }
}