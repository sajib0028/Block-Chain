package blockchain;

import java.util.ArrayList;
public class BChain {
	public static ArrayList<Block> block = new ArrayList<Block>();
	public static void main(String[] args) {
		Block b = new Block("First block", "0");
		block.add(b);
		b.printBlock();
		Block c = new Block("Second block", block.get(block.size() - 1).hash);
		block.add(c);
		c.printBlock();
		Block d = new Block("Third block", block.get(block.size() - 1).hash);
		block.add(d);
		d.printBlock();
		
		Block e = new Block("Fifth Block", block.get(block.size() - 1).hash);
		block.add(e);
		e.printBlock();	
		
	}
	
}
