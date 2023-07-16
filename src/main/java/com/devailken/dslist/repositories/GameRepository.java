package com.devailken.dslist.repositories;

import com.devailken.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository <Game, Long> {

}
