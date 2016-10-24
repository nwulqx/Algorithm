public class CompareVersionNumbers2{
        public int compareVersion(String version1, String version2) {
                String []v1 = version1.split("\\.");
                String []v2 = version2.split("\\.");
                int length = Math.max(v1.length,v2.length);
                for(int i=0;i<length;i++){
                	Integer c1 = i>v1.length-1?0:Integer.valueOf(v1[i]);
                	Integer c2 = i>v2.length-1?0:Integer.valueOf(v2[i]);
                	if(c1.compareTo(c2)!=0){
        		      return c1.compareTo(c2);
                	}
                }
                return 0;
        }
}