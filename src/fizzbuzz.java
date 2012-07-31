import java.io.*;

public class fizzbuzz {
	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
			String line = reader.readLine();
			
			int x = Integer.parseInt(line);
			
			for(int i=1; i <= x; i++){
				if(i%3==0 && i%5==0){
					System.out.println("FizzBuzz");
				}else if(i%3==0){
					System.out.println("Fizz");	
				}else if(i%5==0){
					System.out.println("Buzz");
				}else{
					System.out.println(i);
				}
			}		
		}catch (IOException e){
			System.out.println("fuck??");
		}finally {
			try {
				reader.close();
			} catch (IOException e) {
				System.out.println("fuck!!");
			}
		}
	}
}
