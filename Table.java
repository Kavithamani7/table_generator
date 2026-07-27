import java.util.*;

public class Table{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size (for PxP array):");
        int p;
        try {
            p = sc.nextInt();
            if(p <= 0) throw new Exception();
        } catch(Exception e) {
            System.out.println("Invalid array size");
            return;
        }
        
        Random random = new Random();
        
        int[][] arr= new int[p][p];
        for(int i=0;i<p;i++){
            for(int j=0;j<p;j++){
                arr[i][j] = random.nextInt(1,9);
                arr[i][j] *= 2;
            }
        }
        
        String[][] str = new String[p][p];
        for(int i=0;i<p;i++){
            for(int j=0;j<p;j++){
                str[i][j] = Integer.toString(arr[i][j]);
            }
        }

        System.out.println("Generated 2D array:");
        System.out.print("     ");
        for(int i=0;i<p;i++){
            System.out.print("0" + i + "   ");
        }
        System.out.println();
        
        System.out.print("   ");
        for(int i=0;i<p;i++){
            System.out.print("+----");
        }
        System.out.println("+");
        
        for(int i=0;i<p;i++){
            if(i<10)
                System.out.print("0"+i+" ");
            else
                System.out.print(i+" ");
        
            for(int j=0;j<p;j++){
                 if(str[i][j].length()==1)
                    System.out.print("| " + str[i][j] + "  ");
                else
                    System.out.print("| " + str[i][j] + " ");
            }
            System.out.println("|");
            
            System.out.print("   ");
            for(int k=0;k<p;k++){
                System.out.print("+----");
            }
            System.out.println("+");
        }
        
        System.out.print("Enter a number to highlight (even number 2-16):");
        String num = sc.next();
        try {
            int n = Integer.parseInt(num);
            if(n < 2 || n > 16 || n % 2 != 0) throw new Exception();
        } catch(Exception e) {
            System.out.println("Invalid number");
            return;
        }
        
        int count = 0;
        for(int i=0;i<p;i++){
            for(int j=0;j<p;j++){
                if(str[i][j].equals(num)){
                    count++;
                    str[i][j] = "[" +num+"]";
                }
            }
        }
        
        System.out.println();
        System.out.println("Array with " +num+ " highlighted:");
        System.out.print("     ");
        for(int i=0;i<p;i++){
            System.out.print("0"+i+"   ");
        }
        System.out.println();
        
        System.out.print("   ");
        for(int i=0;i<p;i++){
            System.out.print("+----");
        }
        System.out.println("+");
        
        for(int i=0;i<p;i++){
            if(i<10)
                System.out.print("0"+i+" ");
            else
                System.out.print(i+" ");
        
            for(int j=0;j<p;j++){
                if(str[i][j].length()==1)
                    System.out.print("| " + str[i][j] + "  ");
                else if(str[i][j].length()==2)
                    System.out.print("| " + str[i][j] + " ");
                else
                    System.out.print("|" + str[i][j]);
            }
            
            System.out.println("|");
            System.out.print("   ");
            for(int k=0;k<p;k++){
                System.out.print("+----");
            }
            System.out.println("+");
        }
         System.out.println("Number "+num+" appeared "+ count + " time(s)");
        
    }
}
