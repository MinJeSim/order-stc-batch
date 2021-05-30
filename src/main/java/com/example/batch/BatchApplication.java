package com.example.batch;

import com.example.batch.common.BeanUtils;
import com.example.batch.common.CommonBatch;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import java.util.Arrays;
import java.util.Locale;

@Slf4j
@SpringBootApplication
@EnableAspectJAutoProxy
public class BatchApplication implements CommandLineRunner{
	public static void main(String[] args) {
		SpringApplication.run(BatchApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		log.info("CommandLineRunner: " + Arrays.toString(args));
		if( args.length < 1 ){
			log.info("### check your className : java -jar batch-demo.jar [ClassName]");
			System.exit(0);
		}
		try{
			String beanName = args[0].substring(0,1).toLowerCase(Locale.ROOT)+args[0].substring(1)+args[1];
			System.out.println(beanName);
			CommonBatch batch = (CommonBatch)BeanUtils.getBean(beanName);
			batch.doBatch(args);
		}catch (Exception e){
			log.error(e.getMessage());
		}
	}
}
