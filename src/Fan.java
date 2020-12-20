import java.security.PrivilegedExceptionAction;

public class Fan{
    protected final int SLOW = 1;
    protected final int MEDIUM = 2;
    protected final int FAST = 3;
    final String S1 = "fan is on";
    final String S2 = "fan is off";
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public Fan() {
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        String s = "";
        if(this.on == false){
            s = String.format("Màu sắc: %s\nRadius: %f\nStatus: %b\n",this.color,this.radius,"fan is off");
        }
        else {
            s = String.format("Speed: %d\nMàu Sắc: %s\nRadius: %f\nStatus: %b\n",this.speed,this.color,this.radius,"fan is on");
        }
        return s;
    }

//    @Override
//    public String toString() {
//        String s ="";
//        if(this.on==false){
//        s= "Fan{" +
//                ", Status=" + S2 +
//                ", radius=" + radius +
//                ", color='" + color + '\'' +
//                '}';
//        } else{
//            s= "Fan{" +
//                    ", Status=" + S1 +
//                    ", radius=" + radius +
//                    ", color='" + color + '\'' +
//                    ", speed="  + speed +
//                    '}';
//        }
//        return s;
//    }
}