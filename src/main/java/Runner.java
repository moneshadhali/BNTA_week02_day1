import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Runner {

    public static void main(String[] args) {

//        SCOTTISH ISLANDS
        System.out.println("-----------SCOTTISH ISLANDS-----------");
        List<String> scottishIslands = new ArrayList<>();
        scottishIslands.add("Jura");
        scottishIslands.add("Mull");
        scottishIslands.add("Skye");
        scottishIslands.add("Arran");
        scottishIslands.add("Tresco");

        System.out.println("Before any changes: "+scottishIslands);

//        1. Add "Coll" to the end of the list
        scottishIslands.add(scottishIslands.size(), "Coll");

//        2. Add "Tiree" to the start of the list
        scottishIslands.add(0, "Tiree");

//        3. Add "Islay" after "Jura" and before "Mull"
        int juraPos = scottishIslands.indexOf("Jura");
        scottishIslands.add(juraPos+1,"Islay");

//        4. Print out the index position of "Skye"
        System.out.println("Index position of Skye: "+scottishIslands.indexOf("Skye"));

//        5. Remove "Tresco" from the list by name
        scottishIslands.remove("Tresco");

//        6. Remove "Arran" from the list by index
        int arranPos = scottishIslands.indexOf("Arran");
        scottishIslands.remove(arranPos);

//        7. Print the number of islands in your arraylist
        System.out.println("The number of scottish island: "+scottishIslands.size());

//        8. Sort the list alphabetically
        Collections.sort(scottishIslands);

//        9. Print out all the islands using a for loop
        System.out.println("List of Scottish island");
        for(String island: scottishIslands){
            System.out.println(" - "+island);
        }

        System.out.println(scottishIslands);

//        NUMBERS
        System.out.println();
        System.out.println("-----------NUMBERS-----------");
        List<Integer> numbers = new ArrayList<>();
        Collections.addAll(numbers, 1, 1, 4, 2, 7, 1, 6, 15, 13, 99, 7);

        System.out.println("numbers: " + numbers);

//        1. Print out a list of the even integers
        System.out.println("List of even numbers: ");
        for(int num:numbers){
            if(num%2==0){
                System.out.println(" -"+num);
            }
        }

//        2. Print the difference between the largest and smallest value
        int minValue = Collections.min(numbers);
        int maxValue = Collections.max(numbers);
        int diffVal = maxValue-minValue;
        System.out.println("Difference in value: "+ diffVal);

//        3. Print True if the list contains a 1 next to a 1 somewhere.
        int prevNum = 0;
        for(int num:numbers){
            if(prevNum == num ){
                System.out.println("True - list contains a 1 next to a 1 ");
            }
            prevNum = num;
        }

//        4. Print the sum of the numbers,
        int sumOfNum = 0;
        for(int num:numbers){
            sumOfNum += num;
        }
        System.out.println("Total sum of numbers: " +sumOfNum);

//        5. Print the sum of the numbers...
//           ...except the number 13 is unlucky, so it does not count...
        int sumOfNum2 = 0;
        for(int num:numbers){
            if(num==13){
                continue;
            }
            sumOfNum2 += num;
        }
        System.out.println("Total sum of numbers without unlucky 13: " +sumOfNum2);

//           ...and numbers that come immediately after a 13 also do not count.
//          So [2, 7, 13, 2] would have sum of 9.
        int sumOfNum3 = 0;
        for(int num:numbers){
            if(num==13){
                break;
            }else{
                sumOfNum3 += num;
            }
        }
        System.out.println("Total sum of numbers without unlucky 13 and remainders: " +sumOfNum3);
    }
}