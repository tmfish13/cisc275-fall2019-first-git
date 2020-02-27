import java.util.*;

class Animal{
    String name;
    int numLegs;

    Animal(String name, int numLegs){
	this.name = name;
	this.numLegs = numLegs;
    }

    int getLegs(){
	return numLegs;
    }
}

class AnimalCompare implements Comparator<Animal>{
    // All interface methods are PUBLIC
    // Comparators are seperate classes
    public int compare(Animal a1, Animal a2){
	return a1.getLegs() - a2.getLegs();
    }
}

class Dog extends Animal{

    Dog(String name, int numLegs){
    	super(name, numLegs);
    }

    public String toString(){
    	return (name+", "+numLegs);
    }
}

