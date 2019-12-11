package com.company;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ArgumentParser {
    private Map<String, ICommand> commands = new HashMap<>();

    public void parse(String[] input,String key) throws IOException {
        if (input.length > 0 && commands.containsKey(key)) {
            commands.get(key).execute(input);
        }
        else {
            printHelp();
        }
    }

    public void register(String key, ICommand command) {
        commands.put(key, command);
    }

    private void printHelp() {
        for (String key : commands.keySet()) {
            System.out.println(key + "     " + commands.get(key).description());
        }
    }
}
