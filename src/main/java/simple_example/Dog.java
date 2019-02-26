package simple_example;

import org.springframework.stereotype.Component;

@Component
public class Dog {

    protected String name = "Nora";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
