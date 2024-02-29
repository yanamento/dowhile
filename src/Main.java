public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int goal = 2_459_000;
        int savings = 15_000;
        int savingsNow = 0;
        int months = 0;
        while (savingsNow < goal) {
            months ++;
            savingsNow += savings;
            System.out.println("Месяц " + months + " сумма накоплений равна " + savingsNow + " рублей");
        }

        System.out.println("Задача 2");
        int number = 1;
        while (number <= 10) {
            if (number < 10){
                System.out.print(number + " ");
            } else {
                System.out.print(number);
            }
            number ++;
        }
        System.out.println();
        for (int i = 10; i >= 1; i--) {
            if (i > 1) {
                System.out.print(i + " ");
            } else {
                System.out.print(i);
            }
        }

        System.out.println();
        System.out.println("Задача 3");
        int allPeople = 12_000_000;
        int birth = 204_000;
        int death = 1_500;
        int year = 1;
        for (year = 1; year <= 10; year++) {
            allPeople += birth;
            allPeople -= death;
            System.out.println("Год " + year + ", численность населения составляет " + allPeople);
        }

        System.out.println("Задача 4");
        int goal2 = 12_000_000;
        int start = 0;
        int savings2 = 15_000;
        double prosent = 1.07;
        for (int month = 1; start < goal2; month++) {
            start += savings2;
            start *= prosent;
            System.out.println("В " + month + " месяце накопилось " + start + " рублей");
        }

        System.out.println("Задача 5");
        int goal3 = 12_000_000;
        float start3 = 0;
        int savings3 = 15_000;
        double prosent3 = 1.07;
        for (int month3 = 1; start3 < goal3; month3++) {
            start3 += savings3;
            start3 *= prosent3;
            if (month3 % 6 == 0){
                System.out.println("В " + month3 + " месяце накопилось " + start3 + " рублей");
            }
        }

        System.out.println("Задача 6");
        double prosentBank = 1.07;
        int time = 1;
        int money = 15_000;
        for (; time <= 108; time++) {
            money *= prosentBank;
            if (time % 6 == 0){
                System.out.println("В " + time + " месяце накопилось " + money + " рублей");
            }
        }

        System.out.println("Задача 7");
        for (int friday = 3; friday < 30; friday += 7) {
            System.out.println("Сегодня пятница " + friday + " необходимо подготовить отчет");
        }

        System.out.println("Задача 8");
        int currentYear = 2023;
        for (int i = 0; i < currentYear + 100; i += 79) {
            if (i > currentYear - 200) {
                System.out.println(i);
            }
        }
    }
}