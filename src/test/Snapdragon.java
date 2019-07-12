package test;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Snapdragon implements Processor {

	@Override
	public void processorType() {
		System.out.println("Snapdragon Processor");
	}

}
