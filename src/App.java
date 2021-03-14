import java.util.InputMismatchException;
import java.util.Scanner;

import p1.MyClass;

public class App {
	public static void main(String [] args) {
		
		MyClass myClass = new MyClass(); //from different package

	} 
		
	public void sayNonStaticHi(String name) {
		System.out.println("Hello " + name);
	}
	
	public static void nonStaticMethod() {
		//sayHi of above Function sayNonStaticHi
		App myApp = new App();
		myApp.sayNonStaticHi("Sai Ganesh");
	}
	
	public static void helloWorld() {
		System.out.println("Hello World \n");
	}
	
	
	
	public static void printShape() {
		System.out.println("   /|");
		System.out.println("  / |");
		System.out.println(" /  |");
		System.out.println("/___| \n");
	}
	
	
	
	public static void variableMethod() {
		String characterName = "George";
		int characterAge = 20;
		
		System.out.println("There was once a man named " + characterName);
		System.out.println("he was " + characterAge + " years old. He really liked");
		
		characterName = "Dave";
		characterAge = 18; //comment test 
		
		System.out.println("the name " + characterName + ", but didn't like being "+ characterAge + ".");
		System.out.println("Most of his friends were also " + characterAge + ", and one");
		System.out.println("of them was also named " + characterName + "\n");
	
		
		String phrase = "To be or not to be";
		char grade = 'A';
		int age = 35;
		double gpa = 3.6;
		boolean isMale = true;
		
		System.out.println(phrase);
		System.out.println(age);
		System.out.println(gpa);
		System.out.println(grade);
		System.out.println(isMale + "\n");
	}
	
	
	
	
	public static void workingWithStrings() {
		System.out.println("This \\ is a \"dialogue\"");
		String phrase = "To be or not to be";
		System.out.println(phrase.toUpperCase());
		System.out.println(phrase.toLowerCase());
		System.out.println(phrase.length()+ "\n");
		System.out.println(phrase.contains("not") );
		System.out.println(phrase.charAt(1)); //second character in the string
		System.out.println(phrase.indexOf("b") ); //interesting output of -1 if character not in phrase
		System.out.println(phrase.lastIndexOf("b"));
		System.out.println(phrase.substring(9)); //all text including and after 8th index
		System.out.println(phrase.substring(9, 11)); //all text including and after 8th index and to 10th index. Not including 11th
		System.out.println(phrase.substring(0, phrase.indexOf(" "))); //from start of phrase to first space
	}
	
	
	
	public static void workingWithNumbers() {
		// + - / *
		
		System.out.println(3/4); // division gives integer and not the float value
		System.out.println(3.0/4.0); //decimal value
		System.out.println( 10 % 3 ); 
		
		int myInt = 3;
		double myDouble = -5.5;
		double gpa = 3.5;
		System.out.println(myDouble + myInt); //returns double
		
		System.out.println( Math.abs(myDouble));
		System.out.println(Math.pow(myInt, 3));
		System.out.println(Math.sqrt(36));
		System.out.println(Math.min(2, 6));
		System.out.println(Math.min(2, myInt));
		System.out.println(Math.round(gpa));
		System.out.println(Math.random()); //between 0 and 1
		
	}
	
	
	
	public static void userInputMethod() {
		Scanner keyboardInput = new Scanner(System.in);
		
		System.out.print("Enter your Name: "); 
		//difference between println and print is that println goes to the next line 
		//and print stays on the same line (in this case, the input)
		
		String name = keyboardInput.nextLine();  
		System.out.println("Hey " + name + "!");
		
		System.out.print("Enter your Age: "); 
		int inputAge = keyboardInput.nextInt();  
		System.out.println("Hey " + name + ", you are " + inputAge + " years old!");

		System.out.print("Enter in first Number: ");
		double num1 = keyboardInput.nextDouble();
		System.out.print("Enter in second Number: ");
		double num2 = keyboardInput.nextDouble();
		System.out.println(num1 + num2);
		
		System.out.print("Enter a color: ");
		String color = keyboardInput.nextLine(); 
		//interesting to note that with all the code above before multi line commenting them this doesn't take in input
		
		System.out.print("Enter a plural noun: ");
		String pluralNoun = keyboardInput.nextLine();
		
		System.out.print("Enter a celebrity: ");
		String celebrity = keyboardInput.nextLine();
		
		
		System.out.println("Roses are " + color + "\n"
						+ pluralNoun + " are blue \n"
						+ "I love " + celebrity);
		
	}
	
	
	
