package com.adamboyer.bugtracker;

import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.sql.Timestamp;
import java.time.Instant;
import java.util.Date;
import java.util.Objects;

@Document("projects")
public class Project {
    @Id
    @GeneratedValue
    private String id;
    private String title;
    private String description;
    private String createDate;

    Project() {}

    Project(String title, String description, String creationDate) {
        super();
        this.title = title;
        this.description = description;
        this.createDate = creationDate;
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

    public String getCreateDate() {
        return this.createDate;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Project)) {
            return false;
        }
        Project Project = (Project) o;
        return Objects.equals(this.title, Project.title) && Objects.equals(this.description, Project.description);
    }

    @Override
    public String toString() {
        return "Project{"  + "title='" + this.title + '\'' + ", description='" + this.description + '\'' + '}';
    }
}

