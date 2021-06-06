package com.example.batch.service;

import com.example.batch.common.CommonBatch;
import com.example.batch.repository.StatisticsOrgRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Slf4j
@Service
public class ExampleBatchService1 implements CommonBatch {

    @Autowired
    StatisticsOrgRepository repository;

    private  final String batchId = "BATCH0002";
    private int successCount = 0 ;
    private  int failCount = 0 ;

    @Override
    public String getBatchId(){ return batchId; }
    @Override
    public int getSuccessCount(){ return successCount; }
    @Override
    public int getFailCount(){ return failCount; }
    @Override
    public void doBatch(String[] args){

        try{
            /* input parameter check*/
            Map<String,String> map = new HashMap<String,String>();
            if( args.length > 1){
                map.put("ID", args[1]);
            }
            /* Batch Logic */
            repository.sts_insert_lvl_01();
            successCount++;

            repository.sts_insert_lvl_01_01();
            successCount++;

            repository.sts_insert_lvl_02_02();
            successCount++;

            repository.sts_insert_lvl_03_01();
            successCount++;

            repository.sts_insert_lvl_03_02();
            successCount++;

            repository.sts_insert_lvl_0405();
            successCount++;

            repository.sts_insert_lvl_06();
            successCount++;

            repository.sts_insert_lvl_etc();
            successCount++;

            repository.smry_sts_insert();
            successCount++;

        }catch (Exception e){
            log.error("ExampleBatchService::ERROR!!" + e.getMessage());
            failCount++;
        }
    }
}
