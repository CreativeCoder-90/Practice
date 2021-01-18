package day3;

import java.util.*;

public class AssignmentSecondQ4 {
    public static void main(String[] args) {
        ArrayList<Integer> apples = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        int total=0;

        for(int i=0;;i++){
            int value=sc.nextInt();
            if(value==-1){
                break;
            }
            apples.add(value);
            total=total+apples.get(i);

        }
        Collections.sort(apples);

        System.out.println("total "+total);
        int sum=0;
        int i1=0;
        for(int i=0;i<apples.size();i++){
            sum=sum+apples.get(i);
            if(sum==total*0.5){
                i1=i;
                break;
            }
        }
        System.out.println("i1 ="+i1);
        System.out.println("Ram= ");
        for(int i=0;i<=i1;i++){
            System.out.print(apples.get(i)+" ");
        }
        sum=0;
        int i2=0;
        for(int i=i1+1;i< apples.size();i++){
            sum=sum+apples.get(i);
            if(sum==total*0.3){
                i2=i;
                break;
            }
        }
        System.out.println("Shyam= ");
        for(int i=i1+1;i<=i2;i++){
            System.out.print(apples.get(i)+" ");
        }

        sum=0;
        int i3=0;
        for(int i=i2+1;i< apples.size();i++){
            sum=sum+apples.get(i);
            if(sum==total*0.2){
                i3=i;
                break;
            }
        }
        System.out.println("Rahim= ");
        for(int i=i2+1;i<=i3;i++){
            System.out.print(apples.get(i)+" ");
        }
    }
}
