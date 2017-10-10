import scala.io.Source

class Game (_players: Int, _filename : String){
  val players = _players
  val fileWithCards = _filename
  val cardDeck : List[List[ICard]] = readCardsFromFile(fileWithCards)
  val board = new Board(cardDeck, if (players == 2) 5 else 7);

  def readCardsFromFile(fileWithCards: String): List[List[ICard]] = {
    //TODO Do it with JSON
  }

}
