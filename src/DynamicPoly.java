class Student8 {
    private final String name;
    private int year;

    private static final int annualFees = 10000;

    public Student8(String name, int year) {
        this.name       = name;
        this.year       = year;
    }

    public String getDetails() {
        return "Name : "        + name           + '\n' +
                "Fees : "        + computeFees() ;
    }

    public float computeFees () {
        return Student8.annualFees * year;
    }
    public float computeFees (int annualFees){return annualFees*this.year;}
}

class ResearchStudent8 extends Student8 {
    private String researchArea;
    private static final int annualFees = 10000;

    public ResearchStudent8(String name, int year, String researchArea) {
        super(name, year);
        this.researchArea = researchArea;

    }

    @Override
    public String getDetails() {
        return super.getDetails() + '\n' + "Research Area : " + this.researchArea;
    }
}





public class DynamicPoly {
    public static void main(String[] a) {


        Student8 s1 = new Student8("karan", 2);
        System.out.println(s1.getDetails());
        System.out.println(s1.computeFees());
        ResearchStudent8 s2 = new ResearchStudent8("siddharth", 3, "Software Engineering");
        System.out.println(s2.getDetails());
        System.out.println(s2.computeFees(1000));
    }
}


