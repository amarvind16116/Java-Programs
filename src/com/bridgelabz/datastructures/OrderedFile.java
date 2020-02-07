package com.bridgelabz.datastructures;
/**
 * @author Arvind
 * Date: 3/12/2019
 * purpose: program is used to search value from list if present remove if not then add in file
 * */
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

import com.bridgelabz.utils.InputUtility;
public class OrderedFile {
	
	private static final String PATH = "/home/admin1/Desktop/Arvind/23-Nov-2019-master/FellowShip/DataStructure/OrderdList.txt";
	
	//logic to read from file
	public static int[] readFile() throws Exception
	{
		FileReader file=new FileReader(PATH);
		String string = "";
		int reader = 0;
		while((reader=file.read())!=-1)
		{
			string = string+ (char)reader;
		}
		String []ch=string.split(" ");
		int arr[]=new int[ch.length];
		for(int i=0;i<ch.length;i++)
		{
			arr[i]=Integer.parseInt(ch[i]);
		}
		return arr;
	}
	
	//logic to write in file
	public static void writeFile(String st) throws Exception
	{
		File file=new File(PATH);
		FileWriter f=new FileWriter(file);
		f.write(st);
		f.flush();
	}

	
	public static void main(String[] args) throws Exception {
		
		OrderedList<Integer> orderedList=new OrderedList<Integer>();
		
		int []arr1=readFile();
		for(int show : arr1)
			System.out.print(show+" ");
		
		
		for(int i=0;i<arr1.length;i++)
		{
			orderedList.add(arr1[i]);
			
		}
		System.out.println("\nEnter integer you want to search");
		int a=InputUtility.nextInt();
		
		if(orderedList.searchItem(a))
		{
			System.out.println("Value is deleted from from file");
			orderedList.returnValue(a);
			orderedList.display();
		}
		else
		{
			System.out.println("Value is add into the file");
			orderedList.add(a);
			orderedList.display();
		}
		String st=orderedList.returnString();
		writeFile(st);
		
	}
		

}
