package Data_Structures_Java.ArrayList.Java;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
/* 
 * The following class is created for the practice of insert, delete, update and red operations on a 
 * ArrayList class object
 */
public class Array {
    public static void main(String[] args) {
        // the arrays can  be deca
        List<Integer> demoArr = new ArrayList<Integer>(Arrays.asList(7,2,5,1,8,3));
        // READ: To get element at index 2
        System.out.println(demoArr.get(2));
        // UPDATE:
        demoArr.add(2,3);
        System.out.println(demoArr.get(3));

    }
    
}
