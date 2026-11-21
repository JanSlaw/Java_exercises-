import java.util.List;
import java.util.Collections;
public class TestTrack  {
    ProductionRemoteControlCar productionCar = new ProductionRemoteControlCar();
    ExperimentalRemoteControlCar experimentalCar = new ExperimentalRemoteControlCar();
    public static void race(RemoteControlCar car) {
        car.drive();
    }
  public static List<ProductionRemoteControlCar>getRankedCars(List<ProductionRemoteControlCar> cars) {
         Collections.sort(cars);
      return cars;
   }
}
