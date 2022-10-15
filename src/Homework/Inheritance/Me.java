public class Me extends Father {
    String cyberium;

    public Me(String name, int age, String place, String profession, String favfood) {
        super(name, age, place, profession, favfood);
        this.cyberium = cyberium;
    }


    @Override
    public void eat() {super.eat();}

}
