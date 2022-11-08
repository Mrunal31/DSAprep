Stack<Character> st = new Stack<Character>();
        StringBuilder newString = new StringBuilder();
        //String newString = "";
        for(int i=0;i<s.length();i++){
           if(s.charAt(i)=='(')
           {
               if(!st.isEmpty()){
                   newString.append(s.charAt(i));
               }
               st.push(s.charAt(i));
               
           }else{
               st.pop();
               if(!st.isEmpty()){
                   newString.append(s.charAt(i));
               }
           }
        }
        
        return newString.toString();
