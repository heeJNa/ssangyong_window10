package sist.com.basic3.obj.action;

import java.util.Calendar;

import sist.com.basic3.obj.Action;
import sist.com.basic3.obj.ActionForWard;
import sist.com.basic3.obj.Dao;

public class UpdateAction extends Action{
	private String path;
	private boolean redirect;
	private Dao dao;
	
	public UpdateAction(Dao dao, String path, boolean redirect) {
		super();
		this.dao =dao;
		this.path = path;
		this.redirect = redirect;
	}
	
	@Override
	public ActionForWard execute() {
		System.out.println("UpdateAction Process");
		dao.connectProcess();
		dao.update();
		return new ActionForWard(path,redirect);
		
	}

}
