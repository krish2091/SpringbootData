package com.sbd.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sbd.entities.PersonDetails;


public interface PersonDetailsRepository<person_id> extends JpaRepository<PersonDetails, person_id> {

}
