/**
 * 
 */
package com.hassan.service.impl;

import com.hassan.addition.Addition;
import com.hassan.service.AddService;

/**
 * @author Nazmul.Hassan
 *
 */
public class AdditionServiceImpl implements AddService {

	private Addition adder;
	
	
	public Addition getAdder() {
		return adder;
	}


	public void setAdder(Addition adder) {
		this.adder = adder;
	}


	/* (non-Javadoc)
	 * @see com.hassan.service.AddService#doAddition(int, int)
	 */
	@Override
	public int doAddition(int a, int b) {
		return adder.addNumber(a, b);
	}

}
