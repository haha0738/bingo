package com.dermot.bingo;

public class Player {
	/**
	 * 賓果圖
	 */
	private Matrix _matrix;
	/**
	 * 遊戲
	 */
	private Game _game;
	/**
	 * 暱稱
	 */
	private String _name;
	/**
	 * 連線數
	 */
	private int _links;
	/**
	 * 建構式
	 * @param game
	 * @param name
	 */
	Player(Game game, String name)
	{
		_name = name;
		_game = game;
		_matrix = new Matrix(this);
	}
	
	public Game getGame()
	{
		return _game;
	}
	
	public Matrix getMatrix()
	{
		return _matrix;
	}
	
	public String getName() 
	{
		return _name;
	}
	/**
	 * 是否獲勝
	 * @return
	 */
	public boolean isWin() 
	{
		//確認獲勝就不用再計算，浪費效能
		if (_links >= 5) 
			return true;
		
		_links = _matrix.check();
		return _links >= 5;
	}
	/**
	 * 取得連線數
	 * @return
	 */
	public int getLinks()
	{
		return _links;
	}
}
