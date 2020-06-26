import java.util.Scanner;

public class SaleCommission{

  public static void main(String[] args){

    double commissionRate = 0.0;
    double commission;

    Scanner scan = new Scanner(System.in);
    System.out.print("Enter sale amount : ");

    int sale = scan.nextInt();
    if(sale <= 0 || sale >= 5000){
      System.out.print("Sale  dont add up ");
      System.exit(0);
    }
    else if(sale > 0 && sale < 1000){
      commissionRate = 0.05;
      System.out.print("Commission is 5% ");
    }
    else if(sale >= 1000 && sale < 4000 ){
      commissionRate = 0.1;
      System.out.print("Commission is 10% ");
    }
    else{
      commissionRate = 0.15;
      System.out.print("Commission is 15% ");
    }
    commission = commissionRate * sale;
    System.out.println("will give you " +commission);
  }
}
