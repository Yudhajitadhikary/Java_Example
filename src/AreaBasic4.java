
public class AreaBasic4{
    public static void main(String[] a) {
        Circle1 c1 = new Circle1(10f);
        printCircle(c1);
    }

    public static void printCircle(Circle1 c){
        System.out.println("area of circle = " + c.area());
    }
}

class Circle1{
    private float radius;
    public static final float PI = 3.1414f;

    public Circle1(float radius) {
        this.radius = radius;
    }

    public float area(){
        return PI * this.radius * this.radius;
    }
}





