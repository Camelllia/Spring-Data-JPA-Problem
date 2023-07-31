package com.jpa.problem.sample.com.repository;

import com.jpa.problem.sample.com.domain.Board;

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
    void test1() {

        System.out.println("---- START FIND ALL ----");
        List<Board> result = boardRepository.findAll();
        for (Board board : result) {
            System.out.println("Board Title: " + board.getTitle());
            System.out.println("Category Name: " + board.getCategory().getName());
        }


        System.out.println("---- START FIND ALL BY Fetch Join ----");
        List<Board> fetchJoinResult = boardRepository.findAllByFetchJoin();
        for (Board board : result) {
            System.out.println("Board Title: " + board.getTitle());
            System.out.println("Category Name: " + board.getCategory().getName());
        }
    }
}
