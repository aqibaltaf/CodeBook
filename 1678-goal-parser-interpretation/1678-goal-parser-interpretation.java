class Solution {
    public String interpret(String command) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < command.length(); i++) 
        {
            if(command.charAt(i) == 'G'){
                str.append('G');
            }
            else if((command.charAt(i) == '(') && (command.charAt(i+1) == 'a')){
                str.append("al");
                i = i + 3;
            }
             else if((command.charAt(i) == '(') && (command.charAt(i+1) == ')')){
                str.append('o');
                i = i + 1;
            }
        }
        
        command = str.toString();
        
        return command;
    }
}