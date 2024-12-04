     public class Truck extends Car {
         protected Truck(String modelName, int wheelsCount) {
         super(modelName, wheelsCount);
     }

         protected void checkEngine() {
         System.out.println("Проверяем двигатель");
     }

         protected void checkTrailer() {
         System.out.println("Проверяем прицеп");
     }

     @Override
     protected void check() {
         super.check();
         checkTrailer();
     }
 }