public class Name {

    /** Inverts a name: First Last  ->  Last, First
     *                  Single      ->  Single
     *  Removes Spaces around and in between the names
     *  Takes in consideration the Titles also
     *
     * @param CustomerName
     * @return
     */
    public static String invert(String CustomerName) {
        if (CustomerName == null) {
            return null;
        }
        CustomerName = CustomerName.trim().replaceAll(" +", " ");
        String[] splitName = CustomerName.split(" ");
        String Title = "";
        for (int i = 0; i < splitName.length - 2; i++) {
            Title += splitName[i] + " ";
        }
        Title = Title.trim();
        if (splitName.length > 2){
            return splitName[splitName.length - 1] + ", " + splitName[splitName.length - 2] + " " + Title;
        }else if(splitName.length == 2){
            return splitName[splitName.length - 1] + ", " + splitName[splitName.length - 2];
        }
        return  splitName[splitName.length - 1];
    }

    public static void main(String[] args) {

    }
}
