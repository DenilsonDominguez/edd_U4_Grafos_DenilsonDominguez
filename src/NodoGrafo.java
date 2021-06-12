//Denilson de Jesus Dominguez Herrera
public class NodoGrafo {
    char valor;
    NodoGrafo ant, sig;
    NodoArista aristas;
    
    public NodoGrafo(char v){
        valor = v;
        ant = sig = null;
        aristas = null;
    }
}
