package utility;

import java.sql.Connection;

public class Demo {

	public static void main(String[] args) {
		
			Connection conn=Util.provideConnection();
			System.out.println(conn);
			System.out.println("Connected");

	}

}
