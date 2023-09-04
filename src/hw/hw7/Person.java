package hw.hw7;

public class Person {

    public String name;
    public int age;
    public boolean sex;
    //true - male
    //false - female

    public String getName() {

        String prefix = sex ? "Mr" : "Mrs";
        return prefix + ". " + name;

        //or

//        if (sex) {
//            return "Mr. " + name;
//        } else {
//            return "Mrs. " + name;
//        }
    }

    public static void main(String[] args) {
        Person m = new Person();
        m.name = "John Smith";
        m.age = 20;
        m.sex = true;
        System.out.println(m.getName());
    }
}
