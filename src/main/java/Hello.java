public class Hello {

    public String greet(String name) {
        return "Hello, " + name + "!";
    }

    public static void main(String[] args) {
        System.out.println(new Hello().greet("Azure DevOps"));
    }
}
