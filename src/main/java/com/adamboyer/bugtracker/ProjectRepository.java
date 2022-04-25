package com.adamboyer.bugtracker;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProjectRepository extends MongoRepository<Project, String>{
}