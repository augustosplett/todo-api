package com.asplett.todoapi.api.model;

import java.util.UUID;

public class Task {
    private final String id;
    private String title;
    private String description;
    private boolean done;

    public Task(String title, String description, boolean done) {
        this.id = GenerateID();
        this.title = title;
        this.description = description;
        this.done = done;
    }

    private String GenerateID() {
        UUID uuid = UUID.randomUUID();
        return uuid.toString();
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean getDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }
}
