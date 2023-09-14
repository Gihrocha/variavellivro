import java.util.Objects;
import java.util.Scanner;

    public class Livros {
        public static void main(String[] args) {




            Scanner scanner =new Scanner(System.in);


            System.out.println("Nome do Livro:");
            String nome = scanner.next();



            System.out.print("Quantidade de páginas:");
            int livros = scanner.nextInt();

            System.out.println("Nome do autor:");
            String autor = scanner.next();

            System.out.println("Digite s ou n: ");
            String disponivel = scanner.next();


            if (disponivel.equals("s")){
                System.out.println("está disponível");
                System.out.println("autor: " + autor);
                System.out.println("nome: " + nome);
                System.out.println("livros" + livros);
            } else {
                System.out.println(" não está disponível");}

            System.out.println("está disponível");
            System.out.println("autor: " + autor);
            System.out.println("nome: " + nome);
            System.out.println("livros" + livros);

        }
    }






