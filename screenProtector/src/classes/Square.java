package classes;

import java.awt.Color;

public class Square extends Rectangle {
	
	public Square (Color color, int posX, int posY, int size) {
		super(color,posX,posY, size, size);
	}	
	
	@Override
	public void setWidth (int width) {
		super.setWidth(width);
		super.setHeight(width);
	}
	
	@Override
	public void setHeight (int height) {
		super.setWidth(height);
		super.setHeight(height);
	}
}
