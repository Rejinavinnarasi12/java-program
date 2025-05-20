import java.io.*;
class GFG {
// function to find final position of
// robot after the complete movement
static void finalPosition(String move)
{
int l = move.length();
int countUp = 0, countDown = 0;
int countLeft = 0, countRight = 0;
// traverse the instruction string
// 'move'
for (int i = 0; i < l; i++)
{
// for each movement increment
// its respective counter
if (move.charAt(i) == 'U')
countUp++;
else if (move.charAt(i) == 'D')
countDown++;
else if (move.charAt(i) == 'L')
countLeft++;
else if (move.charAt(i) == 'R')
countRight++;
}
// required final position of robot
System.out.println("Final Position: (" + (countRight - countLeft) + ", " + (countUp -
countDown) + ")");
}
// Driver code
public static void main(String[] args)
{
String move = "UDDLLRUUUDUURUDDUULLDRRRR";
finalPosition(move);
}
}
