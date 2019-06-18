package java_may_06._1;

public class Mail {
    private String site;
    private String login="admin";
    private String password="admin";

    public Mail(String site) {
        this.site = site;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Mail{" +
                "site='" + site + '\'' +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
     public void login(String login, String password){
        if (login.equals(this.login)&&password.equals(this.password))
         System.out.println("You are  logged ");
        else {
         System.out.println("Somethinks is wrong");}
     }
}
