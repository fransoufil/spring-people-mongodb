package com.fransoufil.people.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.fransoufil.people.domain.People;

@Repository
public interface PeopleRepository extends MongoRepository<People, String>{

}
