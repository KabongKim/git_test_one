package JJ;

import java.util.*;
import java.util.stream.Collectors;



public class CC {

		public void list () {
		
		List<Drink> BeList = new ArrayList<Drink>();
		
		
		 Drink Cider = new Drink("���̴�", 1000 , 375 , 350);
		 Drink Coke = new Drink("�ݶ�", 1200, 375, 425);
		 Drink Bong = new Drink("����", 800, 275, 400);
	     
	     BeList.add(Cider);
	     BeList.add(Coke);  
	     BeList.add(Bong); 
	        
//		String name1 = "���̴�";
//		int price1 = 3000;
//		int value1 = 375;
//		int cal1 = 350;
		
//        Drink Cider = new Drink(name1,price1,value1,cal1);
//        
//        BeList.add(Cider);
//		
//		String name2 = "�ݶ�";
//		int price2 = 1900;
//		int value2 = 375;
//		int cal2 = 425;
//		
//		Drink Coke = new Drink(name2,price2,value2,cal2);
//		BeList.add(Coke);
//		
//		String name3 = "����";
//		int price3 = 1800;
//		int value3 = 275;
//		int cal3 = 400;
//	
//		Drink Bong = new Drink(name3,price3,value3,cal3);
//		BeList.add(Bong);
		
		System.out.println("");
		System.out.println("�̸���");
		List<Drink> sort1 = BeList.stream().sorted(Comparator.comparing(Drink::getName).thenComparing(Drink::getPrice)).collect(Collectors.toList());
		show(sort1,"�̸�");
		
		System.out.println("");
		System.out.println("�ݾ׼�");
		List<Drink> sort2 = BeList.stream().sorted(Comparator.comparing(Drink::getPrice).thenComparing(Drink::getCal)).collect(Collectors.toList());
		show(sort2,"�ݾ�");
		
		System.out.println("");
		System.out.println("�뷮��");
		List<Drink> sort3 = BeList.stream().sorted(Comparator.comparing(Drink::getValue).thenComparing(Drink::getPrice)).collect(Collectors.toList());
		show(sort3,"�뷮");
		
		System.out.println("");
		System.out.println("Į�θ���");
		List<Drink> sort4 = BeList.stream().sorted(Comparator.comparing(Drink::getCal).thenComparing(Drink::getPrice)).collect(Collectors.toList());
		show(sort4,"Į�θ�");
//		.thenComparing(Comparator.comparing(Drink::getPrice))
		}
		
		 public void show(List<Drink> blist, String a) {
				
			 System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
			 
		        for (Drink BeList : blist) {
		            String rock =  BeList.getName()+" "+BeList.getPrice()+"��"+" "+BeList.getValue()+"mL"+" "+BeList.getCal()+"Cal"+" ";
		            System.out.println(rock);
		          
		            }
		 }
	public static void main(String[] args) {
	
		CC run = new CC();
		
		run.list();
	}

}
