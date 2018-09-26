package week2.task3;

public class Task3 {

    }


//TODO: khai báo 3 class tương ứng với 3 đối tượng thực tế ở dưới
class Teacher{
    private String Name;
    private String Subject;
    private String Email;
    public String getName(){
        return Name;
    }
    public void setName(String name){
        this.Name = name;
    }
    public String getSubject(){
        return Subject;
    }
    public void setSubject(String subject){
        this.Subject = subject;
    }
    public String getEmail(){
        return Email;
    }
    public void setEmail(String email){
        this.Email = email;
    }
    public void Teach(){
        System.out.println("The teacher teaches" + this.Subject);
    }
}
class Cat{
    private String Name;
    private String Color;
    private int Weight;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        this.Color = color;
    }

    public int getWeight() {
        return Weight;
    }

    public void setWeight(int weight) {
        this.Weight = weight;
    }
    public void Meokeu(){System.out.println("Meow Meow");}
    public boolean Tamthe(){
        if (Color.equals("Tam the")) return true;
        return false;
    }
}
class Laptop{
    private String Name;
    private int Price;
    private String Thick;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getThick() {
        return Thick;
    }

    public void setThick(String thick) {
        Thick = thick;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }
    public boolean canbuy(int money){
        if (money>= this.Price) return true;
        return false;
    }

}
