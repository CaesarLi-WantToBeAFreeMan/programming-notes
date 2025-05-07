package tudelft.countletters;

public class CountLetters{
    public int count(String str){
        int words = 0;
        char previous = ' ', current = ' ';
        for(int i = 0; i < str.length(); i++){
            current = str.charAt(i);
            if (!Character.isLetter(current) && (previous == 'r' || previous == 's'))
                words++;
            previous = current;
        }
        if(previous == 'x' || previous == 's')
            words++;
        return words;
    }
}