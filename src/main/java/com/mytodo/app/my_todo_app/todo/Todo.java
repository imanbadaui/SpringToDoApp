package com.mytodo.app.my_todo_app.todo;

import java.time.LocalDate;

public class Todo {
    private int id;
    private  String description;
    private LocalDate localDate;
    private boolean isDone;

    public Todo(int id, String description, LocalDate localDate, boolean isDone ) {
        this.id = id;
        this.description = description;
        this.localDate = localDate;
        this.isDone = isDone;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    public boolean getIsDone() {
        return isDone;
    }

    public void setIsDone(boolean done) {
        isDone = done;
    }

    @Override
    public String toString() {
        return "Todo{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", localDate=" + localDate +
                ", isDone=" + isDone +
                '}';
    }
}
