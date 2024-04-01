package core;

import java.util.ArrayList;

import util.Util;

public class BlockChainStarter {
	public static void main(String[] args) {
//		mainHash();
		mainBlockChain();
//		mainTransaction();
	}
	
	private static void mainHash() {
		int nonce = 0;
		while(true) {
			if(Util.getHash(nonce + "").substring(0,6).equals("000000")) {
				System.out.println("정답: " + nonce);
				System.out.println("해시값: " + Util.getHash(nonce + ""));
				break;
			}
			nonce++;
		}
	}
	
	private static void mainBlockChain() {
//		Block block1 = new Block(1, null, 0, "바뀐 데이터");
//		block1.mine();
//		block1.getInformation();
//		
//		Block block2 = new Block(2, block1.getBlockHash(), 0, "바뀐 데이터");
//		block2.mine();
//		block2.getInformation();
//		
//		Block block3 = new Block(3, block2.getBlockHash(), 0, "바뀐 데이터");
//		block3.mine();
//		block3.getInformation();
//
//		Block block4 = new Block(4, block3.getBlockHash(), 0, "바뀐 데이터");
//		block4.mine();
//		block4.getInformation();
		
		Block block1 = new Block(1, null, 0, new ArrayList());
		block1.mine();
		block1.getInformation();
		
		Block block2 = new Block(2, block1.getBlockHash(), 0, new ArrayList());
		block2.addTransaction(new Transaction("나동빈", "박한울", 1.5));
		block2.addTransaction(new Transaction("이태일", "박한울", 0.7));
		block2.mine();
		block2.getInformation();
		
		Block block3 = new Block(3, block2.getBlockHash(), 0, new ArrayList());
		block3.addTransaction(new Transaction("강동구", "이상록", 8.2));
		block3.addTransaction(new Transaction("이태일", "나동빈", 9.9));
		block3.mine();
		block3.getInformation();
		
		Block block4 = new Block(4, block3.getBlockHash(), 0, new ArrayList());
		block4.addTransaction(new Transaction("이상록", "강동구", 0.1));
		block4.mine();
		block4.getInformation();
		
	}
	
	private static void mainTransaction() {
		Transaction transaction = new Transaction("나동빈", "박한울", 1.5);
		System.out.println(transaction.getInformation());
	}
	
}
