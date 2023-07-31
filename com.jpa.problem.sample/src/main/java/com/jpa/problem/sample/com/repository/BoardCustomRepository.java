package com.jpa.problem.sample.com.repository;

import com.jpa.problem.sample.com.domain.Board;

import java.util.List;

public interface BoardCustomRepository {

    List<Board> findAllByFetchJoin();
}
