class ReverseString {
    String reverse(String inputString) {
        char[] theInput = inputString.toCharArray();
        String toReturn = "";

        for(int i = theInput.length-1; i >= 0; i--){
            toReturn += theInput[i];
        }
        return String.valueOf(toReturn);
    }
}
