class SqueakyClean {
    static String clean(String identifier) {
        StringBuilder str = new StringBuilder(identifier);
        StringBuilder newStr = new StringBuilder();

        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == ' '){
                newStr.append('_');
                continue;
            } else if(Character.isISOControl(str.charAt(i))){
                newStr.append("CTRL");
                continue;
            } else if(str.charAt(i) == '-' || ('α' <= str.charAt(i) && str.charAt(i) <= 'ω') || !Character.isLetter(str.charAt(i))){
                continue;
            } else if(i != 0 && str.charAt(i - 1) == '-'){
                if(Character.isLowerCase(str.charAt(i))){
                    newStr.append(Character.toUpperCase(str.charAt(i)));
                }
                continue;
            } else {
                newStr.append(str.charAt(i));
            }
        }
        
        return newStr.toString();
    }
}
