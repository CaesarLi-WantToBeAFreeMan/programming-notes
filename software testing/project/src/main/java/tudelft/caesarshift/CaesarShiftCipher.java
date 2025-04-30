package tudelft.caesarshift;

public class CaesarShiftCipher{
    public String CaesarShiftCipher(String message, int shift){
        if(message.isEmpty())
            return "invalid";
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0; i < message.length(); i++){
            if(!Character.isLetter(message.charAt(i)))
                return "invalid";
            stringBuilder.append((char)('a' + ((message.charAt(i) - 'a' + shift) % 26)));
        }
        return stringBuilder.toString();
    }
}