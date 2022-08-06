
class Student7 {
    private final String name;
    private int year;

    private static final int annualFees = 10000;

    public Student7(String name, int year) {
        this.name       = name;
        this.year       = year;
    }

    public String getDetails() {
        return "Name : "        + name           + '\n' +
                "Fees : "        + computeFees() ;
    }

    public int computeFees () {
        return Student7.annualFees * year;
    }
}

class ResearchStudent7 extends Student7 {
    private String researchArea;
    private static final int annualFees = 10000;

    public ResearchStudent7(String name, int year, String researchArea) {
        super(name, year);
        this.researchArea = researchArea;

    }

    @Override
    public String getDetails() {
        return super.getDetails() + '\n' + "Research Area : " + this.researchArea;
    }
}





public class Overrides {
    public static void main(String[] a) {


        Student7 s1 = new Student7("karan", 3);
        System.out.println(s1.getDetails());
        ResearchStudent7 s2 = new ResearchStudent7("siddharth", 4, "Software Engineering");
        System.out.println(s2.getDetails());
    }
}


