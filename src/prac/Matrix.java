package prac;
import java.util.Scanner;
public class Matrix {
    static void swap(int a, int b) {
        int temp;
        temp = a;
        a = b;
        b = temp;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n");
        int n=sc.nextInt();
        System.out.println("enter m");
        int m=sc.nextInt();
        int[][] arr=new int[n][m];
        int i,j;
        for(i=0;i<n;i++){
            for(j=0;j<m;j++){
                System.out.println("Enter prime no.");
                arr[i][j]=sc.nextInt();
            }
        }

        //Sum of Diagnol elements
        int sum=0;
        for(i=0;i<n;i++){
            for(j=0;j<m;j++){
                if(i==j)
                    sum+=arr[i][j];
            }
        }
        System.out.println(sum);

        //Sum of all elements
        int s=0;
        for(i=0;i<n;i++){
            for(j=0;j<m;j++){
                s=s+arr[i][j];
            }
        }
        System.out.println(s);

        //Transpose
        for(i=0;i<n;i++){
            for(j=0;j<m;j++){
                if(i!=j)
                    swap(arr[i][j],arr[j][i]);
            }
        }

        //print transpose matrix
        for(i=0;i<n;i++){
            for(j=0;j<m;j++){
                System.out.println(arr[i][j]);
            }
            System.out.println("\n");
        }


    }
}
