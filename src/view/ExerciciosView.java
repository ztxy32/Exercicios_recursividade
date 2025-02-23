package view;
import controller.ExerciciosController;
import javax.swing.JOptionPane;


public class ExerciciosView{
    public static void main(String args[]){
        ExerciciosController ex = new ExerciciosController();
        /*
        //exercicio 01
            System.out.println("Exercicio 01");
            int valor = 138757;
            System.out.println("O valor "+valor+" tem "+ex.Exercicio01((valor))+" casas decimais.");
        
        //exercicio 02
            System.out.println("\nExercicio 02");
            int firstNumber;
            int secondNumber;

            //validando se o número está dentro dos parametros
            do{
                firstNumber = Integer.parseInt(JOptionPane.showInputDialog("Digite um número entre 10 e 999999\n"));
            }while(firstNumber < 10 && firstNumber > 999999);
            do{
                secondNumber = Integer.parseInt(JOptionPane.showInputDialog("Digite um número entre 0 e 9\n"));
            }while(secondNumber > 10 && secondNumber < 0);

            int vezes = ex.Exercicio02(firstNumber, secondNumber);
            System.out.println("O número "+secondNumber+" aparece "+vezes+" vezes em "+firstNumber);
            

        //exercicio 03
            System.out.println("\nExercicio 03");
            System.out.println(ex.Exercicio03("Amanda"));
        
        //exercicio 04
        int valor2;
        do{
            valor2 = Integer.parseInt(JOptionPane.showInputDialog("Número a ser convertido: "));
        }while(valor2 > 2000);
        System.out.println(ex.Exercicio03(ex.Exercicio04(103)));// <- pra que fazer o mesmo código de novo se o exercicio 3 já inverte o número kkk
        */
        //exercicio 05
        int entrada = 0;
        do{
            entrada = Integer.parseInt(JOptionPane.showInputDialog("Entre com um valor: "));
        }while(entrada > 20);
        System.out.println(ex.Exercicio05(entrada));
    }
}