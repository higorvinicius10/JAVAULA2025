import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //para numeros inteiros//
        int myAGE = 22;

        //para escritas//
        String MyName = "Higor Vinicius";

        //para nunca precisar declarar variavel//
        var myVehicle = "Ford mustang";

        //para numeros não inteiros//
        double MyNumber = 10.0;

        //para apenas uma letra escrita//
        char First = 'A';

        //para verdadeiro ou falso//
        boolean bool = true;


        //conciocionais para determinar uma ação//
        if(primeiro == 'b') {
            System.out.println("Verdadeiro");
        }
        else {
            System.out.println("Falso");
        }

        //Vetores//
        int[] colecaoDeInteiros = {1 ,2 ,3 ,4 ,5};
        System.out.println(colecaoDeInteiros[0]);
        boolean[] colecaoDeBoolean = {true , false , true , false};
        System.out.println(colecaoDeBoolean[3]);

        //ARR//
        String[] nomesArr = new String[10];
        nomesArr[0] = "Hugo";
        nomesArr[1] = "Diana";
        nomesArr[2] = "Bruna";
        nomesArr[3] = "Gilvan";
        nomesArr[4] = "Daniel";

        //arraylists//
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Fernanda");
        nomes.add("Higor");
        nomes.add("Renata");
        nomes.add("Danielle");


        //loops//
        for (int meuInterador = 0; meuInterador < nomes.size(); meuInterador++){
            System.out.println(nomes.get(meuInterador));
        }

        int contador = 0;
        while(contador < 10){
            System.out.println("Estou no while");
            contador++;
        }

        //Casting = mudar o valor de uma variavel//
        double resultado = 0.0;
        int resultadoInt = (int) resultado;

        //casting implicito
        int meuInt = 10;
        double meuDouble = meuInt;

        //casting explicito//
        String meuString = "10";
        int meuInt2 = Integer.parseInt(meuString);
        //ou//
        String minhaString = String.valueOf(meuInt2);

       
        //Estrutura de dados//
        
        //list = permite duplicatas//
        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("WORLD");
        list.add("FERNANDA");
        list.add("KIPPER");
        list.add("KIPPER");
        //para retornar apenas 1 index//
        System.out.println(list.get(1));
      
        //para consultar lista inteira//
        System.out.println("List" + list);


        //lista de sets = não permite duplicata//
        Set<String> setStrings = new HashSet<>();
        setStrings.add("Higor");
        setStrings.add("Donald");
        setStrings.add("Obama");
        setStrings.add("Obama"); // String duplicata NÃO IRÁ SER RETORNADO//

        System.out.println("setStrings:" + setStrings);
        //para verificar se contem ou não o valor X especificado//
        System.out.println("set: " + setStrings.contains("Higor"));

        //MAP = aponta sempre o proximo valor//

        Map<String,String> map = new HashMap<>();
        map.put("Name", "Higor");
        map.put("Surname", "Kipper");
        //acionando index//
        System.out.println(map.get("Name"));

        // QUEUE: aponta para o proximo valor ou anterior //
        Queue<String> queue = new LinkedList<>();
        queue.add("vinicius");
        queue.add("Santos");
        //para printar a fila completa//
        System.out.println("Queue " + queue);

        //para remover o primeiro valor da fila//
        //caso seja usado 2x vai remover o objeto na ordem da fila//
        System.out.println("Queue " + queue.poll());

        //para retornar o primeiro valor da fila
        System.out.println("Queue " + queue.peek());

        //recuperar e remover a cabeça da fila
        System.out.println("Queue " + queue.remove());

        //ver a fila com valor atual//
        System.out.println("Queue " + queue);
        

    }
}

