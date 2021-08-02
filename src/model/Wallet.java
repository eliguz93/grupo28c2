package model;

public class Wallet {

    public static final int LIMITE_BILLETERA = 500000;

    /**
     * Atributes
     * saldo de la billetera 
     * para que las persona las entiendan 
     */
    private int saldo;
    private boolean tieneLimite;

    public Wallet(boolean limite) {
        super(); //Clase como objeto
        saldo = 0;
        tieneLimite = limite;
    }

    public int getSaldo(){
        return saldo;
    }

    public String putSaldo(int valor){
        if(saldo + valor > LIMITE_BILLETERA && tieneLimite){
            return "No puede superar el limite";
        }
        saldo += valor;
        return "Operaciôn exitosa, nuevo saldo " + saldo;
    }

    public String getmoney(int valor){
        if(valor > saldo){
            return "Saldo insuficiente";
        }
        saldo -= valor;
        return "Retiro exitoso, saldo actual " + saldo;
    }

    public String getMoney(int valor){
        if(valor > saldo){
            int saldoTemp = saldo;
            saldo = 0;
            return "Solo se retirô " + saldoTemp;
        }
        saldo -= valor;
        return "Retiro exitoso, saldo actual " + saldo;
    }

    public String getMoney2(int valor){
        if(valor > saldo || tieneLimite){
            int saldoTemp = saldo;
            int valorAdiconal = -10000;
            saldo = 0;
            return "Solo se retirô " + saldoTemp + " Saldo actual " + valorAdiconal;
        }
        saldo -= valor;
        return "Retiro, saldo actual " + saldo;
    }
}
