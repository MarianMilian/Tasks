package java_may_06._1;

public class Person {
    private String name ;
    private String surname;
    private int age;
    private Mail mail;
    private Animal animal;

    public Person(String name, String surname, int age, Mail mail,Animal animal) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.mail = mail;
        this.animal=animal;
    }
    public Person(String name, String surname, int age,String site,String nick, int dogAges) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.mail = new Mail(site);
        this.animal=new Animal(nick,dogAges);
    }

 public   void makeNoise (){
        animal.makeNoice();
 }

 public   void makePii (){
        animal.makePi();
    }
    public void log(String login, String password){
       mail.login(login,password);
    }
}
