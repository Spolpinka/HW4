import static java.lang.Math.pow;

public class HW4 {
    public static void main(String[] args) {
        int deliveryDistance = 95;
        if (deliveryDistance <= 20){
            System.out.println("Потребуется дней: 1");
        } else {
            System.out.println("Потребуется дней: " + (((deliveryDistance-20)/40)+2));
        }

        int age = 23;
        int salary = 58000;
        double koef = 0;
        if (age >= 23){
            koef = 3;
        } else {
            koef = 2;
        }
        if (salary >= 80000){
            koef = koef*1.5;
        } else if (salary >= 50000) {
            koef = koef*1.2;
        }
        int limit = (int) (salary*koef);
        System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + limit + " рублей");

        age = 25;
        salary = 60000;
        int wantedSumm = 500000;
        double basePersent = 10;
        int kreditTime = 12;
        double mounthlyMaxPayment = salary/2;
        if (age < 23){
            basePersent += 1;
        } else if (age < 30) {
            basePersent += 0.5;
        }
        if (salary > 80000){
            basePersent -= 0.7;
        }
        double annuitetK = basePersent/kreditTime/100 * pow((1+basePersent/kreditTime/100),kreditTime)/ (pow((1+basePersent/kreditTime/100),12) - 1);
        double annuitetSum = wantedSumm * annuitetK;
        System.out.print("Максимальный платеж при ЗП " + salary + " равен " + mounthlyMaxPayment + " рублей.");
        if (mounthlyMaxPayment < annuitetSum) System.out.println(" Отказано.");
        else System.out.println(" Одобрено.");

    }
}
