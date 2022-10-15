public class GreatGranny extends GreatGrandFather {

    String recipes;

    public GreatGranny(String name, int age, String place, String profession, String favfood){
        super(name, age, place, profession, favfood);
        this.recipes = "Book about how to Cook perfectly French Cuisine";
    }

    @Override
    public void myAge() {
        super.myAge();
    }
}
