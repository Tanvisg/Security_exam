// import required classes and package if any
import java.security.MessageDigest;
import java.util.Scanner;
// create class MessageDigestExample to understand the use of MessageDigest class
public class MessageDigestExample {
// main() method start
public static void main(String args[]) throws Exception{
// create an instance of Scanner class
Scanner sc = new Scanner(System.in);
System.out.println("Enter the message of any arbitrary length:");
String msg = sc.nextLine();
// close Scanner class
sc.close();
//create an instance of the MessageDigest by using the getInstance() method with the MD5 algorithm
MessageDigest obj = MessageDigest.getInstance("MD5");
//use update() method for passing data to the created MessageDigest Object
obj.update(msg.getBytes());
//use the digest() method for computing the message digest

byte[] byteArray = obj.digest();
System.out.println(byteArray);
//convert the byte array in to Hex String format
StringBuffer hexData = new StringBuffer();
for (int i = 0; i < byteArray.length; i++) {
hexData.append(Integer.toHexString(0xFF & byteArray[i]));
}
System.out.println("Data in Hex format : " + hexData.toString());
}
}