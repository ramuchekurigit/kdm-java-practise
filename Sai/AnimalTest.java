package org.Sai.test.com;

public class AnimalTest {


    
    public void Sound() {
        System.out.println("Animal makes a generic sound");
    }
}

class Bird extends AnimalTest {
    
    @Override
    public void Sound() {
        System.out.println("Bird chirps");
    }
}


class Cat extends AnimalTest {
  
    @Override
    public void Sound() {
        System.out.println("Cat meows");
    }
}


class Animal {
    public static void main(String[] args) {
        
        Bird bird = new Bird();
        Cat cat = new Cat();

       
        bird.Sound(); 
        cat.Sound();  
    }
}