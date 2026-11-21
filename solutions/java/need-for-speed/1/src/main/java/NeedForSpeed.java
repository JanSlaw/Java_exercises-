class NeedForSpeed {
    int speed;
    int batteryDrain;
    int driven;
    int cap = 100;
    NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }

    public boolean batteryDrained() {
        return cap < batteryDrain;
    }

    public int distanceDriven() {
        return driven;
    }

    public void drive() {
        if(!batteryDrained()){
        driven += speed;
        cap -= batteryDrain;
        }
    }

    public static NeedForSpeed nitro() {
         return new NeedForSpeed(50, 4);
    }
}

class RaceTrack {
    int distance;
    RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean canFinishRace(NeedForSpeed car) {
        int howLongCanLast = car.speed*(car.cap/car.batteryDrain);
        return this.distance<=howLongCanLast;
    }
}
