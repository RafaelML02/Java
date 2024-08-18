import es.upm.babel.cclib.Monitor;

class ContadorMon{
    	private int cont;
	private Monitor mutex;
	
	public ContadorMon(int n) {
		this.cont = n;
		mutex = new Monitor();
	}
	
	public int getValue ( ) {
		int value ;
		mutex.enter();
		value = this.cont ;
		mutex.leave ();
		return value ;
		}
	
		public void inc (){
		mutex.enter ( ) ;
		this.cont++;
		mutex.leave ( ) ;
		}
		
		public void dec() {
			mutex.enter();
			this.cont --;
			mutex.leave();
		}
}