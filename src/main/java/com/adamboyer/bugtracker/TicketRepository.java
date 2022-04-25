package com.adamboyer.bugtracker;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface TicketRepository extends MongoRepository<Ticket, String>{
    public List<Ticket> findAll();
}
