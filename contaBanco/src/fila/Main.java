package fila;

public class Main {

    public static void main(String[] args){

        Fila<String> minhaFila = new Fila<>();

        minhaFila.AdicionaItem("primeiro");
        minhaFila.AdicionaItem("segundo");
        minhaFila.AdicionaItem("terceiro");
        minhaFila.AdicionaItem("quarto");
        
        System.out.println(minhaFila);
        
        // pega o primeiro valor da fila
        System.out.println(minhaFila.proximo());
        
        // vai ao proximo valor da fila
        System.out.println(minhaFila.RemoveItemDoInicioDaFila());
        
        System.out.println(minhaFila);
    }
}
