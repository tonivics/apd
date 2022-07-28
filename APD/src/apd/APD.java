package apd;
import java.util.Stack;
import java.util.Scanner;
public class APD {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        char w[] = entrada.nextLine().toCharArray();
        Stack <Character> pilha = new Stack<>();
        pilha.push('z');
        
        System.out.println(w);
    }
    
}
