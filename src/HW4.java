public class HW4 {
    public static void main(String[] args) {
        int deliveryDistance = 95;
        if (deliveryDistance <= 20){
            System.out.println("Потребуется дней: 1");
        } else {
            System.out.println("Потребуется дней: " + (((deliveryDistance-20)/40)+2));
        }


    }
}
