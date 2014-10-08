import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;

public class Trie {
	private TrieNode root;
	private static boolean isFirst = true; 


	public Trie() {
		root = new TrieNode();
	}

	public void insert(String s) {
		TrieNode current = root;
		if ((s).isEmpty()) {
			current.setWord(true); //for blank operator.
		}
		s = s.toLowerCase();
		for (int i= 0; i<s.length();i++) {
			char c = s.charAt(i);
			TrieNode childNode = current.getChildNode(c);
			if (childNode == null) {
				childNode = new TrieNode(c);
				current.getChildNodes().put(c, childNode);
			}
			//update current node.
			current = childNode;
		}
		//update current node isWord to true.
		current.setWord(true);

	}



	public void printWordsMatchingPrefix(String prefix, TrieNode current, String entirePrefix) {

		if (!(prefix).isEmpty()) {
			prefix = prefix.toLowerCase();
			char c = prefix.charAt(0);
			TrieNode child = current.getChildNode(c);
			if (child != null) {
				String word = entirePrefix+child.getContent();
				if (child.isWord())
				{

					if(prefix.length()==1){
						if(!isFirst)System.out.print(",");
						System.out.print(word);
						isFirst=false;
						}
				}
				printWordsMatchingPrefix(prefix.substring(prefix.indexOf(c)+1), child, word );
			}
		} else {
			//denotes reaching end of prefix, begin traversing to get matching words.
			Map<Character, TrieNode> map = current.getChildNodes();
			if (map != null) {
				for (char c: map.keySet()) {
					TrieNode child = current.getChildNode(c);
					if (child != null) {
						String word = entirePrefix+child.getContent();
						if (child.isWord())
						{
							if(!isFirst)System.out.print(",");
							System.out.print(word);
							isFirst=false;
						}
						printWordsMatchingPrefix("", child, word);
					}
				}
			}
		}
	}


	public static void main(String[] args) throws IOException {

		Trie trie1 = new Trie();

		InputStreamReader isr1 = new InputStreamReader(System.in);
		BufferedReader br1 = new BufferedReader(isr1);

		char again;

		do {
			isFirst = true;
			System.out.println("Enter a word.");
			String input = br1.readLine();
			trie1.printWordsMatchingPrefix(input, trie1.getRoot(), "");
			trie1.insert(input);
			System.out.print("\n" + " Would you like to continue? (Y or y)  ");
			input = br1.readLine();
			again = input.charAt(0);
		} while (again == 'y' || again == 'Y');


	}

	public TrieNode getRoot() {
		return root;
	}
}