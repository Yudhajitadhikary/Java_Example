
class Student12{
    protected final String name;
    protected int year;

    protected static final int annualFees = 10000;

    public Student12(String name, int year) {
        this.name = name;
        this.year = year;
    }


    public String getDetails() {
        return "Name : " + name + '\n' +
                "Fees : " + computeFees();
    }

    protected float computeFees() {
        return Student12.annualFees * year;
    }

    public float computeFees(int annualFees){
        return annualFees * this.year;
    }

}

class ResearchStudent12 extends Student12 {
    protected String researchArea;
    private static final int annualFees = 10000;

    public ResearchStudent12(String name, int year, String researchArea) {
        super(name, year);
        this.researchArea = researchArea;
    }

    protected float computeFees(){
        return Student12.annualFees * this.year*0.9f;
    }
//protected function can be overridden

}


public class ProtectedFunction {
    public static void main(String[] a) {

        Student12 s1 = new Student12("karan", 3);
        System.out.println(s1.getDetails());

        ResearchStudent12 s2 = new ResearchStudent12("siddharth", 3, "Software Engineering");
        System.out.println(s2.getDetails());


    }


}


