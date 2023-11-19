package hierarchy;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Anne", "Addams", LocalDateTime.of(1992, 11, 04, 0, 0, 0), "Str. Avram Iancu 12.", LocalDateTime.of(2022, 07, 01, 0, 0, 0), "assistant");
        Programmer programmer1 = new Programmer("John", "Smith", LocalDateTime.of(1990, 02, 11, 0, 0, 0), "Unirii 34.", LocalDateTime.of(2010, 04, 01, 0, 0, 0), "anything", "english");
        DatabaseAdmin dbadmin1 = new DatabaseAdmin("Will", "Davis", LocalDateTime.of(1995, 02, 15, 0, 0, 0), "Str. Ion Creanga 1", LocalDateTime.of(2023, 04, 20, 0, 0, 0), "admin", "PostgreSQL");

        System.out.println(programmer1.getPosition());
        System.out.println(dbadmin1.getAddress());

        System.out.println(employee1.getFullName());
        System.out.println(LocalDateTime.now());
        System.out.println(employee1.getBirthday());

        System.out.println(employee1.getFullName() + " is " + Employee.getAge(employee1.getBirthday()));
    }
}
