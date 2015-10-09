package com.dermot.bingo;

public class Unit {
	/**
	 * 值
	 */
	private int _value;
	/**
	 * 賓果圖
	 */
	private Matrix _matrix;
	Unit(Matrix matrix, int value)
	{
		_matrix = matrix;
		_value = value;
	}
	
	public int getValue()
	{
		return _value;
	}
	
	public Matrix getMatrix()
	{
		return _matrix;
	}
}
