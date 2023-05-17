import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        int a[] = new int[10];
        int count_even =0;
        int count_odd =0;
        int b[] = new int[count_even];
        int c[] = new int[count_odd];

        for (int i=0;i<10;i++){
            System.out.println((i+1)+". Please insert the "+(i+1)+" element of your array: " );
            a[i] = entry.nextInt();
            if(a[i]%2==0){
                count_even+=1;
            }
            else {
                count_odd+=1;
            }

        }

        for (int i=0;i<10;i++){
            if(a[i]%2==0){
                b[count_even]=a[i];
                count_even++;
            }
            else{
                c[count_odd]=a[i];
                count_odd++;
            }
        }

        for (int i=0;i<=count_even;i++) {
            System.out.println("the "+i+" element of your even array is: "+b[i]);
        }

        for (int i=0;i<=count_odd;i++) {
            System.out.println("the "+i+" element of your even array is: "+c[i]);
        }
    }
}