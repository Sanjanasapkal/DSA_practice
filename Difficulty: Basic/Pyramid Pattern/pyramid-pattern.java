import java.util.Scanner;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // code here
        int k=1;
        for(int i=1;i<=n;i++)
        {
            for(int j=i;j<n;j++)
            {
                System.out.print(" ");
            }
            for(int x=1;x<=k;x++)
            {
                System.out.print("*");
            }
            k=k+2;
            System.out.println();
        }

        sc.close();
    }
}