	public static void arrayMethod() {
		String [] friends = {"Jim", "Karen", "Kevin"};
		
		System.out.println( friends[0] );
		System.out.println( friends.length );
		friends[0] = "Dave";
		System.out.println( friends[0] );
		
		
		String [] team = new String [3];
		//when you are not sure of what elements yet
		team[0] = "Mike";
		System.out.println( team[0] );
		System.out.println( team[1] ); // null value since not inserted element yet
		team[1] = "Tim";
		team[2] = "Jerry";
		System.out.println( team[1] );
	}
	
	
	public static void sayHi(String name, int age) {
		System.out.println("Hello " + name);
		System.out.println("You are " + age + " years old!");
		
	}
	
	
	public static void usingMethods() {
		Scanner keyboardInput = new Scanner(System.in);
		System.out.print("What is your name? ");
		String name = keyboardInput.nextLine();
		System.out.print("What is your age? ");
		int age = keyboardInput.nextInt();
		sayHi(name, age);
		 
		
		System.out.println( intMethod(2) );
		int myNum = intMethod(3);
		System.out.println(myNum);
		
		String myString = stringMethod(3);
		System.out.println( myString);
		
		Boolean myBoolean = booleanMethod(3);
		System.out.println( myBoolean);
	}
	
	
	
	public static int intMethod(int numberToCube) {
		return numberToCube * numberToCube * numberToCube;
		
	}
	
	
	
	public static String stringMethod(int numberInt) {
		return "Returned String";
				
	}
	
	
	
	public static boolean booleanMethod(int numberInt) {
		return true;
	}
	
	
	
	public static void ifStatements() {
		//if statements
		boolean isMale = false;
		boolean isTall = true;
		
		if( isMale && isTall ) {
			System.out.println("You are a tall male.");
		}
		else if( isMale && !isTall ) {
			System.out.println("You are a short male.");
		}
		else if( !isMale || isTall ){
			System.out.println("You are tall or not a male.");
		}
		
		else{
			System.out.println("You are not male and not tall.");
		}
		
		System.out.println(max(15,23,5));
	}
	
	
	
	public static int max(int num1, int num2, int num3) {
		//operators are != ==  > <  >= <=
		if(num1 >= num2 && num1 >= num3) {
			return num1;
		}
		
		else if(num2 >= num1 && num2 >= num3) {
			return num2;
		}
		else {
			return num3;
		}
	}
	
	
	
