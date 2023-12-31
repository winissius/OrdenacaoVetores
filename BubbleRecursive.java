import java.util.Arrays; // biblioteca para exibir o vetor de forma mais facil

public class BubbleRecursive {
    public static void bubbleSort(int[] v) // static void para poder chamar sem instanciar o objeto
    {
        for (int i = 0; i < v.length - 1; i++) // faz a passagem dos elementos
        {
            System.out.println(Arrays.toString(v)); // exibicao do vetor
            if (v[i] > v[i+1]) // analise do elemento com o proximo
            {
                change(v, i); // metodo de troca de posicoes
            }
        }
        int countSmaller = 0; // contador de numeros maiores
        for (int i = 0; i < v.length - 1; i++)
        {
            int small = v[0]; // define o menor como o primeiro
            if(v[i] < small)
            {
                countSmaller += 1; // se houverem numeros menores que o primeiro incrementa
            }
        }
        if(countSmaller > 0) // se houverem numeros maiores que o primeiro aciona a recursividade
        {
            bubbleSort(v); // metodo recursivo bubblesort
        }
    }
    public static void change(int [] v, int i) // metodo de troca de posicoes
    {
        int aux = v[i]; // auxiliar para troca
        v[i] = v[i+1];
        v[i+1] = aux;
    }
}