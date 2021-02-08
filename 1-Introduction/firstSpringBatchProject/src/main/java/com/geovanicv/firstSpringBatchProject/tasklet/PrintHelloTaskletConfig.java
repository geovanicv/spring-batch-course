package com.geovanicv.firstSpringBatchProject.tasklet;

import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.configuration.annotation.StepScope;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class PrintHelloTaskletConfig {

	@Bean
	@StepScope
	public Tasklet printHelloTasklet(@Value("#{jobParameters['name']}") String name) {
		return new Tasklet() {
			
			@Override
			public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
				System.out.println(String.format("Hello, %s!!!", name));
				return RepeatStatus.FINISHED;
			}
		};
	}

}
