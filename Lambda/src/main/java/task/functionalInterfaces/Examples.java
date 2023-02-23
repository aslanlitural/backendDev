package task.functionalInterfaces;

import java.util.function.Predicate;

public class Examples {
   public static void main(String[] args) {
//        Predicate<Integer>lesserThan=new Predicate<Integer>() {
//            @Override
//            public boolean test(Integer integer) {
//                return integer<18;
//            }
//        };
//        lesserThan.test(50);


       Predicate<Integer>lesserThan=a->a<18;
    Boolean result=     lesserThan.test(50);
       System.out.println(result);
   }




    }


