package com.example.batch.repository;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StatisticsOrgRepository {
    void sts_org_delete();
    void sts_smry_org_delete();

    void sts_insert_lvl_01();
    void sts_insert_lvl_01_01();
    void sts_insert_lvl_02_02();
    void sts_insert_lvl_03_01();
    void sts_insert_lvl_03_02();
    void sts_insert_lvl_0405();
    void sts_insert_lvl_06();
    void sts_insert_lvl_etc();

    void smry_sts_insert();
}
