
import java.util.*;

public class main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Why did you open this man?");
    System.out.println(" \n");
    System.out.println("(1) Because I want to open this file");
    System.out.println("(2) Because I saw in youtube or community");
    System.out.println("(3) Haha I didn't opened");
    System.out.println("(4) because yellowstrawberry bot goes brrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrr");
    String scst = sc.nextLine();
	int i=0;
	Random ra = new Random();
    if(scst.equals("1")){
      System.out.println("Ok just it was checking");
      while(i<=100){
		  int ikp = ra.nextInt(11);
	int fkp = ra.nextInt(10);
        System.out.printf("\r%s","Uploading "+i+"% | "+ikp+"."+fkp+" Mbps");
		i++;
        try {
          Thread.sleep(400);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
      System.out.println("\n Did u think loading is real? LLLLLLLLLLLLLLLLLLLLLLLLLLL");
    }
    if(scst.equals("2")){
      System.out.println("Ok just it was checking");
      while(i<=100){
		  int ikp = ra.nextInt(11);
	int fkp = ra.nextInt(10);
        System.out.printf("\r%s","Uploading "+i+"% | "+ikp+"."+fkp+" Mbps");
		i++;
        try {
          Thread.sleep(400);
        } catch (InterruptedException e) {
          e.printStackTrace();
		  System.out.println("E");
        }
      }
      System.out.println("\n Did u think loading is real? LLLLLLLLLLLLLLLLLLLLLLLLLLL");
    }
    if(scst.equals("3")){
      System.out.println("wat? wat the... k its just checking");
      while(i<=100){
		  int ikp = ra.nextInt(11);
	int fkp = ra.nextInt(10);
        System.out.printf("\r%s","Uploading "+i+"% | "+ikp+"."+fkp+" Mbps");
		i++;
        try {
          Thread.sleep(400);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
      System.out.println("\n Did u think loading is real? LLLLLLLLLLLLLLLLLLLLLLLLLLL");
    }
    if(scst.equals("4")){
      System.out.println("Yellowstrawberry bot goes brrrrrrrrrrrrrrrrrrrrrrrr");
      String br = "br";
      while(i<=100){
		  int ikp = ra.nextInt(11);
	int fkp = ra.nextInt(10);
        br = br+"r";
        System.out.printf("\r%s",br+" "+i+"% | "+ikp+"."+fkp+" Mbps");
		i++;
        try {
          Thread.sleep(400);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
      System.out.println("\n brrrrrrrrrrrrrrrrrr");
    }
  }
}
