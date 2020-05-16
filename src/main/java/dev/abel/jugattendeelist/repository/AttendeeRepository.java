package dev.abel.jugattendeelist.repository;

import dev.abel.jugattendeelist.domain.Attendee;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AttendeeRepository extends MongoRepository<Attendee, String> {

}
