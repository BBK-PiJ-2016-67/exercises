public class RunSimpleMap {

	static public void main(String[] args) {
		RunSimpleMap runner = new RunSimpleMap();
		runner.run();
	}
	
	public void run() {
		StringMap map = new StringMap();
		
		map.put(1, "test");
		
		System.out.println(map.get(1));
		
		System.out.println(map.isEmpty());
		
		map.remove(1);
		
		System.out.println(map.isEmpty());
		
		map.remove(1);
	}

}