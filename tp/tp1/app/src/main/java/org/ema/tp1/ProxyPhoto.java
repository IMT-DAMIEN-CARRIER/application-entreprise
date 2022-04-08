package org.ema.tp1;

public class ProxyPhoto implements IPhoto{
    IPhoto photo;

	public int width() {
		if ( photo == null){
			photo = new AurorePhoto();
        }
        
		return photo.width();
	}

    @Override
    public int getId() {
        return 10;
    }

    @Override
    public void setId(int id) {
    }

    public static void main(String[] args) {
	    System.out.println();
    }
}
