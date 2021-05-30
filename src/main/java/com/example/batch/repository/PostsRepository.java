package com.example.batch.repository;

import com.example.batch.entity.QueryResult;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PostsRepository {
    List<QueryResult> getTest0();
    List<QueryResult> getTest1();
    List<QueryResult> getTest2();
    List<QueryResult> getTest3();
    List<QueryResult> getTest4();
}
