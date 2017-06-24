package model;


public class applystatAbility extends ability{

	private String status;
	
	public applystatAbility(String name, String target, String status)
	{
		this.name = name;
		this.abilitytarget = target;
		this.status = status;
	}
	
	public void useAbility() {
		Pokemon pktarget = (Pokemon) target.getTargetObject(abilitytarget).getTarget();
		pktarget.setStatus(status);
	}
	
	public boolean equals(Object o) {
			
		return false;
	}

}
