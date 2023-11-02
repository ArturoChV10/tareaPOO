package devices;

public class Laptop extends Device {
    public Laptop(Display display) {
        super(display);
    }

    @Override
    public void showPhoto(String photo) {
        System.out.println("Laptop is displaying photo: " + photo);
        changeState();
    }

    @Override
    public void increaseVolume() {
        this.currentVolume = currentVolume + 1;
        System.out.println("Smart TV volume adjusted to: " + this.currentVolume);
    }
    
    @Override
    public void decreaseVolume() {
        this.currentVolume = currentVolume - 1;
        System.out.println("Smart TV volume adjusted to: " + this.currentVolume);
    }
    
    @Override
    public void changeState() {
    	if(this.statePhoto) {
    		this.statePhoto = false;
    	} else {
    		this.statePhoto = true;
    	}
    }
}
