import java.util.*;

public class ArrayListReview {
    public static void main(String[] args) {

        List<Student>students=new ArrayList<>();
         students.add(new Student(1,"Mike"  ))  ;
         students.add(new Student(2,"Ahmad"));
         students.add(new Student(3,"Jorhe"));
         students.add(new Student(4,"Ali"));
         System.out.println(students);

        for (int i=0; i < students.size() ; i++) {//Legacy For Loop
            System.out.println(students.get(i));
        }
        System.out.println(" Using Iteratot +++++__+_++_+_+__________");
        Iterator iterator=students.listIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());

        }

        //BackWard Iteration
        while (((ListIterator<?>)iterator).hasPrevious()){
            System.out.println(((ListIterator<?>) iterator).previous());
        }


        System.out.println("Printing For Each Loop");
        for (Student student:students)
            System.out.println(student);


        System.out.println("Printing lambda ");

        //Lambda
        students.forEach(student-> System.out.println(student));
        Collections.sort(students,new sortByIdDesc());
        System.out.println(students);

        Collections.sort(students,new sortByName());
        System.out.println(students);

    }
  static class sortByIdDesc implements Comparator<Student>{

      @Override
      public int compare(Student o1, Student o2) {
          return o1.id-o2.id ;
      }



  }
    static class sortByName implements Comparator<Student>{

        @Override
        public int compare(Student o1, Student o2) {
            return o2.name.compareToIgnoreCase(o2.name) ;
        }

}}
