public class Main {
    public static void main(String[] args) {
        System.out.println("Привет, Java!");

        // Задание 1
        int clientIos = 0;
        int clientAndroid = 1;
        if (clientIos == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if (clientAndroid == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        // Задание 2
        int clientDeveYearIos = 2014;
        int clientDeveYearAndroid = 2022;
        if (clientDeveYearIos >=2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        if (clientDeveYearAndroid >=2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }

        // Задание 3
        int year = 2021;
        if (year % 4 == 0 || year % 100 != 0 && year % 400 == 0) {
            System.out.println( year + " год является весокосным");
        } else {
            System.out.println( year + " год не является весокосным");
        }

        // Задание 4
        int deliveryDistance = 95;
        if (deliveryDistance <= 20) {
            System.out.println("На доставку уйдет 1 день");
        } else if (deliveryDistance <= 60) {
            System.out.println("На доставку уйдет 2 дня");
        } else if (deliveryDistance <= 100) {
            System.out.println("На доставку уйдет 3 дня");
        } else {
            System.out.println("Доставка не производиться");
        }

        // Задание 5
        int monthNumber = 12;
        switch (monthNumber) {
            case 12:
            case  1:
            case 2:
                System.out.println("Сейчас зима");
                break;
            case  3:
            case 4:
            case 5:
                System.out.println("Сейчас весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Сейчас лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Сейчас осень");
                break;
            default:
                System.out.println("Неверный номер месяца");
        }

    }
}