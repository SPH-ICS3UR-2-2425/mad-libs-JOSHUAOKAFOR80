import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		/*
		 * MadLibs Program
		 * Author: 
		 * Class: ICS3U
		 * Date: Sept. 16, 2024
		 * Make a program that asks for 10 inputs
		 * reads them into variables, and then prints out a story
		 * Make sure to include Strings, ints, and doubles!
		 */
		
		Scanner in = new Scanner(System.in);
		System.out.println("please enter a girl name ");
		String name = in.nextLine();
		System.out.println("hello "+ name);
		System.out.println("what school do you go to");
		String school = in.nextLine();
		System.out.println("pick a sport ");
		String sport =in.nextLine();
		System.out.println("ive heard many good things about" + school );
		System.out.println("what street do you live on");
		String street = in.nextLine();
		System.out.println("pick a number from 2-6");
		int num1 = in.nextInt();
		System.out.println("would you rather the other characters in the story to be");
		System.out.println("a = gang members ");
		System.out.println("b = homeless people");
		String choice = in.nextLine();
		if (choice.equals("a")) {
			
		}else {
			
		}
		
		
		
		System.out.println("one day a girl named "+name+" was coming back from "+school+" after "+sport+" practice,down "+street+" when she was approched by "+num1 +);
		
		
		
		

	}

}
