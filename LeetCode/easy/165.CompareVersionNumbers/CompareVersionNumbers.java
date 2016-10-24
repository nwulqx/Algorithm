/*A little bit complex when v1.length != v2.length.
We can assume v[i] = 0 when i > v.length
*/
public class CompareVersionNumbers{
    public int compareVersion(String version1, String version2) {
        String []v1 = version1.split("\\.");
        String []v2 = version2.split("\\.");
        int i1 = 0;
        int i2 = 0;
        while(i1<v1.length && i2<v2.length){
        	if(Integer.valueOf(v1[i1])>Integer.valueOf(v2[i2]))
        		return 1;
        	else if(Integer.valueOf(v1[i1])<Integer.valueOf(v2[i2]))
        		return -1;
        	i1++;
        	i2++;
        }
        if(v1.length==v2.length)
        	return 0;
        if(v1.length>v2.length){
        	while(i1<v1.length){
        		if(Integer.valueOf(v1[i1++])>0)
        			return 1;
        	}
        	return 0;
        }
        while(i2<v2.length){
        		if(Integer.valueOf(v2[i2++])>0)
        			return -1;
        	}
    	return 0;
    }
}