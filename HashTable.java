/* 
* 
* This class sets up the has table data structure along with
* the utility methods to manipulate it.
*/
public class HashTable {

	private Node[] map;
	private int tableSize;

	// constructor
	public HashTable(int tableSize) {
		map = new Node[tableSize];
		this.tableSize = tableSize;
	}

	/*
	 * This is the hash function. For this hash function, return 0 if key is the
	 * empty string. Otherwise, calculate the sum of the ASCII values of the
	 * characters in key and find the remainder when divided by 8 (remember mod
	 * divisision %). Check the java API for String methods that may be helpful.
	 */
	private int hash(String key) {
		int x = 0;
		for (int i = 0; i < key.length(); i++) {
			x = x + key.codePointAt(i);

		}
		return x % 8;
	}

	/*
	 * This method should insert a node containing the given key in the proper
	 * bucket in the hash table. Insert new nodes at the head of each linked list
	 * for ease of implementation.
	 */
	public void insert(String key) {
		int in = hash(key);// buck find
		Node som = new Node(key);
		som.record = key;
		som.next = map[in];
		map[in] = som;
	}

	/*
	 * This method returs true if the search key is contained in the hash table, and
	 * false otherwise.
	 */
	public boolean search(String key) {
		int n = hash(key);
		Node pointer = map[n];
		int i = 0;
		while (pointer != null && i == 0) {
			if (pointer.record == map[n].record)
				i++;
			else {
				pointer = pointer.next;
			}
		}
		if (i > 0) {
			return true;
		} else {
			return false;
		}
	}

	/*
	 * This method should print out the hash table row by row. Each line should
	 * print out a separate row of the table. Print the index followed a colon and
	 * then the records in that bucket with spaces between them.
	 * 
	 * For example: 1: Nicholas Mary Kim Jack
	 */
	public void printTable() {
		Node point;
		for (int i = 0; i < map.length; i++) {
			point = map[i];
			while (point != null) {
				System.out.println(point.record + ", ");
				point = point.next;
			}

		}
	}

	/*
	 * for (int i = 0; i < map.length; i++) { System.out.println(hash + "he");
	 * String key = .getKey(); }
	 */

	/*
	 * This method should delete ALL nodes matching the search key.
	 */
	public void delete(String key) {
		int num = hash(key);
		Node pointer = map[num];
		int i = 0;
		while (pointer != null && i == 0) {
			if (pointer.next.record.equals(key)) {
				pointer.next = null;
				i++;
			} else {
				pointer = pointer.next;
			}

		}
	}
}
