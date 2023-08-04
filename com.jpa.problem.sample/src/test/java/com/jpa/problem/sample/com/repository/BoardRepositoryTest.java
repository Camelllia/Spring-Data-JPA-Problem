package com.jpa.problem.sample.com.repository;

import com.jpa.problem.sample.com.domain.Board;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@SpringBootTest
@Transactional
class BoardRepositoryTest {

    @Autowired
    private BoardRepository boardRepository;

    @Test
    @DisplayName("N+1 발생")
    void test1() {
        List<Board> result = boardRepository.findAll();
        result.forEach(board -> {
                    System.out.println("Board Title: " + board.getTitle());
                    System.out.println("Category Name: " + board.getCategory().getName());
                });
    }

    @Test
    @DisplayName("N+1 문제 해결 - Fetch Join")
    void test2() {
        List<Board> result = boardRepository.findAllByFetchJoin();
        result.forEach(board -> {
                    System.out.println("Board Title: " + board.getTitle());
                    System.out.println("Category Name: " + board.getCategory().getName());
                });
    }
}