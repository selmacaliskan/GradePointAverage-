import java.util.Scanner;

public class GradePointAverage {
    public static void main(String[]args){
       int quiz,quiz2,ffinal;
       double average;
       Scanner input= new Scanner (System.in);
       System.out.println("Please enter the quiz grade.:");
       quiz=input.nextInt();
       System.out.println("Please enter the quiz2 grade.:");
       quiz2=input.nextInt();
       System.out.println("Please enter the final grade.:");
       ffinal=input.nextInt();

       average=(quiz*0.2)+(quiz2*0.35)+(ffinal*0.45);
       System.out.println("Your grade point average:"+average);
       String sonuc = (average>=50) ?"you passed":"you stayed";
       System.out.print(sonuc);
    }
}
