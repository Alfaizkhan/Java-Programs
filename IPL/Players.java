public class Players {
    String name;
    String role;
    String country;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    public class IPLMain {
        public void main(String[] args) {
            // TODO code application logic here
            Team t[] = new Team[2];
            t[0] = new Team();
            t[0].team_Get();
            t[0].display_Team();
        }
        
    }

}
