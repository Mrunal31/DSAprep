public static void moveZeroesToLeft(int[] A){
    int n=A.length;
    if (n < 1) return;
  
    int index = n - 1;

    for(int i=n-1;i>=0;i--){
        if(A[i] != 0) {
            A[index] = A[i];
            index--;
          }
    }

    for(int i=index;i>=0;i--){
        A[index] = 0;
    }

    for(int i=0;i<A.length;i++){
    System.out.print(A[i]+" ");
    }
}
