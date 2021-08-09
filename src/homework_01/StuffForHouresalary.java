package homework_01;

public class StuffForHouresalary implements Salary{
    double numberSalary = 20;

    public void salary(){
        double salaryForMonth;
        double salaryForYear;
        double salaryForTenYear;

        salaryForMonth = numberSalary * 12 * 30;
        salaryForYear = numberSalary * 12 * 365;
        salaryForTenYear =  numberSalary * 12 * 365 * 10;

        System.out.println("Salary For 1 month: "+salaryForMonth+" $");
        System.out.println("Salary For 1 year: "+salaryForYear+" $");
        System.out.println("Salary for 10 year: "+salaryForTenYear+" $");

    }
}
