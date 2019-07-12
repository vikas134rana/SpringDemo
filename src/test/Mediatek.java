package test;

import org.springframework.stereotype.Component;

@Component
public class Mediatek implements Processor {

	@Override
	public void processorType() {
		System.out.println("Mediatek Processor");
	}

}
