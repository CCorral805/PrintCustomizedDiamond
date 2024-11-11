import java.util.Scanner;
public class PrintCustomizedDiamond {
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a letter: ");
    char ch = sc.next().charAt(0);

    int reps;
    do {
      System.out.print("Enter a size (even number no less than 6): ");
      reps = sc.nextInt();
    //  System.out.println("");
    } while (!(reps%2==0 && reps>=6));
    System.out.println(""); 

    for(int i = 1; i<=reps/2 ; i++){
      for(int j=0 ; j<((reps/2)-i) ; j++){  //print spaces
        System.out.print(" ");
      }
      for(int j=0 ; j<i*2 ; j++){  //print character
        System.out.print(ch);
      }
    /*  for(int j=0 ; j<((reps/2)-i) ; j++){  //print spaces
        System.out.print(" ");
      }*/
      System.out.println("");
    }
      for(int i = reps/2; i>=1 ; i--){                 //I will divide the execution into 2 parts, second one has a descending i value
        for(int j=0 ; j<((reps/2)-i) ; j++){  //print spaces
          System.out.print(" ");
        }
        for(int j=0 ; j<i*2 ; j++){  //print character
          System.out.print(ch);
        }
       /*  for(int j=0 ; j<((reps/2)-i) ; j++){  //print spaces
          System.out.print(" ");
        }*/
        System.out.println("");
    }
  }
}
