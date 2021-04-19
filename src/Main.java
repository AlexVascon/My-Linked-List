import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        MyNodeList<Integer> intList = new MyNodeList<Integer>();
        intList.insert(10);
        intList.insert(15);
        intList.insert(22);
        intList.insert(8);
        intList.insert(6);

        intList.print();

        MyIterator<Integer> myIterator = intList.myIterator();
        System.out.println();
        myIterator.print();
        System.out.println();

        while(myIterator.hasNext()) {
            if(myIterator.getPrevious() == null) {
                myIterator.next();
            }
            System.out.println("Next head: " + myIterator.previous());
            Scanner scanner = new Scanner(System.in);
            System.out.print("input (1 next, enter prev: ");
            int choice = Integer.parseInt(scanner.nextLine());
            if(choice == 1) {
                myIterator.next();
                myIterator.next();
            }
            if(choice == 3) {
                break;
            }
        }
        System.out.println("entered here");

    }
}