	public static void calculatorIf() {
		Scanner keyboardInput = new Scanner(System.in);
		
		
		System.out.print("Enter a number: ");
		double num1 = keyboardInput.nextDouble();
		
		System.out.print("Enter an operator: ");
		String op = keyboardInput.next(); 
		//using next : whatever user enters does not consider any space you leave even before input : + - will only take in +
		
		System.out.print("Enter another number: ");
		double num2 = keyboardInput.nextDouble();
		
		
		if(op.equals("+")) {
			System.out.println( num1 + num2 );
		} else if(op.equals("-")) {
			System.out.println( num1 - num2 );
		} else if(op.equals("/")) {
			System.out.println( num1 / num2 );
		} else if(op.equals("*")) {
			System.out.println( num1 * num2);
		} else {
			System.out.println("Invalid Operator.");
		}
	}
	
	
	public static String getDayNameSwitchCase(int dayNum) {
		String dayName = "";
		
		switch(dayNum) {
			case 0: dayName = "Sunday";
				break;
			case 1: dayName = "Monday";
				break;
			case 2: dayName = "Tuesday";
				break;
			case 3: dayName = "Wednesday";
				break;
			case 4: dayName = "Thursday";
				break;
			case 5: dayName = "Friday";
				break;
			case 6: dayName = "Saturday";
				break;
			default: dayName = "Invalid Day.";
				break;
			
		}
		
		return dayName;
	}
	
	
	public static void whileLoop() {
		
		int i  = 1;
		while( i <= 10 ) {
			
			System.out.println(i);
			i ++;
		} //checks condition then does the action
		
		do {
			System.out.println(i);
			i--;
		}while( i > 0); //does the action then do the condition
	}
	
	
	public static void guessingGame() {
		Scanner keyboardInput = new Scanner(System.in);
		
		String secretWord = "giraffe";
		String guess = "";
		int guessCount = 0;
		int guessLimit = 3; 
		boolean outOfGuesses = false;
		
		while(!guess.equals(secretWord) && !outOfGuesses) {
			
			
			if(guessCount < guessLimit) {
				System.out.print("Enter a guess: ");
				guess = keyboardInput.nextLine();
				guessCount++;
			} else {
				outOfGuesses = true;
			}
			
		}
	
		if(outOfGuesses){
			System.out.println("You Lose! No more guesses");
		}
		else {
			System.out.println("You Win!");
		}
	}
	
	
	public static void forLoop() {
		String [] friends = {"Jim", "Angela", "Oscar"};
		
		for(int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		
		for(int j = 0; j < friends.length; j++) {
			System.out.println(friends[j]);
		}
	}
	
	
	public static int pow(int baseNum, int powNum) {
		int result = 1;
		for(int i = 0; i < powNum; i++) {
			result = result * baseNum;
		}
		return result;
	}
	
	
	public static void nestedLoop2DArray() {
		int [][] numberGrid = {
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9},
				{0}
		};
		
		for(int i = 0; i < numberGrid.length; i++) {
			for(int j = 0; j < numberGrid[i].length; j++) {
				System.out.print(numberGrid[i][j]);
			}
			System.out.println();
		}
	}
	
	public static void errorExceptions() {
		//Exception is just general issues like wrong user input
		//Error is something seriously wrong with the program 
		
		Scanner keyboardInput = new Scanner(System.in);
		/*
		Boolean loopBoolean = true;
		//Loop to continue asking
		
		while(loopBoolean){
			System.out.print("Enter a number: ");
			try{
				double num = keyboardInput.nextDouble();
				System.out.println(num);
				loopBoolean = false;
				
			} catch(Exception e) {
				
			}
		}
		*/
		//int [] nums = {1,2,3};
		try {
			//System.out.println( nums[5] );
			double num = keyboardInput.nextDouble();
			System.out.println(num);
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e); //e is the exception name
		} catch(InputMismatchException e) {
			System.out.println("Invalid Input");
		} catch(Exception e) {
			// can be Throwable e or Error e
			//Throwable is any error or any exception
			
		}
	}
	
	
