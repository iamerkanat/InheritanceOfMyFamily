public class GreatGrandFather extends MyFamily {
    String heroism;

    public GreatGrandFather(String name, int age, String place, String profession, String favfood){

        super(name, age, place, profession, favfood);
        this.heroism = "in the 1930-1933 ages of hunger strike, my Great Grandad hunted in the forest and after getting loot he shared it with all of people from the village; ";
    }

    @Override
    public void eat() {super.eat();}
}
