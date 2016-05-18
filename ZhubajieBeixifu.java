class Xiyoujirenwu 
{
    float height,weight;
    String head,ear;
    void speak(String s){
        head = "歪着头";
        System.out.println(s);
    }
}

public class ZhubajieBeixifu{
    public static void main (String args[]){
        Xiyoujirenwu zhubajie,sunwukong;        //声明两个对象：猪八戒和孙悟空
        zhubajie = new Xiyoujirenwu();
        sunwukong = new Xiyoujirenwu();

        zhubajie.height = 1.8f;                 //给zhubajie属性赋值
        zhubajie.head = "大头";
        zhubajie.ear = "一双大耳朵";

        sunwukong.weight = 1000.0f;              //给sunwukong属性赋值
        sunwukong.head = "秀发飘飘";
        sunwukong.height = 1.62f;


        System.out.println("zhubajie的身高：" + zhubajie.height);
        System.out.println("zhubajie的头：" + zhubajie.head);
        System.out.println("sunwukong的重量：" + sunwukong.weight);
        System.out.println("sunwukong的头：" + sunwukong.head);

        zhubajie.speak("俺老猪我想娶媳妇");     //对象调用方法
        System.out.println("zhubajie的头：" + zhubajie.head);
        sunwukong.speak("老孙我重 1000 斤，我想骗猪八戒背我");  //对象调用方法
        System.out.println("sunwukong的头：" + zhubajie.head);




    }
}
