import java.util.Scanner;

class Patterns{
    static void pattern1(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }

    static void pattern2( int n ){
        for ( int i = 0; i < n; i++){
            for(int j = 0; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern3(int n){
        for(int i =1;i<=n;i++){
            for(int j =1; j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    static void pattern4(int n){
        for(int i =1;i<=n;i++){
            for(int j =1; j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }

    static void pattern5(int n){
        for(int i =1;i<=n;i++){
            for(int j =1; j<=n-i+1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern6(int n){
        for(int i =1;i<=n;i++){
            for(int j =1; j<=n-i+1;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    static void pattern7(int n){
        for(int i =1;i<=n;i++){
            for (int j=1;j<=n-i;j++){
                System.out.print("  ");
            }

            for (int j=1;j<=2*i-1;j++){
                System.out.print("* ");
            }

            for (int j=1;j<=n-i;j++){
                System.out.print("  ");
            }

            System.out.println();
        }
    }

    static void pattern8(int n){
        for(int i =1;i<=n;i++){
            for (int j=1;j<=i-1;j++){
                System.out.print("  ");
            }

            for (int j=1;j<=2*(n-i)+1;j++){
                System.out.print("* ");
            }

            for (int j=1;j<=i-1;j++){
                System.out.print("  ");
            }

            System.out.println();
        }
    }

    static void pattern9(int n){
             for(int i =1;i<=n;i++){
            for (int j=1;j<=n-i;j++){
                System.out.print("  ");
            }

            for (int j=1;j<=2*i-1;j++){
                System.out.print("* ");
            }

            for (int j=1;j<=i-1;j++){
                System.out.print("  ");
            }

            System.out.println();
        }
        for(int i =1;i<=n;i++){
            for (int j=1;j<=i-1;j++){
                System.out.print("  ");
            }

            for (int j=1;j<=2*(n-i)+1;j++){
                System.out.print("* ");
            }

            for (int j=1;j<=i-1;j++){
                System.out.print("  ");
            }

            System.out.println();
        }
    }

    static void pattern10(int n){
        for (int i = 1; i <= 2*n-1; i++){
            int star =i ;
             if(i>n) star=2*n-i;
            for(int j = 1; j<=star;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern11(int n){
        for( int i= 1; i<=n; i++){
            int digit =1;
            if(i%2==0) digit=0;
            for(int j=1; j<=i;j++){
                System.out.print(digit+" ");
                digit=1-digit;
            }
            System.out.println();
        }
    }

    static void pattern12(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+ " ");
            }

            for(int j=1;j<=2*n-2*i;j++){
                System.out.print("  ");
            }

            for(int j=i;j>=1;j--){
                System.out.print(j+ " ");
            }

            System.out.println();
        }
    }

    static void pattern13(int n){
        int sum=1;
        for ( int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(sum+" ");
                sum++;
            }
            System.out.println();
        }
    }

    static void pattern14(int n){
         for(int i=1;i<=n;i++){
            for(char j ='A'; j<='A'+i-1;j++){
                System.out.print(j+" ");
            }
            System.out.println();
         }
    }

    static void pattern15(int n){
         for(int i=1;i<=n;i++){
            for(char j ='A'; j<='A'+n-i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
         }
    }

    static void pattern16(int n){
        for(int i=1; i<=n;i++){
            char ch= (char) ('A' + i - 1);
            for(int j=1;j<=i;j++){
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }

    static void pattern17(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }

            char ch='A';
            int breakPoint=(2*i-1)/2;
            for(int j=1;j<=2*i-1;j++){
                System.out.print(ch+" ");
                if(j<=breakPoint){
                    ch++;
                }
                else{
                    ch--;
                }
            }

            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }

            System.out.println();
        }
    }
    
    static void pattern18(int n){
        for(int i=1;i<=n;i++){
            char ch=(char)('E'-i+1)   ;         
            for(int j=ch;j<='E';j++){
                System.out.print((char)(j)+" ");
            }
            System.out.println();
        }
    }

    static void pattern19(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print("* ");
            }

            for(int j=1;j<=2*i-2;j++){
                System.out.print("  ");
            }

            for(int j=1;j<=n-i+1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }

            for(int j=1;j<=2*(n-i);j++){
                System.out.print("  ");
            }

            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern20(int n){
        int spaces = 2*n-2, star;

        for(int i=1;i<=2*n-1;i++){
            if(i<n) star=i;
            else star=2*n-i;

            for(int j=1;j<=star;j++){
                System.out.print("* ");
            }

            for(int j=1;j<=spaces;j++){
                System.out.print("  ");
            }

            for(int j=1;j<=star;j++){
                System.out.print("* ");
            }

            if(i<n) spaces-=2;
            else spaces+=2;
            System.out.println();
        }
    }

    static void pattern21(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==1 || j==1 || i==n || j==n){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    static void pattern22(int n){
        for(int i=1;i<=2*n-1;i++){
            for(int j=1;j<=2*n-1;j++){
                int top  = i-1, left = j-1, right= (2*n-1)-j, down=(2*n-1)-i;
                System.out.print(n-Math.min(Math.min(top,down),Math.min(left,right)) + " ");
            }
            System.out.println();
        }
    }



   public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the Number :: ");
    int Number = sc.nextInt();

    System.out.println("\nPattern 1: Square Star Pattern\n");
    pattern1(Number);

    System.out.println("\nPattern 2: Right Angle Triangle (Stars)\n");
    pattern2(Number);

    System.out.println("\nPattern 3: Right Angle Triangle (Numbers Increasing in Row)\n");
    pattern3(Number);

    System.out.println("\nPattern 4: Right Angle Triangle (Same Number in Row)\n");
    pattern4(Number);

    System.out.println("\nPattern 5: Inverted Right Triangle (Stars)\n");
    pattern5(Number);

    System.out.println("\nPattern 6: Inverted Right Triangle (Numbers Increasing)\n");
    pattern6(Number);

    System.out.println("\nPattern 7: Pyramid Pattern (Stars)\n");
    pattern7(Number);

    System.out.println("\nPattern 8: Inverted Pyramid Pattern (Stars)\n");
    pattern8(Number);

    System.out.println("\nPattern 9: Diamond Pattern (Stars)\n");
    pattern9(Number);

    System.out.println("\nPattern 10: Triangle then Inverted Triangle (Stars)\n");
    pattern10(Number);

    System.out.println("\nPattern 11: Binary Right Angle Triangle (0s and 1s)\n");
    pattern11(Number);

    System.out.println("\nPattern 12: Palindrome Number Pyramid\n");
    pattern12(Number);

    System.out.println("\nPattern 13: Continuous Number Triangle\n");
    pattern13(Number);

    System.out.println("\nPattern 14: Right Angle Alphabet Pattern (Increasing Letters)\n");
    pattern14(Number);

    System.out.println("\nPattern 15: Inverted Alphabet Triangle\n");
    pattern15(Number);

    System.out.println("\nPattern 16: Right Angle Alphabet Pattern (Same Letter per Row)\n");
    pattern16(Number);

    System.out.println("\nPattern 17: Alphabet Pyramid (A to Peak and Back)\n");
    pattern17(Number);

    System.out.println("\nPattern 18: Reverse Alphabet Triangle\n");
    pattern18(Number);

    System.out.println("\nPattern 19: Double Triangle Pattern (Hourglass with Stars)\n");
    pattern19(Number);

    System.out.println("\nPattern 20: Symmetric Double Triangle with Spaces\n");
    pattern20(Number);

    System.out.println("\nPattern 21: Hollow Square Pattern\n");
    pattern21(Number);

    System.out.println("\nPattern 22: Number Square Pattern (Concentric)\n");
    pattern22(Number);

    sc.close();
}
}