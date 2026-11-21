public class ExperimentalRemoteControlCar implements RemoteControlCar{
int DistanceTravelled;
    public void drive() {
        DistanceTravelled += 20;
    }

    public int getDistanceTravelled() {
        return DistanceTravelled;
    }
}
