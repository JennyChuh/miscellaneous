package charactor;

public class Range {
public static void main(String []args){
	for(Season season:Season.values()){
		System.out.println(season);
	}
}
}
/* 
��������ֻ��ʹ����ĸ ���� $ _
������һ���ַ� ֻ��ʹ�� ��ĸ $ _
������һ���ַ� ����ʹ������
  һ��ʹ��booleanֵbreak
  public class HelloWorld {
    public static void main(String[] args) {
          
        //��ӡ����    
        for (int i = 0; i < 10; i++) {
             
            for (int j = 0; j < 10; j++) {
                System.out.println(i+":"+j);
                if(0==j%2) 
                    break; //�����˫����������ǰѭ��
            }
             
        }
         
    }
}
	����ʹ�ñ�ǩbreak
	����boolean���������ⲿѭ��
	��Ҫ���ڲ�ѭ�����޸��������ֵ
	ÿ���ڲ�ѭ�������󣬶�Ҫ���ⲿѭ�����жϣ����������ֵ
	public class HelloWorld {
    public static void main(String[] args) {
        boolean breakout = false; //�Ƿ���ֹ�ⲿѭ���ı��
        for (int i = 0; i < 10; i++) {
 
            for (int j = 0; j < 10; j++) {
                System.out.println(i + ":" + j);
                if (0 == j % 2) {
                    breakout = true; //��ֹ�ⲿѭ���ı������Ϊtrue
                    break;
                }
            }
            if (breakout) //�ж��Ƿ���ֹ�ⲿѭ��
                break;
        }
 
    }
}
*/