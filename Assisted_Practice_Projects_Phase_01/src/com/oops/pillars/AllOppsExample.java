package com.oops.pillars;

class Animal {
 private String name;
 public Animal(String name) {
     this.name = name;
 }
 public String getName() {
     return name;
 }
 public void makeSound() {
     System.out.println(name + " makes a generic sound");
 }
}
class Dog extends Animal {
 public Dog(String name) {
     super(name);
 }
 public void makeSound() {
     System.out.println(getName() + " barks");
 }
}
class Cat extends Animal {
 public Cat(String name) {
     super(name);
 }
 public void makeSound() {
     System.out.println(getName() + " meows");
 }}
public class AllOppsExample {
 public static void main(String[] args) {
     
     Animal animal = new Animal("Generic Animal");
     Dog dog = new Dog("Buddy");
     Cat cat = new Cat("Whiskers");
     
     System.out.println("Encapsulation: " + dog.getName()); 
     
     System.out.println("\nAbstraction:");
     animal.makeSound(); 
     dog.makeSound(); 
     cat.makeSound(); 
     
 
     Animal[] animals = new Animal[] { animal, dog, cat };
     
     System.out.println("\nPolymorphism:");
     for (Animal a : animals) {
         a.makeSound(); 
     }
 }
}

