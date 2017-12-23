package GSGMain;

import java.util.ArrayList;

public class Generator {
	
	private static ArrayList<Unit> unitList = new ArrayList<Unit>();

	public static void main(String[] args) {

		
	
		String arsenalCode = "lol";
		String unitRole = "CO";
		String factionName = "ISIS";
		Boolean isRandom = true;
	
	
		//unitList.add(new Unit(arsenalCode, unitRole, factionName, isRandom));
		Unit CO = new Unit(arsenalCode, unitRole, factionName, isRandom);
		CO.printDetails();
		
		System.out.println("");
		
		Unit AR = new Unit(arsenalCode, unitRole, factionName, isRandom);
		AR.printDetails();
		
	}
}
