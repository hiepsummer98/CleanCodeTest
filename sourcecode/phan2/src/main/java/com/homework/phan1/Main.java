package com.homework.phan2;

import com.homework.phan2.bean.BMP;
import com.homework.phan2.bean.GIF;
import com.homework.phan2.bean.JPG;
import com.homework.phan2.bean.PNG;
import com.homework.phan2.interfaces.IFile;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {

	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
		
		IFile graphicEditorBMP = new BMP();
		IFile graphicEditorJPG = new JPG();
		IFile graphicEditorPNG = new PNG();
		IFile graphicEditorGIF = new GIF();

		graphicEditorBMP.setFilePath("/BMP");
		graphicEditorBMP.openFile();
		graphicEditorBMP.parseFile();
		graphicEditorBMP.saveFile();

		graphicEditorJPG.setFilePath("/JPG");
		graphicEditorJPG.openFile();
		graphicEditorJPG.parseFile();
		graphicEditorJPG.saveFile();

		graphicEditorPNG.setFilePath("/PNG");
		graphicEditorPNG.openFile();
		graphicEditorPNG.parseFile();
		graphicEditorPNG.saveFile();

		graphicEditorGIF.setFilePath("/GIF");
		graphicEditorGIF.openFile();
		graphicEditorGIF.parseFile();
		graphicEditorGIF.saveFile();
	}

}
