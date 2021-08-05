package model;

public class Owner extends Usuario{ // Va a heredar todo
    private Wallet wallet;
    
    //Metodo constructor CTOR - Crear objeto
   
    public Owner (String nNombre) {
        super();
        wallet = new Wallet(true);
        setNombre(nNombre);
    }


    public Wallet getWallet() {
        return wallet;
    }

}
