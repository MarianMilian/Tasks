package java_may_08._1;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Person {
    private String name ;
    private int year;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", year=" + year +
                '}';
    }
}
