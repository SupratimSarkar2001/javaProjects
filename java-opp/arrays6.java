public class arrays6 {
    public static void main(String args[]) 
    {
        int intArray[] = {1,2,3};
          
        int cloneArray[] = intArray.clone();
          
        // will print false as deep copy is created
        // for one-dimensional array
        System.out.println(intArray == cloneArray);
          
        for (int i = 0; i < cloneArray.length; i++) {
            System.out.print(cloneArray[i]+" ");

        }


        System.out.println();
            int intArray2[][] = {{1,2,3},{1,5,6},{7,8,9}};
            int cloneArray2[][] = intArray2.clone();
            System.out.println(intArray2 == cloneArray2);
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++){
                System.out.print(cloneArray2[i][j]+" ");
                }
                System.out.println();
    
            }            

        
    }
}
    