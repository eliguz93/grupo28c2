package test_source;

import model.Owner;

public class Testing {

    public Testing(){
        super();
        escenarioOwner();
    }

    public void escenarioOwner(){
        Owner owner1 = new Owner("Juan");
        Owner owner2 = new Owner("Pedro");

        boolean r1 = assertTrue("Juan", owner1.getNombre());
        System.out.println("Prueba nombre" + ((r1)? " Paso": " No paso" )); // Si es verdadrea pasa la primera, si es falasa la segunda
    //Operador ternario ayuda ahorrar codigo
    }

    public boolean assertTrue(String expected, String received){
        if(expected.equals(received)){
            return true;

        }
        return false;
    }
    public boolean assertTrue(int expected, int received) {
        if(expected == received){
            return true;
        }
        return false;
    
    }

    public boolean assertFalse(String expected, String received) {
        if(expected.equals(received)){
            return false;
        }
        return true;
    }
    




}
