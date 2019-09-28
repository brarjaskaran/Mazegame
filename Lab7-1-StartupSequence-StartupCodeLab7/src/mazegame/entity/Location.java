package mazegame.entity;

import java.util.HashMap;

public class Location {
//	private HashMap<String, Exit> exits;
	private HashMap characters;
	private Inventory items;
	private ExitCollection exitCollection;
	private String description;
	private String label;
	
	public Location () {
		exitCollection = new ExitCollection();
		items = new Inventory();
	}
	
	public Location (String description, String label){
		this();		// What does this accomplish
		this.setDescription(description);
		this.setLabel(label);
	}
	
	//public boolean addExit (String exitLabel, Exit theExit){
	//	if (exits.containsKey(exitLabel))
	//		return false;
	//	exits.put(exitLabel, theExit);
	//	return true;
	//}
	
	//public Exit getExit(String exitLabel){
	//	return (Exit) exits.get(exitLabel);
	//}
	
	public Inventory getInventory () {
		return items;
	}
	
	public ExitCollection getExitCollection () {
		return exitCollection;
	}
		
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}	
	
	
	//public boolean containsExit(String exitLabel) {
	//	return exits.containsKey(exitLabel);
	//}
	
	//public String availableExits()
   // {
  //      StringBuilder returnMsg = new StringBuilder();
   //     for (Object label: this.exits.keySet())
   //     {
    //        returnMsg.append("[" + label.toString() + "] ");
   //     }
   //     return returnMsg.toString();
   // }

    public String toString()
    {
        return "**********\n" + this.label + "\n**********\n"
            + "Exits found :: " + exitCollection.availableExits() + "\n**********\n" 
            + "\n" + items.toString()
            + this.description + "\n**********\n";
    }

}
