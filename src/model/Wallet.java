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
    private int meta;

    public Wallet(boolean limite) {
        super(); //Clase como objeto
        saldo = 0;
        meta = 0;
        tieneLimite = limite;
    }

    public Wallet(boolean limite, int saldo) {  //Sobreescritura 
        super(); //Clase como objeto
        this.saldo = saldo;
        meta = 0;
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
        if(verificarMeta()){System.out.println("Has superado la meta!");}
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
    

    public String definirMeta(int valor){
        if(valor == 0){
            meta = valor;
            return "Nueva meta agregada!";
        }
        if(valor > LIMITE_BILLETERA && tieneLimite){
            return "No se puede establecer una meta mas alta que el limite";
        }
        if(valor<0){
            return "Valor ingresado no valido";
        }
        if(valor<=saldo){
            return "Ya has superado este valor";
        }
        meta = valor;
        return "Nueva meta agregada!";
    }

    public boolean verificarMeta(){
        if(saldo >= meta && meta > 0){
            return true;
        }
        return false;
    }

    public String breakLimites(){
        if(!tieneLimite){
            return "Error. Su cuenta es sin limites";
        }
        if (saldo < 10000){
            return "Error. Romper el limite tiene un costo de 10000, usted tiene " + saldo;
        }
        saldo -= 10000;
        tieneLimite = false;
        return "Operacion exitosa. Su cuenta ahora es sin limite. nuevo saldo: " + saldo;
        
    }



}
