package charactor;

public class Range {
public static void main(String []args){
	for(Season season:Season.values()){
		System.out.println(season);
	}
}
}
/* 
变量命名只能使用字母 数字 $ _
变量第一个字符 只能使用 字母 $ _
变量第一个字符 不能使用数字
  一、使用boolean值break
  public class HelloWorld {
    public static void main(String[] args) {
          
        //打印单数    
        for (int i = 0; i < 10; i++) {
             
            for (int j = 0; j < 10; j++) {
                System.out.println(i+":"+j);
                if(0==j%2) 
                    break; //如果是双数，结束当前循环
            }
             
        }
         
    }
}
	二、使用标签break
	借助boolean变量结束外部循环
	需要在内部循环中修改这个变量值
	每次内部循环结束后，都要在外部循环中判断，这个变量的值
	public class HelloWorld {
    public static void main(String[] args) {
        boolean breakout = false; //是否终止外部循环的标记
        for (int i = 0; i < 10; i++) {
 
            for (int j = 0; j < 10; j++) {
                System.out.println(i + ":" + j);
                if (0 == j % 2) {
                    breakout = true; //终止外部循环的标记设置为true
                    break;
                }
            }
            if (breakout) //判断是否终止外部循环
                break;
        }
 
    }
}
*/