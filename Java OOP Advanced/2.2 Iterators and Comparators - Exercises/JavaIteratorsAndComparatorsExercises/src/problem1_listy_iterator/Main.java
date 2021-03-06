package problem1_listy_iterator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ListyIterator<String> iterator = null;
        String command;
        while(!"END".equalsIgnoreCase(command = reader.readLine())) {
            String[] tokens = command.split("\\s+");
            switch (tokens[0]){
                case "Create":
                    String[] input = new String[tokens.length - 1];
                    for (int i = 1; i < tokens.length; i++) {
                        input[i - 1] = tokens[i];
                    }
                    iterator = new ListyIterator<>(input);
                    break;
                case "Move":
                    System.out.println(iterator.hasNext());
                    if (iterator.hasNext()) {
                        iterator.next();
                    }
                    break;
                case "Print":
                    try {
                        iterator.print();
                    } catch (IllegalArgumentException ie){
                        System.out.println(ie.getMessage());
                    }
                    break;
                case "HasNext":
                    System.out.println(iterator.hasNext());
                    break;
            }
        }
    }
}
