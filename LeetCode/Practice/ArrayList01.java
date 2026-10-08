import java.util.*;
public class ArrayList01 {
    void main() {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("Bishal");
        arr.add("Abhishek");
        arr.add("Bikram");
        System.out.println(arr);
        arr.set(0,"Bibek"); //it used to replace the value of specific index
        System.out.println(arr);
        System.out.println(arr.get(1));// it is used to get index value and sout print the index value
        arr.remove(2);// it is used to remove the value of specific index
        System.out.println(arr);
        int n=arr.size(); // it is used to find the size of arraylist 
        System.out.println(n);
        for(int i=0; i<arr.size(); i++){
            System.out.println(arr.get(i));// it is used to print the value of arraylist using their index
        }
        Collections.sort(arr);// sort the arraylist 
        System.out.println(arr);// printing the arraylist 
        arr.clear();//it is used to remove all element from the array list
        System.out.println("the empty arrlist are = "+arr);
    }
}
