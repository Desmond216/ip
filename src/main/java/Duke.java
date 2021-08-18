import java.util.*;
import java.io.*;


public class Duke {
    public static void main(String[] args) throws IOException {
        String logo = " ____        _        \n"
                + "|  _ \\ _   _| | _____ \n"
                + "| | | | | | | |/ / _ \\\n"
                + "| |_| | |_| |   <  __/\n"
                + "|____/ \\__,_|_|\\_\\___|\n";
        System.out.println("Hello from\n" + logo);

        System.out.println("Hello I'm Duke\n What can I do for u");
        System.out.println("--------------------------");
        ArrayList<String> lst = new ArrayList<String>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        while (input.equals("bye") == false) {
            if(input.equals("list") == false) {
                System.out.println("added: " + input);
                lst.add(input);
                System.out.println("--------------------------");
                input = br.readLine();
                continue;
            }
            for(int i = 0; i < lst.size(); i++) {
                System.out.println(i+1 + ": " + lst.get(i));
            }
            System.out.println("--------------------------");
            input = br.readLine();
        }
        System.out.println("Bye. Hope to see you again soon!");
    }
}
