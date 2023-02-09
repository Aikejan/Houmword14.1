public class Child extends Father{
    private  String name;
    private int age;

    public Child(String profession, String name, int age) {
        super(profession);
        this.name = name;
        this.age = age;
    }
public  void hoppy(){
    System.out.println("bassketbol");
    }

    public  void food(){
        System.out.println("salat");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return
                "Profession: " + getProfession() + "\n" +
                "name: " + name + "\n" +
                "age:  " + age;

    }
}
