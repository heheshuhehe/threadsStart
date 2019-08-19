package firstMain;

public class ThirdClass {

		private SecondClass theSecond;
		
		ThirdClass(){
			theSecond = new SecondClass();
		}
		
		ThirdClass(SecondClass superSecondclass){
			theSecond = superSecondclass;
		}
		
		public void runMinSecondClass() {
			System.out.println("Third is here");
			theSecond.m();
		}
		
}
