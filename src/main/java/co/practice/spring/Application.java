package co.practice.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.nio.file.Paths;


public class Application {

	public static void main(String[] args) {
		//Car car=new Car(new GasolineEngine());

		ApplicationContext context=new FileSystemXmlApplicationContext(Paths.get("src/main/resources/beans.xml").toString());
		Car car=context.getBean("car", Car.class);

		System.out.println(car.getEngine().getEngineTyp());

	}

}
