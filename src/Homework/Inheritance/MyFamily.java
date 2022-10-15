public class MyFamily {

    String name;
    int age;
    String place;
    String favfood;
    String profession;


    public MyFamily(String name, int age, String place, String profession, String favfood){
        this.name = name;
        this.age = age;
        this.place = place;
        this.favfood = favfood;
        this.profession = profession;
    }




    public void myAge(){
        System.out.println(age + "years");
    }

    public void myInfo(){
        System.out.println(profession);
    }
    public void eat(){
        System.out.println("My name is: "+name+", and I am eating: " + favfood);
    }

    public void display(){
        System.out.println("Name: " + name);
    }

}