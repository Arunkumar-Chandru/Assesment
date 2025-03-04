import java.util.Scanner;

public class spaceremove {
    public static void main(String[] args) {
        string();
    }
     static void string(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter String: ");
        String s=sc.nextLine();
        String[] a=s.trim().split("\\s+");
        for(int i=a.length-1;i>=0;i--){
            System.out.print(a[i]+" ");
        }
}
}
