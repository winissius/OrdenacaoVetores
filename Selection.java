import java.util.Arrays; // biblioteca para exibir o vetor de forma mais facil

public class Selection {
    public static void selectionSort(int[] v)
    {
        System.out.println(Arrays.toString(v)); // exibe o vetor antes da alteracao
        for(int i = 0; i < v.length - 1; i++)
        {
            int smallPosition = i; // guarda a posicao do menor elemento
            for(int j = i + 1; j < v.length; j++) // varre o vetor a partir da posicao para frente
            {
                if(v[j] <  v[smallPosition])
                {
                    smallPosition = j; // guarda a posicao do menor
                }
            }
            change(v, i, smallPosition);
            System.out.println(Arrays.toString(v));
        }
    }

    public static void change(int [] v, int i, int j) // metodo de troca de posicoes
    {
        int aux = v[i]; // auxiliar para troca
        v[i] = v[j];
        v[j] = aux;
    }
}
