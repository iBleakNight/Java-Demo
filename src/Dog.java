class Dog extends Animal{
    void eat(){
        System.out.println("dog : eat");
    }
    void eatTest (){
        this.eat();
        super.eat();
    }
}
