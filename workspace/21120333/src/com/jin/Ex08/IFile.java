package com.jin.Ex08;

import java.io.File;

import javafx.scene.Parent;

public interface IFile {
	public String SaveWindow();
	public void CreateFile(Parent form, String filePath);
	public File OpenWindow();
	public void ReadFile(File file);
}
