package com.jpa.problem.sample.com.repository;

import com.jpa.problem.sample.com.domain.Board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board, Long>, BoardCustomRepository {
    
}
