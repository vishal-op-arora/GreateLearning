package Week4;

class Animal{
    public static int count = 0;
    String name;

    void setName(String name){
        this.name = name;
    }

    String getName(){
        return this.name;
    }

    static void getCount(){
        count++;
        System.out.println(count);
    }
}

public class AnimalDemo {
    public static void main(String[] args) {
        Animal cat = new Animal();
        cat.setName("puffy");
        System.out.println(cat.getName());

        /*
         * getCount() is static method
         * called like Animal.getCount()
         *
         * syntax : ClassName.staticMethodName();
         */
        Animal.getCount();

        Animal dog = new Animal();
        dog.setName("pluto");
        System.out.println(dog.getName());
        Animal.getCount();
    }
}
