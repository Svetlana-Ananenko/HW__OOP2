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

     public void updateTyre() {
         System.out.println("Меняем покрышку");
     }

     public void check() {
         System.out.println("Обслуживаем " + this.getModelName());
         for (int i = 0; i < this.getWheelsCount(); i++) {
             this.updateTyre();

         }

     }
 }
