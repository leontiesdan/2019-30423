
public class NameInvertor {

	public static void main(String args[]) {
		int Index = 0, i, prevIndex = 0, foundFirst = 0;
		String receivedName = new String("    Mr. Phd. Truta Minecraft"  ); // receivedName stores the name we need to invert
		String name = receivedName.trim(); // Get rid of the white spaces in the front and end of the string
		int len = name.length();
		Index = len - 1;
		// As there might be some titles before the first name, we do a while to get all
		// the words
		i = Index;
		if(name.compareTo("") == 0) {
			Index = 0;
			System.out.print("");
		}
		while (Index != 0) {
			for (i = Index; i >= 0; i--) {
				if (name.charAt(i) == ' ' || i == -1) {
					prevIndex = Index;
					Index = i;
					String singleName = name.substring(Index + 1, prevIndex + 1); // a name or title
					if (foundFirst == 0) {
						System.out.print(singleName + ", ");
					} else
						System.out.print(singleName + " ");
					foundFirst++; // we found the last name and we don't put a comma anymore
				}
				if (i == 0) {
					System.out.print(name.substring(0, Index + 1)); // print the first name or first title
					Index = 0;
				}
			}
		}
	}
}
