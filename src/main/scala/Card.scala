trait Card {
  def getPoints: Int
  def purchase(money: Set): Boolean
  def getCost: Set
}
