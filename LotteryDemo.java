import java.util.Scanner;
public class LotteryDemo{

public static void main(String [] args){

final int NUMBER_OF_LOTTERY=5;//a final int variable thats holds the size of the lottery number arrays
int userLotteryNumber;//int variable that holds the lottery numbers gotten from the user
int [] userLotteryNumbers = new int [NUMBER_OF_LOTTERY];//array with int variable that holds the users numbers and also gives the size of the array
int [] matchNumbers = new int [NUMBER_OF_LOTTERY];//array with int variable that holds the matched numbers and also gives the size of the array
int [] lotteryNumbers = new int [NUMBER_OF_LOTTERY];//array with int variable that holds the computers randomly generated numbers and also gives the size of the array
Scanner scanner = new Scanner(System.in);

Lottery lotto = new Lottery(NUMBER_OF_LOTTERY);//sets the number of size of array for the computers generated numbers
for(int count= 0;count < NUMBER_OF_LOTTERY; count++){//a loop that iterates for a certain number of times depening on the amount of times assigned to repeat
	System.out.println("please enter the lottery number " + (count+1));
	userLotteryNumber = scanner.nextInt();
	userLotteryNumbers[count] = userLotteryNumber;
}
lotto.getUserLotteryNumbers(userLotteryNumbers);
matchNumbers = lotto.compLotteryNumbers();
lotteryNumbers = lotto.getLotteryNumber();

System.out.println("Todays rotary numbers are: ");//deisplays a message to the user telling the user about the winning numbers generated today
for(int current = 0; current < lotteryNumbers.length; current++){//a loop that iterates for a certain number of times depening on the amount of times assigned to repeat
	System.out.print(lotteryNumbers[current] + ", ");//displays a message to the user showing the person the winning numbers generated today
}
System.out.println("\nYour numbers are: ");//deisplays a message to the user telling the user about the his lottery numbers
for(int current = 0; current < userLotteryNumbers.length; current++){//a loop that iterates for a certain number of times depening on the amount of times assigned to repeat
	System.out.print(userLotteryNumbers[current] + ", ");;//displays a message to the user showing the person numbers generated today
}
int numOfMatchedNumbers = 0;
System.out.println("\nMatched numbers are: ");//deisplays a message to the user telling the user about the numnbers he matched right today
for(int current = 0; current < matchNumbers.length; current++){//a loop that iterates for a certain number of times depening on the amount of times assigned to repeat
	if(matchNumbers[current] != -1){//a condition to be done if a number in a slot of the matched array isnt one
	System.out.println(matchNumbers[current] + " (slot " + (current+1) + ")");//prints the current slot of the matched number
	numOfMatchedNumbers++;//keeps tracked of the numbers in the matched arrays that werent one
}
}
if(numOfMatchedNumbers == NUMBER_OF_LOTTERY){//a condition if the matched nmumbers are up to 5
	System.out.println("Hurray!,Your the grand prize winner!, you won a million dollars congrats!");//displays a message to the user granting the user the winner
}else{//a condition to does otherwise
	System.out.println("You matched " + numOfMatchedNumbers + " correctly and didnt win the lottary");//displays a message to the user telling the user the amount of numbers the user matched correctly
}
}
}