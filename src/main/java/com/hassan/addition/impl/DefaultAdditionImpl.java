/**
 * 
 */
package com.hassan.addition.impl;

import com.hassan.addition.Addition;

/**
 * @author Nazmul.Hassan
 *
 */
public class DefaultAdditionImpl implements Addition {

	/* (non-Javadoc)
	 * @see com.hassan.addition.Addition#addNumber(int, int)
	 */
	@Override
	public int addNumber(int a, int b) {
		System.out.println(">>>>>>>>>   Default Addition Implementation <<<<<<<<<<<");
		return a + b;
	}

}
