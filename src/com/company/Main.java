package com.company;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        ArgumentParser argumentParser = new ArgumentParser();
        argumentParser.register("Add", new Add());
        argumentParser.register("Convert", new Convert());
        argumentParser.parse(args,"Add");
        argumentParser.parse(args,"Convert");
    }
}
