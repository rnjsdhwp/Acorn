package com.jin.View.Ex02;

import javafx.scene.Parent;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class ViewTestImpl implements IViewService{

	@Override
	public void ViewTest(Parent form) {
//		form���� ��ü�� ã�� ����
		ImageView iv = (ImageView) form.lookup("#imgView");
//		System.out.println(iv.getId());
		
//		../�� ���� ��η� �̵��϶���� ��ɾ�
//		�� ��ġ�� com.jin.View.Ex00�̰�
//		�̹��� ��δ� com.jin.View.img�̹Ƿ�
//		���� ��η� �̵��� �� img������ �ִ� ����.png�� �о� ����
		String imgPath = getClass().getResource("../img/����.png").toString();
		iv.setImage(new Image(imgPath));
	}

}
