package throwsvsthrow;

public class ThrowExample1 {
	public static void main(String[] args) throws InterruptedException{
		for (int i=0; i<6;i++) {
		//int number = 10/0;
		System.out.println(i);
		Thread.sleep(3000);
		for (int j=0;j<6; j ++){
			System.out.println(j);
		}
	}

}

}
