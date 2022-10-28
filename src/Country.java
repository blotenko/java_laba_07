import java.util.List;
import java.util.Scanner;

public class Country {
    String name;
    String id;
    List<City> cities;

    Country(String name, String id, List<City> c){
       this.cities = c;

        this.name = name;
        this.id = id;
    }


    public void display() {
        System.out.println("Country id: "+ id);
        System.out.println("Country: "+ name+ " contains :");
        for(int i = 0; i<cities.size();i++){
            cities.get(i).display();
        }
    }

    public  void changeCountry(){
        display();
        System.out.println("Enter which param you want to change: ");
        int choice = 0;
        System.out.println("1. Country id");
        System.out.println("2. Country name");
        System.out.println("3. Change city param");

        Scanner keyboard = new Scanner(System.in);
        Scanner keyboard2 = new Scanner(System.in);
        choice = keyboard.nextInt();
        switch (choice){
            case -1 : return;
            case 1: {
                System.out.println("Enter Country id  :");
                String cId = keyboard.nextLine();
                id = cId;
            }
            case 2: {
                System.out.println("Enter Country name  :");
                String name = keyboard.nextLine();
                name = name;
            }
            case 3 :{
                System.out.println("Enter with which city you want  to work?  :");
                for(int  i =0; i< cities.size();i++){
                    System.out.println(i+" city");
                }
                choice = keyboard.nextInt();
                System.out.println("Enter which param you want to change: ");
                System.out.println("1. Country name");
                System.out.println("2. Country id");
                System.out.println("3. City ref");
                System.out.println("4. City count of people");
                System.out.println("5. City is stol");
                int choice2 = 0;
                choice2 = keyboard.nextInt();
                switch (choice2){
                    case 1:{
                        System.out.println("Enter name :");
                        String tmp = keyboard2.nextLine();
                        cities.get(choice).name =  tmp;
                    break;
                    }
                    case 2:{
                        System.out.println("Enter id :");
                        String tmp = keyboard.nextLine();
                        cities.get(choice).id = tmp;
                        break;
                    }
                    case 3:{
                        System.out.println("Enter ref :");
                        String tmp = keyboard.nextLine();
                        cities.get(choice).ref = tmp;
                        break;
                    }
                    case 4:{
                        System.out.println("Enter countOfPeope :");
                        String tmp = keyboard.nextLine();
                        cities.get(choice).countOfPeople = tmp;
                        break;
                    }
                    case 5:{
                        System.out.println("Enter isStoliza :");
                        String tmp = keyboard.nextLine();
                        cities.get(choice).isStol = tmp;
                        break;
                    }
                    case 0: break;
                }
            }
        }
    }

    public void deleteCity(){
        System.out.println("Enter which city you want to delete ?");
        for(int  i =0; i< cities.size();i++){
            System.out.println(i+" city");
        }
        Scanner keyboard = new Scanner(System.in);
        int choice = keyboard.nextInt();
        cities.remove(choice);
    }

}
