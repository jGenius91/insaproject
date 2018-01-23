package di_calculator;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		
		//spring을 적용하기 전의 코드
		/*MyCalculator myCalculator = new MyCalculator();
		myCalculator.setCalculator(new Calculator());
		myCalculator.setFirstNum(10);
		myCalculator.setSecondNum(2);
		myCalculator.add();
		myCalculator.sub();
		myCalculator.mul();
		myCalculator.div();*/
		
		String configLocation = "classpath:di_calculator/applicationCTX.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLocation);
		//추상적인 클래스 생성
		MyCalculator myCalculator = ctx.getBean("myCalculator",MyCalculator.class);
		//bean의 객체를 가져온다.
		
		myCalculator.add();
		myCalculator.sub();
		myCalculator.mul();
		myCalculator.div();
	}
}
