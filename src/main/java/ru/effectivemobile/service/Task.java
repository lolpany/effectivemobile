package ru.effectivemobile.service;

public class Task {
    private long id;
    private String header;
    private String description;
    private TaskStatus status;
    private TaskPriority priority;
    private AppUser author;
    private AppUser executor;
}
