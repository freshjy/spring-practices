package container.videosystem;

public class Ironman implements DigitalVideoDisc {
	private String title = "IronMan";
	private String studio = "Marvel";
	
	@Override
	public void play() {
		System.out.println("playing movie " + studio + "'s " +  title);
	}

}
