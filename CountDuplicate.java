public class CountDuplicate {
    
	
        public static void main(String[] args) {
            
            int i = 0, j;
            int duplicate= 0;
            int[] arr = {7,8, 6, 5, 6, 9, 8, 7, 10, 5};
            
            while(i < arr.length) 
            {
                j = i + 1;
                while(j < arr.length)
                {		
                    if(arr[i] == arr[j]) {
                        duplicate++;
                        break;
                    }
                    j++;
                }
                i++;
            }
            System.out.println("Duplicate count is  : "+ duplicate);
        }
    }
    

