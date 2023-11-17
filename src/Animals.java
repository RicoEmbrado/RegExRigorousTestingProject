public class Animals
{
    //instance variables

    String name;
    String age; //in years

    public Animals()
    {
        this.name = "";
        this.age = "";
    }

    public Animals(String name, String age)
    {
        this.name = name;
        this.age = age;
    }

    public String getName()
    {
        return name;
    }

    public String getAge()
    {
        return age;
    }
}
