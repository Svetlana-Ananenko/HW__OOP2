 import java.util.Arrays;

 public class ServiceStation {

     public void check(Vehicle vehicle) {
         System.out.println("Обслуживаем " + vehicle.getModelName());
         vehicle.check();
     }


 }