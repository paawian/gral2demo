package mainboard;

import gral2demo.Ram;

 class RamPort {

	 	private String description;
		private Mainboard mainboard;
		private boolean avaible = true;
		private Ram ram;
		
		public RamPort(Mainboard mainboard) {
			
			this.mainboard = mainboard;
		}

		public void installDevice(Ram ram)
		{
			ram.setMainboard(mainboard);
			description=ram.getDescription();
			this.ram=ram;
			this.avaible=false;
		}

		public void unInstallDevice()
		{
			ram.setMainboard(null);
			description=null;
			this.avaible=true;
		}

		public String getDescription() {
			return description;
		}

		public boolean isAvaible() {
			return avaible;
		}
		
}
