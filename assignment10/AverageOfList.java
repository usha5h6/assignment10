package Task1;
import java.util.*;
public class AverageOfList {
	public static void main(String atr[]) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		ArrayList<Integer> a=new ArrayList<Integer>();
		for(int i=0;i<n;i++) {
			a.add(s.nextInt());
		}
		IntSummaryStatistics stats = a.stream() .mapToInt((x) -> x) .summaryStatistics();
		System.out.println("Average of all list numbers : " + stats.getAverage());

	}

}
