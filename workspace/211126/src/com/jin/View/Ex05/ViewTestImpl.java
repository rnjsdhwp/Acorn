package com.jin.View.Ex05;

import javafx.scene.Parent;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class ViewTestImpl implements IViewService{

	@Override
	public void ViewTest(Parent form) {
//		form에서 객체를 찾기 위해
		ImageView iv = (ImageView) form.lookup("#imgView");
//		System.out.println(iv.getId());
//		../는 상위 경로로 이동하라는 명령어
//		현재 위치는 com.jin.View.Ex00이고
//		이미지의 경로는 com.jin.View.Img이므로
//		상위 경로로 이동한 후 Img 폴더에 있는 사자.png를 읽어 들임
		String imgPath = getClass().getResource("../Img/사자.png").toString();
		iv.setImage(new Image(imgPath));
	}
}
