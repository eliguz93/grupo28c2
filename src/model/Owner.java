package model;

public class Owner extends Usuario{ // Va a heredar todo
    private Wallet wallet;
    
    //Metodo constructor CTOR - Crear objeto
   
    public Owner (String nNombre) {
        super();
        wallet = new Wallet(true);
        setNombre(nNombre);
    }

    @Override //Sobreescritura metodo del padre - polimorfismo 
    public String getNombre() { //Clase usururio de owner 
        // TODO Auto-generated method stub
        return super.getNombre();
    }

    public Wallet getWallet() {
        return wallet;
    }

}
