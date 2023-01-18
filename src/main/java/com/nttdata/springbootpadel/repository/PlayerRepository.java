package com.nttdata.springbootpadel.repository;

import org.springframework.data.repository.CrudRepository;

import com.nttdata.springbootpadel.model.Player;

public interface PlayerRepository extends CrudRepository<Player, Long>{

}
