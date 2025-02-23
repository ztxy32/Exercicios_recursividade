package controller;

public class ExerciciosController{
    public ExerciciosController(){
        super();
    }
    
    //Exercicio 01
    public int Exercicio01(int num){
        /*  
            Condição de parada: 
                quando o numero não for mais divisivel por 10 o codigo retorna 1
                se o número não é divisivel por 10 logo só tem um digito.
        */
        if(num / 10 == 0){
            return 1;        
        }else{
            num /= 10;
            return 1+Exercicio01(num);    
        }
    }

    //Exercicio 02
    public int Exercicio02(int firstNumber, int secondNumber){
        //condição de parada: 
        //o primeiro numero não pode ser mais dividido e não é igual ao segundo numero
        if(firstNumber/10 < secondNumber && firstNumber != secondNumber){
            return 0;
        }else{
            //pega o a representação do ultimo numero pelo resto da divisão por 10
            int resto = firstNumber % 10;
            //inicia o contador como 0
            int count = 0;
            //se o resto for igual ao segundo número conta mais 1
            if (resto == secondNumber) {
                count += 1;
            }
            //quando a função terminar o contador será somado com 1 se o resto for igual ao segundo número
            //se não for igual será somado com o 0 da declaração do contador
            return count + Exercicio02(firstNumber/10, secondNumber);
        }
        
    }
}
