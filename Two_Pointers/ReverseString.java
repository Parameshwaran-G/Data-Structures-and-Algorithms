class ReverseString{
    public static void main(String[] args){
        String word = "Hello World";
        char charArray[] = word.toCharArray();
        int left = 0;
        int right = word.length()-1;
        while(left<right){
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            left++;
            right--;
        }
        String reversedString = new String(charArray);
        System.out.println(reversedString);
    }
}