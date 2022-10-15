public class MyMain {
    public static void main(String[] args) {

        GreatGrandFather Jaksybai = new GreatGrandFather("Jaksybai", 88, "Almaty", "Hunter", "Besbarmak");
        GreatGranny Sholpan = new GreatGranny("Sholpan", 79, "Almaty", "Cook", "Nisuaz-salad");
        GrandDad Qosymbai = new GrandDad("Qosymbai", 56, "Almaty", "Engineer", "Graten-patato");
        Grandma Tolybike = new Grandma("Tolybike", 82, "Almaty", "Teacher", "Rabbit-soup and kordon");
        Mom Iliya = new Mom("Iliya", 46, "Almaty", "Chemist-technologist", "Sushi");
        Father Tenel = new Father("Tenel", 46, "Almaty", "Military", "Borsch");
        Me Erkanat = new Me("Erkanat", 18, "Almaty", "Java-Programmer", "Fetuchini");


        Jaksybai.eat();
        Sholpan.eat();
        Qosymbai.eat();
        Tolybike.eat();
        Iliya.eat();
        Tenel.eat();
        Erkanat.eat();


    }

}