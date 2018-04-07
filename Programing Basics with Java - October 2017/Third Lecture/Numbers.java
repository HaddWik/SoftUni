import java.util.Scanner;

public class Numbers
{
    public static void main(String[] args) {

        String lastDigit = "";
        String firstDigit = "";
        String allDigits = "";

        Scanner console = new Scanner(System.in);

        int number = Integer.parseInt(console.nextLine());

        if (number < 0 || number > 100) {
            System.out.println("invalid number");
        } else if (number == 0) {
            System.out.println("zero");
        } else {
            if (number / 10 != 1) {
                if (number % 10 == 1) {
                    lastDigit = "one";
                } else if (number % 10 == 2) {
                    lastDigit = "two";
                } else if (number % 10 == 3) {
                    lastDigit = "three";
                } else if (number % 10 == 4) {
                    lastDigit = "four";
                } else if (number % 10 == 5) {
                    lastDigit = "five";
                } else if (number % 10 == 6) {
                    lastDigit = "six";
                } else if (number % 10 == 7) {
                    lastDigit = "seven";
                } else if (number % 10 == 8) {
                    lastDigit = "eight";
                } else if (number % 10 == 9) {
                    lastDigit = "nine";
                } else {
                    lastDigit = "";
                }
            }

            if (number == 100) {
                allDigits = "one hundred";
            } else if (number / 10 == 2) {
                firstDigit = "twenty";
            } else if (number / 10 == 3) {
                firstDigit = "thirty";
            } else if (number / 10 == 4) {
                firstDigit = "forty";
            } else if (number / 10 == 5) {
                firstDigit = "fifty";
            } else if (number / 10 == 6) {
                firstDigit = "sixty";
            } else if (number / 10 == 7) {
                firstDigit = "seventy";
            } else if (number / 10 == 8) {
                firstDigit = "eighty";
            } else if (number / 10 == 9) {
                firstDigit = "ninety";
            } else if (number / 10 == 1) {
                if (number % 10 == 1) {
                    allDigits = "eleven";
                } else if (number % 10 == 2) {
                    allDigits = "twelve";
                } else if (number % 10 == 3) {
                    allDigits = "thirteen";
                } else if (number % 10 == 4) {
                    allDigits = "fourteen";
                } else if (number % 10 == 5) {
                    allDigits = "fifteen";
                } else if (number % 10 == 6) {
                    allDigits = "sixteen";
                } else if (number % 10 == 7) {
                    allDigits = "seventeen";
                } else if (number % 10 == 8) {
                    allDigits = "eighteen";
                } else if (number % 10 == 9) {
                    allDigits = "nineteen";
                } else {
                    allDigits = "ten";
                }
            }

            if (number > 10 && !lastDigit.equals("")) {
                allDigits = firstDigit + " " + lastDigit;
            } else if (number > 19 && number < 100) {
                allDigits = firstDigit;
            } else if (number < 10) {
                allDigits = lastDigit;
            }
            System.out.println(allDigits);
        }
    }
}
