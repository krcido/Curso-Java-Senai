package classes;

import java.awt.*;
import javax.swing.*;

public class Image {
	
	// atributos
	
	private ImageIcon img;
	private int posX, posY, width, height;
	
	// construtores
	
	public Image (String url, int posX, int posY ) {
		this.img = new ImageIcon(this.getClass().getResource(url));
		this.posX = posX;
		this.posY = posY;
		this.width = img.getIconWidth();
		this.height = img.getIconHeight();
	}
	
	// metodos específicos
	
	// (int)(this.width*scale) .... arredonda de double para inteiro
	public void Draw (Graphics g) {
		
		g.drawImage(img.getImage(), this.posX, this.posY, this.width,this.height, null);
	}
	
	public void Scale (double scale) {
		this.width*=scale;
		this.height*=scale;
	}
	
	public void MoveX (int inc) {
		this.posX += inc;
	}
	
	public void MoveY (int inc) {
		
		this.posY += inc;
	}
	
	public void GetColision(int width, int height) {
		
		// colisão com a borda lateral direita
		
		if(this.posX + this.width > width)
			this.posX = width - this.width;
		
		// colisão com a borda lateral esquerda
		if(this.posX <0)
			this.posX = 0;
		
		
		// colisão com a borda lateral inferior
		if(this.posY + this.height> height)
			this.posY = height - this.height;
		
		
		// colisão com a borda lateral superior
		
		if(this.posY <0)
			this.posY = 0;
	}
	
	// metodos de acesso 

	public ImageIcon getImg() {
		return img;
	}

	public void setImg(ImageIcon img) {
		this.img = img;
	}

	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	
}
