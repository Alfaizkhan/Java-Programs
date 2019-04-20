import java.util.Scanner;

public class Team {
    String name;
    String hg;
    String owner;
    String capt;
    int player = 4;

    public Team() {
        this.p = new Players[11];
            for(int i=0;i<11;i++)
                p[i] = new Players();
    }

    public String getCaptain() {
        return capt;
    }

    	public void setCaptain(String Captain) {
    		this.capt = Captain;
    }

    	public Players[] getP() {
    		return p;
    }

    	public void setP(Players[] p) {
    		this.p = p;
    }

    	public String getName() {
    		return name;
    }

    	public void setName(String name) {
    		this.name = name;
    }

    	public String getHomeground() {
    		return hg;
    }

    public void setHomeground(String homeground) {
        this.hg = homeground;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
    Players p[];
	private Scanner sc;

    public void team_Get(){
        int j;
        int countf =0 ,countw =0;
        String temp = "india";
        sc = new Scanner (System.in);
   
        System.out.println("Enter Team Details:" + "\nTeam Name, Owner, Homeground" );
        System.out.println("Team Name: ");
        name = sc.next();
        System.out.println("Owner: ");
        owner = sc.next();
        System.out.println("Homeground: ");
        hg = sc.next();
        System.out.println("Enter player details : Name, Country, Role");
        for(j=0;j<player;j++){
            System.out.println("Name: ");
            p[j].name = sc.next();
            System.out.println("Country: ");
            p[j].country = sc.next();
            System.out.println("Role: ");
            p[j].role = sc.next(); 
            
            //Checking condition for foreign player
            if(!(p[j].getCountry()).equalsIgnoreCase(temp)){
                countf = countf + 1;
                System.out.println("number of foreigner " + countf);
            }
            if(countf == 4 ){
                System.out.println("Max limit for foreign players to take ");
            }
            if(countf > 4 ){
                System.out.println("No more foreign players RENTER DETAILS: ");
                j = j-1;
                countf = 4;
            }
            if((p[j].getRole()).equals("wk")){
                countw = countw + 1;
                System.out.println("Max limit for wicketkeeper ");
            }
            if(countw > 1){
                System.out.println("Only 1 wicketkeeper per team RENTER DETAILS: ");
                j = j - 1;
                countw = 1;
            }                
        }
        System.out.println("Captain : ");
        capt = sc.next();
        }   
    public void display_Team(){
        System.out.println("Team Details:");
        System.out.println("Team Name: " + getName() + "  Owner: " + getOwner() + "  Homeground: " + getHomeground() );
        System.out.println("Player Details: ");
        System.out.println("Name:\t\tCountry:\tRole:");
        for(int i =0;i<player;i++){
            System.out.println(p[i].getName() +"\t\t"+  p[i].getCountry() +"\t\t"+  p[i].getRole());
        }
        System.out.println("Captain : " + getCaptain());
        
    }
    
}

    


