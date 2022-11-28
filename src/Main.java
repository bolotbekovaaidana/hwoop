public class Main {
    public static void main(String[] args) {
        Fish fish=new Fish();
        fish.water();
        fish.setNickname("Dory");
        System.out.println("Fish's nickname: "+fish.getNickname());
        Cat cat=new Cat();
        cat.fish();
        cat.setNickname("Lili");
        System.out.println("Cat's nickname:"+cat.getNickname());
        Parrot parrot=new Parrot();
        parrot.repeat();
        parrot.setNickname("rainbow");
        System.out.println("Parrot's nickname:"+parrot.getNickname());
        Dog dog=new Dog();
        dog.run();
        dog.setNickname("Alabay");
        System.out.println("Dog's nickname:"+dog.getNickname());
    }
}