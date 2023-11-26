public class Animals
{
    //instance variables

    String name;
    String age; //in years
    String username;

    public Animals()
    {
        this.name = "";
        this.age = "";
        this.username = "";
    }

    public Animals(String name, String age, String username)
    {
        this.name = name;
        this.age = age;
        this.username = username;
    }

    public String getName()
    {
        return name;
    }

    public String getAge()
    {
        return age;
    }

    public String getUsername()
    {
        return username;
    }
}
