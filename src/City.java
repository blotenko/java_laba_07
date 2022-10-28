public class City {
    String name;
    String id;
    String ref;
    String countOfPeople;
    String isStol;
    City(String str, String i, String r, String c, String is){
        this.name = str;
        this.id = i;
        this.ref = r;
        this.countOfPeople = c;
        this.isStol = is;
    }
    public void display() {
        System.out.println("City :"+ name);
        System.out.println("City id :"+ id);
        System.out.println("City ref: "+ ref);
        System.out.println("City count Of people: "+ countOfPeople);
        System.out.println("City  stoliza : "+ isStol);
    }
}
