package com.company;
import java.io.*;

public class Add implements ICommand {

    @Override
    public void execute(String[] input) throws IOException {
        String str = input[0] + " " + input[1] + " " + input[2] + "\n";
        File file = new File("currency.txt");
        try {
            FileWriter writer = new FileWriter(file);
            writer.write(str);
            writer.close();
        }
        catch(IOException ex)
        {
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public String description() {
        return "Added new currency";
    }

}
