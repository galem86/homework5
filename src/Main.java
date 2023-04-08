public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

    System.out.println("Задача1");
    int ios = 0;
    int Android = 1;
    int clientOS = 1;
        if(clientOS ==0)

    {
        System.out.println("клиен пользуется " + ios);
    }
        if(clientOS ==1)

    {
        System.out.println("клиент пользуется " + Android);
    }
        System.out.println("задача2");
    int clientDeviceYear = 2019;
    int clienOS = 1;
        if(clienOS ==0&&clientDeviceYear >=2015)

    {
        System.out.println("Установите вессию для IOS по ссылке");
    }else if(clienOS ==0&&clientDeviceYear< 2015)

    {
        System.out.println(" Установите облегченную вессию для IOS по ссылке");
    } else if(clienOS ==1&&clientDeviceYear >=2015)

    {
        System.out.println("Установите вессию для Android по ссылке");
    } else if(clienOS ==1&&clientDeviceYear<2015)

    {
        System.out.println("Установите облегченную вессию для Android по ссылке");
    }else

    {
        System.out.println(" Не подходит");

    }
        System.out.println("задача3");
    int year = 2021;
        if(year %4==0&&year %100!=0||year %400==0)

    {
        System.out.println(year + "Год является высокосным");
    } else

    {
        System.out.println(year + " год является высокостный");
    }
        System.out.println("Задача4");
    int distanse = 95;
    int days = -1;
        if(distanse <=20)

    {
        days = 1;
    }else if(distanse >20&&distanse <=60)

    {
        days = 2;
    } else if(distanse >60&&distanse <=100)

    {
        days = 2;
    }if(days >0)

    {
        System.out.println("Потребуется дней:" + days + "срок доставки");
    }
        System.out.println("Задача5");
    int monthNumber = 14;
        switch(monthNumber)

    {
        case 1:
        case 2:
        case 12:
            System.out.println("зима");
            break;
        case 3:
        case 4:
        case 5:
            System.out.println("весна");
            break;
        case 6:
        case 7:
        case 8:
            System.out.println("Лето");
            break;
        case 9:
        case 10:
        case 11:
            System.out.println("осень");
            break;
        default:
            System.out.println(" неправильный номер месяца");
    }

}}