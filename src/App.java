import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       Scanner sc = new Scanner(System.in);

       for(;;){
        int x = sc.nextInt();
       int y = sc.nextInt();

       if(x == y){
        break;
       }else if(x > y){
        System.out.println("Decrescente");
       }else if(y > x){
        System.out.println("Crescente");
       }
       }
       

       sc.close();
    }
}
