public class Main {
    public static void main(String[] args) {
        task1(1998);
        task2(0,2018);
        task3(3);
    }

       public static void task1(int checkLeap){
        if (checkLeap(1993)) {
            System.out.println("Год является високосным");
        } else {
            System.out.println("Год не является високосным");
        }
    }
    static boolean checkLeap(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

    public static void task2(int client, int clienDeviceYearr) {
        int ios = 1;
        int android = 0;
        boolean condition = clienDeviceYearr > 2015;
        if (client == ios && condition) {
            System.out.println("Установите  версию приложения для IOS по ссылке");
        } else if (client == ios) {
            System.out.println("Установите облегченную версию для IOS по ссылке");
        }
        if (client == android && condition) {
            System.out.println("Установите  версию приложения для android по ссылке");
        } else if (client == android) {
            System.out.println("Установите облегченную версию для android по ссылке");
        }
    }

    public static void task3(int deliverydistance) {
        if (deliverydistance <= 20) {
            System.out.println("Доставка в пределах 20 км  занимает сутки");
        } else if (deliverydistance > 20 && deliverydistance < 60) {
            System.out.println("доставка от 20 до 60 км занимает 2 суток");
        }
        if (deliverydistance > 60 && deliverydistance < 100) {
            System.out.println("доставка занимает 3 дня");
        } else if (deliverydistance > 100) {
            System.out.println("доставки нет");
        }
    }
}





