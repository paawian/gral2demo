package mainboard;

import gral2demo.PciExpressGraphicCard;

 class PciExpressSlot {

	private String description;
	private Mainboard mainboard;
	private boolean avaible = true;
	private PciExpressGraphicCard card;
	
	public PciExpressSlot()
	{
		this.mainboard = mainboard;
	}
	
	public void installDevice(PciExpressGraphicCard graphicCard)
	{
		card.setMainboard(mainboard);
		description=null;
		this.avaible=true;
	}
	
	public void unInstallDevice()
	{
		card.setMainboard(null);
		description=null;
		this.avaible=true;
	}
	
	public String getDescription()
	{
		return description;
	}
	
	public boolean isAvaible() {
		return avaible;
	}
}
