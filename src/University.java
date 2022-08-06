class Student11 {
    protected final String name;
    protected int year;

    private static final int annualFees = 10000;

    public Student11(String name, int year) {
        this.name = name;
        this.year = year;
    }


    public String getDetails() {
        return "Name : " + name + '\n' +
                "Fees : " + computeFees();
    }

    public int computeFees() {
        return Student11.annualFees * year;
    }
}

class ResearchStudent11 extends Student11 {
    protected String researchArea;
    private static final int annualFees = 10000;

    public ResearchStudent11(String name, int year, String researchArea) {
        super(name, year);
        this.researchArea = researchArea;
    }

    public String getDetails() {
        return this.name + " is a research student with research area" + researchArea + " and he/she is in his/her year: " + year;
    }
}


class PhDStudent1 extends ResearchStudent11 {
    private String thesisTitle;
    private static final int annualFees = 10000;

    public PhDStudent1(String name, int year, String researchArea, String thesisTitle) {
        super(name, year, researchArea);
        this.thesisTitle = thesisTitle;
    }

    public String getDetails() {
        return this.name + " is a PhD student with research area" + researchArea + " and he/she is in his/her year: " + year + ". He/She working on the thesis titled " + thesisTitle;
    }
}




public class University {
    public static void main(String[] a) {

        Student11 s1 = new Student11("karan", 3);
//    System.out.println(s1.getDetails());

        ResearchStudent11 s2 = new ResearchStudent11("siddharth", 4, "Software Engineering");
//    System.out.println(s2.getDetails());

        PhDStudent1 s3 = new PhDStudent1("hari", 1, "Software Engineering", "Automated Evaluation");
//    System.out.println(s3.getDetails());

        Student11[] array = {s1, s2, s3};
        printDetails(array);


    }

    public static void printDetails (Student11 [] students)
    {for (Student11 student: students){
        System.out.println(student.getDetails());
    }
    }
}


