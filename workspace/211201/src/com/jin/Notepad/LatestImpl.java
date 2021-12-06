package com.jin.Notepad;

public class LatestImpl implements ILatest{
	private ILatestDAO iLatestDao;
	
	public LatestImpl() {
		// TODO Auto-generated constructor stub
		iLatestDao = new LatestDAOImpl();
	}
	
	@Override
	public void LoadLatest() {
		// TODO Auto-generated method stub
		
	}

}
