class Xiyoujirenwu 
{
    float height,weight;
    String head,ear;
    void speak(String s){
        head = "����ͷ";
        System.out.println(s);
    }
}

public class ZhubajieBeixifu{
    public static void main (String args[]){
        Xiyoujirenwu zhubajie,sunwukong;        //��������������˽�������
        zhubajie = new Xiyoujirenwu();
        sunwukong = new Xiyoujirenwu();

        zhubajie.height = 1.8f;                 //��zhubajie���Ը�ֵ
        zhubajie.head = "��ͷ";
        zhubajie.ear = "һ˫�����";

        sunwukong.weight = 1000.0f;              //��sunwukong���Ը�ֵ
        sunwukong.head = "�㷢ƮƮ";
        sunwukong.height = 1.62f;


        System.out.println("zhubajie����ߣ�" + zhubajie.height);
        System.out.println("zhubajie��ͷ��" + zhubajie.head);
        System.out.println("sunwukong��������" + sunwukong.weight);
        System.out.println("sunwukong��ͷ��" + sunwukong.head);

        zhubajie.speak("����������Ȣϱ��");     //������÷���
        System.out.println("zhubajie��ͷ��" + zhubajie.head);
        sunwukong.speak("�������� 1000 �����ƭ��˽䱳��");  //������÷���
        System.out.println("sunwukong��ͷ��" + zhubajie.head);




    }
}
