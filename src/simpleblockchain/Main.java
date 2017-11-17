package simpleblockchain;
public class Main {

    /**

        Hash = digital signature

        Each block will have:

            List of transactions
            Previous Hash

            Hash
     * @param args
     */

    public static void main(String[] args) {

        String[] genesisTransactions = {"a satoshi sent nikola 10 bitcoin","marija sent 10 bitcoins to nikola"};
        Block genesisBlock = new Block(0, genesisTransactions);

        String[] block2Transactions = {"nikola sent 10 bitcoin to satoshi", "satoshi sent 10 bitcoin to petar"};
        Block block2 = new Block(genesisBlock.getBlockHash(), block2Transactions);

        String[] block3Transactions = {"nikola sent 999 bitcoin to halkbank"};
        Block block3 = new Block(block2.getBlockHash(), block3Transactions);

        System.out.println("Hash of genesis block:");
        System.out.println(genesisBlock.getBlockHash());

        System.out.println("Hash of block 2:");
        System.out.println(block2.getBlockHash());

        System.out.println("Hash of block 3:");
        System.out.println(block3.getBlockHash());

    }


}
