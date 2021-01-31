package com.gmail.oastro36;

import java.io.File;

public class Main {

	public static void main(String[] args) {
		File file = new File("fileGruop.txt");
		Group group = new Group();
		LoadGroupFromFile load = new LoadGroupFromFile(group);
			
		load.loadGroup(file);	
		System.out.println(group);
	}

}
