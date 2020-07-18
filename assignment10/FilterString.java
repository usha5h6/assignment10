
package Task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class FilterString {
	public static void main(String atr[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		ArrayList<String> a=new ArrayList<String>();
		for(int i=0;i<n;i++) {
			a.add(sc.next());
		}
		
		List<String> FilteredList=    a.stream()
				  .filter(s -> s.startsWith("a"))
				  .filter(s -> s.length() == 3)
				  .collect(Collectors.toList());
		System.out.println(FilteredList);
		sc.close();
	}

}