package packageOne;

/**
 * @Author: jn
 * @Date: 2020/4/23 22:20
 */
public class Ex2 {
    public Ex2(String name){
        //这个构造器仅有一个参数：name
        System.out.println("小狗的名字是 : " + name );
    }
    public static void main(String[] args){
        // 下面的语句将创建一个Puppy对象
        Ex2 myPuppy = new Ex2( "来福" );
    }
}