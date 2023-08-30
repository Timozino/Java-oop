public class Main {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.color = "Red";
        myCar.speed = 0;

        myCar.startEngine();
        myCar.accelerate();
    }
}


// //METHOD-OVERRIDING

// public class Main {
//     public static void main(String[] args) {
//         Vehicle vehicle = new Car();
//         vehicle.move(); // Output: Car is moving
//     }
// }
