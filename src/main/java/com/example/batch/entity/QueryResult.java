package com.example.batch.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.format.DateTimeFormatter;

@ToString
@Getter
@Setter
@NoArgsConstructor
@Entity
public class QueryResult {
    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("yyyyMMdd");

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String svc_num;
    private String op_dt;
    private String test_data;

    public QueryResult(String svc_num, String op_dt, String test_data) {
        this.svc_num = svc_num;
        this.op_dt = op_dt;
        this.test_data = test_data;
    }
}