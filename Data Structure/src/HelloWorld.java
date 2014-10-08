public class HelloWorld{

     public static void main(String []args){
        int i = 1, j = 2, sum = 0;
        int n = 5;
        do {
            sum += i * j;
            System.out.print(i + " " + j + " + ");
            if(j == n){
                i++;
                 j = i;
            }
            j++;
        }while(((i < j) && (j <= n) ));
       
        System.out.println("Sum " + sum);
     }
}