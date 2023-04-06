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

    public static void task1 () {
        System.out.println("Задача 1");
        int monthProfit = 3500000;
        System.out.println("Выручка за месяц " + monthProfit + " рублей");
        byte employees = 5;
        System.out.println("Количество сотрудников " + employees + " человек");
        short employee1Salary = 30000;
        System.out.println("Средняя зарплата сотрудников " + employee1Salary + " рублей");
        long lastYearDividends = 4700000L;
        System.out.println("Дивиденды за прошлый год " + lastYearDividends + " рублей");
        float taxRate = 0.4F;
        System.out.println("Ставка налога " + taxRate + " %");
        double index = 3.3333333333333;
        System.out.println("Значение коэффициента " + index);
    }

    public static void task2 () {
        System.out.println("Задача 2");
        float taxRate = 27.12F;
        System.out.println("Ставка налога " + taxRate + " %");
        long annualIncome = 987678965549L;
        System.out.println("Выручка за год " + annualIncome + " рублей");
        double index = 2.786;
        System.out.println("Значение коэффициента " + index);
        short employees = 569;
        System.out.println("Количество сотрудников " + employees + " человек");
        short overPaid = -159;
        System.out.println("Переплата по налогу на прибыль " + overPaid + " рублей");
        short employee1Salary = 27897;
        System.out.println("Средняя зарплата сотрудников " + employee1Salary + " рублей");
        byte employeesFired = 67;
        System.out.println("Уволено за год " + employeesFired + " сотрудников");
    }

    public static void task3 () {
        System.out.println("Задача 3");
        short pupils1 = 23;
        short pupils2 = 27;
        short pupils3 = 30;
        short sheetsBought = 480;
        int totalPupils = pupils1 + pupils2 + pupils3;
        int sheetsPerPupil = sheetsBought / totalPupils;
        System.out.println("На каждого ученика рассчитано " + sheetsPerPupil + " листов бумаги");
    }

    public static void task4 () {
        System.out.println("Задача 4");
        short time1 = 2;
        short performance1 = 16;
        int bottlesMadePerMinute = performance1 / time1;
        System.out.println("Изготовлено бутылок за 1 минуту " + bottlesMadePerMinute);
        short time2 = 20;
        int performance2 = bottlesMadePerMinute * time2;
        System.out.println("За " + time2 + " минут машина произвела " + performance2 + " штук бутылок");
        short time3InDays = 1;
        int time3InHours = time3InDays * 24;
        int time3InMinutes = time3InHours * 60;
        int performance3 = bottlesMadePerMinute * time3InMinutes;
        System.out.println("За " + time3InDays + " сутки машина произвела " + performance3 + " штук бутылок");
        short time4InDays = 3;
        int time4InHours = time4InDays * 24;
        int time4InMinutes = time4InHours * 60;
        int performance4 = bottlesMadePerMinute * time4InMinutes;
        System.out.println("За " + time4InDays + " дня машина произвела " + performance4 + " штук бутылок");
        short time5InMonths = 1;
        int time5InDays = time5InMonths * 30;
        int time5InHours = time5InDays * 24;
        int time5InMinutes = time5InHours * 60;
        int performance5 = bottlesMadePerMinute * time5InMinutes;
        System.out.println("За " + time5InMonths + " месяц машина произвела " + performance5 + " штук бутылок");
    }

    public static void task5 () {
        System.out.println("Задача 5");
        short totalPaintCansBought = 120;
        short whitePaintCansNeededPer1Classroom = 2;
        short brownPaintCansNeededPer1Classroom = 4;
        int totalPaintCansNeededPer1Classroom = whitePaintCansNeededPer1Classroom + brownPaintCansNeededPer1Classroom;
        int totalClassroomsInSchool = totalPaintCansBought / totalPaintCansNeededPer1Classroom;
        int whitePaintCansBought = totalClassroomsInSchool * whitePaintCansNeededPer1Classroom;
        int brownPaintCansBought = totalClassroomsInSchool * brownPaintCansNeededPer1Classroom;
        System.out.println("В школе, где " + totalClassroomsInSchool + " классов, нужно " + whitePaintCansBought + " банок белой краски и " + brownPaintCansBought + " банок коричневой краски");
    }

    public static void task6 () {
        System.out.println("Задача 6");
        short bananaWeightInGrams = 80;
        short milkWeightInGrams = 105;
        short iceCreamBriquetteWeightInGrams = 100;
        short eggWeightInGrams = 70;
        short bananasNeeded = 5;
        short milkNeeded = 2;
        short iceCreamNeeded = 2;
        short eggsNeeded = 4;
        int bananasNeededInGrams = bananaWeightInGrams * bananasNeeded;
        int milkNeededInGrams = milkWeightInGrams * milkNeeded;
        int iceCreamNeededInGrams = iceCreamBriquetteWeightInGrams * iceCreamNeeded;
        int eggsNeededInGrams = eggWeightInGrams * eggsNeeded;
        int totalWeightInGrams = bananasNeededInGrams + milkNeededInGrams + iceCreamNeededInGrams + eggsNeededInGrams;
        System.out.println("Вес всех ингредиентов в граммах - " + totalWeightInGrams + " г");
        float totalWeightInKilograms = totalWeightInGrams / 1000F;
        System.out.println("Вес всех ингредиентов в килограммах - " + totalWeightInKilograms + " кг");
    }

    public static void task7 () {
        System.out.println("Задача 7");
        short kilosNeededToLose = 7;
        short weightLostPerDayInGrams1 = 250;
        float weightLostPerDayInKilograms1 = weightLostPerDayInGrams1 / 1000F;
        short weightLostPerDayInGrams2 = 500;
        float weightLostPerDayInKilograms2 = weightLostPerDayInGrams2 / 1000F;
        int averageWeightLostPerDayInGrams = weightLostPerDayInGrams1 + weightLostPerDayInGrams2;
        float averageWeightLostPerDayInKilograms = averageWeightLostPerDayInGrams / 1000F;
        float daysNeededToLoseWeight1 = kilosNeededToLose / weightLostPerDayInKilograms1;
        float daysNeededToLoseWeight2 = kilosNeededToLose / weightLostPerDayInKilograms2;
        float daysNeededToLoseWeight3 = kilosNeededToLose / averageWeightLostPerDayInKilograms;
        System.out.println("Если спортсмен будет терять каждый день по " + weightLostPerDayInGrams1 + " грамм, " + daysNeededToLoseWeight1 + " дней уйдет на похудение");
        System.out.println("Если спортсмен будет терять каждый день по " + weightLostPerDayInGrams2 + " грамм, " + daysNeededToLoseWeight2 + " дней уйдет на похудение");
        System.out.println("В среднем, чтобы добиться результата похудения, может потребоваться " + daysNeededToLoseWeight3 + " дней");
    }

    public static void task8 () {
        System.out.println("Задача 8");
        int monthSalaryOfMasha = 67760;
        int monthSalaryOfDenis = 83690;
        int monthSalaryOfKristina = 76230;
        byte growthRateInPercentage = 10;
        float growthRate = growthRateInPercentage / 100F;
        float monthSalaryGrowthOfMasha = monthSalaryOfMasha * growthRate;
        float newMonthSalaryOfMasha = monthSalaryOfMasha + monthSalaryGrowthOfMasha;
        float monthSalaryGrowthOfDenis = monthSalaryOfDenis * growthRate;
        float newMonthSalaryOfDenis = monthSalaryOfDenis + monthSalaryGrowthOfDenis;
        float monthSalaryGrowthOfKristina = monthSalaryOfKristina * growthRate;
        float newMonthSalaryOfKristina = monthSalaryOfKristina + monthSalaryGrowthOfKristina;
        int annualSalaryOfMashaBeforeGrowth = monthSalaryOfMasha * 12;
        float newAnnualSalaryOfMasha = newMonthSalaryOfMasha * 12;
        float annualSalaryGrowthOfMasha = newAnnualSalaryOfMasha - annualSalaryOfMashaBeforeGrowth;
        int annualSalaryOfDenisBeforeGrowth = monthSalaryOfDenis * 12;
        float newAnnualSalaryOfDenis = newMonthSalaryOfDenis * 12;
        float annualSalaryGrowthOfDenis = newAnnualSalaryOfDenis - annualSalaryOfDenisBeforeGrowth;
        int annualSalaryOfKristinaBeforeGrowth = monthSalaryOfKristina * 12;
        float newAnnualSalaryOfKristina = newMonthSalaryOfKristina * 12;
        float annualSalaryGrowthOfKristina = newAnnualSalaryOfKristina - annualSalaryOfKristinaBeforeGrowth;
        System.out.println("Маша теперь получает " + newMonthSalaryOfMasha + " рублей. Годовой доход вырос на " + annualSalaryGrowthOfMasha + " рублей");
        System.out.println("Денис теперь получает " + newMonthSalaryOfDenis + " рублей. Годовой доход вырос на " + annualSalaryGrowthOfDenis + " рублей");
        System.out.println("Кристина теперь получает " + newMonthSalaryOfKristina + " рублей. Годовой доход вырос на " + annualSalaryGrowthOfKristina + " рублей");
    }
}