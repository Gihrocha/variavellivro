import java.util.Scanner;

public class Exercício2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();


        System.out.println(idade +" em dias:" + idade + 365 );
        System.out.println(idade +" em meses:" + idade + 12);






        float valor2 = 8;
         float  valor3= 9;
        float  valor4= 7;
        float  valor5= 4;
        float  valor6= 5;
        float  valor7= 6;



        float soma2= valor2 + valor3 + valor4;
        float soma3= valor6 + valor5 + valor7;
        float media1= soma2 / 3 ;
        float media2= soma3 /3;
        float soma4= media1 + media2;
        float media3 = soma4/ 2;



        System.out.println("O valor da média 7,8,9 é " + media1);
        System.out.println("O valor da média  4,5,6 é " + media2);
        System.out.println("soma das medias " + soma4);
        System.out.println("o valor da média geral é "  + media3);

    }
}
