/*Very clever! 
For exception when n =3 and ^3 ....
*/
public class IntegerReplacement2{
	public int integerReplacement(int n) {
		int count = 0;
		while(n!=1){
			int bit = n&3;
			if(n == 3 || bit == 1){
				n--;
				count ++;
			}else if(bit==3){
				n++;
				count ++;
			}
			count ++;
			// We need no signed shift operator!
			n >>>=1;
		}
		return count;
	}
}