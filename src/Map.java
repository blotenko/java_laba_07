public class Map {
    Country[] countries;
    Map(Country[] c){
        this.countries = c;
    }
    void displayMap(){
        System.out.println("Map contains : ");
        for(int i = 0;i<countries.length;i++){
            countries[i].display();
        }
    }
}
