import kcoin.Block
import kcoin.BlockChain

fun main(args: Array<String>) {

    val blockChain = BlockChain()

    var genesisBlock = Block(previousHash = "0", data = "I'm the genesis block!")
    println("Genesis: $genesisBlock")
    genesisBlock = blockChain.add(genesisBlock)

    val secondBlock = blockChain.add(Block(genesisBlock.hash, "I'm the second"))
    blockChain.add(Block(secondBlock.hash, "I'm the third"))

    println("BlockChain is valid: ${blockChain.isValid()}")
}