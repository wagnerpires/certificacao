package certificacao.exercicios;

public class Ready {
    protected static int first = 2;
    private final short DEFAULT_VALUE = 10;

    private static class GetSet {
        int first = 5;
        static int second = DEFAULT_VALUE;
    }

    private GetSet go = new GetSet();

    public static void main(String[] begin) {
        Ready r = new Ready();
        System.out.print("[" + r.go.first);
        System.out.print(", " + r.go.second + "]");
    }
}

/*
    A. [2, 5]
    B. [5, 10]
    C. [2, 10]
    D. The code does not compile because of the GetSet class declaration.
    E. The code does not compile for another reason.
 */

/*
    215. D. The final variable DEFAULT_VALUE is not a static variable; therefore, the static nested class
         GetSet cannot access it without a reference to the class. For this reason, the declaration of the static
         nested class GetSet does not compile, and option D is the correct answer. The rest of the code compiles
         without issue. If the DEFAULT_VALUE variable was modified to be static, then the code would compile
         and print [5, 10] at runtime.
 */

/*
    215. D. A variável final DEFAULT_VALUE não é uma variável estática; portanto, a classe aninhada estática
        GetSet não pode acessá-la sem uma referência à classe. Por este motivo, a declaração de classe estática
        aninhada GetSet não compila, e a opção D é a resposta correta. O resto do código compila sem problemas.
        Se a variável DEFAULT_VALUE for modificada para ser estática, o código será compilado e imprimirá [5, 10]
        em tempo de execução.
 */