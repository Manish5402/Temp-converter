import java.util.Scanner;

class Manish{
    Scanner sc =new Scanner(System.in);

    public void options(){
        System.out.println("type 1 : Farenheit To Celcius");
        System.out.println("type 2 : Celcius To Farenheit ");

    }
    public void convert(){

          int b= sc.nextInt();
        System.out.print("enter Temp : ");
        float tempr=sc.nextFloat();


        if(b==1){
            System.out.println(tempr +" Farenheit To Celcius : "+(tempr-32)*5/9 +"C");
         } else if (b==2) {
            System.out.println(tempr +" Celcius To Farenheit : "+(tempr*9/5)+32 +"F");
        }
        else {
            System.out.println("Choese the type ");
        }
    }
}
public class TempratureConverter {
    public static void main(String[] args) {
        Manish mansa =new Manish();
        mansa.options();
        mansa.convert();
    }
}
