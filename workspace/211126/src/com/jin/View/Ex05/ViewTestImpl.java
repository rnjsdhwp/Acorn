package com.jin.View.Ex05;

import javafx.scene.Parent;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class ViewTestImpl implements IViewService{

	@Override
	public void ViewTest(Parent form) {
//		form���� ��ü�� ã�� ����
		ImageView iv = (ImageView) form.lookup("#imgView");
//		System.out.println(iv.getId());
//		../�� ���� ��η� �̵��϶�� ��ɾ�
//		���� ��ġ�� com.jin.View.Ex00�̰�
//		�̹����� ��δ� com.jin.View.Img�̹Ƿ�
//		���� ��η� �̵��� �� Img ������ �ִ� ����.png�� �о� ����
		String imgPath = getClass().getResource("../Img/����.png").toString();
		iv.setImage(new Image(imgPath));
	}
}
