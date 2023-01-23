public class homework {
    public static void main(String[] args) {
            task0();
        task1();
        task2();
        task3();
        task4();
    }

    public static void task0() {
        System.out.println();
        System.out.println("Задача №0");
        int[] weights = {90, 91, 93, 92, 85, 87, 88, 89, 0, 0, 0, 0};
        weights[0] = 90;
        int januaryWeights = weights[0];
        System.out.println(januaryWeights);
        System.out.println(weights[0]);
        System.out.println(weights[4]);


        int january = 0;
        System.out.println(weights[january]);
        for (int i = 0; i < weights.length; i++) {
            System.out.println(weights[i]);

        }

    }

    public static void task1() {
        System.out.println();
        System.out.println("Задача №1");
        int[] number = new int[3];
        number[0] = 1;
        number[1] = 2;
        number[2] = 3;
        System.out.println(number[0]);
        System.out.println(number[1]);
        System.out.println(number[2]);
        System.out.println();

        double[] numberA = {1.57, 7.654, 9.986};
        for (int i = 0; i < 3; i++) {
            System.out.println(numberA[i]);

        }
        System.out.println();
        int[] abc = {11, 33, 55, 77, 99};
        for (int i = 0; i < 5; i++) {
            System.out.println(abc[i]);

        }

    }

    public static void task2() {
        System.out.println();
        System.out.println("Задача №2");
        int[] number = new int[3];
        number[0] = 1;
        number[1] = 2;
        number[2] = 3;
        System.out.print(number[0] + ", ");
        System.out.print(number[1] + ", ");
        System.out.print(number[2]);
        System.out.println();

        double[] numberA = {1.57, 7.654, 9.986};
        System.out.print(numberA[0]);
        for (int i = 1; i < 3; i++) {
            System.out.print(", " + numberA[i]);

        }
        System.out.println();

        int[] abc = {11, 33, 55, 77, 99};
        System.out.print(abc[0]);
        for (int i = 1; i < abc.length; i++) {
            System.out.print(", " + abc[i]);

        }
    }

    public static void task3() {
        System.out.println();
        System.out.println();
        System.out.println("Задача №3");
        int[] number = new int[3];
        number[0] = 1;
        number[1] = 2;
        number[2] = 3;
        System.out.print(number[2] + ", ");
        System.out.print(number[1] + ", ");
        System.out.print(number[0]);
        System.out.println();

        double[] numberA = {1.57, 7.654, 9.986};
        System.out.print(numberA[2]);
        for (int i = 1; i >= 0; i--) {
            System.out.print(", " + numberA[i]);

        }
        System.out.println();

        int[] abc = {11, 33, 55, 77, 99};
        System.out.print(abc[4]);
        for (int i = 3; i >= 0; i--) {
            System.out.print(", " + abc[i]);

        }
    }

    public static void task4() {
        System.out.println();
        System.out.println();
        System.out.println("Задача №4");
        int[] abc = {1, 2, 3, 4, 5};

        for (int i = 0; i < 5; i++) {
            if (abc[i]%2!=0)
                abc[i]=abc[i]+1;{
                System.out.print(abc[i]+" ");}


        }


    }
}



