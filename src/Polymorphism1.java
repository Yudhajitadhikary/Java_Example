
class Student9 {
    private final String name;
    private int year;

    private static final int annualFees = 10000;

    public Student9(String name, int year) {
        this.name       = name;
        this.year       = year;
    }

    public String getDetails() {
        return "Name : "        + name           + '\n' +
                "Fees : "        + computeFees() ;
    }

    public float computeFees () {
        return Student9.annualFees * year;
    }
    public float computeFees (int annualFees){return annualFees*this.year;}
}

class ResearchStudent9 extends Student9 {
    private String researchArea;
    private static final int annualFees = 10000;

    public ResearchStudent9(String name, int year, String researchArea) {
        super(name, year);
        this.researchArea = researchArea;

    }

    @Override
    public String getDetails() {
        return super.getDetails() + '\n' + "Research Area : " + this.researchArea;
    }
}





public class Polymorphism1 {
    public static void main(String[] a) {


        Student9 s1 = new Student9("karan", 2);
        System.out.println(s1.getDetails());
        System.out.println(s1.computeFees());
        ResearchStudent9 s2 = new ResearchStudent9("siddharth", 3, "Software Engineering");
        System.out.println(s2.getDetails());
        System.out.println(s2.computeFees(1000));
        System.out.println(s2.computeFees());
    }
}


