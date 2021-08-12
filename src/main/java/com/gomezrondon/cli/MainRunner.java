package com.gomezrondon.cli;

import org.springframework.stereotype.Component;
import picocli.CommandLine;

import java.util.Locale;


@Component
public class MainRunner {

    @CommandLine.Option(names= {"-o", "option"}, description = "Numerp de option"   )
    private int option = 0;

    public String executeOption() {

        var strBuilder = new StringBuilder().append("\n");
        strBuilder.append("1) gradle clean").append("\n");
        strBuilder.append("2) gradle clean build").append("\n");
        strBuilder.append("3) gradle clean build -x test").append("\n");

        String commandReturned;
        switch (option) {
            case 0:  commandReturned = strBuilder.toString();
                break;
            case 1:  commandReturned = "gradle clean";
                break;
            case 2:  commandReturned = "gradle clean build";
                break;
            case 3:  commandReturned = "gradle clean build -x test";
                break;
            default: commandReturned = "--";
                break;
        }
//        System.out.println(commandReturned);
        return commandReturned;
    }


}
