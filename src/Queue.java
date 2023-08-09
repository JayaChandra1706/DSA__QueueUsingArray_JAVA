import java.util.Scanner;
public class Queue {
	private int q[];
    private int r=-1;
    private int f=0;
    private int size;
    private Scanner scan=new Scanner(System.in);
    public Queue(int n){
        q=new int[n];
        size=q.length;
    }
    public void insert(){
        System.out.println();
        System.out.println();
        if(r==size-1){
            System.out.print("Insertion is not possible because Queue is Full");
            System.out.println();
        }else{
            System.out.print("Enetr Element to Insert:");
            int ele =scan.nextInt();
            r++;
            q[r]=ele;
            System.out.println("Insertion comleted at "+r);
            System.out.println();
            System.out.println();
        } 
    }
    public void delete(){
        System.out.println();
        System.out.println();
        if(r==-1||f>r){
            System.out.println("Deletion not possible because Queue is Empty");
        }else{
            System.out.println("Deletion completed Successfully Deleted "+q[f]);
            f++;
            
        }
        System.out.println();
        System.out.println();
    }
    public void display(){
        System.out.println();
        System.out.println();
        if(r==-1||f>r){
            System.out.println("There is no elements to Display");
        }else{
            for(int i=f;i<=r;i++){
                System.out.print(q[i]+" ");
            }
        }
        System.out.println();
        System.out.println();
    }
}
