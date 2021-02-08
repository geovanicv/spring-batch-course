package com.geovanicv.parImpar.processor;

import org.springframework.batch.core.configuration.annotation.StepScope;
import org.springframework.batch.item.function.FunctionItemProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class ParImparProcessor {
	
	@Bean
	@StepScope
	public FunctionItemProcessor<Integer, String> parOuImparProcessor() {
		return new FunctionItemProcessor<Integer, String>(
				item -> item % 2 == 0 
				? String.format("Item %s é Par", item)
				: String.format("Item %s é Ímpar", item)
		);
	}
}
