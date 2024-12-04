 public class Car extends Vehicle {

     protected Car(String modelName, int wheelsCount) {
         super(modelName, wheelsCount);
     }


     protected void checkEngine() {
         System.out.println("Проверяем двигатель");
     }

     @Override
     protected void check() {
         super.check();
         checkEngine();
     }
 }