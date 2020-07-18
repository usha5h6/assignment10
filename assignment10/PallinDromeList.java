package Task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class PallinDromeList {
	public static void main(String atr[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		ArrayList<String> a=new ArrayList<String>();
		for(int i=0;i<n;i++) {
			a.add(sc.next());
		}
		ArrayList<String> FilteredList=PallinDromeList.filterList(a,PallindomeCheck::isPalindroe);
		System.out.println(FilteredList);
	}

	
	public static ArrayList<String> filterList(ArrayList<String> a, Predicate<String> predicate) {
		ArrayList<String> finalList=new ArrayList<String>();
		for(String n:a){
			if(predicate.test(n)){
				finalList.add(n);
			}
		}
		return finalList;
	}
}