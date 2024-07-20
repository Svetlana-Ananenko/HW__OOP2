 public class Vehicle {
     public String modelName;
     public int wheelsCount;

     public Vehicle(String modelName, int wheelsCount) {
         this.modelName = modelName;
         this.wheelsCount = wheelsCount;
     }

     public String getModelName() {
         return modelName;
     }

     public int getWheelsCount() {
         return wheelsCount;
     }

     public void setModelName(String modelName) {
         this.modelName = modelName;
     }

     public void setWheelsCount(int wheelsCount) {
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


     public void check() {
         for (int i = 0; i < getWheelsCount(); i++) {
             updateTyre();
         }

     }
 }
