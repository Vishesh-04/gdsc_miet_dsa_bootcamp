import java.util.*;
class Missing
{    
    public static void main (String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println ("Enter NO.");
    int n = sc.nextInt();
    int A[] = new int [n-1];
    System.out.println ("Enter Array");
    for (int i = 0; i < n ; i++ ){
        A[i]=sc.nextInt();
    }
    int x =0;
    int sum = A[x];
    System.out.println(sum);
}
}