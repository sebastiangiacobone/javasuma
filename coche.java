public class coche {

    private int numPuertas; 
    
    public coche(int numPuertas) 
    {
        this.numPuertas = numPuertas;
    }
    
    public int getNumPuertas()
    {
        return numPuertas;
    }
    
    public void añadirPuerta() 
    {
        numPuertas++;
    }
    
    public static void main(String[] args) {
        
        coche miCoche = new coche(2); // tenemos un deportido tricuerpo con solo dos puertas
        System.out.println("El coche tiene " + miCoche.getNumPuertas() + " puertas."); 

        miCoche.añadirPuerta(); // tenemos un fastback con porton trasero
        System.out.println("El coche tiene " + miCoche.getNumPuertas() + " puertas."); 

        miCoche.añadirPuerta(); // tenemos un familiar de 4 puertas

        System.out.println("El coche tiene " + miCoche.getNumPuertas() + " puertas."); 
        miCoche.añadirPuerta(); // y ahora un SUV de 5 puertas
        System.out.println("El coche tiene " + miCoche.getNumPuertas() + " puertas."); // mostrar el número de puertas del coche

        
    }
}