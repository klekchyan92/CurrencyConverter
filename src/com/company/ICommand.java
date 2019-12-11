package com.company;
import java.io.IOException;

public interface ICommand {
    void execute(String[] input) throws  IOException;
    String description();
}