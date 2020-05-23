package oop;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@NoArgsConstructor

public class SubTask extends Task {
    private String taskDescription;

    public SubTask(String taskName, LocalDate startDate, LocalDate stop, String taskDescription) {
        super(taskName, startDate, stop);
        this.taskDescription = taskDescription;
    }

    @Override
    public String toString() {
        return "SubTask{" +
                "taskDescription='" + taskDescription + '\'' +
                "} " + super.toString();
    }
    public void editsubtask(String taskName, LocalDate startDate, LocalDate stop, String taskDescription){
    setTaskName(taskName);
    setStartDate(startDate);
    setStop(stop);
    this.taskDescription = taskDescription;
    }
    public void editsubtas(String taskName, String taskDescription){
        setTaskName(taskName);
        this.taskDescription = taskDescription;
    }
}
