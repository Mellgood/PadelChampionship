package com.nttdata.springbootpadel.repository;

import org.springframework.data.repository.CrudRepository;

import com.nttdata.springbootpadel.model.Match;

public interface MatchRepository extends CrudRepository<Match, Long>{

}
