package com.company.comands.interfaces;
import com.company.State;

public interface Comand {
    public String getName();
    public void execute(State state) throws Exception;
}
