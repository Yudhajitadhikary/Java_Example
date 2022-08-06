
class Student3 {
    private final String name;
    private int year;

    private static final int annualFees = 10000;

    public Student3(String name, int year) {
        this.name       = name;
        this.year       = year;
    }

    public String getDetails() {
        return "Name : "        + name           + '\n' +
                "Fees : "        + computeFees() ;
    }

    public int computeFees () {
        return Student3.annualFees * year;
    }
}

class ResearchStudent3 extends Student3 {
    private String researchArea;
    private static final int annualFees = 10000;

    public ResearchStudent3(String name, int year, String researchArea) {
        super(name, year);
        this.researchArea = researchArea;
    }
}

class PhDStudent3 extends ResearchStudent3 {
    private String thesisTitle;
    private static final int annualFees = 10000;

    public PhDStudent3(String name, int year, String researchArea, String thesisTitle) {
        super(name, year, researchArea);
        this.thesisTitle = thesisTitle;
    }
}




public class Inheritance1 {
    public static void main(String[] a) {


        Student3 s1 = new Student3("karan", 3);
        System.out.println(s1.getDetails());
        ResearchStudent3 s2 = new ResearchStudent3("siddharth", 4, "Software Engineering");
        System.out.println(s2.getDetails());
        PhDStudent3 s3 = new PhDStudent3("hari", 1, "Software Engineering", "Automated Evaluation");
        System.out.println(s3.getDetails());
    }
}


