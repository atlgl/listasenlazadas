/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listasdinamicas;

/**
 *
 * @author upam
 */
public class ListaLigadaSimple {
    
    private Nodo raiz=null;
    private Nodo aux=null;
    private int tamanio=0;
    
    public void agregar(int dato){
        if(raiz!=null){
            raiz=new Nodo(dato);
            raiz=aux;
            tamanio++;
        }
        else
        {
            Nodo nodo=new Nodo(dato);
            aux.sig=nodo;
            aux=aux.sig;
            tamanio++;
            
        }
    }
    
}
