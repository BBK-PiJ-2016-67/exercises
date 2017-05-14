package impl;

import java.io.File;

public class Linux {

	File file;
	
	public static void main(String[] args) {
		Linux linux = new Linux();
		linux.ls();
	}

	public Linux() {
		this.file = new File("/");
	}

	public void ls() {
		this.file.list();
	}

}
