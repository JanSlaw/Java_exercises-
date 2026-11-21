public class JedliksToyCar {
    private String distance = "Driven 0 meters";
    private String battery = "Battery at 100%";
    private int meters;
    private int percentage = 100;
    public static JedliksToyCar buy() {
        return new JedliksToyCar();
    }

    public String distanceDisplay() {
        if(meters==0){
            return distance;
        }else return "Driven " + meters + " meters";
    }

    public String batteryDisplay() {
        if(percentage==100){
            return battery;
        }else if(percentage ==0) {
            return "Battery empty";
        }else return "Battery at " + percentage +"%";
    }

    public void drive() {
        if(percentage>0){
        int driven=20;
        meters = meters + driven;
        percentage = percentage - 1;
        }
        
    }
}
