public class Main {
    public static void main(String[] args) {
    task1();
    task2();
    task3();
    task4();
    task5();
    }
    public static void task1(){
        System.out.println("Задача 1");
        char clientOS = 1;
        if(clientOS == 0){
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else{
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }
    public static void task2(){
        System.out.println("Задача 2");
        char clientOS = 0;
        char clientDeviceYear = 2014;
        if (clientOS == 0){
          if (clientDeviceYear < 2015){
              System.out.println("Установите облегченную версию приложения для iOS по ссылке");
          } else{
              System.out.println("Установите версию приложения для iOS по ссылке");
          }
        } else {
            if (clientDeviceYear<2015){
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else{
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }
    }
    public static void task3(){
        System.out.println("Задача 3");
        int year = 2024;
        if (year % 4 == 0){
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }
    public static void task4(){
        System.out.println("Задача 4");
        int deliveryDistance = 95;
        int deliveryDate = 1;
        if( deliveryDistance<20){
            System.out.println("Потребуется дней: " + deliveryDate);
        }else if(deliveryDistance>20 && deliveryDistance<60){
            deliveryDate++;
            System.out.println("Потребуется дней: " + deliveryDate);
        } else if (deliveryDistance>60 && deliveryDistance<100){
            deliveryDate = deliveryDate + 2;
            System.out.println("Потребуется дней: " + deliveryDate);
        } else {
            System.out.println("Доставки нет");
        }
    }
    public static void task5(){
        System.out.println("Задача 5");
        int monthNumber = 12;
        switch (monthNumber){
            case 1, 2, 12:
                System.out.println("Сезон зимы");
                break;
            case 3, 4, 5:
                System.out.println("Сезон весны");
                break;
            case 6, 7, 8:
                System.out.println("Сезон лета");
                break;
            case 9, 11, 10:
                System.out.println("Сезон осени");
                break;
            default:
                System.out.println("Неверное значение");
        }
    }
}
