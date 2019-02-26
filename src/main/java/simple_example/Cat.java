package simple_example;

import org.springframework.stereotype.Component;

@Component
public class Cat {

    protected String name = "Barsik";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
