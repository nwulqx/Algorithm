public class RansomNote{
	public static void main(String []args){
		System.out.println(canConstruct("fihjjjjei","hjibagacbhadfaefdjaeaebgi"));
	}
    public static boolean canConstruct(String ransomNote, String magazine) {
    	if(ransomNote.length()==0&&magazine.length()==0)
    		return true;
    	if(ransomNote.length()==0&&magazine.length()!=0)
    		return true;
    	if(ransomNote.length()!=0&&magazine.length()==0)
    		return false;
    	char c1[] = ransomNote.toCharArray();
    	char c2[] = magazine.toCharArray();
    	boolean result =true;
    	for(int i=0;i<c1.length;i++){
    		if(!result) break;
    		for(int j=0;j<c2.length;j++){
    			if(c1[i] == c2[j]){
    				c2[j] = '\t';
    				result =true;
    				break;
    			}
    			result = false;
    		}
    	}
    	return result;
    }
}