package org.example;
import org.fusesource.jansi.Ansi;
import org.fusesource.jansi.AnsiConsole;

import static org.fusesource.jansi.Ansi.Color.GREEN;
import static org.fusesource.jansi.Ansi.ansi;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        AnsiConsole.systemUninstall();
        System.out.println(Ansi.ansi().fg(Ansi.Color.RED).a("Hello World").reset());
        AnsiConsole.systemUninstall();
        System.out.println(Ansi.ansi().fg(Ansi.Color.BLUE).a("Hello Mundo").reset());
        AnsiConsole.systemUninstall();
        System.out.println(Ansi.ansi().fg(Ansi.Color.YELLOW).a("Hello World").reset());
        AnsiConsole.systemUninstall();
        System.out.println(Ansi.ansi().fg(Ansi.Color.MAGENTA).a("Hello World").reset());
        AnsiConsole.systemUninstall();
        System.out.println(Ansi.ansi().fg(Ansi.Color.CYAN).a("Hello World").reset());
        AnsiConsole.systemUninstall();


    }
}