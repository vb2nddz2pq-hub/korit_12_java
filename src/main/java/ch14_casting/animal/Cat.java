package ch14_casting.animal;

public class Cat extends Animal{
    @Override
    protected void makeSound() {
        super.makeSound();
        System.out.println("고양이가 웁니다.");
    }
    // 고유메서드
    public  void udadada(){
        System.out.println("고양이가 우다다다 거립니다.");
    }
}
