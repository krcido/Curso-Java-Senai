package classes;
import java.awt.*;

public class Rectangle extends Shape {
		// Atributos
		private int width;
		private int height;
		
		// Construtores
		
		public Rectangle(Color color, int posX, int posY, int width, int height) {
			super(color,posX,posY);
			this.width = width;
			this.height = height;
		}
		
		// Métodos específicos
		@Override
		public void draw(Graphics g) {
			g.setColor(super.getColor());
			g.fillRect(super.getPosX(), super.getPosY(), this.width, this.height);
		}
		
		public void changeDir(int limXmin, int linXmax, int limYmin, int linYmax) {
			if(super.getPosX() + this.width >= linXmax 
		       || super.getPosX() <= limXmin) {
				super.setSpeedX(super.getSpeedX()*-1);
				super.setColor(super.colorGenerate());
			}
			
			if(super.getPosY() + this.height >= linYmax 
				       || super.getPosY() <= limYmin) {
						super.setSpeedY(super.getSpeedY()*-1);
						super.setColor(super.colorGenerate());
			}
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
		
		
		// Métodos de acesso
		
		
}

