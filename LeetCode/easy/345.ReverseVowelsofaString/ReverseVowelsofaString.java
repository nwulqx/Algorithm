import java.util.*;
public class ReverseVowelsofaString{
	public static void main(String []args){
		System.out.println(reverseVowels("df"));
		// System.out.println(isVowels('.'));
	}
	public static String reverseVowels(String s){
		char c[] = s.toCharArray();
		int i = 0;
		int j = c.length-1;
		while(i<j){
			while(i<c.length && !isVowels(c[i])){
				i++;
			}
			while(j>=0 && !isVowels(c[j])){
				j--;
			}
			if(i<j){
				swap(c,i,j);
				i++;
				j--;
			}
		}
		return new String(c);
	}
	public static void swap(char[] c,int i,int j){
		if(i==j) return;
		c[i] = (char)(c[i]^c[j]);
		c[j] = (char)(c[i]^c[j]);
		c[i] = (char)(c[i]^c[j]);
	}
	public static boolean isVowels(char c){
		if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U'){
			return true;
		}
		return false;
	}
}