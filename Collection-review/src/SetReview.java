import java.util.HashSet;
import java.util.Set;

public class SetReview {

    public static void main(String[]args){

        Set<Student>mySet=new HashSet<>()  ;
        mySet.add(new Student(7,"Andrey"));
        mySet.add(new Student(8,"Thomas"));
        mySet.add(new Student(9,"Thomas"));
        System.out.println(mySet);

        //No duplicate
        Set<Integer>numSet =new HashSet<>();
        numSet.add(1);
        numSet.add(2);
        System.out.println(numSet);
        System.out.println(numSet.add(2));

        System.out.println(" First Repeating "+firstRepaeting("java devoloper"));


    }

  public static Character firstRepaeting(String str){
        //Create hasmap

      Set<Character>chars =new HashSet<>();
      for (Character ch:str.toCharArray())if (!chars.add(ch))return ch;
      //Iteration return ch if add return false
      return null;



  }


}
