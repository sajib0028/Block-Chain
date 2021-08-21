package blockchain;

public class Block {
	public String hash;
	public String previousHash;
	private String data;
	

	// Constructor for the block
	public Block(String data, String previousHash) {
		this.data = data;
		this.previousHash = previousHash;
		this.hash = calculateHash();
		
	}
	// printBlock function to print the data and the previous hash on the console.
	public void printBlock() {
		System.out.println("Data: " + this.data);
		System.out.println("Previous Hash: " + this.previousHash);
		System.out.println("Hash: " + this.hash);
	}

	// calculateHash
	public String calculateHash() {
		ApplyHash ah = new ApplyHash();
		String aha = this.data + this.previousHash;
		String resultHash = ah.applyHashingAlgorithm(aha);
		return resultHash;
	}
	
	
}


