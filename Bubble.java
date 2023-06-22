import java.util.Arrays; // importacao de biblioteca para exibicao do array
public class Bubble {
    public static void bubbleSort(int[] v) // static void para poder chamar sem instanciar o objeto
    {
        System.out.println("Bubble sort");
        for (int j = v.length-1; j > 0; j--) // garante a passagem ate a completa ordenacao
        {
            for (int i = 0; i < j; i++) // faz a primeira passagem com trocas de elementos
            {
                if (v[i] > v[i+1])
                {
                    change(v, i); // metodo de troca de posicoes
                }
                System.out.println(Arrays.toString(v)); // exibicao do array para verificar o andamento da sort
            }
        }
    }
    public static void change(int [] v, int i) // metodo de troca de posicoes
    {
        int aux = v[i];
        v[i] = v[i+1];
        v[i+1] = aux;
    }
}

