package GSGMain;

public class Unit
{

	private String arsenalCode, unitRole, factionName;
	private Boolean isRandom;

	// Constructor
	public Unit(String arsenalCode, String unitRole, String factionName, Boolean isRandom)
	{

		this.arsenalCode = arsenalCode;
		this.unitRole = unitRole;
		this.factionName = factionName;
		this.isRandom = isRandom;

	}

	public String getArsenalCode()
	{
		return arsenalCode;
	}

	public void setArsenalCode(String arsenalCode)
	{
		this.arsenalCode = arsenalCode;
	}

	public String getUnitRole()
	{
		return unitRole;
	}

	public void setUnitRole(String unitRole)
	{
		this.unitRole = unitRole;
	}

	public String getFactionName()
	{
		return arsenalCode;
	}

	public void setFactionName(String factionName)
	{
		this.factionName = factionName;
	}

	public Boolean getIsRandom()
	{
		return isRandom;
	}

	public void setIsRandom(Boolean isRandom)
	{
		this.isRandom = isRandom;
	}

}