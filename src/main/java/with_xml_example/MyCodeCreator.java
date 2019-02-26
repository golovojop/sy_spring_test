package with_xml_example;

public class MyCodeCreator implements CodeCreator {

    String name;

    public MyCodeCreator(String name) {
        this.name = name;
    }

    public CatEx getClassCat() {
        return new CatEx(name);

    }
}
