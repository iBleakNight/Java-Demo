public class Variable{
    static int allClicks=0;    // 类变量

    String str="hello world";  // 实例变量

    public void method(){

        int i =0;  // 局部变量

    }

    public static void main(String[] args){
        System.out.println("allClicks:" + allClicks);
//        System.out.println("str:" + str);
    }

}