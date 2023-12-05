package FifthOfDecember;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Identifiable> identifiables = new ArrayList<>();

        String input = scanner.nextLine();

        while (!input.equals("End")){
            String[] token = input.split("\\s+");

            if(token.length == 2){
                //  Robots

                String model = token[0];
                String id = token[1];

                Robot robot = new Robot(id, model);
                identifiables.add(robot);
            } else if(token.length == 3){
                //  Citizen

                String name = token[0];
                int age = Integer.parseInt(token[1]);
                String id = token[2];

                Citizen citizen = new Citizen(name, age, id);
                identifiables.add(citizen);
            } else {
                throw new IllegalArgumentException("Invalid input");
            }

            input = scanner.nextLine();
        }

        String idDigits = scanner.nextLine();

        for (Identifiable identity : identifiables){
            if(identity.getId().endsWith(idDigits)){
                System.out.println(identity.getId());
            }
        }
    }
}


