package com.abstraction;


	//helper class
public class Helper extends Manager {
	//helper method for manager
	public Employee getObjectManager() {
		return new Manager();
	}
	
	//helper method for team lead
	public Employee getObjectTeamLead() {
		return new TeamLead();
	}
	
	
	
	
	

}
