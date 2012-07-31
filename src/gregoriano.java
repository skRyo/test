/*
 * 西暦年が4で割り切れる年は閏年
    ただし、西暦年が100で割り切れる年は平年
    ただし、西暦年が400で割り切れる年は閏年
 * 
 */

public class gregoriano {
    public static void main(String[] args) {
        int x = 2000;
      for ( int i = 1; i <= x; i++ ){
        if ((i % 4 == 0) && (i % 100 != 0) || (i % 400 == 0)){
            System.out.println(i + " 閏年みたいだよ");
        }else{
            System.out.println(i);
        }
      }
//        for ( int i = 1; i <= x; i++ ){
//            if ( i%4==0 ){
//                if ( i%400==0 || i%100!=0 ){
//                    System.out.println(i + " 閏年みたいだよ");
//                }else{
//                    System.out.println(i);
//                }
//            }else{
//                System.out.println(i);
//            }
//        }
    }
}

