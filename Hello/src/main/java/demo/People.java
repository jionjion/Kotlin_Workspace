package demo;

/**
 * 正常的Java类
 *
 * @author Jion
 */
public class People {

    private final String name;

    public People(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.println("Hello, " + name);
    }

    public String getName() {
        return name;
    }
}
