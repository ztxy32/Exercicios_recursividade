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
        //quando o primeiro numero chegar a 0 não haverá mais numeros a serem contados.
        //isso corrige o erro do commit anterior onde o programa dava erro ao passar o numero 0 no segundo parametro sem terem zeros no primeiro.
        if(firstNumber == 0){
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

    //Exercicio 03
    public String Exercicio03(String text){
        //condição de parada: quando não quando não ouver mais caracteres na string retorna;
        if(text.isEmpty()){
            return text;
        }else{
            String lastCharactere = text.substring(text.length() - 1);//pega o ultimo caractere da string
            //cria uma nova string com um caractere a mais até que não tenham mais caracteres na estring
            return lastCharactere + Exercicio03(text.substring(0,text.length()-1));
        }
    }
    //Exercicio 04
    public String Exercicio04(int value){
        if(value == 0){
            return "";
        }else{
            return String.valueOf(value % 2) + Exercicio04(value/2);
        }
    }

    //Exercicio 05
    public int Exercicio05(int value){
        //condição de parada:
        //se o valor for igual a 1 ou 2 retorna 1 pois os dois primeiros valores da sequencia são o 1
        if(value == 1 || value == 2){
            return 1;
        }else{
            return Exercicio05(value - 1) + Exercicio05(value - 2);
        }
    }

    //Exercicio 06
    private int CalculaFatorial(int value){
        //condição de parada:
        //o fatorial de 1 é == 1 então retorna 1
        if(value == 1){
            return 1;
        }else{
            return value *CalculaFatorial(value -1);
        }
    }
    public int Exercicio06(int value){
        //condição de parada:
        //quando o valor for 0 a função retorna 1 porque a expressão começa com 1
        if(value == 0){
            return 1;
        }else{
            //para cada termo da serie é somado 1/fatorial(n) ao resultado da chamada
            return (1/CalculaFatorial(value)) + Exercicio06(value - 1);
        }
    }

    //Exercicio 07
    public int Exercicio07(int value){
        //condição de parada
        ////quando o primeiro numero chegar a 0 não haverá mais numeros a serem contados.
        if(value == 0){
            return 0;
        }else{
            int resto = value%10;
            return resto + Exercicio07(value/10);
        }
    }
}