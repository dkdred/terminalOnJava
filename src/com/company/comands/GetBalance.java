package com.company.comands;
import com.company.State;
import com.company.comands.interfaces.Comand;

public class GetBalance implements Comand {



    @Override
    public String getName() {
        return "для просмотра счета ";
    }

    @Override
    public void execute(State state) throws Exception {
        System.out.println(" У вас на счету: " + state.getUser().getBalance());
    }
}
