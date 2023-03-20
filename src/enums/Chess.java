package enums;

import java.util.ArrayList;
import java.util.List;

public class Chess {

	Coins coin;
	String position;
	Color color;
	public List<Chess>board = new ArrayList<Chess>();
	
	public Chess(){};
	Chess(Coins coin,String position,Color color) {
		this.coin = coin;
		this.position = position;
		this.color = color;
	}
	
	
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	public Coins getCoin() {
		return coin;
	}
	public void setCoin(Coins coin) {
		this.coin = coin;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	
    public void getCoins() {
    	board.add(new Chess(Coins.KING,"E-1",Color.WHITE));
    	board.add(new Chess(Coins.QUEEN,"D-1",Color.WHITE));
    	board.add(new Chess(Coins.BISHOP,"C-1,F-1",Color.WHITE));
    	board.add(new Chess(Coins.KNIGHT,"B-1,G-1",Color.WHITE));
    	board.add(new Chess(Coins.ROOK,"A-1,H-1",Color.WHITE));
    	board.add(new Chess(Coins.PAWN,"A-2-H-2",Color.WHITE));
    	board.add(new Chess(Coins.KING,"E-8",Color.BLACK));
    	board.add(new Chess(Coins.QUEEN,"D-8",Color.BLACK));
    	board.add(new Chess(Coins.BISHOP,"C-8,F-8",Color.BLACK));
    	board.add(new Chess(Coins.KNIGHT,"B-8,G-8",Color.BLACK));
    	board.add(new Chess(Coins.ROOK,"A-8,H-8",Color.BLACK));
    	board.add(new Chess(Coins.PAWN,"A-7-H-7",Color.BLACK));
    }
    
    public String toString() {
    	return "Position is :"+position;
    }
	
}
