class Hangar {
    public static void main(String[] args) {
        Car jaguar = new Car("Jaguar", 456);
        Car honda = new Car("Honda", 123);
        Boat speedo = new Boat("Speedo", 222);
        Boat tora = new Boat("Tora", 888);
        System.out.println(jaguar.doStuff());
        System.out.println(honda.doStuff());
        System.out.println(speedo.doStuff());
        System.out.println(tora.doStuff());

    }
}