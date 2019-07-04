public class Car extends Vehicule {
    public Car(String name, int kilometers){
        super(name, kilometers);
    }
    public String doStuff() {
        return "Je suis " + getBrand() + " et je fais vroum vroum !";
    }
}