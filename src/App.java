public class App {

    private String nombre; 
    private int edad;
    private double estatura;
    private float peso;
    private char inicial;
    private String direccionVivienda; 

    /** Clases */


    public static void main2(String[] args) throws Exception {
        //Operadores aritmeticos
        int resultado = 5+4;
        double resultado2 = 5/4;
        double resultado3 = 12%4;
        resultado++;
        resultado = resultado+1;
        resultado--;
        resultado = -resultado; /** se niega el valor*/
        resultado = +resultado; /** se niega el valor*/

        //Operadores logicos
        boolean respuesta = 5>4;
        respuesta = 25 != 12; /**Diferente */
        respuesta = true;
        respuesta = 15>12 && 5<2; /** igual a and */
        respuesta = 15>12 || 5<2; /** igual a or */

        //Operadores bit a bit - cambiar logica que se puede evaluar - boleanos
        //Operador ^ sor - tambien sirve elevar al cuadrado 
        //Operador &
        //Operador | 


        //Estructuras de control
        if (respuesta) {              //**Se ejecuta dentro de los corchetes */
            //resultado si se cumple la condicion 
        if (respuesta) {
            
        } else {
            
        }           
        }

        int valor = 3;
        switch (valor) {    // Se evalua el primer elemento - if encascado o anidado 
            case 1:
                //bloque de codigo
                break;
        
            case 2:
                //bloque de codigo
                break;

            case 3:
                //bloque de codigo
                break;

            default:   // es el else del if 
                break;

        }

        //ciclos o bucles
        while (valor != 3) {
            //bloque de codigo
        }
        
        do {  //de una en adelante
            //bloque de codigo
        } while (valor != 3);


        for (String string : args) {   ///args es lista - por cada elemento hace algo 
            //bloque del codigo
            
        }
        for (int i = 0; i < args.length; i++) {  // declara la variable de incremento, la segunda es una condicion, la tercera es un incremento
            
        }

        for(;;){}  //For infinito



    }
}
