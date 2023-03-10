import java.util.Scanner;

public class TowerofHanoi {
    public static void TowofHan(int n,String src, String medium,String dstn){
        
        if(n==1){
            System.out.println("Move disk "+n+" from "+src+" to "+dstn);
        }
        else{
            //transfer n-1 disk src to helper ....
            TowofHan(n-1, src, dstn,medium);
            //transfer 1 disk from src to destination...
            TowofHan(1, src, medium, dstn);
            //transfer n-1 disk from medium to destination...
            TowofHan(n-1, medium, src, dstn);
            
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter the no of disk ");
        try (Scanner sc = new Scanner(System.in)) {
            int n=  sc.nextInt();
            TowofHan(n,"A","B","C");
        }
    }
    
}