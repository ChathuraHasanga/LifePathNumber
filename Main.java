import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter your birth day to get as one digit!!!");

        boolean isOnRepeat = true;
        String input1 = null;
        int num1 = 0;
        try {
            while (isOnRepeat) {
                Scanner scanner = new Scanner(System.in);

                System.out.println("Enter Your first digit.");
                input1 = scanner.nextLine();
                if (!input1.matches("[0-9]+")) {
                    System.out.println("Please enter valid digit!");
                } else if (input1.matches("[0-9]+") && input1.length() != 1) {
                    System.out.println("Enter valid one digit only");
                } else {
                    num1 = Integer.parseInt(input1);
                    System.out.println("Your first digit is " + num1);
                    isOnRepeat = false;

                }

            }
        } catch (Exception e) {
            System.out.println("Error happen : " + e.getMessage());
        }


        boolean isOnRepeat2 = true;
        String input2 = null;
        int num2 = 0;
        try {
            while (isOnRepeat2) {
                Scanner scanner = new Scanner(System.in);

                System.out.println("Enter Your second digit.");
                input2 = scanner.nextLine();
                if (!input2.matches("[0-9]+")) {
                    System.out.println("Please enter valid digit!");
                } else if (input2.matches("[0-9]+") && input2.length() != 1) {
                    System.out.println("Enter valid one digit only");
                } else {
                    num2 = Integer.parseInt(input2);
                    System.out.println("Your second digit is " + num2);
                    isOnRepeat2 = false;
                }

            }
        } catch (Exception e) {
            System.out.println("Error happen : " + e.getMessage());
        }

        boolean isOnRepeat3 = true;
        String input3 = null;
        int num3 =0;
        try {
            while (isOnRepeat3) {
                Scanner scanner = new Scanner(System.in);

                System.out.println("Enter Your third digit.");
                input3 = scanner.nextLine();
                if (!input3.matches("[0-9]+")) {
                    System.out.println("Please enter valid digit!");
                } else if (input3.matches("[0-9]+") && input3.length() != 1) {
                    System.out.println("Enter valid one digit only");
                } else {
                    num3 =Integer.parseInt(input3);
                    System.out.println("Your third digit is " + num3);
                    isOnRepeat3 = false;
                }

            }
        } catch (Exception e) {
            System.out.println("Error happen : " + e.getMessage());
        }

        boolean isOnRepeat4 = true;
        String input4 = null;
        int num4 =0;
        try {
            while (isOnRepeat4) {
                Scanner scanner = new Scanner(System.in);

                System.out.println("Enter Your fourth digit.");
                input4 = scanner.nextLine();
                if (!input4.matches("[0-9]+")) {
                    System.out.println("Please enter valid digit!");
                } else if (input4.matches("[0-9]+") && input4.length() != 1) {
                    System.out.println("Enter valid one digit only");
                } else {
                    num4 = Integer.parseInt(input4);
                    System.out.println("Your fourth digit is " + num4);
                    isOnRepeat4 = false;
                }

            }
        } catch (Exception e) {
            System.out.println("Error happen : " + e.getMessage());
        }

        boolean isOnRepeat5 = true;
        String input5 = null;
        int num5 =0;
        try {
            while (isOnRepeat5) {
                Scanner scanner = new Scanner(System.in);

                System.out.println("Enter Your fifth digit.");
                input5 = scanner.nextLine();
                if (!input5.matches("[0-9]+")) {
                    System.out.println("Please enter valid digit!");
                } else if (input5.matches("[0-9]+") && input5.length() != 1) {
                    System.out.println("Enter valid one digit only");
                } else {
                    num5 = Integer.parseInt(input5);
                    System.out.println("Your fifth digit is " + num5);
                    isOnRepeat5 = false;
                }

            }
        } catch (Exception e) {
            System.out.println("Error happen : " + e.getMessage());
        }

        boolean isOnRepeat6 = true;
        String input6 = null;
        int num6 =0;
        try {
            while (isOnRepeat6) {
                Scanner scanner = new Scanner(System.in);

                System.out.println("Enter Your sixth digit.");
                input6 = scanner.nextLine();
                if (!input6.matches("[0-9]+")) {
                    System.out.println("Please enter valid digit!");
                } else if (input6.matches("[0-9]+") && input6.length() != 1) {
                    System.out.println("Enter valid one digit only");
                } else {
                    num6  =Integer.parseInt(input6);
                    System.out.println("Your sixth digit is " + num6);
                    isOnRepeat6 = false;
                }

            }
        } catch (Exception e) {
            System.out.println("Error happen : " + e.getMessage());
        }

        boolean isOnRepeat7 = true;
        String input7 = null;
        int num7 = 0;
        try {
            while (isOnRepeat7) {
                Scanner scanner = new Scanner(System.in);

                System.out.println("Enter Your seventh digit.");
                input7 = scanner.nextLine();
                if (!input7.matches("[0-9]+")) {
                    System.out.println("Please enter valid digit!");
                } else if (input7.matches("[0-9]+") && input7.length() != 1) {
                    System.out.println("Enter valid one digit only");
                } else {
                    num7 = Integer.parseInt(input7);
                    System.out.println("Your seventh digit is " + num7);
                    isOnRepeat7 = false;
                }

            }
        } catch (Exception e) {
            System.out.println("Error happen : " + e.getMessage());
        }

        boolean isOnRepeat8 = true;
        String input8 = null;
        int num8 = 0;
        try {
            while (isOnRepeat8) {
                Scanner scanner = new Scanner(System.in);

                System.out.println("Enter Your eight digit.");
                input8 = scanner.nextLine();
                if (!input8.matches("[0-9]+")) {
                    System.out.println("Please enter valid digit!");
                } else if (input8.matches("[0-9]+") && input8.length() != 1) {
                    System.out.println("Enter valid one digit only");
                } else {
                    num8 = Integer.parseInt(input8);
                    System.out.println("Your eight digit is " + num8);
                    isOnRepeat8 = false;
                }

            }
        } catch (Exception e) {
            System.out.println("Error happen : " + e.getMessage());
        }

        Integer sum = num1 + num2 + num3 + num4 + num5 + num5 + num6 + num7 + num8;
        System.out.println("Sum of numbers is: " + sum);

        while (sum >= 10) {
            int temp = 0;
            while (sum > 0) {
                temp += sum % 10;
                sum /= 10;
            }
            sum = temp;
        }
        System.out.println("Your Life Path Number is: " + sum);

    }
}