public class Mom extends GrandDad{
    String kindness;

    public Mom(String name, int age, String place, String profession, String favfood) {
        super(name, age, place, profession, favfood);
        this.kindness = "loving, kissing, telling fairytales";
    }

    @Override
    public void eat() {super.eat();}
}

