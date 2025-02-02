import java.util.Scanner;
class Class02{
    String CustomerName;
    int Balance;
    int Accno;
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter cus name: ");
        CustomerName = sc.nextLine();
        System.out.println("Enter Accno : ");
        Accno = sc.nextInt();
        System.out.println("Enter the Balance: ");
        Balance = sc.nextInt();
    }
    void display(){
        System.out.println("Hello "+CustomerName+" Acc no is "+Accno+" Bal is "+Balance);
    }
    }
    public class PDemo002{
        public static void main(String[] args) {
            Class02 mn = new Class02();
            mn.input();
            mn.display();
    }
}
