package view;

import model.Wallet;

public class Vista {
    public static void main2(String[] args) {
        Wallet wallet1 = new Wallet(true);
        Wallet wallet2 = new Wallet(false); //Objeto diferente

        String saldo1 = wallet1.putSaldo(600000);
        // System.out.println(wallet1.getSaldo());
        System.out.println(saldo1);
        String saldo2 = wallet2.putSaldo(200000);
        // System.out.println(wallet2.getSaldo());
        System.out.println(saldo2);
        


    }
    
}
