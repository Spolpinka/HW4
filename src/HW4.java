public class HW4 {
    public static void main(String[] args) {
        int year = 2300;
        if (year%4 == 0 && year%100 != 0){
            System.out.println(year + " год является високосным");
        } else if (year%400 == 0){
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }
}
