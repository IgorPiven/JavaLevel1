import java.util.Scanner;

public class Main {

    // Methods

    public static float exprCalc(float a, float b, float c, float d){
        return a * (b + (c / d)); }


        public static boolean varCompare (int a, int b) {
            int sum = a + b;

            if (sum >=10 && sum <=20) return true;
            else
                return false;

        }

                public static String checkPosNeg (int a) {
                    String result;
                    if (a >= 0)
                        result = "Число положительное";
                    else
                        result = "Число отрицательное";

                    return result;

                }

                    public static boolean checkTrueFalse (int a) {

                        if (a >= 0)
                            return false;
                        else
                            return true;
                    }

                        public static void helloName (String name) {

                            System.out.println("Привет, " + name);
                        }

                                public static String checkYear(int year) {

                                    String yearType;

                                    if (((year % 4) == 0 && (year % 100) != 0) || ((year % 4) == 0 && (year % 100) == 0 && (year % 400) == 0))
                                        yearType = "Данный год високосный";
                                    else yearType = "Данный год не високосный";

                                    return yearType;
                                }


    public static void main(String[] args) {

        //Task2
        byte varByte = 12;
        short varShort = 12000;
        int varInt = 534567;
        long varLong = 100000L;
        float varFloat = 1.24F;
        double varDouble = 5.567;
        char varChar = 'X';
        boolean varBoolean = true;



            // Task 3
            float a = 1.0F;
            float b = 2.5F;
            float c = 6.3F;
            float d = 3.2F;

            System.out.println(exprCalc(a,b,c,d));


                // Task 4
                System.out.println("Введите 2 целых числа");
                Scanner in = new Scanner(System.in);

                int varA = in.nextInt();
                int varB = in.nextInt();

                System.out.println(varCompare(varA,varB));


                    // Task 5
                    System.out.println("Введите целое число");
                    Scanner in1 = new Scanner(System.in);

                    int posnegA = in1.nextInt();

                    System.out.println(checkPosNeg(posnegA));


                        //Task 6
                        System.out.println("Введите целое число");
                        Scanner in2 = new Scanner(System.in);

                        int varTF = in2.nextInt();

                        System.out.println(checkTrueFalse(varTF));


                            //Task7
                            System.out.println("Введите имя");
                            Scanner in3 = new Scanner(System.in);

                            String name = in3.nextLine();

                            helloName(name);


                                //Task8
                                System.out.println("Введите год");
                                Scanner in4 = new Scanner(System.in);

                                int year = in4.nextInt();
                        
                                System.out.println(checkYear(year));

    }

}
