public class Grandma extends GrandDad{
    String gifts;

    public Grandma(String name, int age, String place, String profession, String favfood) {
        super(name, age, place, profession, favfood);
        this.gifts = "for Erkanat";
    }

    @Override
    public void eat() {super.eat();}
}
