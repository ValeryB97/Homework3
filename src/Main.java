public class Main {
    public static void main(String[] args) {
        // Задание 1
        byte a = 3;
        System.out.println("Значение переменной a с типом byte равно " + a);
        short b = 7;
        System.out.println("Значение переменной b с типом short равно " + b);
        int c = 968;
        System.out.println("Значение переменной c с типом int равно " + c);
        long d = 435424L;
        System.out.println("Значение переменной d с типом long равно " + d);
        float f = 5.8f;
        System.out.println("Значение переменной f с типом float равно " + f);
        double g = 34.649357;
        System.out.println("Значение переменной g с типом double равно " + g);
        // Задание 2
        float sugar = 27.12f;
        long distance = 987678965549L;
        float coffee = 2.786f;
        short people = 569;
        short money = -159;
        int orange = 27897;
        byte car = 67;
        // Задание 3
        byte oneClass = 23;
        byte twoClass = 27;
        byte threeClass = 30;
        int allClass = oneClass + twoClass + threeClass;
        int paper = 480 / allClass;
        System.out.println("На каждого ученика рассчитано " + paper + " листов бумаги");
        // Задание 4
        byte bottleTwoMinutes = 16;
        int bottleOneMinutes = bottleTwoMinutes / 2;
        int bottleTwentyMinutes = bottleOneMinutes * 20;
        System.out.println("За 20 минут машина произвела " + bottleTwentyMinutes + " штук бутылок");
        int bottleOneDay = bottleOneMinutes * 1440;
        System.out.println("За сутки машина произвела " + bottleOneDay + " штук бутылок");
        int bottleThreeDays = bottleOneMinutes * 4320;
        System.out.println("За 3 дня машина произвела " + bottleThreeDays + " штук бутылок");
        int bottleOneMonth = bottleOneDay * 43200;
        System.out.println("За один месяц машина произвела " + bottleOneMonth + " штук бутылок");
        // Задание 5
        byte whitePaint = 2;
        byte brownPaint = 4;
        int totalClass = 120 / (whitePaint + brownPaint);
        int needWhitePaint = totalClass * whitePaint;
        int needBrownPaint = totalClass * brownPaint;
        System.out.println("В школе, где " + totalClass + " классов, нужно " + needWhitePaint + " банок белой краски и " + needBrownPaint + " банок коричневой краски.");
        // Задание 6
        byte banana = 5;
        short milk = 2;
        byte iceCream = 2;
        byte eggs = 4;
        byte weightBanana = 80;
        byte weightMilk = 105;
        byte weightIceCream = 100;
        byte weightEggs = 70;
        int sportsBreakfast = (banana * weightBanana) + (milk * weightMilk) + (iceCream * weightIceCream) + (eggs * weightEggs);
        float weightKg = sportsBreakfast / 1000f;
        System.out.println("Спортзавтрак весит " + sportsBreakfast + " граммов или " + weightKg + " килограмма");
        // Задание 7
        int loseWeight = 7000;
        int minGramPerDay = 250;
        int maxGramPerDay = 500;
        int needDaysLoseWeight = loseWeight / minGramPerDay;
        System.out.println("Если спортсмен будет терять каждый день по " + minGramPerDay + " граммов ему понадобиться " + needDaysLoseWeight + " дней, чтоб похудеть на " + loseWeight + " граммов");
        int needDaysLoseWeight2 = loseWeight / maxGramPerDay;
        System.out.println("Если спортсмен будет терять каждый день по " + maxGramPerDay + " граммов ему понадобиться " + needDaysLoseWeight2 + " дней, чтоб похудеть на " + loseWeight + " граммов");
        int averageDays = (needDaysLoseWeight + needDaysLoseWeight2) / 2;
        System.out.println("В среднем спортсемену понадобиться " + averageDays + " дней, чтоб похудеть на " + loseWeight + " граммов");
        // Задание 8
        int mashaSalary = 67760;
        int denisSalary = 83690;
        int kristinaSalary = 76230;
        int mashaInreaseSalary = mashaSalary + ((mashaSalary * 10) / 100);
        int mashaPerYearSalary = (mashaInreaseSalary * 12) - (mashaSalary * 12);
        System.out.println("После повышения зарплаты на 10% Маша получает " + mashaInreaseSalary + " рублей. Годовой доход увеличелся на " + mashaPerYearSalary + " рублей");
        int denisInreaseSalary = denisSalary + ((denisSalary * 10) / 100);
        int denisPerYearSalary = (denisInreaseSalary * 12) - (denisSalary * 12);
        System.out.println("После повышения зарплаты на 10% Денис получает " + denisInreaseSalary + " рублей. Годовой доход увеличелся на " + denisPerYearSalary + " рублей");
        int kristinaInreaseSalary = kristinaSalary + ((kristinaSalary * 10) / 100);
        int kristinaPerYearSalary = (kristinaInreaseSalary * 12) - (kristinaSalary * 12);
        System.out.println("После повышения зарплаты на 10% Кристина получает " + kristinaInreaseSalary + " рублей. Годовой доход увеличелся на " + kristinaPerYearSalary + " рублей");
    }
}