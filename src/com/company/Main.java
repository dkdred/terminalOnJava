package com.company;
import java.util.Scanner;

import com.company.comands.*;

public class Main {
    public static void main(String[] args) {
        Terminal terminal = new Terminal();
        terminal.addComand(new ExitInProgramm());
        terminal.addComand(new GetMoney());
        terminal.addComand(new GetBalance());
        terminal.addComand(new TransferMoney());
        terminal.addComand(new InMoney());

        Scanner in = new Scanner(System.in);
        while (true){
            terminal.printAllComands();
            int operation = in.nextInt();
            if (operation == 0){
                return;
            }
            try {
                terminal.useComandByNumber(operation);
            } catch (Exception exception){
                System.out.println(exception.getMessage());
            }
        }

    }
}
