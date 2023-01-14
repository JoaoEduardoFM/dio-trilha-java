package listasEncadeada;


public class Main {

    public static void main(String args[]){

        ListaEncadeada<String> minhaListaEncadeada = new ListaEncadeada<>();

        minhaListaEncadeada.add(" indice1 ");
        minhaListaEncadeada.add(" indice2 ");
        minhaListaEncadeada.add(" indice3 ");
        minhaListaEncadeada.add(" indice4 ");

        System.out.println(minhaListaEncadeada.get(0));
        System.out.println(minhaListaEncadeada.get(1));
        System.out.println(minhaListaEncadeada.get(2));
        System.out.println(minhaListaEncadeada.get(3));

        System.out.println(minhaListaEncadeada);

        minhaListaEncadeada.remove(3);

        System.out.println(minhaListaEncadeada);



    }

}
