interface Person2 {
    public abstract String getDetails();
    public abstract float computeSalary();
}

class Student15 implements Person2{
    protected final int rollNumber;
    protected int year;

    protected static final int annualFees = 10000;
    protected static final int annualSalary = 15000;

    public Student15(int rollNumber, int year) {
        this.rollNumber = rollNumber;
        this.year = year;
    }


    public String getDetails() {
        return "Roll Number : " + rollNumber + '\n' +
                "Fees : " + this.computeFees();
    }

    protected float computeFees() {
        return Student15.annualFees * year;
    }

    public float computeFees(int annualFees){
        return Student15.annualFees * this.year;
    }

    public float computeSalary() {
        return Student15.annualSalary * this.year;
    }
}

class Professor15 implements Person2 {
    private int employeeNumber;
    private static final float startingSalary = 50000;

    public Professor15(int employeeNumber) {
        this.employeeNumber = employeeNumber;
    }
    public String getDetails(){
        return "Employee Number : " + this.employeeNumber;
    }

    public float computeSalary(){
        return this.startingSalary;

    }

}


class ResearchStudent15 extends Student15 {
    protected String researchArea;
    private static final int annualFees = 10000;

    public ResearchStudent15(int rollNumber, int year, String researchArea) {
        super(rollNumber, year);
        this.researchArea = researchArea;
    }

    protected float computeFees(){
        return Student15.annualFees * this.year*0.9f;
    }


}


public class InterfaceDemo {
    public static void main(String[] a) {

        Student15 s1 = new Student15(200, 2);
        //System.out.println(s1.getDetails());

        ResearchStudent15 s2 = new ResearchStudent15(300, 3, "Software Engineering");
        //System.out.println(s2.getDetails());

        Professor15 p1 = new Professor15(100);

        Person2[] array = {s1, s2, p1};
        printDetails(array);


    }

    public static void  printDetails (Person2 [] persons) {
        for (Person2 person: persons) {
            System.out.println(person.getDetails());
            System.out.println("Salary: " + person.computeSalary());
        }
    }


}


