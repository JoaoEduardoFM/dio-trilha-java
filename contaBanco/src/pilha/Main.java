package pilha;

public class Main {

    public static void main(String args[]){
        Pilha minhaPilha = new Pilha();
        minhaPilha.Incrementa(new No(1));
        minhaPilha.Incrementa(new No(2));
        minhaPilha.Incrementa(new No(3));
        minhaPilha.Incrementa(new No(4));
        minhaPilha.Incrementa(new No(5));
        minhaPilha.Incrementa(new No(6));
        minhaPilha.Incrementa(new No(7));

        System.out.println(minhaPilha);

        System.out.println("Topo da pilha " + minhaPilha.topoDaPilha());
        
        System.out.println("decrementa pilha " + minhaPilha.decrementaPilha());
        

    }

}
