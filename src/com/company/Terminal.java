package com.company;
import com.company.comands.interfaces.Comand;

import java.util.ArrayList;
import java.util.List;

public class Terminal {
    private List<Comand> comands;
    private State state;

    public Terminal(){
        comands = new ArrayList<>();
        state = new State();
    }

    public void addComand(Comand comand){
        comands.add(comand);
    }

    public void printAllComands(){
        for (int i = 0; i < comands.size(); i ++) {
            // i is the index
             Comand comand = comands.get(i);
            System.out.println(comand.getName() + i);
        }
    }

    public void useComandByNumber(int numberOfComand) throws Exception {
        Comand usingComand = comands.get(numberOfComand);
        usingComand.execute(state);
    }

}
