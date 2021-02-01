package com.gmail.oastro36;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class LoadGroupFromFile {
	private Group gr;
	
	public LoadGroupFromFile(Group gr) {
		super();
		this.gr = gr;
	}

	public LoadGroupFromFile() {
		super();
	}

	public void loadGroup(File file) {
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			String line = "";
			for (; (line = br.readLine()) != null;) {
				String arraySplit[] = line.split("[ ]");
				Student student = new Student();
				student.setName(arraySplit[0] + "");
				student.setLastName(arraySplit[1] + "");
				student.setSureName(arraySplit[2] + "");
				student.setAge(Integer.valueOf(arraySplit[3]));
				student.setSex((arraySplit[4].equals("m") ? true : false));
				student.setGroupName(arraySplit[5] + "");
				student.setZachNumber(Integer.valueOf(arraySplit[6]));
				try {
				gr.addStudent(student);
				gr.setGroupName(arraySplit[5] + "");
				}catch(EleventhStudentExeption e) {
					System.out.println(e.getMessage());
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}