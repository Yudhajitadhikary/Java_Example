class Person {
    protected final String name;

    public Person(String name) {
        this.name = name;

    }

    public String getDetails(){
        return "I have no details to share";
    }

}

class Student13 extends Person{

    protected int year;

    protected static final int annualFees = 10000;

    public Student13(String name, int year) {
        super(name);
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

class Professor extends Person {
    private int employeeNumber;
    private static final float startingSalary = 50000;

    public Professor(String name, int employeeNumber){
        super(name);
        this.employeeNumber = employeeNumber;

    }

}


class ResearchStudent13 extends Student13{
    protected String researchArea;
    private static final int annualFees = 10000;

    public ResearchStudent13(String name, int year, String researchArea) {
        super(name, year);
        this.researchArea = researchArea;
    }

    protected float computeFees(){
        return Student12.annualFees * this.year*0.9f;
    }


}


public class WithPersonUnivesity {
    public static void main(String[] a) {

        Student13 s1 = new Student13("karan", 2);
        //System.out.println(s1.getDetails());

        ResearchStudent13 s2 = new ResearchStudent13("siddharth", 3, "Software Engineering");
        //System.out.println(s2.getDetails());

        Professor p1 = new Professor("SKC", 100);

        Person[] array = {s1, s2, p1};
        printDetails(array);


    }

    public static void  printDetails (Person [] persons) {
        for (Person person: persons) {
            System.out.println(person.getDetails());
        }
    }


}

