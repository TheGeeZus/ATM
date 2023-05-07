package application;

import pr.com.*;
import java.util.Scanner;

/**
 *
 * @author Jesus J. Nieves-Padilla
 */
public class Main {

    public static void main(String[] args) {
        Scanner option = new Scanner(System.in);

        String FirstName, LastName, TheAddress, PreConfirmation;
        boolean ConfirmationEmp = false;

        int choice;

        System.out.println("Welcome to the non-GUI BANK System");
        System.out.println("This Software is not intented to be a rollback, it is just for TESTING PURPOSES!");

        do {
            System.out.println("1. REGISTRATION");
            System.out.println("2. BANK Account creation");
            System.out.println("3. BANK LOAN Registration");
            System.out.println("4. BANK ACCOUNT/LOAN Verification");
            System.out.println("5. Profile Check");
            System.out.print("Make your selection (to exit enter 9:");

            choice = option.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter First Name:");
                    FirstName = option.nextLine();
                    System.out.print("Enter Last Name:");
                    LastName = option.nextLine();
                    System.out.print("Enter Address:");
                    TheAddress = option.nextLine();
                    System.out.print("Are you an Employe (Enter \'y\', \'yes\', \'YES\', \'n', \'no\', \'No\' or \'NO' only please!):");
                    PreConfirmation = option.nextLine();
                    if ((PreConfirmation == "y") || (PreConfirmation == "Yes") || (PreConfirmation == "yes") || (PreConfirmation == "YES")) {
                        ConfirmationEmp = true;
                    } else if ((PreConfirmation == "n") || (PreConfirmation == "No") || (PreConfirmation == "no") || (PreConfirmation == "NO")) {
                        ConfirmationEmp = false;
                    } else {
                        System.out.print("ERROR: TRY AGAIN\nAre you an Employe (Enter \'y\', \'yes\', \'YES\', \'n', \'no\', \'No\' or \'NO' only please!):");
                        PreConfirmation = option.nextLine();
                        if ((PreConfirmation == "y") || (PreConfirmation == "Yes") || (PreConfirmation == "yes") || (PreConfirmation == "YES")) {
                            ConfirmationEmp = true;
                        } else if ((PreConfirmation == "n") || (PreConfirmation == "No") || (PreConfirmation == "no") || (PreConfirmation == "NO")) {
                            ConfirmationEmp = false;
                        }
                    }
                    Person p1 = new Person(FirstName, LastName, TheAddress, ConfirmationEmp);
                    break;
                case 2:
                    //HERE
                    break;
                case 3:
                    //HERE
                    break;
                case 4:
                    //HERE
                    break;
                case 5:
                    p1.getFirstName();
                    break;
                case 9:
                    break;
                default:
                    System.out.println("WRONG ENTRY, TRY AGAIN!");
                    break;
            }
        } while (choice != 9);
    }

}
