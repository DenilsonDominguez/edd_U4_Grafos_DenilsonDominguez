//Denilson de Jesus Dominguez Herrera
class NodoArista {
    NodoGrafo direccion;
    NodoArista ant, sig;
    
    public NodoArista(NodoGrafo d){
        direccion = d;
        ant = sig = null;
    }

}
