class Employee{
    Employee(String n){
        System.out.println("Welcome employee "+n);
    }
}

class Dev extends Employee{
    int age;
    Dev(String n){
        super(n);
        System.out.println("Your role is Dev");
    }

    public void getAge() {
        System.out.println("Your age: "+age);
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class demoInheritance {
    public static void main(String[] args) {
        Dev dev1 = new Dev("Nick");
        dev1.setAge(34);
        dev1.getAge();


    }
}
