package hello.core.order;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class HelloLombok {

    private String name;
    private int age;

    public static void main(String[] args) {
        HelloLombok helloLombok = new HelloLombok();
       helloLombok.setName("Junsu");

       String name = helloLombok.name;
        System.out.println("name = " + name);
    }
}