package bankAccount;

import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main() {
        Scanner consoleInput = new Scanner(System.in);

        for(String command = consoleInput.nextLine(); !command.equals("End"); command = consoleInput.nextLine()) {
            String[] tokens = command.split("\\s+");
            String actualCommand = tokens[0];
            if (actualCommand.equals("Create")) {
                new BankAccount();
            } else if (actualCommand.equals("SetInterest")) {
                int id = Integer.parseInt(tokens[1]);
                int var6 = Integer.parseInt(tokens[2]);
            } else if (!actualCommand.equals("GetInterest")) {
                System.out.println("Invalid command");
            }
        }

    }
}
