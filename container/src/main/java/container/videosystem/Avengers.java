package container.videosystem;


public class Avengers implements DigitalVideoDisc {
	private String title = "Avangers";
	private String studio = "Marvel";
	
	@Override
	public void play() {
		System.out.println("playing movie " + studio + "'s " +  title);
	}

}
