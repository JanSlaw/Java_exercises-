public class SalaryCalculator {
    
    public double salaryMultiplier(int daysSkipped) {
       boolean sal = daysSkipped >= 5;
        double value = sal ? 0.85 : 1.0;
        return value;
    }

    public int bonusMultiplier(int productsSold) {
        boolean multiple = productsSold>=20;
        int bonus = multiple ? 13 : 10;
        return bonus; 
    }

    public double bonusForProductsSold(int productsSold) {
        return bonusMultiplier(productsSold)*productsSold;
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        
     double Sal = 1000.00 * salaryMultiplier(daysSkipped) + bonusForProductsSold(productsSold);
     boolean condition = Sal>2000.00;
        return condition ? 2000.00:Sal;
        
    } 
}
