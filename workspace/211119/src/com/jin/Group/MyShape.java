package com.jin.Group;

import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

public class MyShape {
	
	public Rectangle getRect(int x, int y, int w, int h, Color color) {
		Rectangle r = new Rectangle();
		
		r.setX(x);
		r.setY(y);
		r.setWidth(w);
		r.setHeight(h);
		r.setFill(color);
		
		return r;
	}

	public Circle getCircle(Color color, int x, int y, int r) {
		Circle c = new Circle(r, color);
		c.relocate(x, y);
		
		return c;
	}
	
}
