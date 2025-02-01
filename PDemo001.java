import java.util.Scanner;
class PDemo001{
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
    public static void main(String[] args) {
        PDemo001 mn = new PDemo001();
        mn.input();
        mn.display();
    }
}
