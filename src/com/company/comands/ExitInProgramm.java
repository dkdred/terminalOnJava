package com.company.comands;

import com.company.State;
import com.company.comands.interfaces.Comand;

public class ExitInProgramm implements Comand {


    @Override
    public String getName() {
        return "Выход из программы ";
    }

    @Override
    public void execute(State state) throws Exception {
        System.out.println("Выходим из программы ");
        System.exit(0);
    }
}
