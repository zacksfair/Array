package example;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;
import java.util.Arrays;
import java.util.Random;
@WebService()
public class HelloWorld {
  @WebMethod
  public static void main(String []args) {
    double start  = System.currentTimeMillis() ;
    int[] myList = new int[1000];
    int number = 0;
    Random rand = new Random();
    for(int i = 0;i<1000;i++){
      number = number+rand.nextInt(2)+1;//每次随机增加1或2
      myList[i] = number;
    };
    System.out.println(Arrays.toString(myList));
    double end  = System.currentTimeMillis() ;
    System.out.println("time is : " + (end - start)+"Millis");
  }
}
