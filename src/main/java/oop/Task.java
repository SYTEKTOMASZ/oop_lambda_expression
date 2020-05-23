package oop;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data               // implementuje getery, setterry
@NoArgsConstructor  //implementuje pusty konstruktor
@AllArgsConstructor //implementuje konstruktor z wszystkimi polami w argumentach
public class Task {
    private String taskName;
    private LocalDate startDate;
    private LocalDate stop;

    @Override
    public String toString() {
        return "Task{" +
                "taskName='" + taskName + '\'' +
                ", startDate=" + startDate +
                ", stop=" + stop +
                '}';
    }
}
