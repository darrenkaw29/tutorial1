
import java.util.Scanner;

public class T1Q5 {

    public static void main(String[] args) {
          int minNum,maxNum,sum=0;
        Scanner scan = new Scanner(System.in);
        System.out.print("enter the min num: ");
        minNum = scan.nextInt();
        System.out.print("enter the max num: ");
        maxNum = scan.nextInt();
        
        for (int i=minNum;i<=maxNum;i++){
        if(i%2 != 0){
            System.out.println(i);
           sum+=i;
        }
        
    }
            System.out.println("sum of odd is :" +sum);
}
}

