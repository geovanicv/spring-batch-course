package com.geovanicv.parImpar.writer;

import org.springframework.batch.core.configuration.annotation.StepScope;
import org.springframework.batch.item.ItemWriter;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class ParImparWriter {
	
	@Bean
	@StepScope
	public ItemWriter<String> imprimeWriter() {
		return itens -> itens.forEach(System.out::println);
	}
}
