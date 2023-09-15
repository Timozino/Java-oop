 // public class Main {
//     public static void main(String[] args) {
//         Car myCar = new Car();
//         myCar.color = "Red";
//         myCar.speed = 0;

//         myCar.startEngine();
//         myCar.accelerate();
//     }
// }


// // //METHOD-OVERRIDING

// // public class Main {
// //     public static void main(String[] args) {
// //         Vehicle vehicle = new Car();
// //         vehicle.move(); // Output: Car is moving
// //     }
// // }

class MyClass {
    // Define attributes (instance variables)
    int a;
    int b;

    // Define methods
    int add() {
        return a + b;
    }
}

public class Main { 
    public static void main(String[] args) {
        // Create objects of the class
        MyClass c = new MyClass();
        //MyClass object2 = n ew MyClass();

        // Set values for attributes
        c.a = 5;
        c.b = 3;
 
        // object2.attribute1 = 10;
        // object2.attribute2 = 7;
  
        // Call the add method on objects
        int result = c.add();
        //int result2 = object2.add();

        // Print the results
        System.out.println(result);
        //System.out.println("Result 2: " + result2);
    }
}












