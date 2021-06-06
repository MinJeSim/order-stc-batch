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
    private String ORG_ID;
    private String ORG_NM;
    private String ORG_ABBR_NM;

    public QueryResult(String ORG_ID, String ORG_NM, String ORG_ABBR_NM) {
        this.ORG_ID = ORG_ID;
        this.ORG_NM = ORG_NM;
        this.ORG_ABBR_NM = ORG_ABBR_NM;
    }
}