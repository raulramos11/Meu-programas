import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        System.out.print("\033c");

        Scanner input = new Scanner(System.in);

        int opcao = 2;

        while (opcao != 0){
            System.out.print("\033c");


            menu();

            opcao = input.nextInt();

            if (opcao == 1) {
                System.out.print("\033c");
                soma();
            }

            if (opcao == 2) {
                System.out.print("\033c");
                subtracao();
            }

            if (opcao == 3) {
                System.out.print("\033c");
                multiplicacao();
            }

            if (opcao == 4) {
                System.out.print("\033c");
                divisao();
            }
            
            
        }
    }








    static void menu(){
        System.out.println("-----------------------------------------------------------------------------");
            System.out.println("Calculadora: por favor digite o número correspondente ao oque vc deseja");
            System.out.println("1- Calcular soma de dois números");
            System.out.println("2- Calcular subtração de dois números");
            System.out.println("3- Calcular multiplicação de dois números");
            System.out.println("4- Calcular divisão dos dois primeiros numeros");
            System.out.println("0- Sair do programa");
            System.out.println("-----------------------------------------------------------------------------");
    }

    static void soma(){
        Scanner input = new Scanner(System.in);

        float n1;
        float n2;

        System.out.println("Digite o primeiro valor:");
            n1 = input.nextFloat();

        System.out.println("Digite o segundo valor:");
            n2 = input.nextFloat();

        float soma = n1+n2;

        System.out.println("A soma dos valores vai ser igual a " + soma);

        try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    }

    static void subtracao(){
        Scanner input = new Scanner(System.in);

        float n1;
        float n2;

        System.out.println("Digite o primeiro valor:");
        n1 = input.nextFloat();

        System.out.println("Digite o segundo valor:");
        n2 = input.nextFloat();

        float sub = n1-n2;


        System.out.println("A subtração dos valores vai ser igual a " + sub);

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    static void multiplicacao(){
        Scanner input = new Scanner(System.in);

        float n1;
        float n2;

        System.out.println("Digite o primeiro valor:");
        n1 = input.nextFloat();

        System.out.println("Digite o segundo valor:");
        n2 = input.nextFloat();

        float mult = n1*n2;


        System.out.println("A multiplicação dos valores vai ser igual a " + mult);


        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    static void divisao(){
        Scanner input = new Scanner(System.in);

        float n1;
        float n2;

        System.out.println("Digite o primeiro valor:");
            n1 = input.nextFloat();

        System.out.println("Digite o segundo valor:");
            n2 = input.nextFloat();

        float div = n1+n2;


        System.out.println("A divisão dos valores vai ser igual a " + div);


        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
