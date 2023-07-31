package com.jpa.problem.sample.com.repository;

import com.jpa.problem.sample.com.domain.Board;
import static com.jpa.problem.sample.com.domain.QBoard.board;

import static com.jpa.problem.sample.com.domain.QCategory.category;
import com.querydsl.jpa.impl.JPAQueryFactory;

import java.util.List;

public class BoardCustomRepositoryImpl implements BoardCustomRepository {

    private final JPAQueryFactory jpaQueryFactory;

    public BoardCustomRepositoryImpl(JPAQueryFactory jpaQueryFactory) {
        this.jpaQueryFactory = jpaQueryFactory;
    }

    @Override
    public List<Board> findAllByFetchJoin() {
        return jpaQueryFactory.selectFrom(board)
                .leftJoin(board.category, category).fetchJoin()
                .fetch();
    }
}
