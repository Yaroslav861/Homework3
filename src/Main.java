public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }
    private static void task1() {
        System.out.println("Задание 1");
        int one = 11254548;
        System.out.println("Значение переменной one с типом int равно " + one);
        byte two = 122;
        System.out.println("Значение переменной two с типом byte равно " + two);
        short three = 31254;
        System.out.println("Значение переменной three  с типом short равно " + three);
        long four = 265478912345l;
        System.out.println("Значение переменной four  с типом long равно " + four);
        float five = 5.55555f;
        System.out.println("Значение переменной five  с типом float равно " + five);
        double six = 6.666666666;
        System.out.println("Значение переменной six с типом double равно " + six);
    }

    private static void task2() {
        System.out.println("Задание 2");
        float a = 27.12f;
        long b = 987678965549l;
        double c = 2.786f;
        short d = 569;
        short e = -159;
        int f = 27897;
        byte g = 67;
    }
    private static void task3() {
        System.out.println("Задание 3");
        byte LPStudents = 23;
        byte ASStudents = 27;
        byte EAStudents = 30;
        short allPaper = 480;
        byte allStudents = (byte) (LPStudents+ASStudents+EAStudents);
        byte PaperOneStudents = (byte) (allPaper/allStudents);
        System.out.println("На каждого ученика рассчитано " + PaperOneStudents + " листов бумаги.");
    }
    private static void task4() {
        System.out.println("Задание 4");
        byte bottles = 16;
        byte min = 2;
        byte bottlesInOneMin = (byte) (bottles/min);
        short bottles20min = (short) (20*bottlesInOneMin);
        System.out.println("За 20 минут машина произвела " + bottles20min + " штук бутылок.");
        short min24Hours = 24*60;
        short bottlesIn24Hours = (short) (min24Hours*bottlesInOneMin);
        System.out.println("За 24 часа машина произвела " + bottlesIn24Hours + " штук бутылок");
        short min3Day = 24*3*60;
        int bottlesIn3day = (min3Day*bottlesInOneMin);
        System.out.println("За 3 дня машина произвела " + bottlesIn3day + " штук бутылок.");
        int min31day = 31*24*60;
        int bottlesIn31day = min31day*bottlesInOneMin;
        System.out.println("За 1 месяц машина произвела " + bottlesIn31day + " штук бутылок.");
    }

    private static void task5() {
        System.out.println("Задание 5");
        byte allPaint = 120;
        byte whitePaint = 2;
        byte brownPaint = 4;
        byte oneClassPaint = (byte) (whitePaint+brownPaint);
        byte allClassSchool = (byte) (allPaint/oneClassPaint);
        byte allWhitePaint = (byte) (allClassSchool*whitePaint);
        byte allBrownPaint = (byte) (allClassSchool*brownPaint);
        System.out.println("В школе, где " + allClassSchool + " классов, нужно " + allWhitePaint + " банок белой краски и " + allBrownPaint + " банок коричневой краски.");

    }

    private static void task6() {
        System.out.println("Задание 6");
        byte banana = 5;
        short milk = 200;
        byte iceCream = 2;
        byte rawEggs = 4;
        byte weight1Banana = 80;
        byte weight100MgMilk = 105;
        byte weight100GIceCream = 100;
        byte weight1RawEggs = 70;
        float OneKG1000g = 1000.0f;
        short allWeightBanana = (short) (banana*weight1Banana);
        short allWeightMilk = (short) (milk/100*weight100MgMilk);
        short allWeightIceCream = (short) (iceCream*weight100GIceCream);
        short allWeightRawEggs = (short) (weight1RawEggs*rawEggs);
        short allWeightProductsG = (short) (allWeightBanana+allWeightMilk+allWeightIceCream+allWeightRawEggs);
        System.out.println ("Общий вес продуктов в граммах = " + allWeightProductsG);
        float allWeightProductsKg = (float) (allWeightProductsG/OneKG1000g);
        System.out.println ("Общий вес продуктов в КГ = " + allWeightProductsKg);
    }

    private static void task7() {
        System.out.println("Задание 7");
        byte loseWeight = 7;
        short weightLossPerDayA = 250;
        short weightLossPerDayB = 500;
        short OneKG1000g = 1000;
        short loseWeightInGrams = (short) (loseWeight*OneKG1000g);
        short Loss250gPerDay = (short) (loseWeightInGrams/weightLossPerDayA);
        System.out.println("Если спортсмен будет скидывать каждый день по 250г то он скинет 7кг за " + Loss250gPerDay + " дней.");
        short Loss500gPerDay = (short) (loseWeightInGrams/weightLossPerDayB);
        System.out.println("Если спортсмен будет скидывать каждый день по 500г то он скинет 7кг за " + Loss500gPerDay + " дней.");
    }

    private static void task8() {
        System.out.println("Задание 8");
        int salaryMashaMonth2022 = 67760;
        int salaryDenisMonth2022 = 83690;
        int salaryKristinaMonth2022 = 76230;
        short salaryIncreaseMasha = (short) (salaryMashaMonth2022*10/100);
        short salaryIncreaseDenis = (short) (salaryDenisMonth2022*10/100);
        short salaryIncreaseKristina = (short) (salaryKristinaMonth2022*10/100);
        int salaryMashaMonth2023 = salaryMashaMonth2022+salaryIncreaseMasha;
        int salaryDenisMonth2023 = salaryDenisMonth2022+salaryIncreaseDenis;
        int salaryKristinaMonth2023 = salaryKristinaMonth2022+salaryIncreaseKristina;
        int annualIncomeMasha2022 = salaryMashaMonth2022*12;
        int annualIncomeDenis2022 = salaryDenisMonth2022*12;
        int annualIncomeKristina2022 = salaryKristinaMonth2022*12;
        int annualIncomeMasha2023 = salaryMashaMonth2023*12;
        int annualIncomeDenis2023 = salaryDenisMonth2023*12;
        int annualIncomeKristina2023 = salaryKristinaMonth2023*12;
        int differenceInAnnualIncomeMasha = annualIncomeMasha2023-annualIncomeMasha2022;
        int differenceInAnnualIncomeDenis = annualIncomeDenis2023-annualIncomeDenis2022;
        int differenceInAnnualIncomeKristina = annualIncomeKristina2023-annualIncomeKristina2022;
        System.out.println("Маша теперь получает " + salaryMashaMonth2023 + " рублей. Годовой доход вырос на " + differenceInAnnualIncomeMasha + " рублей.");
        System.out.println("Денис теперь получает " + salaryDenisMonth2023 + " рублей. Годовой доход вырос на " + differenceInAnnualIncomeDenis + " рублей.");
        System.out.println("Кристина теперь получает " + salaryKristinaMonth2023 + " рублей. Годовой доход вырос на " + differenceInAnnualIncomeKristina + " рублей.");
    }
}
