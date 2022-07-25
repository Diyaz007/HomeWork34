package A;

public class Dog {
    private int weight;
    private int age;

    public Dog(int weight, int age) {
        this.weight = weight;
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void Speak(){
        System.out.println("Привет я Далматиней, мне "+age+", мой вес "+weight+", Пока!");
    }
}
