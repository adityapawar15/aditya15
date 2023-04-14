import java.util.Scanner;

class PassWord_Generator {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Your New Generated Password is :- ");
        int total = 1; //in.nextInt();
        //System.out.println("How long do you want your random passwords to be? ");
        int length = 8; //in.nextInt();

        String[] randomPasswords = new String[total];

        for (int i = 0; i < total; i++) {
            String randomPassword = "";

            for (int j = 0; j < length; j++) {
                randomPassword += randomCharacter();
            }
            randomPasswords[i] = randomPassword;
        }

        printArray(randomPasswords);

    }

    //Created a function that prints out an array that is passed in as a parameter
    public static void printArray(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static char randomCharacter() {
        int rand = (int) (Math.random() * 62);
        if (rand <= 9) {
            int number = rand + 48;
            return (char) (number);
        } else if (rand <= 35) {
            int uppercase = rand + 55;
            return (char) (uppercase);
        } else {
            int lowercase = rand + 61;
            return (char) (lowercase);
        }
    }

}
