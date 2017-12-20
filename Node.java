/*
 * This class sets up the basic node used in the has table.
 * Do not change this class.
 */
public class Node {

	public String record = "";
	public Node next = null;
	
	// constructor
	public Node(String newRecord) {
		record = newRecord;
		next = null;
	}
	
}


int count = 0;
int num = 0;
boolean bottom = false;
while(count == 0 && num < top){
	if(stack[num] == null){
		stack[num] = record;
		count++;
		bottom = true;
	}
	else{
	num++;
	}
}
if(count == 0 && num == top){
	bottom = false;
}
return bottom;
}