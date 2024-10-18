package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
        //  Basic Salary <= 10000: taxes - 15%. 10000 < Basic Salary <= 20000:
        //  taxes - 18% Basic Salary > 20000 : taxes - 20% Basic salary < 0 -> "wrong input!"
        if (salary < 0) {
            System.out.println("wrong input!");
            return;
        }

        float salaryAfterTaxes;

        if (salary <= 10000) {
            salaryAfterTaxes = salary - ((float)(salary * 15) / 100);
            System.out.println(salaryAfterTaxes);
        }
        if (salary > 10000 && salary <= 20000) {
            salaryAfterTaxes = salary - ((float)(salary * 18) / 100);
            System.out.println(salaryAfterTaxes);
        }
        if (salary > 20000) {
            salaryAfterTaxes = salary - ((float)(salary * 20) / 100);
            System.out.println(salaryAfterTaxes);
        }
    }
}
