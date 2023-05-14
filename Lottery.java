import java.util.Random;
public class Lottery{

private int [] lotteryNumbers;//array with an int variable to hold the lottery numbers of the computer
private int [] userLotteryNumbers;//array with an int variable to hold the lottery numbers of the user

/**this method gets the gives a value to the aize of the users lottery numbers array
*/
public void getUserLotteryNumbers(int [] userLotteryNumbersShown){
	userLotteryNumbers = userLotteryNumbersShown;
}
/** this method gets the users lottery numbers
*/
public int[] getLotteryNumber(){
	return lotteryNumbers;//returns lottery numbers
}
/**this method helps to keeps count each time there is a match between the user and computers lottery numbers
*/
public int [] compLotteryNumbers(){
int [] matchNumbers = new int[lotteryNumbers.length];//array with an int variable that holds the users matched numbers and gives the size of the arrays for the matched numbers

for(int currentMatchNumIndex =0; currentMatchNumIndex < matchNumbers.length; currentMatchNumIndex++){//a loop that iterates for a certain number of times depening on the amount of times assigned to repeat
	matchNumbers [currentMatchNumIndex] = -1;//equates all indexes in the arrays to -1
}
for(int currentUserLotNum = 0 ; currentUserLotNum < userLotteryNumbers.length; currentUserLotNum++){//a loop that iterates for a certain number of times depening on the amount of times assigned to repeat
	if(userLotteryNumbers[currentUserLotNum] == lotteryNumbers[currentUserLotNum]){//a condition to be followed if the users lottery number and the computers randomly generated lottery number match,
	matchNumbers[currentUserLotNum] =userLotteryNumbers[currentUserLotNum];//sets that particular index in the matched arrays to the the number found to be a match between the user and the computer
}
}
return matchNumbers;//returns matched numbers
}
/** a constructor that sets a value for the size of the computers lottery array
*/
public Lottery(int lotNum){
Random random = new Random();

lotteryNumbers = new int[lotNum];//sets the size of the array
for(int currentLotNumIndex = 0; currentLotNumIndex < lotteryNumbers.length ; currentLotNumIndex++){//a loop that iterates for a certain number of times depening on the amount of times assigned to repeat
	lotteryNumbers[currentLotNumIndex] = random.nextInt(10);//generstes random numbers from 0 to 9
}
}
}