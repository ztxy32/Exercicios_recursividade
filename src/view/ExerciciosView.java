package view;
import controller.ExerciciosController;


public class ExerciciosView{
    public static void main(String args[]){
        ExerciciosController ex = new ExerciciosController();
        
        //exercicio 01
        //System.out.println("Exercicio 01");
        //int valor = 138757;
        //System.out.println("O valor "+valor+" tem "+ex.Exercicio01((valor))+" casas decimais.");
        
        //exercicio 02
        //System.out.println("\nExercicio 02");
        int firstNumber = 123178;
        int secondNumber = 5;
        int vezes = ex.Exercicio02(firstNumber, secondNumber);
        if(firstNumber > 999999 || firstNumber < 10 || secondNumber > 9){
            System.out.println("Número inválido!");
        }else{
            System.out.println("O número "+secondNumber+" aparece "+vezes+" vezes em "+firstNumber);
        }
    }
}
