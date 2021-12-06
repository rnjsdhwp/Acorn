package com.jin.Notepad;

public class FileController {
	private IHelp iHelp;
	private ILatest iLatest;
	private IFile iFile;
	
	public FileController() {
		iHelp = new HelpImpl();
		iLatest = new LatestImpl();
		iFile = new FileImpl();
	}
	
	public void NewFile() {
		
	}
	public void Save() {
		
	}
	public void SaveAs() {
		
	}
	public void Open() {
		
	}
	public void LoadLatest() {
		
	}
	public void About() {
		
	}
}
