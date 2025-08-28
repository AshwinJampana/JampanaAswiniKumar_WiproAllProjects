package Assignment_Day6;

import java.util.Scanner;

public class Problem6 {
	enum Direction{NORTH,SOUTH,EAST,WEST}
	public static void main(String[] args) throws IllegalArgumentException  {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a direction :");
        String input = sc.nextLine();
        Direction direction = Direction.valueOf(input);
        
        switch(direction) {
            case NORTH:
                System.out.println("Move north ");
                break;
            case SOUTH:
                System.out.println("Move south");
                break;
            case EAST:
                System.out.println("Move east");
                break;
            case WEST:
                System.out.println("Move west");
                break;
        }

	}

}
