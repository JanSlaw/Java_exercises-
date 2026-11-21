class ProductionRemoteControlCar implements RemoteControlCar, Comparable<ProductionRemoteControlCar> {
    int DistanceTravelled;
   int NumberOfVictories;
    public void drive() {
        DistanceTravelled += 10;
    }

    public int getDistanceTravelled() {
        return DistanceTravelled;
    }

    public int getNumberOfVictories() {
        return NumberOfVictories;
    }

    public void setNumberOfVictories(int numberOfVictories) {
        NumberOfVictories = numberOfVictories;
    }
    @Override
    public int compareTo(ProductionRemoteControlCar other){
        return Integer.compare(other.NumberOfVictories, this.NumberOfVictories);
    }
}
 