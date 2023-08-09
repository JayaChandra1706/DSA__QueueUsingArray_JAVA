import java.util.Scanner;
public class QueueApp {
	public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the Queue Length:");
        int len=scan.nextInt();
        Queue queue=new Queue(len);
        while(true){
            System.out.println("Enter 1 to Insert");
            System.out.println("Enetr 2 to Delete");
            System.out.println("Enetr 3 to Display");
            System.out.println("Enetr another any number to Exit");
            System.out.println();
            System.out.println("Enetr yoiur choice");
            int choice=scan.nextInt();
            switch(choice){
                case 1:
                    queue.insert();
                    break;
                case 2:
                    queue.delete();
                    break;
                case 3:
                    queue.display();
                    break;
                default:
                    System.exit(0);            
            }
        } 
    }
}
