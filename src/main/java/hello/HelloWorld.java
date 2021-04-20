package hello;

import org.joda.time.LocalTime;

public class HelloWorld {
    public static void main(String[] args) {
      LocalTime currentTime = new LocalTime();
		  System.out.println("hello world wt is ur time: " + currentTime);

        Greeter greeter = new Greeter();
        System.out.println(greeter.sayHello());
    }
}
