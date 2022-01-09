package com.hibernate.tester;

import java.io.IOException;

import com.hibernate.dao.MobileImpl;
import com.hibernate.entity.MobileEntity;

public class MobileTester {
 public static void main(String[] args) throws IOException {

		 
		 MobileImpl dao = new MobileImpl();
		 
		 
		dao.saveMobileEntity();
		
}
}
