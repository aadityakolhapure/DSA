import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args){
        List<String> studentName = new ArrayList<>();
        studentName.add("Aaditya");
        studentName.add("Aakash");
        studentName.add("Prem");
        studentName.add("Rushikesh");
        studentName.add(2, "Abhishek");
        System.out.println("Student Names: " + studentName);

        List<String> languages = new ArrayList<>();
        languages.add("Java");
        languages.add("C++");
        languages.add("Python");
        languages.add("C");
        languages.add("PHP");
        System.out.println("Languages: " + languages);
        studentName.addAll(languages);
        System.out.println(studentName);
    }
}
