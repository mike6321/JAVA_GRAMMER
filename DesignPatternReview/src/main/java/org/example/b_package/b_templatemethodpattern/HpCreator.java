package org.example.b_package.b_templatemethodpattern;

import java.util.Date;

public class HpCreator extends ItemCreator{

	@Override
	public void requestItemInfo() {
		// TODO Auto-generated method stub
		System.out.println("DB���� ü��ȸ�� ������ ������ �������� �ֽ��ϴ�.");
	}

	@Override
	protected void createItemLog() {
		// TODO Auto-generated method stub
		System.out.println("DB���� ü��ȸ�� ������ ������ �����Խ��ϴ�!"+new Date());
	}
}

