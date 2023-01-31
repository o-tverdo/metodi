import java.time.LocalDate;

public class Main {

    public static void calculationLeapYear(int i) {
        if (i % 100 != 0 && (i % 4 == 0 || i % 400 == 0)) {
            System.out.println("visokostnii");
        } else {
            System.out.println("НЕ visokostnii");
        }
    }

    public static void findWhatsClient(int clientDeviceYear, int client) {
        if (client == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (client == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (client == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
    }


    public static int countDeliveryDays(int deliveryDistance) {
        int day = 1;
        if (deliveryDistance < 20){
            return day;}
        else if (deliveryDistance >= 20 && deliveryDistance <= 60){
            day+=1;
            return day;}
            else if (deliveryDistance > 60 && deliveryDistance < 100){
                    day+=2;
                return day;}
                else {
                    return day = 0;}
                }






    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }
    public static void task1() {
        System.out.println("Задача 1");
            int year = 2004;
            calculationLeapYear(year);
        }



        public static void task2() {
            System.out.println("Задача 2");
            int currentYear = LocalDate.now().getYear();
            int iosOrAndroid = 1;
            findWhatsClient(currentYear,iosOrAndroid);

        }

        public static void task3() {
            System.out.println("Задача 2");
            int distance = 95;
            int deliveryDays = countDeliveryDays(distance);
            System.out.println(deliveryDays);
        }
    }

