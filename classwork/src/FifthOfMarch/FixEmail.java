package FifthOfMarch;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class FixEmail {
    public FixEmail() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> emails = new HashMap();

        for(String name = scanner.nextLine(); !name.equals("stop"); name = scanner.nextLine()) {
            String email = scanner.nextLine();
            if (!email.endsWith("us") || !email.endsWith("uk") || !email.endsWith("com")) {
                emails.put(name, email);
            }
        }

        Iterator var6 = emails.keySet().iterator();

        while(var6.hasNext()) {
            String key = (String)var6.next();
            System.out.println(key + " -> " + (String)emails.get(key));
        }

    }
}
