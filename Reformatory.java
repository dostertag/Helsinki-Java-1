/*
 *  DO TOT TOUCH THIS CLASS!
 */

public class Person {

    private String name;
    private int age;
    private int height;
    private int weight;

    public Person(String name, int age, int height, int weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public void becomeOlder() {
        this.age++;
    }

    public boolean adult() {
        return this.age >= 18;
    }

    public double weightIndex() {
        double heightInMeters = this.height / 100.0;

        return this.weight / (heightInMeters * heightInMeters);
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return this.height;
    }
    
    public class Reformatory {
    
    private int totalTimesMeasured;

    public Reformatory() {
        this.totalTimesMeasured = 0;
    }
    
    public int weight(Person person) {
        // return the weight of the person
        this.totalTimesMeasured++;
        return person.getWeight();

    }
    public void feed(Person person) {
        int temporaryWeight = person.getWeight();
        person.setWeight(temporaryWeight + 1);
    }
    
    public int totalWeightsMeasured() {
        return this.totalTimesMeasured;
    }

}


public class Main {

    public static void main(String[] args) {
        // write here test code 
    Reformatory eastHelsinkiReformatory = new Reformatory();

    Person brian = new Person("Brian", 1, 110, 7);
    Person pekka = new Person("Pekka", 33, 176, 85);

    System.out.println("total weights measured "+eastHelsinkiReformatory.totalWeightsMeasured());

    eastHelsinkiReformatory.weight(brian);
    eastHelsinkiReformatory.weight(pekka);

    System.out.println("total weights measured "+eastHelsinkiReformatory.totalWeightsMeasured());

    eastHelsinkiReformatory.weight(brian);
    eastHelsinkiReformatory.weight(brian);
    eastHelsinkiReformatory.weight(brian);
    eastHelsinkiReformatory.weight(brian);

    System.out.println("total weights measured "+eastHelsinkiReformatory.totalWeightsMeasured());        
    }
}


    public int getWeight() {
        return this.weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        return this.name + " I am " + this.age + " years old, my weight index is " + this.weightIndex();
    }
}
