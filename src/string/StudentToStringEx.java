package string;

public class StudentToStringEx {
    int id;
    String name;
    int roll;
    public StudentToStringEx(int id, String name, int roll) {
        this.id = id;
        this.name = name;
        this.roll = roll;
    }
    public String toString()
    {
        return (this.id+this.name+this.roll);

    }
    public static void main(String[] args)
    {
        StudentToStringEx obj = new StudentToStringEx(1,"Hi",2);
        System.out.println(obj);

    }

}
