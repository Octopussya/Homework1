import java.util.ArrayList;
class Person
{
    String _name;
    boolean _isMan;
    int _age;

    Person(String name, boolean isMan, int age)
    {
        _name = name;
        _isMan = isMan;
        _age = age;
    }
    void print()
    {
        System.out.format("name: %s\ngender: %s\nage: %d\n", _name, _isMan ? "male" : "female", _age);
    }
};

class Father extends Person
{
    Father(String name, boolean isMan, int age)
    {
        super(name, isMan, age);
    }
    void print()
    {
        System.out.println("Father:");
        super.print();
    }
};
class Mother extends Person
{
    Mother(String name, boolean isMan, int age)
    {
        super(name, isMan, age);
    }
    void print()
    {
        System.out.println("Mother:");
        super.print();
    }
};
class Child extends Person
{
    Child(String name, boolean isMan, int age)
    {
        super(name, isMan, age);
    }
    void print()
    {
        System.out.println("Child:");
        super.print();
    }
};

class Family
{
    Father _father;
    Mother _mother;
    ArrayList<Child>  _children;
    int childrenCount;

    Family(Father father, Mother mother, ArrayList<Child> children)
    {
        _father = father;
        _mother = mother;
        _children = children;
    }
    boolean isValid()
    {
        return _children.size() >= 1 && _children.size() <= 5;
    }
    void print()
    {
        if(!isValid())
        {
            System.out.println("invalid family");
            return;
        }
        _father.print();
        _mother.print();
        for(Child child : _children)
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
