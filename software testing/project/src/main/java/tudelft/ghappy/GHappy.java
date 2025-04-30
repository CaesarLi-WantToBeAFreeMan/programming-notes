package tudelft.ghappy;

public class GHappy{

    public boolean gHappy(String str){
        assert str  !=  null;
        for(int i = 0; i < str.length(); i++)
            if(str.charAt(i) == 'g' && str.charAt(Math.max(i - 1, 0)) != 'g' && str.charAt(Math.min(i + 1, str.length())) != 'g')
                return false;
        return true;
    }
}