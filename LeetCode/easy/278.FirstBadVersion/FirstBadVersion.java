public class FirstBadVersion{
    public int firstBadVersion(int n) {
        if(isBadVersion(1)) return 1;
    	int low = 1;
    	int high = n;
    	int mid = low+(high-low)/2;
    	while(mid>low){
    		if(isBadVersion(mid)){
    			high = mid;
    		}else{
    			low = mid;
    		}
    		mid = low+(high-low)/2;//attention:stackoverflow!
    	}
    	return low+1;   
    }
}