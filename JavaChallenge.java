package week2.day3;

public class JavaChallenge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  String s = "Hello World";
  String []split=s.split(" ");
  int length= split.length;
  int lastword_length = split[length-1].length();
  
  System.out.println("The last word is " +split[length-1]+ " with length "+lastword_length);
  
  String s1 = "fly me to the moon";
  String []split1=s1.split(" ");
  int length1= split1.length;
  int lastword_length1 = split1[length1-1].length();
  
  System.out.println("The last word is " +split1[length1-1]+ " with length  "+lastword_length1);
  
  String s2 = "luffy is still joyboy";
  String []split2=s2.split(" ");
  int length2= split2.length;
  int lastword_length2 = split2[length2-1].length();
  
  System.out.println("The last word is " +split2[length2-1]+ " with length "+lastword_length2);
	}

}
