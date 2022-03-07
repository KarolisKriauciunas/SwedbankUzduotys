package Collections;

import java.util.*;

public class PaskaitosUzduotysMazos {
    public static void main(String[] args) {
        ArrayList<String> Cars = new ArrayList<>();
        Cars.add("Subaru");
        Cars.add("Bmw");
        Cars.add("Suzuki");

        for (String name : Cars) {
            System.out.print(" " + name);
        }
        System.out.print("\n");
        Cars.set(Cars.indexOf("Subaru"), "Honda");
        System.out.println(Cars.size());

        for (String name : Cars) {
            System.out.println(" " + name);

        }
        int[] NumberList = {-40, 55, 63, 17, 22, 68, 89, 97, 89};

        for (int i : NumberList) {
            System.out.print(" " + i);
        }
        System.out.print("\n");
        int[] temp = {1, 2, 3, 4, 5};
        List<Integer> Numbers = new ArrayList<>();
        for (int i : temp) Numbers.add(i);
        System.out.println(Numbers);

        List<Student> students = new ArrayList<>();
        Student student1 = new Student("Karolis", 1, 19, 20293);
        Student student2 = new Student("Algis", 4, 76, 25675);
        Student student3 = new Student("Kazys", 3, 33, 74534);
        Student student4 = new Student("Emilija", 2, 23, 77777);
        Student student5 = new Student("Ruta", 3, 21, 1);
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.removeIf(student -> student.getAge() > 25);
        for (Student s : students) {
            System.out.println(s.toString());
        }
        String[] temp2 = {"Apple", "Pear", "Banana", "Apple", "Cherry", "Fig", "Orange", "Banana", "Apple"};
        ArrayList<String> fruitsList = new ArrayList<>(Arrays.stream(temp2).toList());
        System.out.println(fruitsList.size());
        System.out.println(fruitsList);
        Set<String> fruits = new HashSet<>(fruitsList);
        System.out.println(fruits.size());
        System.out.println(fruits);
        Map<Integer, Student> studentMap = new HashMap<>();
        for (Student s : students) {
            studentMap.put(s.getID(), s);
        }
        System.out.println(studentMap);
        System.out.println();
        for (int value : studentMap.keySet()) {
            System.out.println(value + " " + studentMap.get(value));
        }
        System.out.println();
    }
}
