import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.

    System.out.println("Hello and welcome!");
        int valor= 10;

        System.out.println("Variavél do tipo  int  :" + valor);


        byte MyVariavelByte = 10;

        System.out.println("byte:" + MyVariavelByte);


        short MyVariavelShort = 10;

        System.out.println("Variavel do tipo short:" + MyVariavelShort);


        long MyVariavelLong = 200000000000L ;

System.out.println("Variavel do tipo long" + MyVariavelLong);


    boolean MyVarianvelBoolean = false;

        System.out.println("Variavel do tipo boolean" + MyVarianvelBoolean);

        if (MyVarianvelBoolean == true){
            System.out.println("A variavel é true");
        } else {
            System.out.println("A variavel é falsa");}

        char MyVariavelchar = 'a';

        System.out.println("Variavel do tipo char " + MyVariavelchar);

        String MyVarianvelString = "kkkkkkkkk22222222";

        System.out.println("Variavel string: " + MyVarianvelString);


        float MyVariavelFloat = 3.14f;
        System.out.println("Variavel do tipo float " +  MyVariavelFloat);


        int MyVariavelInt = 10000000;
        System.out.println("Variavel do tipo Int " +  MyVariavelInt);

        double  MyVariavelDouble = 3.14159265359;
        System.out.println("Variavel do tipo double " +  MyVariavelDouble);




        int valor1=  12;
        int valor2= 13;

        int soma = valor1 + valor2;

        System.out.println("A soma de " + valor1 + " e " + valor2 + " é igual a " + soma);



Scanner scanner = new Scanner(System.in);
        System.out.println ("Digite um número");
        System.out.println("Digite o primeiro número");
        int numero2 = scanner.nextInt();

        System.out.println ("Digite um número");
        System.out.println("Digite o segundo número");
        int numero3 = scanner.nextInt();

soma = numero2 + numero3;
System.out.println("A soma é "+soma);
        scanner.close();

        System.out.println ("Digite um número");
        System.out.println("Digite o primeiro número");
        int numero4 = scanner.nextInt();

        System.out.println ("Digite um número");
        System.out.println("Digite o segundo número");
        int numero5 = scanner.nextInt();

        soma = numero4 - numero5;
        System.out.println("A subtração é "+soma);
        scanner.close();




        System.out.println ("Digite um número");
        System.out.println("Digite o primeiro número");
        int numero6 = scanner.nextInt();

        System.out.println ("Digite um número");
        System.out.println("Digite o segundo número");
        int numero7 = scanner.nextInt();

        soma = numero6 * numero7;
        System.out.println("A Multiplicação é "+soma);
        scanner.close();



        System.out.println ("Digite um número");
        System.out.println("Digite o primeiro número");
        int numero8 = scanner.nextInt();

        System.out.println ("Digite um número");
        System.out.println("Digite o segundo número");
        int numero9 = scanner.nextInt();

        soma = numero8 / numero9;
        System.out.println("A Divisão é "+soma);


scanner.close();




        int numero1 = scanner.nextInt();

        System.out.println("O número de " + numero1 + " é ");

        if (numero1 % 2 == 0){
            System.out.println("é um número par");
        } else {
            System.out.println("é um número ímpar");}






    }
}