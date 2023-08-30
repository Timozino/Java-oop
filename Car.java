class Car {
    String color;
    int speed;

    void startEngine() {
        System.out.println("Engine started");
    }

    void accelerate() {
        speed += 10;
        System.out.println("Accelerating. Current speed: " + speed);
    }
}


