package homework_01;

public class StuffForMonthesalary implements Salary{
    double numberSalary=5000.42;


    public void salary(){
        double salaryForYear;
        double salaryForTenYear;

        salaryForYear = numberSalary * 12;
        salaryForTenYear = numberSalary * 12 * 10;

        System.out.println("Salary For 1 year: "+salaryForYear+" $");
        System.out.println("Salary for 10 year: "+salaryForTenYear+" $");
    }
}
