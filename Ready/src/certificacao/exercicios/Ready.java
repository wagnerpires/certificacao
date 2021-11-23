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

/*
Você deve entender a diferença entre uma classe e uma instância dessa classe. Se você vir um carro na rua, saberá imediatamente que é um carro,
mesmo que não consiga ver qual modelo ou tipo. Isso porque você compara o que vê com a classe “carro”. A classe contém o que é semelhante a
todos os carros. Pense nisso como um modelo ou uma ideia.

Ao mesmo tempo, o carro que você vê é uma instância da classe "carro", pois tem todas as propriedades que você espera: há alguém dirigindo, tem motor, rodas.
Portanto, a classe diz "todos os carros têm uma cor" e a instância diz "este carro específico é vermelho".

No mundo OO, você define a classe e dentro da classe, você define um campo do tipo Color. Quando a classe é instanciada (quando você cria uma
instância específica), a memória é reservada para a cor e você pode dar uma cor a essa instância específica. Como esses atributos são específicos, eles não
são estáticos.

Os campos e métodos estáticos são compartilhados com todas as instâncias. Eles são para valores que são específicos para a classe e não para uma
instância específica. Para métodos, geralmente são métodos auxiliares globais (como Integer.parseInt()). Para campos, geralmente são constantes
(como tipos de carros, ou seja, algo onde você tem um conjunto limitado que não muda com frequência).

Para resolver seu problema, você precisa instanciar uma instância (criar um objeto) de sua classe para que o tempo de execução possa reservar
memória para a instância (caso contrário, instâncias diferentes se sobrescreveriam, o que você não deseja).
*/