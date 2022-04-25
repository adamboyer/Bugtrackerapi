package com.adamboyer.bugtracker;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Document("tickets")
public class Ticket {
    @Id
    @GeneratedValue
    private String id;
    private String user_id;
    private String title;
    private String project_id;
    private String description;

    Ticket() {}

    Ticket(String title, String description, String project, String user) {
        super();
        this.id = id;
        this.title = title;
        this.description = description;
        this.project_id = project;
        this.user_id = user;
    }

    public String getId() {
        return this.id;
    }


    public String getTitle() {
        return this.title;
    }

    public String getDescription() {
        return this.description;
    }

    public String getProject() { return this.project_id; }

    public String getUser() {return this.user_id;}

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setProject(String project) { this.project_id = project; }

    public void setUser(String user) {this.user_id = user;}

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Ticket)) {
            return false;
        }
        Ticket Ticket = (Ticket) o;
        return Objects.equals(this.title, Ticket.title) && Objects.equals(this.description, Ticket.description);
    }

    @Override
    public String toString() {
        return "Ticket{"  + "title='" + this.title + '\'' + ", description='" + this.description + '\'' + '}';
    }
}
