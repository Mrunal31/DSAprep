LENGTH OF LAST WORD(STRING TYPE QUESTION LEETCODE) LEVEL-EASY 
TIME REQ = 03:50:71

String[] arr = new String[s.length()];
arr = s.split(" ");
return arr[arr.length - 1].length();
