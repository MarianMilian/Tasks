package java_may_06._1;

public class Animal {
    private String nick;
    private int age;

    public Animal(String nick, int age) {
        this.nick = nick;
        this.age = age;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "nick='" + nick + '\'' +
                ", age=" + age +
                '}';
    }
    public void makeNoice(){
        System.out.println("Gav Gav");
    }

    public void makePi(){
        System.out.println("Make piiii  everywhere");
    }
}
