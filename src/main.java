import java.util.Scanner;
public class main {




    /*
    //opgave 1 bank-konto
    //-----------------------------------------------//
        //globale
    double balance = 0.00;
    String accountName = "Philip";

    //-----------------------------------------------//



    void main(){

        Scanner scan = new Scanner(System.in);

        //Indbetaling på konto//

        System.out.println("Hvor meget ønsker du at sætte ind");
        double depositAmount = scan.nextDouble();
        deposit100(depositAmount);

        // Udbetaling
        System.out.println("Hvor meget vil du trække ud?");
        double withdrawAmount = scan.nextDouble();
        withdraw50(withdrawAmount);

        // Print saldo
        printBalance();

        scan.close();

    }
            // deposit (hvad skal ind på kontoen)
    void deposit100(double amount){
        balance += amount;


    }
        // hvad skal trækkes fra kontoen
    void withdraw50(double amount){
        if (amount > balance) {
            System.out.println("Ikke nok penge på kontoen!");
        } else {
            balance -= amount;
        }
    }
        // her henter vi det der skal printer til slut, til main metoden//
    void printBalance(){

        System.out.println(accountName + ", Du har " + balance + "kr. tilbage på kontoen");
    }

     */


        //opgave 2 grading
    /*

    int assigmentPoint = 0;
    int examePoint = 0;
    int projectPoints = 0;

    void main() {

        addAssignmentPoints(25);
        addExamPoints(40);
        addProjectPoints(30);
        printTotal();

        System.out.println("din karakter er: " + getGrade());

    }

    void addAssignmentPoints(int points) {
        assigmentPoint += points;

    }

    void addExamPoints(int points) {

        examePoint += points;
    }


    void addProjectPoints(int points) {
        projectPoints += points;

    }

    void printTotal() {

        int totalScore = (projectPoints + examePoint + assigmentPoint);
        System.out.println("Sum af dine point " + totalScore);
    }

    String getGrade() {
        int gradeScore = (projectPoints + examePoint + assigmentPoint);
        if ( gradeScore < 50) {
            return "-3";
        } else if (gradeScore < 70) {
            return "00";
        } else if (gradeScore < 80) {
            return "4";

        } else {
            return "12";

        }
    }

     */

    /*

    //opgave 3

    double applyDiscount(double price, double discountPercent) {
        return price * (1 - discountPercent / 100);
    }

    double addTax(double price) {
        return price * 1.25;
    }

    double calculateFinalPrice(double basePrice, double discount) {
        double priceAfterDiscount = applyDiscount(basePrice, discount);
        double finalPrice = addTax(priceAfterDiscount);
        return finalPrice;
    }

    void main() {
        double finalPrice = calculateFinalPrice(500, 20);
        System.out.println("Slutpris: " + finalPrice + " kr");
    }

    */
    // opgave 4
    /*

        void main() {

            int[] numbers = {45, 67, 23, 89, 34, 56, 78};

            System.out.println("max" + findMax(numbers));
            System.out.println("min " + findMin(numbers));
            System.out.println("gennemsnit: " + calculateAverage(numbers));
        }




        int findMax(int[] numbers) {
            int max = numbers[0];
            for (int num : numbers) {
                if (num > max) {
                    max = num;
                }
            }
            return max;
        }

        int findMin(int[] numbers) {
            int min = numbers[0];
            for (int num : numbers) {
                if (num < min) {
                    min = num;
                }
            }
            return min;
        }

        double calculateAverage(int[] numbers) {
            int sum = 0;
            for (int num : numbers) {
                sum += num;
            }
            return (double) sum / numbers.length;
        }

     */

        // opgave 5 kommentar. kan ikke finde debug assigment
}






