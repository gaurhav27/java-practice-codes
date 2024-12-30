package com.october.oops;

public abstract class AbstractClassAnimal {

	public abstract void sound();
}

class Dog extends AbstractClassAnimal {
	public void sound() {
		System.out.println("Bark");
	}
}

class Lion extends AbstractClassAnimal {
	public void sound() {
		System.out.println("Roar");
	}
}

class Animal {
	public static void main(String[] args) {
		Dog dog = new Dog();
		Lion lion = new Lion();

		dog.sound();
		lion.sound();
	}
}
