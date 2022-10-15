public class GrandDad extends GreatGrandFather {

    String documents;

    public GrandDad(String name, int age, String place, String profession, String favfood) {
        super(name, age, place, profession, favfood);
        this.documents = "contructions of mechanisms";
    }

    @Override
    public void eat() {super.eat();}
}
