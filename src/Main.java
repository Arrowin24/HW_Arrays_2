public class Main {
    public static void main(String[] args) {
        int[] costs = generateRandomArray();

        //Task1
        System.out.println("Задание 1: ");
        int costsPerMonth = 0;

        for (int cost : costs) {
            costsPerMonth += cost;
        }
        System.out.println("Сумма трат за месяц составила " + costsPerMonth + " рублей");

        //Task2
        System.out.println("Задание 2: ");
        int minCost = costs[0];
        int maxCost = costs[0];

        for (int day = 1; day < costs.length; day++) {
            if (minCost > costs[day]) {
                minCost = costs[day];
            }
            if (maxCost < costs[day]) {
                maxCost = costs[day];
            }
        }

        System.out.println("Минимальная сумма трат за день составила " + minCost + " рублей. " +
                "Максимальная сумма тран за день составила " + maxCost + " рублей.");

        //Task3
        System.out.println("Задание 3: ");
        int averageCost = costsPerMonth / costs.length;
        System.out.println("Средняя сумма трат за месяц составила " + averageCost + " рублей");

        //Task4
        System.out.println("Задание 4: ");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }


    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}