/*
	public static void studentClass() {
		Student myStudent = new Student();
		myStudent.firstName = "Jim";
		myStudent.lastName = "Halpert";
		myStudent.major = "Business";
		myStudent.gpa = 2.3;
		myStudent.age = 25;
		myStudent.onProbation = false;
		
		Student myStudent2 = new Student();
		myStudent2.firstName = "Pam";
		myStudent2.lastName = "Beasley";
		myStudent2.major = "Art";
		myStudent2.gpa = 3.0;
		myStudent2.age = 22;
		myStudent2.onProbation = true;
		
		System.out.println(myStudent2.firstName);		
		
	}
*/
	public static void constructorMethod() {
		
		//Check book.java
		
		Book book1 = new Book("Harry Potter", "JK Rowling", 500, "English");
		
		Book book2 = new Book("The 4 hour workweek", "Tim Ferriss", 200, "English");
		
		System.out.println(book1.title);
		System.out.println(book2.pages);
	}
	
	
	public static void takeTest(Question [] questions) {
		int score = 0;
		Scanner keyboardInput = new Scanner(System.in);
		for(int i = 0; i < questions.length; i++) {
			System.out.println(questions[i].prompt);
			String answer = keyboardInput.nextLine();
			if(answer.equals(questions[i].answer)) {
				score++;
			}
			
		} System.out.println("You got " + score + "/" + questions.length);
		
	}
	
	public static void mcqTest() {
		
		//Check Question.java
		
		String q1 = "What color are apples?\n" 
		+ "(a)red/green\n(b)Orange\n(c)Magenta\n";
		
		String q2 = "What color are bananas?\n" 
		+ "(a)red/green\n(b)Yellow\n(c)Blue\n";

		Question [] questions = {
				new Question(q1, "a"),
				new Question(q2, "b")
		};
		takeTest(questions);
	}
	
	public static void objectInstanceMethod() {
		Student myStudent = new Student("Ganesh", "Mechanical Engineering", 3.6);
		
		System.out.println(myStudent.isOnHonorRoll()); //cjeck student class for the isOnHonorRoll method 
	}
	
	public static void settersAndGetters() {
		
		//check Movie.java
		
		
		Movie movie1 = new Movie("The Avengers", "Joss Whedon", "PG-13");
		Movie movie2 = new Movie("Step Brothers", "Adam McKay", "R");
		
		
		// movie1.ageRating = "Dog"; not possible anymore as private
		System.out.println(movie1.getRating());
		System.out.println(movie2.getDirector());
		System.out.println(movie1.getTitle());
	}
	
	public static void staticAttribute() {
		
		//check Song.java
		
		
		Song holiday = new Song("Holiday", "Green Day", 200);
		Song americanIdiot = new Song("American Idiot", "Green Day", 168);
		
		//System.out.println(holiday.getArtist());
		//System.out.println(americanIdiot.getLength());
		
		System.out.println(holiday.getSongsCount()); //at this time there are ald 2 songs
		System.out.println(americanIdiot.getSongsCount()); // different instances but same attribute
		// that is the purpose of static
		
		Song africa = new Song("Africa", "Toto", 300);
		
		System.out.println(holiday.getSongsCount()); //at this time there are ald 3 songs
		System.out.println(americanIdiot.getSongsCount()); // different instances but same attribute
		// that is the purpose of static
		System.out.println(africa.getSongsCount()); 
	}
	
	public static void staticMethods() {
		
		//check Prints.java
		
		int x = Prints.feetInMile;
		System.out.println(x);
		
		Prints.sayGoodbye();
		
	}
	
	public static void Inheritance() {
		//Inheritance
		
		Chef normalChef = new Chef(); 
		normalChef.makeSpecialDish(); 
		
		//Just a point i noted that if the makeChicken method was static the 2 lines above can be just 1 line
		// Chef.makeChicken(); //this is if the method was static. and 1 line can get the same output
		
		ItalianChef italianChef = new ItalianChef(); 
		italianChef.makeSpecialDish(); 
		
		ChineseChef chineseChef = new ChineseChef();
		chineseChef.makeSalad();
	}
	
	public static void interfaceInheritance() {
		
		Animal [] animals = {
				new Cow(), 
				new Dog(),
				new Bird()
		};
		
		for(int i = 0; i < animals.length; i++) {
			animals[i].speak();
		}
		
		Animal myCow = new Cow();
		myCow.eat();
		
		Animal myDog = new Dog();
		myDog.eat();
		
	}
	
	public static void accessModifiers() {
		
		//check song.java
		
		Song holiday = new Song("Holiday", "Green Day", 300); //if song constructor in song.java is private cannot access here
		holiday.playSong();
		
	}
	
}




