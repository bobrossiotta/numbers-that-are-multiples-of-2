import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        int k;
                Scanner bob = new Scanner(System.in);
                System.out.println("Sayı Giriniz: ");
                k= bob.nextInt();

                for (int i=1; i<=k; i++){
                    if (i%2 == 0){
                        System.out.println(i);
                    }
                }


            }
        }