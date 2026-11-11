class SqueakyClean {
    static String clean(String identifier) {
        StringBuilder sb = new StringBuilder();
        boolean checker = false;
        for (char a : identifier.toCharArray()) {
            if (Character.isWhitespace(a)) {
                sb.append('_'); 
            } else if(a == '-'){
                checker = true;
            }else if(checker){
                sb.append(Character.toUpperCase(a));
                checker = false;
            }else if (a == '4'){
                sb.append('a');
            }else if (a == '3'){
                sb.append('e');
            }else if (a == '0'){
                sb.append('o');
            }else if (a == '1'){
                sb.append('l');
            }else if (a == '7'){
                sb.append('t');
            }
            else if (Character.isLetter(a)) {
                sb.append(a);
        }
        }
        
        return sb.toString();
    }
}