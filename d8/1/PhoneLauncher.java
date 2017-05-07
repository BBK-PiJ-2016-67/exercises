public class PhoneLauncher {
	public static void main(String[] args) {
		PhoneLauncher launcher = new PhoneLauncher();
		launcher.launch();
	}
	public void launch() {
		OldPhone siemens = new OldPhone("Siemens Shitty Phone");
		
		siemens.call("080011155577");
		System.out.println("The brand of the old phone is " + siemens.getBrand());
		
		/////
		
		MobilePhone nokia = new MobilePhone("Nokia 3310");
		
		for (int i = 0; i < 11; i++) {
			nokia.call("0670" + i);
		}
		
		nokia.printLastNumbers();
		nokia.playGame("2");
		nokia.ringAlarm("11:00PM");
		System.out.println("The brand of the mobile phone is " + nokia.getBrand());
		
		/////
		
		SmartPhone iPhone = new SmartPhone("iPhone 6S");
		
		for (int i = 0; i < 11; i++) {
			iPhone.call("0800" + i);
		}
		
		iPhone.call("00302332");
		
		iPhone.printLastNumbers();
		
		iPhone.ringAlarm("10:00AM");
		iPhone.playGame("9");
		iPhone.browseWeb("www.google.com");
		
		System.out.println("The brand of my phone is " + iPhone.getBrand());
		
		Point location = iPhone.findPosition();
		System.out.println("I am at " + location.toString());
	}
}
