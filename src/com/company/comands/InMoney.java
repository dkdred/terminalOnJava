package com.company.comands;
import com.company.State;
import com.company.comands.interfaces.Comand;

import java.util.Scanner;

public class InMoney implements Comand {
    @Override
    public String getName() {
        return "для внесения денег ";
    }

    @Override
    public void execute(State state) throws Exception {
        System.out.println("Минимальная сумма внесения на баланс " + state.getUser().getMinBalance());
        System.out.println("Введите сумму которую хотите внести на баланс");
        Scanner in = new Scanner(System.in);
        int sum = Math.abs(in.nextInt());
        state.getUser().plusBalance(sum);
        System.out.println( "У вас на счете осталось" + state.getUser().getBalance());
    }
}
