public class AreaBasic5{
    public static void main(String[] a) {
        Circle2 c1 = new Circle2(10f);
        printCircle(c1);
    }

    public static void printCircle(Circle2 c){
        System.out.println("radius of circle = " + c.getRadius() + '\n' +
                "area of circle = " + c.area());
    }
}

class Circle2{
    private float radius;
    public static final float PI = 3.1414f;

    public Circle2(float radius) {
        this.radius = radius;
    }

    public float getRadius() {
        return this.radius;
    }

    public float area(){
        return PI * this.radius * this.radius;
    }
}





