package controller;

public class ExerciciosController{
    public ExerciciosController(){
        super();
    }
    
    public static int Exercicio01(int num){
        if(num / 10 == 0){//condição de parada: quando o numero não for mais divisivel por 10 o codigo retorna 1 (se o número não é divisivel por 10 logo só tem um digito);
            return 1;        
        }else{
            num /= 10;
            return 1+Exercicio01(num);    
        }
    }
}
