 public class Vehicle {
     protected String modelName;
     protected int wheelsCount;

     protected Vehicle(String modelName, int wheelsCount) {
         this.modelName = modelName;
         this.wheelsCount = wheelsCount;
     }

     protected String getModelName() {
         return modelName;
     }

     protected int getWheelsCount() {
         return wheelsCount;
     }

     protected void setModelName(String modelName) {
         this.modelName = modelName;
     }

     protected void setWheelsCount(int wheelsCount) {
         this.wheelsCount = wheelsCount;
     }

     protected void updateTyre() {
         System.out.println("Меняем покрышку");
     }

     protected void checkEngine() {
         System.out.println("Проверяем двигатель");
     }


     protected void checkTrailer() {
         System.out.println("Проверяем прицеп");
     }


     protected void check() {
         for (int i = 0; i < getWheelsCount(); i++) {
             updateTyre();
         }

     }
 }
