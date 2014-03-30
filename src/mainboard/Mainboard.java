package mainboard;

import gral2demo.AgpGraphicCard;
import gral2demo.HddDrive;
import gral2demo.Ram;

public class Mainboard {

	private IdePort[] idePorts;
	private RamPort[] ramPorts;
	
	private AgpSlot agpSlot;
	private GraphicCardType graphicCardType;

	public Mainboard(GraphicCardType type, int idePorts, int ramPorts)
	{
		this.graphicCardType = type;
		
		this.ramPorts=new RamPort[ramPorts];
		for(int i=0; i<ramPorts;i++)
		{
			this.ramPorts[i]=new RamPort(this);
		}
		
		this.idePorts=new IdePort[idePorts];
		for(int i=0;i<idePorts;i++)
			this.idePorts[i]=new IdePort(this);
		
		this.agpSlot=new AgpSlot(this);
	}

	
	public void installIdeDevice(HddDrive drive, int portNumber)
	{
		if(portNumber<0 || portNumber>= idePorts.length)
		{
			System.out.println("\nNie ma takiego numeru portu.");
			return;
		}
		if(idePorts[portNumber].isAvaible())
			idePorts[portNumber].installDevice(drive);
		else
			System.out.println("\nSlot "+portNumber+" is not avaible.");
	}
	
	public void installAgpGraphicCard(AgpGraphicCard agpGraphicCard)
	{
		if(agpSlot.isAvaible())
			agpSlot.installDevice(agpGraphicCard);
		else
			System.out.println("\nGraphic card is already installed.");
		
	}
	
	public void installRam(Ram ram, int portNumber)
	{
		if(ramPorts[portNumber].isAvaible())
			ramPorts[portNumber].installDevice(ram);
		else
			System.out.println("\nSlot: "+portNumber+" jest niedostepny");
	}
	
	public String getFullDescription()
	{
		String result;
		result="----------------------------\n";
		result=result + "Ide Devices: \n";
		for(int i=0;i<idePorts.length;i++)
		{
			result=result+"Port "+i+"\n"+idePorts[i].getDescription();
		}
		result=result+"\n----------------------------\n";
		result=result + "Graphic Card: \n";
		result+=agpSlot.getDescription();
		
		result=result+"\n----------------------------\n";
		result=result + "Ram Ports: \n";
		for(int i=0;i<idePorts.length;i++)
		{
			result=result+"";
		}
		
		return result;
	}
}
