import java.util.Scanner;

public class MovieMain {
    private static Scanner sc;

	public static void main(String arg[]){
        MovieData md[],temp;
        String movie_name, actor, director, name;
        double collection;
        int select, flag, i ;
        md = new MovieData[3];
        sc = new Scanner(System.in);
        for( i =0; i<3; i++){
            System.out.println("Movie Name:");
            movie_name = sc.next();
            System.out.println("Actor : ");
            actor = sc.next();
            System.out.println("Director : ");
            director = sc.next();
            System.out.println("collection : ");
            collection = sc.nextInt();
            md[i] = new MovieData(movie_name, actor, director, collection);
        }
        System.out.println("1.Director 2.Actor 3.Grossing movies" );
        select = sc.nextInt();
        switch(select){
            case 1:
                System.out.println("Director name :");
                name = sc.next();
                    for( i =0; i<3; i++){
                        flag = 0;
                        if((md[i].director).equalsIgnoreCase(name)){
                            flag = 1;
                        }
                        if(flag == 1){
                            System.out.println("Movie : " + md[i].getM_name());
                        }
                        else
                          System.out.println("no such director");
                    }
                break;
            case 2:
                System.out.println("Actor name :");
                name = sc.next();
                for( i =0; i<3; i++){
                        flag = 0;
                        if((md[i].getActor()).equalsIgnoreCase(name)){
                            flag = 1;
                        }
                        if(flag == 1){
                            System.out.println("Movie : " + md[i].getM_name());
                        }
                        else
                            System.out.println("no such director");
                }
                break;
            case 3:
                System.out.println("Movies with highest earnings to lowest");
                for (i = 0; i < 2; i++) {
                    for (int j =i+1; j<3; j++){
                        if(md[i].getBox_office()<md[j].getBox_office()){
                            temp = md[i];
                            md[i] = md[j];
                            md[j] = temp;
                            
                        }
                    }
                }
                for(i =0; i< 3; i++){
                    System.out.println("Movies are: "+ md[i].getM_name()+" Earings: "+ md[i].getBox_office());
                }
                break;
                
            default:
                System.out.println("Invalid Input");
        }
    }
    
}
