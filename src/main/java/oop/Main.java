package oop;

import javax.security.auth.Subject;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args){
        Task task = new Task("Nauka programowania",
                LocalDate.now(),
                LocalDate.of(2020, 9, 30));
        System.out.println(task.toString());
        Task emptyTask = new Task();
        emptyTask.setTaskName("Empty Task");
        System.out.println(emptyTask.getTaskName());
        SubTask st = new SubTask();
        st.setTaskName("Nauka OOP w Javie");
        st.setStartDate(LocalDate.now());
        System.out.println(st.getTaskName());
        System.out.println(st);
        SubTask st1 = new SubTask(
                "Nauka MySQL",
                LocalDate.of(2020,6,6),
                LocalDate.of(2020, 8, 8),
                "Będzie zabawa"
        );
        System.out.println(st1.toString());



    }
}
