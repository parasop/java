
/*
write a program to perform menu driven actions with udf in java 
1] addition 
2] substraction
3] multiplication
4] division
5] swapped value
6] println table
7] println armston number beween two values
8] pelidrom
9] println table between two values
10] exit
*/
import java.util.Scanner;
class menudriven {
	
		public static void main(String[] args){
			
			Helper myHelper = new Helper();
			myHelper.init();
			
		}
	
	
	
}

class Helper {
	
	Helper(){
	
	
	}
	
		public void init(){
			
		while(true){
				
				System.out.println("1] addition");
				System.out.println("2] substraction");
				System.out.println("3] multiplication");
				System.out.println("4] division");
				System.out.println("5] swapped value");
                System.out.println("6] println table");
                System.out.println("7] println armston number");
                System.out.println("8] println palidrom number");
                System.out.println("9] println table between two values");
                System.out.println("10] exit");
                System.out.println("enter Your choice :");
                
                 Scanner scan = new Scanner(System.in);
                    int choice = scan.nextInt();

                    if(choice == 10) break;

                    switch(choice){

                        case 1 :
                        {
                            this.addition();
                            break;
                        }
                        case 2:
                        {
                            this.substraction();
                            break;
                        }
                        case 3:
                        {
                            this.multiplication();
                            break;
                        }
                        case 4 :
                        {
                            this.division();
                            break;
                        }
                        case 5 :
                        {
                            this.swap();
                            break;
                        }
                        case 6:
                        {
                            this.table();
                            break;
                        }
                        case 7:
                        {
                            this.armston();
                            break;
                        }
                        case 8:
                        {
                            this.pelidrom();
                            break;
                        }
                        case 9:
                        {
                            this.dyanmicTable();
                            break;
                        }
                    }

              //      System.in.read();
              String val = scan.nextLine();
                 

                }
        }

           public void addition(){

                    int a,b;
                      Scanner scan = new Scanner(System.in);
                     System.out.print("enter number a:");
                     a =  scan.nextInt();

                     System.out.print("enter number b:");
                     b =  scan.nextInt();
                     

                    System.out.println("Total is :"+ (a+b));

                }


          public void substraction(){

                    int a,b;
                      Scanner scan = new Scanner(System.in);
                     System.out.print("enter number a:");
                     a =  scan.nextInt();

                     System.out.print("enter number b:");
                     b =  scan.nextInt();
                     

                    System.out.println("Substaction is :"+ (a-b));

                }

              public void multiplication(){

                    int a,b;
                      Scanner scan = new Scanner(System.in);
                     System.out.print("enter number a:");
                     a =  scan.nextInt();

                     System.out.print("enter number b:");
                     b =  scan.nextInt();
                     

                    System.out.println("Multiplication is :"+ (a*b));

                }
              public void division(){

                    int a,b;
                      Scanner scan = new Scanner(System.in);
                     System.out.print("enter number a:");
                     a =  scan.nextInt();

                     System.out.print("enter number b:");
                     b =  scan.nextInt();
                     

                    System.out.println("Division is :"+ (a*b));

                }

              public void swap(){

                    int a,b,temp;
                      Scanner scan = new Scanner(System.in);
                     System.out.print("enter number a:");
                     a =  scan.nextInt();

                     System.out.print("enter number b:");
                     b =  scan.nextInt();

                    temp = a;
                    a =b;
                    b = temp;
                   
                   // [a,b] = [b,a];
                    System.out.println("a ="+(a)+"b ="+(b));

                }

                public void table(){
                      int a;
                      Scanner scan = new Scanner(System.in);
                     System.out.print("enter table number :");
                     a = scan.nextInt();


                     for(int i =1;i<=10;i++){

                        print(a+"x"+(i)+"="+(a*i));
                     }
                     public void armston(){
                        int num,realNum,remainder,result =0;
                        Scanner scan = new Scanner(System.in);

                        System.out.print("enter number :");
                        num = scan.nextInt();
                        realNum = num;


                        while(realNum !=0){
                            remainder = realNum % 10;
                             result += Math.pow(remainder, 3);
                             realNum /= 10;
                        }
                        
                        if(result === num){
                            System.out.println("Number is armston")
                        } else {
                            System.out.println("Number is not armston")
                        }

                     }

                   

                }

                public void palidrom(){

                      int num,temp.total,remainder
                        Scanner scan = new Scanner(System.in);

                        System.out.print("enter number :");
                        num = scan.nextInt();


                        temp = num;

                        while(num >0){

                            //reminder
                            remainder = number%10;
                            total = (total*10) + remainder;
                            num /= 10;

                        }

                          if(temp == totla){
                            System.out.println("Number is pelidrom")
                        } else {
                            System.out.println("Number is not pelidrom")
                        }

                }


                public void dyanmicTable(){

                    int a,from,to;
                     Scanner scan = new Scanner(System.in);

                        System.out.print("enter table number :");
                        num = scan.nextInt();

                            System.out.print("enter starting number of table :");
                        from = scan.nextInt();

                        System.out.print("enter ending number for table :");
                        to = scan.nextInt();


                        for(int i =from;i<to;i++){

                            System.out.println(a+"x"+(i)+"="+(a*i))
                        }






                }

			
		
}
