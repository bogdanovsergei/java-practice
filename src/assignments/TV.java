package assignments;

public class TV {
	  int channel=1;
	  int volumeLevel=1;
	  boolean on = false;
	  String brand = "undefined";
	  
	  public TV() {
	    System.out.println("Creating TV object using no Args- constructor");
	  }
	  
	  public TV(String brand) {
	    System.out.println("Creating TV object using 1 arg - constructor");
	  }

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		if (channel>0 && channel<120 && on==true) {
			this.channel = channel;
		} else {
			System.out.println("ERROR: TV is either OFF or invalid Channel");
		}
	}

	public int getVolumeLevel() {
		return volumeLevel;
	}

	public void setVolumeLevel(int volumeLevel) {
		if (volumeLevel >=1 && volumeLevel <=7 && isOn()) {
			this.volumeLevel = volumeLevel;
		} else {
			System.out.println("ERROR: TV is either OFF or invalid Volume level");
		}
	}

	public void setOn(boolean on) {
		this.on = on;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	  
	public void channelUp() {
		this.channel++;
	}
	public void channerDown() {
		this.channel--;
	}
	
	public void volumeUp() {
		volumeLevel++;
	}
	public void volumeDown() {
		volumeLevel--;
	}
	
	public boolean isOn() {
		if(on) {
			return true;
		}
		return false;
		
	}
	
	public void turnOn() {
		if(isOn()) {
			System.out.println("TV is already ON");
		} else {
			on = true;
		}
	}
	
	public void turnOff() {
		if(isOn()==false) {
			System.out.println("TV is already OFF");
		} else {
			on = false;
		}
	}

}
