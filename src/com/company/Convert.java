package com.company;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Convert implements ICommand {

    @Override
    public void execute(String[] input) {
        String str = input[0] + " " + input[1] + " " + Integer.parseInt(input[2]) * 512 + "\n";
        File file = new File("converted.txt");
        try {
            FileWriter writer = new FileWriter(file);
            writer.write(str);
            writer.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public String description() {
        return "Currency converted";
    }
}