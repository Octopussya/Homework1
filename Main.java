import java.util.ArrayList;

abstract class Person
{
    private String name;
    private boolean isMan;
    private int age;

    protected Person(String name, boolean isMan, int age)
    {
        this.name = name;
        this.isMan = isMan;
        this.age = age;
    }
    protected void print()
    {
        System.out.format("name: %s\ngender: %s\nage: %d\n", name, isMan ? "male" : "female", age);
    }
};

class Father extends Person
{
    public Father(String name, boolean isMan, int age)
    {
        super(name, isMan, age);
    }
    public void print()
    {
        System.out.println("Father:");
        super.print();
    }
};
class Mother extends Person
{
    public Mother(String name, boolean isMan, int age)
    {
        super(name, isMan, age);
    }
    public void print()
    {
        System.out.println("Mother:");
        super.print();
    }
};
class Child extends Person
{
    public Child(String name, boolean isMan, int age)
    {
        super(name, isMan, age);
    }
    public void print()
    {
        System.out.println("Child:");
        super.print();
    }
};

class Family
{
    private Father father;
    private Mother mother;
    private ArrayList<Child>  children;
    private int childrenCount;

    public Family(Father father, Mother mother, ArrayList<Child> children)
    {
        this.father = father;
        this.mother = mother;
        this.children = children;
    }
    public boolean isValid()
    {
        return children.size() >= 1 && children.size() <= 5;
    }
    public void print()
    {
        if(!isValid())
        {
            System.out.println("invalid family");
            return;
        }
        father.print();
        mother.print();
        for(Child child : children)
            child.print();
    }
};

class Main
{
    public static void main(String args[])
    {
        Father f = new Father("Vasya", true, 29);
        Mother m = new Mother("Masha", false, 27);
        Child c1 = new Child("Vanya", true, 3);
        Child c2 = new Child("Katya", false, 1);
        ArrayList<Child> children = new ArrayList<Child>();
        children.add(c1);
        children.add(c2);
        Family family = new Family(f, m, children);
        family.print();
    }
}
