
package maioroumenor;

import java.util.Scanner;

public class MaiorOuMenor {

   
    public static void main(String[] args) {
       
        int n1;
        Scanner num = new Scanner(System.in);
        System.out.println("Digite um numero");
        n1=num.nextInt();
        
        if (n1>=100 && n1<200){
            System.out.println(n1 + " Esta dentro do intervalo de 100 e 200");
        }else{
            System.out.println("Numero digitado menor que 100 ou maior que 200");
        }
        
       num.close();
    }
    
}
