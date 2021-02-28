package com.company.comands;
import com.company.State;
import com.company.comands.interfaces.Comand;
import java.util.Scanner;
public class GetMoney implements Comand {
    @Override
    public String getName() {
        return "для снятия денег ";
    }

    @Override
    public void execute(State state) throws Exception {
        System.out.println("Введите сумму которую хотите снять с баланса:");
        Scanner in = new Scanner(System.in);
        int sum = Math.abs(in.nextInt());
        state.getUser().minusBalance(sum);
        System.out.println( "У вас на счете осталось" + state.getUser().getBalance());
    }
}
