 import java.util.Arrays;

 public class ServiceStation {

     protected void check(Vehicle vehicle) {
         System.out.println("Обслуживаем " + vehicle.getModelName());
         vehicle.check();
     }


 }