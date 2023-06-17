package com.example.diylib.generic;

public class Main {
    private static class Person{
        String name;
        int age;
        public Person(String name, int age){
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "name = " + this.name + " age = " + this.age;
        }
    }
    public static void main(String[] args) {
        System.out.println("start ...");
        MyGenericContainer<String> container1 = new MyGenericContainer<>("string");
        MyGenericContainer<Integer> container2 = new MyGenericContainer<>(12);
        MyGenericContainer<Person> container3 = new MyGenericContainer<>(new Person("jiwon", 25));
        System.out.println("container1 "+container1);
        System.out.println("container2 "+container2);
        System.out.println("container3 "+container3);

        MyGenericContainer<Person> [] containerArray = new MyGenericContainer [3];
        containerArray[0] = new MyGenericContainer<Person>(new Person("Jasmin", 23));
        containerArray[1] = new MyGenericContainer<Person>(new Person("Jage", 13));
        containerArray[2] = new MyGenericContainer<Person>(new Person("Noel", 34));

        for (MyGenericContainer<Person> container : containerArray) {
            System.out.println(container.getValue());
        }

    }
}
