public class TaskThreeCycle {
    public static void main(String[] args) {
        // Задание 1
        System.out.println("Задание 1");
        int i = 0;
        while (i <= 9) {
            i++;
            System.out.print(i + " ");

        }
        System.out.println(" ");
        for (i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println(" ");
        System.out.println(" ");
        // Задание 2
        System.out.println("Задание 2");
        int firstNumFriday = 2; // номер первой пятницы месяца
        for (i = firstNumFriday; i <= 31; i = i + 7) {
            firstNumFriday = i;
            System.out.println("Сегодня пятница " + firstNumFriday + "е число. Необходимо подготовить отчет.");
        }
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Задание 3");

        // Задание 3
        int cometYear = 79;  // периодичность пролета кометы
        int numStartYear = 1896;  // последний раз комета пролетала по условиям задачи
        int numNowYear = numStartYear - cometYear + 200; // cейчас такой год
        int numFinish = numNowYear +100;
        // System.out.println("начало отсчета"+numNowYear);  проверка правильности года по заданию
        //System.out.println("конец отсчета "+numFinish);
        int n;    // последний раз комета была рядом до 2022 года
        for (i = numStartYear; i <= numNowYear; i = i + cometYear) {
            numStartYear = i;
            System.out.println("За последние 200 лет комета была рядом в эти годы:" + numStartYear);
        }
        for (n = i; i <= numFinish && n >= numNowYear; i = n + cometYear) {
            n = i;
            System.out.println("В следующие 100 лет камета будет рядом в эти годы:" + n);
        }
    }
}

