public class TestMain {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        Fan fan2 = new Fan();
        creatObjFan1(fan1);
        System.out.println(fan1);


    }

    private static void creatObjFan1(Fan fan1) {
        fan1.setSpeed(fan1.FAST);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setOn(true);
    }
    private static  void crearObjFan2(Fan fan2){

    }
}
