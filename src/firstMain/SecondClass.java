package firstMain;

public class SecondClass {

		
		private int count =10;
		private Object o = new Object();
		
		public SecondClass() {
			this.count = 10;
			
			
		}
		
		public void m() {
			synchronized (o) {
				while (count>0) {
					count --;
					System.out.println(Thread.currentThread().getName() + " count is "+ count+ " Secondclass here " );
				}
				count =10;

			}

		}
}
