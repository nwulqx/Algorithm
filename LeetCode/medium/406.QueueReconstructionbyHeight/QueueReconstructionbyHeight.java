/**/
import java.util.*;
public class QueueReconstructionbyHeight{
	public static void main(String []args){
		int [][]people = {{5,0}, {7,0}, {5,2}, {6,1}, {4,4}, {7,1}};
		System.out.println(Arrays.toString(reconstructQueue(people)));
	}
    public static int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people,new Comparator<int[]>(){
        	public int compare(int []o1,int []o2){
        		return o1[0]!=o2[0]?o2[0]-o1[0] : o1[1]-o2[1];
        	}
        });
        List<int[]> list = new ArrayList<int []>();
        for(int []num : people){
        	list.add(num[1],num);
        }
        return list.toArray(new int[people.length][]);
    }
}